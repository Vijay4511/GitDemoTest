package sampmaven;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReporterCls {
	
	static ExtentReports extent;
	public static ExtentReports GenerateReport()
	{
		
		String reportfile = System.getProperty("user.dir")+"\\reports\\report.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportfile);
		reporter.config().setDocumentTitle("QA Test Results");
		reporter.config().setReportName("Apsrtc Automation Execution");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("TeamName", "QA Automation");
		extent.setSystemInfo("Tester", "Vijay Kumar");
		
		return extent;
	}
	

}
