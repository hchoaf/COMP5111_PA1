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
	
	
	static SootClass counterClass;
	static SootMethod addStaticInvocationMethod, addInstanceInvocationMethod, visitNodeMethod, addToExecutedStatementsMethod;
	
	
	
	static {
		counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.Counter");
		addToExecutedStatementsMethod = counterClass.getMethod("void addToExecutedStatements(int)");
	}
	
	@Override
	protected void internalTransform(Body body, String phase, Map options) {
		System.out.println(counterClass);
		SootMethod method = body.getMethod();
		// if (!method.getDeclaringClass().toString().equals("comp5111.assignment.cut.Subject$CharTasks")) return;
		// System.out.println("#############################################################");
		// System.out.println("Instrumenting method: " + method.getSignature());
		// System.out.println("Instrumenting body: " + body.toString());
		String className = method.getDeclaringClass().getName();
		
		Chain<Unit> units = body.getUnits();
		// System.out.println(units.size());
		Iterator<?> stmtIt = units.snapshotIterator();
	
		stmtIt = units.snapshotIterator();
		
		// Register Statements
		for (Unit u : units) {
			Stmt stmt = (Stmt) u;
			if (stmt instanceof JIdentityStmt) continue;
			StatementInfo stmtInfo = new StatementInfo(stmt, className);
			if (!Counter.allStatements.containsKey(stmt.hashCode())) {
				Counter.allStatements.put(stmtInfo.hashCode, stmtInfo);
			}
			
			if (stmt instanceof IfStmt) {
				// units.getSuccOf(stmt).getUni
			}
		}
		
        final UnitGraph cfg = new BriefUnitGraph(body);
        final Set<Unit> bodyStmts = new HashSet<>();
        
        for (Unit unit : cfg) {
        	if (unit instanceof JIdentityStmt) continue;
        	if (unit instanceof IfStmt || unit instanceof TableSwitchStmt || unit instanceof LookupSwitchStmt) {
        		Set<Integer> targets = new HashSet<>();
        		for (Unit successor : cfg.getSuccsOf(unit)) {
        			StatementInfo srcStmtInfo = new StatementInfo((Stmt) unit, className);
        			StatementInfo dstStmtInfo = new StatementInfo((Stmt) successor, className);
        			Counter.registeredBranches.put(srcStmtInfo, dstStmtInfo);
        			targets.add(successor.hashCode());
        		}
        	}
        }
        
        
        

		
		while (stmtIt.hasNext()) {
			
			Stmt stmt = (Stmt) stmtIt.next();
			
			if (stmt instanceof JIdentityStmt) continue;
			
			if (stmt instanceof IfStmt) {
			}
			
			
			int stmtHashCode = stmt.hashCode();
			
			
			
			InvokeExpr expr = null;
			
			expr = Jimple.v().newStaticInvokeExpr(addToExecutedStatementsMethod.makeRef(), IntConstant.v(stmtHashCode));
			Stmt incStmt = Jimple.v().newInvokeStmt(expr);
			units.insertBefore(incStmt, stmt);
			
			
			
		}
		
	}

}

