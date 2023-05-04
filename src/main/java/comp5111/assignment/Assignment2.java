package comp5111.assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment2 {
	private static final String ROOT_DIR = System.getProperty("user.dir");
	private static final String EXTENSION = ".tsv";
	private static final String REPORT_DIR = ROOT_DIR + "/assignment2-reports";
	private static final String FILENAME_PREFIX = "spectrum_fl_";
	
	
    public static void main(String[] args) {
        // TODO we decide to not restrict how you implement main class. So do as you wish to complete assignment 2.
    	System.out.println(ROOT_DIR + "/REPORTS");
    	createTSV("ochiai", "randoop0", "");
    	// createReportDirectory("ochiai");
    }
    
    
    
    private static String ochiaiScore() {
    	StringBuilder s = new StringBuilder();
    	
    	
    	
    	
    	
    	return s.toString();
    }
    
    private static void createTSV(String algoName, String suiteName, String content) {
    	createReportDirectory(algoName);
    	try {
    		FileWriter fs = new FileWriter(REPORT_DIR + "/" + algoName + "/" 
    				+ FILENAME_PREFIX + algoName + "_" + suiteName + EXTENSION);
    		
    		fs.write("Method Signature\tStatement\tSuspicious Score\tRanking\n");
    		fs.write("Dummy Method\tasfasdfasfsafasfasfsf\t0.13123\t1");
    		fs.close();
    		
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	
    }
    
    private static void createReportDirectory(String algoName) {
    	File dir = new File(REPORT_DIR);
    	if (!dir.exists()) dir.mkdir();
    	File algoDir = new File(dir + "/" + algoName);
    	if (!algoDir.exists()) algoDir.mkdir();
    }
}
