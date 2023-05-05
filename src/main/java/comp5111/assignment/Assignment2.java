package comp5111.assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import soot.Pack;
import soot.PackManager;
import soot.Scene;
import soot.Transform;
import soot.options.Options;

public class Assignment2 {
	// Constants for file names
	private static final String ROOT_DIR = System.getProperty("user.dir");
	private static final String EXTENSION = ".tsv";
	private static final String REPORT_DIR = ROOT_DIR + "/assignment2-reports";
	private static final String FILENAME_PREFIX = "spectrum_fl_";
	
	// Constants for class names
	private static final String PACKAGE_NAME = "comp5111.assignment.cut";
	private static final String CUT_NAME = PACKAGE_NAME + ".Subject";
	private static final String CUT_PATH = "./raw-classes";
	private static final String TESTCLASS_PATH = "./target/classes";
	private static final String CLASS_PATH_SEPARATOR = (System.getProperty("os.name").toLowerCase().contains("win")) ? ";" : ":";

	static final ConcurrentHashMap<Integer, Description> testDescriptionMap = new ConcurrentHashMap<>();
	static final ConcurrentHashMap<Integer, HashSet<Integer>> testStmtMap = new ConcurrentHashMap<>();
	static final ConcurrentHashMap<Integer, Boolean> testPassFailMap = new ConcurrentHashMap<>();
	static int testCaseNum = 0;
	

	static void addToTestStmtMap(Integer stmtHashCode) {
		testStmtMap.putIfAbsent(stmtHashCode, new HashSet<>());
		HashSet<Integer> tests = testStmtMap.get(stmtHashCode);
		tests.add(testCaseNum);
		testStmtMap.put(stmtHashCode, tests);
	}
	
	static void addTestDescription(Description description) {
		testDescriptionMap.put(testCaseNum, description);
	}
	
	static void addToTestPassFailMap(Boolean passed) {
		testPassFailMap.put(testCaseNum, passed);
	}
	
	static int getPassTestNumByStmt(Integer stmtHashCode) {
		return getPassTestsRanByStmt(stmtHashCode).size();
	}
	
	static int getFailTestNumByStmt(Integer stmtHashCode) {
		return getFailTestsRanByStmt(stmtHashCode).size();
	}
	
	static HashSet<Integer> getTestsRanByStmt(Integer stmtHashCode) {
		return testStmtMap.getOrDefault(stmtHashCode, new HashSet<Integer>());
	}
	
	static HashSet<Integer> getFailTestsRanByStmt(Integer stmtHashCode) {
		HashSet<Integer> testsRan = testStmtMap.getOrDefault(stmtHashCode, new HashSet<Integer>());
		return (HashSet<Integer>) testsRan.stream().filter(key -> !testPassFailMap.getOrDefault(key, true)).collect(Collectors.toSet());
		
	}

	static HashSet<Integer> getPassTestsRanByStmt(Integer stmtHashCode) {
		HashSet<Integer> testsRan = testStmtMap.getOrDefault(stmtHashCode, new HashSet<Integer>());
		return (HashSet<Integer>) testsRan.stream().filter(key -> testPassFailMap.getOrDefault(key, false)).collect(Collectors.toSet());
		
	}
	
	
	
	
    public static void main(String[] args) {
        // TODO we decide to not restrict how you implement main class. So do as you wish to complete assignment 2.
    	
    	System.out.println("Main Started");
    	// System.out.println(ROOT_DIR + "/REPORTS");
    	// createTSV("ochiai", "randoop0", "");
    	// createReportDirectory("ochiai");
    	
    	String testClassName = "";
    	testClassName = "Subject_FaultRevealing0_ESTest";
    	
    	instrumentWithSoot();
    	runJunitTests(PACKAGE_NAME + "." + testClassName);
    	
    	
    	
    	System.out.println("##################################################################");
    	// System.out.println(Counter.failedMap);
    	System.out.println("##################################################################");
    	// System.out.println(Counter.successMap);
    	// System.out.println(ochiaiScore());
    	System.out.println(printFailingTestsByLineNumber());
    	System.out.println("Main Ended");
    	
    	
    	
    	
    	/*
		for (final Map.Entry<Integer, StatementInfo> entry : Counter.executedStatements.entrySet()) {
			System.out.print(entry.getValue().lineNumber);
			System.out.println(" - " + entry.getValue().statementString);
			System.out.printf("Total Passed: %d\n", getPassTestsRanByStmt(entry.getKey()).size());
			System.out.println(getPassTestsRanByStmt(entry.getKey()));
			System.out.printf("Total Failed: %d\n", getFailTestsRanByStmt(entry.getKey()).size());
			System.out.println(getFailTestsRanByStmt(entry.getKey()));
			System.out.println();
		}
		*/
    	
    	
    	

    }
    
    private static String printFailingTestsByLineNumber() {
    	HashMap<Integer, HashSet<Integer>> target = new HashMap<>();
    	
    	for (final Map.Entry<Integer, StatementInfo> entry : Counter.executedStatements.entrySet()) {
    		target.put(entry.getValue().lineNumber, getFailTestsRanByStmt(entry.getKey()));
    	}
    	
    	StringBuilder s = new StringBuilder();
    	
    	HashMap<Integer, HashSet<Integer>> targetSorted = 
    			target.entrySet().stream().sorted(Map.Entry.comparingByKey())
    			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    	
    	for (final Map.Entry<Integer, HashSet<Integer>> entry : targetSorted.entrySet()) {
    		s.append(entry.getKey());
    		s.append("\t");
    		s.append(entry.getValue());
    		s.append("\n");
    	}
    	return s.toString();
    }
    
    private static HashMap<Integer, Integer> calculateRanking(HashMap<Integer, Double> suspiciousScores) {
    	
    	HashMap<Integer, Integer> ochiaiRankings = new HashMap<Integer, Integer>();
    	
    	suspiciousScores.keySet().stream().forEach(stmtHashCode -> {
    		int N = 0;
    		int M = 0;
    		for (final Map.Entry<Integer, Double> e: suspiciousScores.entrySet()) {
    			if (e.getValue() > suspiciousScores.get(stmtHashCode)) N++;
    			if (e.getValue() >= suspiciousScores.get(stmtHashCode)) M++;
    		}
    		ochiaiRankings.put(stmtHashCode, (N+M+1)/2);
    	});
    	

    	HashMap<Integer, Integer> ochiaiRankingsSorted = 
    			ochiaiRankings.entrySet().stream().sorted(Map.Entry.comparingByValue())
    			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    	return ochiaiRankingsSorted;
    }
    
    private static HashMap<Integer, Double> jaccardScore() {
    	HashMap<Integer, Double> jaccardMap = new HashMap<>();
    	int Nf = Counter.failedTestCases;
    	int Ns = Counter.passedTestCases;

		for (final Map.Entry<Integer, StatementInfo> entry : Counter.executedStatements.entrySet()) {
			Integer stmtHashCode = entry.getKey();
			int Nef = getFailTestNumByStmt(stmtHashCode);
			int Nes = getPassTestNumByStmt(stmtHashCode);
			double jaccardScore = (Nef / (Nf + Nes));
			jaccardMap.put(stmtHashCode, jaccardScore);
		}
		
		HashMap<Integer, Double> sortedJaccardMap = 
				jaccardMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		return sortedJaccardMap;
    	
    }
    
    private static HashMap<Integer, Double> tarantulaScore() {
    	HashMap<Integer, Double> tarantulaMap = new HashMap<>();
    	int Nf = Counter.failedTestCases;
    	int Ns = Counter.passedTestCases;

		for (final Map.Entry<Integer, StatementInfo> entry : Counter.executedStatements.entrySet()) {
			Integer stmtHashCode = entry.getKey();
			int Nef = getFailTestNumByStmt(stmtHashCode);
			int Nes = getPassTestNumByStmt(stmtHashCode);
			double tarantulaScore = (Nef / Nf) / ((Nef / Nf) + (Nes / Ns));
			tarantulaMap.put(stmtHashCode, tarantulaScore);
		}
		
		HashMap<Integer, Double> sortedTarantulaMap = 
				tarantulaMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		return sortedTarantulaMap;
    	
    }
    
    private static HashMap<Integer, Double> ampleScore() {
    	HashMap<Integer, Double> ampleMap = new HashMap<>();
    	int Nf = Counter.failedTestCases;
    	int Ns = Counter.passedTestCases;

		for (final Map.Entry<Integer, StatementInfo> entry : Counter.executedStatements.entrySet()) {
			Integer stmtHashCode = entry.getKey();
			int Nef = getFailTestNumByStmt(stmtHashCode);
			int Nes = getPassTestNumByStmt(stmtHashCode);
			double ampleScore = Math.abs((Nef / Nf) - (Nes / Ns));
			ampleMap.put(stmtHashCode, ampleScore);
		}
		
		HashMap<Integer, Double> sortedAmpleMap = 
				ampleMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		return sortedAmpleMap;
    	
    	
    }
    
    
    private static HashMap<Integer, Double> ochiaiScore() {
    	HashMap<Integer, Double> ochiaiScoreMap = new HashMap<>();
    	int Nf = Counter.failedTestCases;
    	int Ns = Counter.passedTestCases;

		for (final Map.Entry<Integer, StatementInfo> entry : Counter.executedStatements.entrySet()) {
			Integer stmtHashCode = entry.getKey();
			int Nef = getFailTestNumByStmt(stmtHashCode);
			int Nes = getPassTestNumByStmt(stmtHashCode);
			Double ochiaiSimilarity = (Nef / Math.sqrt(Nf * (Nef + Nes)));
			ochiaiScoreMap.put(stmtHashCode, ochiaiSimilarity);
		}
		
		HashMap<Integer, Double> sortedOchiaiScoreMap = 
				ochiaiScoreMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		return sortedOchiaiScoreMap;
    }
    
    private static void instrumentWithSoot() {
        /*Set the soot-classpath to include the helper class and class to analyze*/
        Options.v().set_process_dir(Arrays.asList(CUT_PATH));
        // Options.v().set_soot_classpath(Scene.v().defaultClassPath() + classPathSeparator + targetPath + classPathSeparator + classUnderTestPath);
        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + CLASS_PATH_SEPARATOR + TESTCLASS_PATH + CLASS_PATH_SEPARATOR + CUT_PATH);
        // we set the soot output dir to target/classes so that the instrumented class can override the class file
        Options.v().set_output_dir(TESTCLASS_PATH);
        
        // retain line numbers
        Options.v().set_keep_line_number(true);
        // retain the original variable names
        Options.v().setPhaseOption("jb", "use-original-names:true");
        
        /* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");

        Instrumenter instrumenter = new Instrumenter();
        jtp.add(new Transform("jtp.instrumenter", instrumenter));
        
        // pass arguments to soot
		soot.Main.main(new String[] {CUT_NAME});

    }
    
    
    
    private static void runJunitTests(String testClassName) {
    	
    	Class<?> testClass = null;
    	try {
    		testClass = Class.forName(testClassName);
    		JUnitCore junit = new JUnitCore();
    		
    		junit.addListener(new RunListener() {
    			public void testStarted(Description description) {
    				
    				addTestDescription(description);
    				addToTestPassFailMap(true);
    				
    				
    			}
    			public synchronized void testFailure(Failure failure) {
    				Counter.failedTestCases++;
    				addToTestPassFailMap(false);
    				
    			}
    			public void testFinished(Description description) {
    				Counter.passedTestCases++;
    				
    				for (final Map.Entry<Integer, StatementInfo> entry : Counter.executedStatements.entrySet()) {
    					addToTestStmtMap(entry.getValue().stmtHashCode);
    				}
    				testCaseNum++;
    			}
    			
    		});
    		
    		
    		System.out.println("Running JUnit test: " + testClass.getName());
    		junit.run(testClass);
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	} finally {
    		System.out.printf("Total : %d\n", testCaseNum);
    		System.out.printf("Failed : %d\n", Counter.failedTestCases);
    		System.out.printf("Finished : %d\n", Counter.passedTestCases);
    	}
    }
    
    
    
    private static void createTSV(String algoName, String suiteName, String content) {
    	createReportDirectory(algoName);
    	try {
    		FileWriter fs = new FileWriter(REPORT_DIR + "/" + algoName + "/" 
    				+ FILENAME_PREFIX + algoName + "_" + suiteName + EXTENSION);
    		
    		fs.write("Method Signature\tStatement\tSuspicious Score\tRanking\n");
    		fs.write("Dummy Method\tasfasdfasfsafasfasfsf\t0.13123\t1");
    		fs.close();
    		
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	
    }
    
    private static void createReportDirectory(String algoName) {
    	File dir = new File(REPORT_DIR);
    	if (!dir.exists()) dir.mkdir();
    	File algoDir = new File(dir + "/" + algoName);
    	if (!algoDir.exists()) algoDir.mkdir();
    }
}
