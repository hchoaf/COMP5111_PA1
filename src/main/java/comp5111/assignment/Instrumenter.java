package comp5111.assignment;

import soot.*;

import soot.tagkit.LineNumberTag;
import soot.jimple.*;
import soot.jimple.internal.JIdentityStmt;
import soot.util.Chain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Instrumenter extends BodyTransformer{
	
	
	static SootClass counterClass;
	static SootMethod addStaticInvocationMethod, addInstanceInvocationMethod, visitNodeMethod, addToExecutedStatementsMethod;
	
	static ConcurrentHashMap<Unit, Integer> allStmts = new ConcurrentHashMap<>();
	
	static int outsideCount = 0;
	static int insideCount = 0;
	
	
	static {
		counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.Counter");
		addStaticInvocationMethod = counterClass.getMethod("void addStaticInvocation(int)");
		addInstanceInvocationMethod = counterClass.getMethod("void addInstanceInvocation(int)");
		visitNodeMethod = counterClass.getMethod("void visitNode(int)");
		addToExecutedStatementsMethod = counterClass.getMethod("void addToExecutedStatements(int)");
	}
	
	@Override
	protected void internalTransform(Body body, String phase, Map options) {
		SootMethod method = body.getMethod();
		// if (!method.getDeclaringClass().toString().equals("comp5111.assignment.cut.Subject$CharTasks")) return;
		// System.out.println("#############################################################");
		// System.out.println("Instrumenting method: " + method.getSignature());
		// System.out.println("Instrumenting body: " + body.toString());
		
		
		Chain<Unit> units = body.getUnits();
		// System.out.println(units.size());
		Iterator<?> stmtIt = units.snapshotIterator();
	
		stmtIt = units.snapshotIterator();
		

		List<Unit> branchUnits = new ArrayList<Unit>();
		
		for (Unit u : units) {
			Stmt stmt = (Stmt) u;
			if (stmt instanceof JIdentityStmt) continue;
			outsideCount++;
			
			System.out.println(u.hashCode() + "  -  " + u.getJavaSourceStartLineNumber());
		}
		
		while (stmtIt.hasNext()) {
			Stmt stmt = (Stmt) stmtIt.next();
			if (stmt instanceof JIdentityStmt) continue;
			insideCount++;
			// if (stmt.containsInvokeExpr()) continue;
			// System.out.println(stmt);
			// if (!stmt.hasTag("LineNumberTag")) continue;
			int stmtLineNumber = ((LineNumberTag) stmt.getTag("LineNumberTag")).getLineNumber();
			String stmtString = "|" + stmt + "|";
			String stmtDeclaringClassName = body.getMethod().getDeclaringClass().getName();
			
			// System.out.println(stmt.hashCode());
			if (stmt instanceof IfStmt) {
			}
			StatementInfo stmtInfo = new StatementInfo(stmtLineNumber, stmtString, stmtDeclaringClassName);
			String debugMessage = stmtLineNumber + ":::" + stmt;
			// System.out.println(debugMessage);
			
			if (stmt instanceof JIdentityStmt) {
			}
			
			
			if (!Counter.allStatements.containsKey(stmt.hashCode())) {
				Counter.allStatements.put(stmt.hashCode(), stmtInfo);
			}
			
			
			
			
			
			
			InvokeExpr expr = null;
			
			expr = Jimple.v().newStaticInvokeExpr(addToExecutedStatementsMethod.makeRef(), IntConstant.v(stmt.hashCode()));
			Stmt incStmt = Jimple.v().newInvokeStmt(expr);
			units.insertBefore(incStmt, stmt);
			
			
			
		}
		
	}

}

