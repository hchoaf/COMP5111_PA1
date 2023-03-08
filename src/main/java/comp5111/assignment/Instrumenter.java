package comp5111.assignment;

import soot.*;
import soot.jimple.*;
import soot.util.Chain;

import java.util.Iterator;
import java.util.Map;

public class Instrumenter extends BodyTransformer{
	
	static SootClass counterClass;
	static SootMethod addStaticInvocationMethod, addInstanceInvocationMethod;
	
	static {
		counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.Counter");
		addStaticInvocationMethod = counterClass.getMethod("void addStaticInvocation(int)");
		addInstanceInvocationMethod = counterClass.getMethod("void addInstanceInvocation(int)");
	}
	
	@Override
	protected void internalTransform(Body body, String phase, Map options) {
		SootMethod method = body.getMethod();
		
		if (method.isConstructor() || method.isStaticInitializer()) {
			return;
		}
		
		System.out.println("Instrumenting method: " + method.getSignature());
		
		Chain<Unit> units = body.getUnits();
		
		Iterator<?> stmtIt = units.snapshotIterator();
		
		while (stmtIt.hasNext()) {
			Stmt stmt = (Stmt) stmtIt.next();
			
			
			if (stmt instanceof ReturnStmt || stmt instanceof ReturnVoidStmt) {
				InvokeExpr incExpr = null;
				if (method.isStatic() ) {
					incExpr = Jimple.v().newStaticInvokeExpr(addStaticInvocationMethod.makeRef(), IntConstant.v(1));
				} else {
					incExpr = Jimple.v().newStaticInvokeExpr(addInstanceInvocationMethod.makeRef(), IntConstant.v(1));
				}
				
				Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);
				
				units.insertBefore(incStmt, stmt);
			}
		}
	}

}
