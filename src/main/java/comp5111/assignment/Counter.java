package comp5111.assignment;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;




public class Counter {
	
	static final int MAXLENGTH = 100;
	
	static int failedTestCases = 0;
	static int passedTestCases = 0;
	static int testCaseNumber = 0;
	
	
	/*
	static ConcurrentHashMap<Integer, HashSet<Integer>> failedMap = new ConcurrentHashMap<>();
	static ConcurrentHashMap<Integer, HashSet<Integer>> passedMap = new ConcurrentHashMap<>();
	
	static void addToFailedMap(Integer stmtHashCode) {
		System.out.println("addToFailedMap called");
		HashSet<Integer> set = new HashSet<Integer>();
		
		if (failedMap.containsKey(stmtHashCode)) {
			set = failedMap.get(stmtHashCode);
		}
		set.add(testCaseNum);
		failedMap.put(stmtHashCode, set);
		
		
	}
	
	static void addToPassedMap(Integer stmtHashCode) {
		System.out.println("addToPassedMap called");
		HashSet<Integer> set = new HashSet<Integer>();
		
		if (passedMap.containsKey(stmtHashCode)) {
			set = passedMap.get(stmtHashCode);
		}
		set.add(testCaseNum);
		passedMap.put(stmtHashCode, set);
	}
	*/
	
	static void resetMaps() {
		registeredStatements.clear();
		executedStatements.clear();
		registeredBranches.clear();
		executedBranches.clear();
		previousStmtHashCode = null;
	}
	static ConcurrentHashMap<Integer, StatementInfo> allExecutedStatements = new ConcurrentHashMap<>();
	
	static ConcurrentHashMap<Integer, StatementInfo> registeredStatements = new ConcurrentHashMap<>();
	
	static ConcurrentHashMap<Integer, StatementInfo> executedStatements = new ConcurrentHashMap<>();
	

	static ConcurrentHashMap<BranchInfo, Integer> registeredBranches = new ConcurrentHashMap<>();
	
	static ConcurrentHashMap<Map.Entry<Integer, Integer>, Integer> executedBranches = new ConcurrentHashMap<>();
	
	
	static Integer previousStmtHashCode = null;
	
	
	public static void addToExecutedStatements(int hashCode) {
		if (registeredStatements.containsKey(hashCode)) {
			executedStatements.put(hashCode, registeredStatements.get(hashCode));
			
			if (previousStmtHashCode != null) {
				Map.Entry<Integer, Integer> tmp = new AbstractMap.SimpleEntry<>(previousStmtHashCode, hashCode);
				executedBranches.put(tmp, executedBranches.getOrDefault(tmp, 0) + 1);
			}
			previousStmtHashCode = hashCode;
		} else {
			throw new IllegalArgumentException("Statement in line " + hashCode + " does not exist.");
		}
	}
	
	
	public static int getRegisteredStatementsCount() {
		return registeredStatements.size();
	}
	
	public static int getRegisteredStatementsCount(String declaredClassName) {
		return (int) registeredStatements.values().stream().filter(e -> (e.declaringClassName == declaredClassName)).count();
	}
	
	public static int getExecutedStatementsCount() {
		return executedStatements.size();
	}
	
	public static int getExecutedStatementsCount(String declaredClassName) {
		return (int) executedStatements.values().stream().filter(e -> (e.declaringClassName == declaredClassName)).count();
	}
	
	public static int getRegisteredBranchesCount() {
		return registeredBranches.size();
	}
	
	public static int getRegisteredBranchesCount(String declaredClassName) {
		return (int) registeredBranches.keySet().stream().filter(e -> (e.srcInfo.declaringClassName == declaredClassName)).count();
	}
	
	public static int getExecutedBranchesCount() {
		int count = 0;
		for (BranchInfo registeredBrcInfo : registeredBranches.keySet()) {
			int srcHashCode = registeredBrcInfo.srcInfo.stmtHashCode;
			int dstHashCode = registeredBrcInfo.dstInfo.stmtHashCode;
			if (srcHashCode != dstHashCode) {
				if (executedBranches.containsKey(new AbstractMap.SimpleEntry<>(srcHashCode, dstHashCode))) count++;
			}
		}
		return count;
	}
	
	public static int getExecutedBranchesCount(String declaredClassName) {
		int count = 0;
		for (BranchInfo registeredBrcInfo : registeredBranches.keySet().stream().filter(e -> (e.srcInfo.declaringClassName == declaredClassName)).collect(Collectors.toList())) {
			int srcHashCode = registeredBrcInfo.srcInfo.stmtHashCode;
			int dstHashCode = registeredBrcInfo.dstInfo.stmtHashCode;
			if (srcHashCode != dstHashCode) {
				if (executedBranches.containsKey(new AbstractMap.SimpleEntry<>(srcHashCode, dstHashCode))) count++;
			}
		}
		return count;
		
	}
	
	public static String returnAllStatements() {
		StringBuffer sb = new StringBuffer("[Coverage of Each Statement]\n");
		sb.append("_______________________________________________________________________________________________________________\n");
		sb.append(String.format("%-102s", "| Statement") + "|Covered?|\n");
		sb.append("|-----------------------------------------------------------------------------------------------------|-------|\n");
		for (Integer hashCode : registeredStatements.keySet()) {
			// System.out.println(hashCode);
			
			String methodName = registeredStatements.get(hashCode).statementString;
			if (methodName.length() > MAXLENGTH) {
				methodName = methodName.substring(0, 27) + "...";
			}
			if (methodName.length()>95) methodName = methodName.substring(90)+"...";
			sb.append("| " + String.format("%-100s", methodName) + (executedStatements.containsKey(hashCode) ? "|   Y   |\n" : "|   N   |\n"));
		}
		sb.append("---------------------------------------------------------------------------------------------------------------\n");
		return sb.toString();
	}
	
	public static String returnAllBranches() {
		StringBuffer sb = new StringBuffer("[Coverage of Each Branch]\n");
		sb.append("_______________________________________________________________________________________________________________\n");
		sb.append(String.format("%-102s", "Branch") + "|Covered?\n");
		sb.append("|-----------------------------------------------------------------------------------------------------|-------|\n");
		for (BranchInfo registeredBrcInfo : registeredBranches.keySet()) {
			int srcHashCode = registeredBrcInfo.srcInfo.stmtHashCode;
			int dstHashCode = registeredBrcInfo.dstInfo.stmtHashCode;
			String srcString = registeredStatements.get(srcHashCode).statementString;
			if (srcString.length()>88) srcString = srcString.substring(0,88)+"...";
			String dstString = registeredStatements.get(dstHashCode).statementString;
			if (dstString.length()>85) dstString = dstString.substring(0,85)+"...";
			Boolean executed = executedBranches.containsKey(new AbstractMap.SimpleEntry<>(srcHashCode, dstHashCode));
			sb.append("| Source: " + String.format("%-92s", srcString) + ((executed) ? "|   Y   |\n" : "|   N   |\n"));
			sb.append("|   Target: " + String.format("%-90s", dstString) + "|       |\n");
			
		}
		sb.append("---------------------------------------------------------------------------------------------------------------\n");
		return sb.toString();
		
	}
	
	
	
	
	
		
}
