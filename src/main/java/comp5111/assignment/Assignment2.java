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
	private static final String[] TEST_SUITE_CLASSES = {"Regression_0_Test", "Regression_1_Test", "Regression_2_Test", "Subject_FaultRevealing0_ESTest", "Subject_FaultRevealing1_ESTest", "Subject_FaultRevealing2_ESTest"};
	private static final String[] TEST_SUITE_NAMES = {"randoop0", "randoop1", "randoop2", "evosuite0", "evosuite1", "evosuite2"};
	private static final int MAX_LENGTH = 100;

	// private static final String[] TEST_SUITE_CLASSES = {"Subject_FaultRevealing0_ESTest", "Subject_FaultRevealing1_ESTest", "Subject_FaultRevealing2_ESTest"};
	// private static final String[] TEST_SUITE_NAMES = {"evosuite0", "evosuite1", "evosuite2"};
	
	private static final String[] ALGO_NAMES = {"ochiai", "jaccard", "tarantula", "ample"};
	
	
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
	static int failedTestCases = 0;
	static int totalTestCases = 0;

	
    public static void main(String[] args) {
        // TODO we decide to not restrict how you implement main class. So do as you wish to complete assignment 2.
    	
    	System.out.println("Main Started");
    	// System.out.println(ROOT_DIR + "/REPORTS");
    	// createTSV("ochiai", "randoop0", "");
    	// createReportDirectory("ochiai");
    	
    	
    	instrumentWithSoot();
    	


    	String testClassName = TEST_SUITE_CLASSES[4];
    	String algoName = "ochiai";
    	String fileName = "evosuite1";
    	
    	runJunitTests(PACKAGE_NAME + "." + testClassName);
    	createTSV(algoName, fileName, printContents(algoName));
    	System.out.println(printFailingTestsByLineNumber());
    	/*
    	System.out.println("Main Ended");
    	for (String algoName : ALGO_NAMES) {
    		for (int i = 0; i<TEST_SUITE_NAMES.length; i++) {
    			String testClassName = TEST_SUITE_CLASSES[i];
    			runJunitTests(PACKAGE_NAME + "." + testClassName);
    			
    			createTSV(algoName, TEST_SUITE_NAMES[i], printContents(algoName));
    			
    			
    			
    			
    			clearEverything();
    		}
    	}
    	*/
    	
    	

    }
    
    private static void clearEverything() {
    	Counter.resetMaps();
    	testDescriptionMap.clear();
    	testStmtMap.clear();
    	testPassFailMap.clear();
    	testCaseNum = 0;
    	failedTestCases = 0;
    	totalTestCases = 0;
    	
    }
    

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
	
	private static String printContents(String algoName) {
		HashMap<Integer, Double> suspiciousScores = new HashMap<>();
		if (algoName == "ochiai") {
			suspiciousScores = ochiaiScore();
		} else if (algoName == "jaccard") {
			suspiciousScores = jaccardScore();
		} else if (algoName == "ample") {
			suspiciousScores = ampleScore();
		} else if (algoName == "tarantula") {
			suspiciousScores = tarantulaScore();
		} else {
			throw new IllegalArgumentException("Wrong algo name");
		}
		
		HashMap<Integer, Integer> sortedRankings = calculateRanking(suspiciousScores);
		
		
		StringBuilder s = new StringBuilder();
		for (final Map.Entry<Integer, Integer> entry : sortedRankings.entrySet()) {
			int stmtHashCode = entry.getKey();
			s.append(Counter.allExecutedStatements.get(stmtHashCode).methodSignature);
			s.append("\t");
			s.append(Counter.allExecutedStatements.get(stmtHashCode).statementString);
			s.append("\t");
			s.append(String.format("%.8f\t", suspiciousScores.get(stmtHashCode)));
			s.append(entry.getValue());
			s.append("\n");
			
			
		}
		return s.toString();
	}
	
	
    private static String printFailingTestsByLineNumber() {
    	StringBuilder s = new StringBuilder();
    	HashMap<Integer, Integer> stmtLineNumberMap = new HashMap<>();
    	for (final Map.Entry<Integer, StatementInfo> entry : Counter.allExecutedStatements.entrySet()) {
    		stmtLineNumberMap.put(entry.getKey(), entry.getValue().lineNumber);
    	}
    	
    	HashMap<Integer, Integer> stmtLineNumberMapSorted = 
    			stmtLineNumberMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
    			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    			
    	for (final Map.Entry<Integer, Integer> entry : stmtLineNumberMapSorted.entrySet()) {
    		s.append(String.format("%1$-5s\t", entry.getValue().toString()));
    		String stmtString = Counter.allExecutedStatements.get(entry.getKey()).statementString;
    		if (stmtString.length() > MAX_LENGTH) {
    			s.append(String.format("%s\t", stmtString.substring(0, MAX_LENGTH)));
    		} else {
    			s.append(String.format("%1$-"+MAX_LENGTH+"s\t", Counter.allExecutedStatements.get(entry.getKey()).statementString));
    		}
    		s.append(getFailTestsRanByStmt(entry.getKey()));
    		s.append("\n");
    	}
    	
    	return s.toString();
    }
    
    private static HashMap<Integer, Integer> calculateRanking(HashMap<Integer, Double> suspiciousScores) {
    	
    	HashMap<Integer, Integer> rankings = new HashMap<Integer, Integer>();
    	
    	suspiciousScores.keySet().stream().forEach(stmtHashCode -> {
    		int N = 0;
    		int M = 0;
    		for (final Map.Entry<Integer, Double> e: suspiciousScores.entrySet()) {
    			if (e.getValue() > suspiciousScores.get(stmtHashCode)) N++;
    			if (e.getValue() >= suspiciousScores.get(stmtHashCode)) M++;
    		}
    		rankings.put(stmtHashCode, (N+M+1)/2);
    	});
    	

    	HashMap<Integer, Integer> rankingsSorted = 
    			rankings.entrySet().stream().sorted(Map.Entry.comparingByValue())
    			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    	return rankingsSorted;
    }
    
    private static HashMap<Integer, Double> jaccardScore() {
    	HashMap<Integer, Double> jaccardMap = new HashMap<>();
    	int Nf = failedTestCases;
    	int Ns = totalTestCases - failedTestCases;

		for (final Map.Entry<Integer, StatementInfo> entry : Counter.allExecutedStatements.entrySet()) {
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
    	int Nf = failedTestCases;
    	int Ns = totalTestCases - failedTestCases;

		for (final Map.Entry<Integer, StatementInfo> entry : Counter.allExecutedStatements.entrySet()) {
			Integer stmtHashCode = entry.getKey();
			int Nef = getFailTestNumByStmt(stmtHashCode);
			int Nes = getPassTestNumByStmt(stmtHashCode);
			double firstTerm = Nef/Nf;
			double secondTerm = Nes/Ns;
			double tarantulaScore = firstTerm / (firstTerm + secondTerm);
			tarantulaMap.put(stmtHashCode, tarantulaScore);
		}
		
		HashMap<Integer, Double> sortedTarantulaMap = 
				tarantulaMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		return sortedTarantulaMap;
    	
    }
    
    private static HashMap<Integer, Double> ampleScore() {
    	HashMap<Integer, Double> ampleMap = new HashMap<>();
    	int Nf = failedTestCases;
    	int Ns = totalTestCases - failedTestCases;

		for (final Map.Entry<Integer, StatementInfo> entry : Counter.allExecutedStatements.entrySet()) {
			Integer stmtHashCode = entry.getKey();
			int Nef = getFailTestNumByStmt(stmtHashCode);
			int Nes = getPassTestNumByStmt(stmtHashCode);
			double firstTerm = Nef / Nf;
			double secondTerm = Nes / Ns;
			// System.out.println(firstTerm);
			double ampleScore = Math.abs(firstTerm - secondTerm);
			ampleMap.put(stmtHashCode, ampleScore);
		}
		
		HashMap<Integer, Double> sortedAmpleMap = 
				ampleMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		return sortedAmpleMap;
    	
    	
    }
    
    
    private static HashMap<Integer, Double> ochiaiScore() {
    	HashMap<Integer, Double> ochiaiScoreMap = new HashMap<>();
    	int Nf = failedTestCases;
    	int Ns = totalTestCases - failedTestCases;

		for (final Map.Entry<Integer, StatementInfo> entry : Counter.allExecutedStatements.entrySet()) {
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
    				Counter.executedStatements.clear();
    				addTestDescription(description);
    				addToTestPassFailMap(true);
    				
    			}
    			public synchronized void testFailure(Failure failure) {
    				failedTestCases++;
    				addToTestPassFailMap(false);
    			}
    			public void testFinished(Description description) {
    				totalTestCases++;
    				
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
    		System.out.printf("Failed : %d\n", failedTestCases);
    		System.out.printf("Finished : %d\n", totalTestCases);
    	}
    }
    
    
    
    private static void createTSV(String algoName, String suiteName, String content) {
    	createReportDirectory(algoName);
    	try {
    		FileWriter fs = new FileWriter(REPORT_DIR + "/" + algoName + "/" 
    				+ FILENAME_PREFIX + algoName + "_" + suiteName + EXTENSION);
    		fs.write(String.format("Ranking and Score by %s algorithm\n", algoName));
    		fs.write("Method Signature\tStatement\tSuspicious Score\tRanking\n");
    		fs.write(content);
    		fs.close();
    		System.out.println("Report Created in : " + REPORT_DIR + "/" + algoName + "/" 
    				+ FILENAME_PREFIX + algoName + "_" + suiteName + EXTENSION);
    		
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
