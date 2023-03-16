package comp5111.assignment;

import soot.*;


import soot.toolkits.graph.BriefUnitGraph;
import soot.toolkits.graph.UnitGraph;
import soot.jimple.*;
import soot.jimple.internal.JIdentityStmt;
import soot.util.Chain;


import java.util.HashSet;
import java.util.Iterator;

import java.util.Map;
import java.util.Set;


public class Instrumenter extends BodyTransformer{
	
	
	static SootClass counterClass, statementInfoClass;
	static SootMethod addStaticInvocationMethod, addInstanceInvocationMethod, visitNodeMethod, addToExecutedStatementsMethod;
	
	
	
	static {
		counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.Counter");
		statementInfoClass = Scene.v().loadClassAndSupport("comp5111.assignment.StatementInfo");
		addToExecutedStatementsMethod = counterClass.getMethod("void addToExecutedStatements(int)");
	}
	
	@Override
	protected void internalTransform(Body body, String phase, Map options) {
		SootMethod method = body.getMethod();
		String className = method.getDeclaringClass().getName();
		
		Chain<Unit> units = body.getUnits();
		Iterator<?> stmtIt = units.snapshotIterator();
	
		stmtIt = units.snapshotIterator();
		
		// Register Statements
		for (Unit u : units) {
			Stmt stmt = (Stmt) u;
			if (stmt instanceof JIdentityStmt) continue;
			int stmtHashCode = stmt.hashCode();
			int stmtLineNumber = stmt.getJavaSourceStartLineNumber();
			String stmtString = stmt.toString();
			
			StatementInfo stmtInfo = new StatementInfo(stmtHashCode, stmtLineNumber, stmtString, className);
			if (!Counter.registeredStatements.containsKey(stmt.hashCode())) {
				Counter.registeredStatements.put(stmtInfo.hashCode, stmtInfo);
			}
		}
		
        final UnitGraph cfg = new BriefUnitGraph(body);
        final Set<Unit> bodyStmts = new HashSet<>();
        
        for (Unit unit : cfg) {
        	if (unit instanceof JIdentityStmt) continue;
        	if (unit instanceof IfStmt || unit instanceof TableSwitchStmt || unit instanceof LookupSwitchStmt) {
        		Set<Integer> targets = new HashSet<>();
        		for (Unit successor : cfg.getSuccsOf(unit)) {
        			Stmt srcStmt = (Stmt) unit;
        			int srcHashCode = srcStmt.hashCode();
        			int srcLineNumber = srcStmt.getJavaSourceStartLineNumber();
        			String srcString = srcStmt.toString();
        			StatementInfo srcInfo = new StatementInfo(srcHashCode, srcLineNumber, srcString, className);
        			
        			Stmt dstStmt = (Stmt) successor;
        			int dstHashCode = dstStmt.hashCode();
        			int dstLineNumber = dstStmt.getJavaSourceStartLineNumber();
        			String dstString = dstStmt.toString();
        			StatementInfo dstInfo = new StatementInfo(dstHashCode, dstLineNumber, dstString, className);
        			BranchInfo brcInfo = new BranchInfo(srcInfo, dstInfo);
        			Counter.registeredBranches.put(brcInfo, 1);
        			targets.add(successor.hashCode());
        		}
        	}
        }
        
        
        

		
		while (stmtIt.hasNext()) {
			
			Stmt stmt = (Stmt) stmtIt.next();
			
			if (stmt instanceof JIdentityStmt) continue;
			
			
			int stmtHashCode = stmt.hashCode();
			
			InvokeExpr expr = null;
			
			expr = Jimple.v().newStaticInvokeExpr(addToExecutedStatementsMethod.makeRef(), IntConstant.v(stmtHashCode));
			Stmt incStmt = Jimple.v().newInvokeStmt(expr);
			units.insertBefore(incStmt, stmt);
			
			
			
		}
		
	}

}

