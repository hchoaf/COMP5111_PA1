package comp5111.assignment;

import java.util.concurrent.ConcurrentHashMap;


public class Counter {
	
	static ConcurrentHashMap<Integer, StatementInfo> allStatements = new ConcurrentHashMap<>();
	
	static ConcurrentHashMap<Integer, StatementInfo> allBranches = new ConcurrentHashMap<>();
	
	static ConcurrentHashMap<Integer, StatementInfo> executedStatements = new ConcurrentHashMap<>();
	
	
	public static void addToExecutedStatements(int sourceLineNumber) {
		if (allStatements.containsKey(sourceLineNumber)) {
			executedStatements.put(sourceLineNumber, allStatements.get(sourceLineNumber));
		} else {
			throw new IllegalArgumentException("Statement in line " + sourceLineNumber + " does not exist.");
		}
	}
	
	
	public static int getRegisteredStatementsCount() {
		return allStatements.size();
	}
	
	public static int getRegisteredStatementsCount(String declaredClassName) {
		
		return 0;
	}
	
	
	
	static ConcurrentHashMap<Integer, Integer> nodeCover = new ConcurrentHashMap<>();
	// static HashMap<Integer, Integer> edgeCover = new HashMap<>();
	
	public static void visitNode(int stmtId) {
		nodeCover.put(stmtId, nodeCover.getOrDefault(stmtId, 0) + 1);
	}
	
	public static int getNodeCover(int stmtId) {
		return nodeCover.getOrDefault(stmtId, 0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    private static int numStaticInvocations = 0;
    private static int numInstanceInvocations = 0;

    public static void addStaticInvocation(int n) {
        numStaticInvocations += n;
    }

    public static void addInstanceInvocation(int n) {
        numInstanceInvocations += n;
    }

    public static int getNumInstanceInvocations() {
        return numInstanceInvocations;
    }

    public static int getNumStaticInvocations() {
        return numStaticInvocations;
    }
}
