package comp5111.assignment;

import java.util.Arrays;

import org.junit.runner.JUnitCore;
import soot.Pack;
import soot.PackManager;
import soot.Scene;
import soot.Transform;
import soot.options.Options;

public class EntryPoint {

	public static void main(String[] args) {
		instrumentWithSoot();
		
		runJunitTests();
		
		System.out.println("Invocation to static methods: " + Counter.getNumStaticInvocations());
        System.out.println("Invocation to instance methods: " + Counter.getNumInstanceInvocations());
    }
	
	private static void instrumentWithSoot() {
        // the path to the compiled Subject class file
		String classUnderTestName = "comp5111.assignment.cut.Subject";
        String classUnderTestPath = "./raw-classes";
        String targetPath = "./target/classes";

        String classPathSeparator = ":";
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            classPathSeparator = ";";
        }
        /*Set the soot-classpath to include the helper class and class to analyze*/
        Options.v().set_process_dir(Arrays.asList(classUnderTestPath));
        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + classPathSeparator + targetPath + classPathSeparator + classUnderTestPath);

        // we set the soot output dir to target/classes so that the instrumented class can override the class file
        Options.v().set_output_dir(targetPath);

        // retain line numbers
        Options.v().set_keep_line_number(true);
        // retain the original variable names
        Options.v().setPhaseOption("jb", "use-original-names:true");

        /* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");

        Instrumenter instrumenter = new Instrumenter();
        jtp.add(new Transform("jtp.instrumenter", instrumenter));

		
		String classUnderTest = "comp5111.assignment.cut.Subject";
        // pass arguments to soot
		soot.Main.main(new String[] {classUnderTest});
		
	}
	
	private static void runJunitTests() {
		Class<?> testClass = null;
		try {
			testClass = Class.forName("comp5111.assignment.cut.RegressionTest00");
			JUnitCore junit = new JUnitCore();
			System.out.println("Running junit test: " + testClass.getName());
			junit.run(testClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
