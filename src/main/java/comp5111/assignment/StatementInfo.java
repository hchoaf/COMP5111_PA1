package comp5111.assignment;


public class StatementInfo {
	public final int stmtHashCode;
	public final int lineNumber;
	public final String statementString;
	public final String declaringClassName;
	public final String methodSignature;
	
	public StatementInfo(int hashCode, int lineNumber, String statementString, String declaringClassName, String methodSignature) {
		this.stmtHashCode = hashCode;
		this.lineNumber = lineNumber;
		this.statementString = statementString;
		this.declaringClassName = declaringClassName;
		this.methodSignature = methodSignature;
	}
	
	@Override
	public String toString() {
		return "|" + stmtHashCode + "|" + lineNumber + "|" + statementString + "|" + declaringClassName + "|" + methodSignature + "|";
	}
	
	

}
