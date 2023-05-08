package comp5111.assignment;

import java.util.Comparator;
import java.util.Map;

public class ReportData {

	public int lineNumber;
	public String methodSignature;
	public String statementString;
	public double suspiciousScore;
	public int ranking;
	public ReportData() {
	}
	public ReportData(int lineNumber, String methodSignature, String statementString, double suspiciousScore, int ranking) {
		this.lineNumber = lineNumber;
		this.methodSignature = methodSignature;
		this.statementString = statementString;
		this.suspiciousScore = suspiciousScore;
		this.ranking = ranking;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(this.methodSignature);
		s.append("\t");
		s.append(this.statementString);
		s.append("\t");
		s.append(String.format("%.10f\t", this.suspiciousScore));
		s.append(this.ranking);
		s.append("\n");
		
		return s.toString();
	}
	
	public String debugString() {
		StringBuilder s = new StringBuilder();
		s.append(this.lineNumber);
		s.append("\t");
		s.append(this.methodSignature);
		s.append("\t");
		s.append(this.statementString);
		s.append("\t");
		s.append(String.format("%.10f\t", this.suspiciousScore));
		s.append(this.ranking);
		s.append("\n");
		
		return s.toString();
		
	}
	
	public static class ReportDataComparator implements Comparator<ReportData> {
	
		@Override
		public int compare(ReportData o1, ReportData o2) {
	        int result = Double.compare(o1.ranking, o2.ranking);
	        
	        if (result == 0) {
	            result = o1.methodSignature.compareTo(o2.methodSignature);
	            
	            if (result == 0) {
	                result = o1.statementString.compareTo(o2.statementString);
	            }
	        }
	        
	        return result;
	    }
		
	}
	
	
	public static class DebugReportDataComparator implements Comparator<ReportData> {
		@Override
		public int compare(ReportData o1, ReportData o2) {
	        int result = Double.compare(o1.ranking, o2.ranking);
	        
	        if (result == 0) {
	            result = Integer.compare(o1.lineNumber, o2.lineNumber);
	            
	            if (result == 0) {
	                result = o1.statementString.compareTo(o2.statementString);
	            }
	        }
	        
	        return result;
	    }
	}
	
}
