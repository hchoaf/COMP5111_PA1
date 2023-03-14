package comp5111.assignment;


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
	
	@Override
	public String toString() {
		return "|" + hashCode + "|" + lineNumber + "|" + statementString + "|" + declaringClassName + "|";
	}
	
	

}
