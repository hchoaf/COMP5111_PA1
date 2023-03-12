package comp5111.assignment;

import soot.*;

public class StatementInfo {
	public final int lineNumber;
	public final String statementString;
	public final String declaringClassName;
	
	public StatementInfo(int lineNumber, String statementString, String declaringClassName) {
		this.lineNumber = lineNumber;
		this.statementString = statementString;
		this.declaringClassName = declaringClassName;
	}
	
	@Override
	public String toString() {
		return "|" + lineNumber + "|" + statementString + "|" + declaringClassName + "|";
	}
	
	

}
