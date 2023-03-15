package comp5111.assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.runner.JUnitCore;
import soot.Pack;
import soot.PackManager;
import soot.Scene;
import soot.Transform;
import soot.options.Options;

public class EntryPoint {

	public static void main(String[] args) {
		String packageName = "comp5111.assignment.cut";
		String testClassName = "";
		String reportName = "";
		if (args[0].equals("example")) {
			testClassName = "Regression__Test";
			reportName = "example";
		} else {
			testClassName = "RegressionTest" + args[0];
			reportName = "Randoop" + args[0];
		}
		
		instrumentWithSoot();
		runJunitTests(packageName + "." + testClassName);
		
		Set<String> innerClasses = Counter.allStatements.values().stream().map(stmt -> stmt.declaringClassName).collect(Collectors.toSet());
		int totalCount = 0;
		int coveredCount = 0;
		
		StringBuffer statementResultText = new StringBuffer(reportName+" Statement Coverage\n");
		statementResultText.append("=================================================\n");
		statementResultText.append(resultString("Overall", Counter.getExecutedStatementsCount(), Counter.getRegisteredStatementsCount()));
		for (String declaringClassName : innerClasses) {
			totalCount = Counter.getRegisteredStatementsCount(declaringClassName);
			coveredCount = Counter.getExecutedStatementsCount(declaringClassName);
			statementResultText.append(resultString(declaringClassName, coveredCount, totalCount));
		}
	
		totalCount = 0;
		coveredCount = 0;
		
		StringBuffer branchResultText = new StringBuffer(reportName+" Branch Coverage\n");
		branchResultText.append("=================================================\n");
		branchResultText.append(resultString("Overall", Counter.getExecutedBranchesCount(), Counter.getRegisteredBranchesCount()));
		for (String declaringClassName : innerClasses) {
			totalCount = Counter.getRegisteredBranchesCount(declaringClassName);
			coveredCount = Counter.getExecutedBranchesCount(declaringClassName);
			branchResultText.append(resultString(declaringClassName, coveredCount, totalCount));
		}

    	String reportsPath = "./reports/";
		generateReport(reportsPath + reportName + "-stmt.txt", statementResultText.toString());
		generateReport(reportsPath + reportName + "-branch.txt", branchResultText.toString());
		
		if (args[0].equals("example")) {
			System.out.println(statementResultText.toString());
			System.out.println(branchResultText.toString());
		}
		
		
		
    }
	
	private static String resultString(String declaringClassName, int coveredCount, int totalCount) {
		StringBuffer sb = new StringBuffer("\n"+declaringClassName);
		sb.append("\nCovered / Total : " + coveredCount + " / " + totalCount);
		float percentage = (totalCount == 0) ? 0 : (float) coveredCount*100 / totalCount;
		sb.append(String.format("\nPercentage: %.2f%%\n", percentage));
		return sb.toString();
	}
	
	private static void generateReport(String fileName, String context) {
		try {
			File myObj = new File(fileName);
			if (myObj.createNewFile()) {
	    		System.out.println("File created: " + myObj.getName());
	    	} else {
	    		System.out.println("File already exists. Overwriting to file :" + myObj.getName());
	    	}
			FileWriter myWriter = new FileWriter(fileName, false);
			myWriter.write(context);
			myWriter.close();
			System.out.println("Successfully wrote to the file: " + myObj.getName());
			
		} catch (IOException e) {
    		System.out.println("An error occurred.");
    		e.printStackTrace();
	    }
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
        // Options.v().set_soot_classpath(Scene.v().defaultClassPath() + classPathSeparator + targetPath + classPathSeparator + classUnderTestPath);
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

		
        // pass arguments to soot
		soot.Main.main(new String[] {classUnderTestName});
		
	}
	
	private static void runJunitTests(String testClassName) {
		Class<?> testClass = null;
		try {
			testClass = Class.forName(testClassName);
			JUnitCore junit = new JUnitCore();
			System.out.println("Running junit test: " + testClass.getName());
			junit.run(testClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
