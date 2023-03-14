package comp5111.assignment;

import soot.jimple.Stmt;
import soot.tagkit.LineNumberTag;

public class StatementInfo {
	public final int hashCode;
	public final int lineNumber;
	public final String statementString;
	public final String declaringClassName;
	
	public StatementInfo(int hashCode, int lineNumber, String statementString, String declaringClassName) {
		this.hashCode = hashCode;
		this.lineNumber = lineNumber;
		this.statementString = statementString;
		this.declaringClassName = declaringClassName;
	}
	
	public StatementInfo(Stmt stmt, String declaringClassName) {
		this.hashCode = stmt.hashCode();
		this.lineNumber = ((LineNumberTag) stmt.getTag("LineNumberTag")).getLineNumber();
		this.statementString = "|" + stmt + "|";
		this.declaringClassName = declaringClassName;
	}
	
	@Override
	public String toString() {
		return "|" + hashCode + "|" + lineNumber + "|" + statementString + "|" + declaringClassName + "|";
	}
	
	

}
