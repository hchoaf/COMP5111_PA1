package comp5111.assignment;

import java.util.AbstractMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;




public class Counter {
	
	static ConcurrentHashMap<Integer, StatementInfo> allStatements = new ConcurrentHashMap<>();
	
	static ConcurrentHashMap<Integer, StatementInfo> executedStatements = new ConcurrentHashMap<>();
	

	static ConcurrentHashMap<BranchInfo, Integer> registeredBranches = new ConcurrentHashMap<>();
	
	static ConcurrentHashMap<Map.Entry<Integer, Integer>, Integer> executedBranches = new ConcurrentHashMap<>();
	
	
	static Integer previousStmtHashCode = null;
	
	
	public static void addToExecutedStatements(int hashCode) {
		if (allStatements.containsKey(hashCode)) {
			executedStatements.put(hashCode, allStatements.get(hashCode));
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
		return allStatements.size();
	}
	
	public static int getRegisteredStatementsCount(String declaredClassName) {
		return (int) allStatements.values().stream().filter(e -> (e.declaringClassName == declaredClassName)).count();
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
			int srcHashCode = registeredBrcInfo.srcInfo.hashCode;
			int dstHashCode = registeredBrcInfo.dstInfo.hashCode;
			if (srcHashCode != dstHashCode) {
				if (executedBranches.containsKey(new AbstractMap.SimpleEntry<>(srcHashCode, dstHashCode))) count++;
			}
		}
		return count;
	}
	
	public static int getExecutedBranchesCount(String declaredClassName) {
		int count = 0;
		for (BranchInfo registeredBrcInfo : registeredBranches.keySet().stream().filter(e -> (e.srcInfo.declaringClassName == declaredClassName)).collect(Collectors.toList())) {
			int srcHashCode = registeredBrcInfo.srcInfo.hashCode;
			int dstHashCode = registeredBrcInfo.dstInfo.hashCode;
			if (srcHashCode != dstHashCode) {
				if (executedBranches.containsKey(new AbstractMap.SimpleEntry<>(srcHashCode, dstHashCode))) count++;
			}
		}
		return count;
		
	}
		
}
