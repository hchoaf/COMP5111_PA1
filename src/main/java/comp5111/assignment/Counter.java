package comp5111.assignment;

import java.util.concurrent.ConcurrentHashMap;




public class Counter {
	
	static ConcurrentHashMap<Integer, StatementInfo> allStatements = new ConcurrentHashMap<>();
	
	static ConcurrentHashMap<Integer, StatementInfo> executedStatements = new ConcurrentHashMap<>();

	static ConcurrentHashMap<StatementInfo, StatementInfo> registeredBranches = new ConcurrentHashMap<>();
	
	static ConcurrentHashMap<StatementInfo, StatementInfo> executedBranches = new ConcurrentHashMap<>();
	
	static Integer previousStmtHashCode = null;
	
	
	public static void addToExecutedStatements(int hashCode) {
		if (allStatements.containsKey(hashCode)) {
			executedStatements.put(hashCode, allStatements.get(hashCode));
			if (previousStmtHashCode != null) {
				executedBranches.put(allStatements.get(previousStmtHashCode), allStatements.get(hashCode));
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
		
}
