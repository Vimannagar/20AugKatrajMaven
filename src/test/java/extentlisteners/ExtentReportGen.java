package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utility.TimeStampPrinter;

public class ExtentReportGen {
	static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator()
	{
		
		String filename = "KatrajBatchReport"+TimeStampPrinter.getCurrentTime()+ ".html";
		String path = System.getProperty("user.dir")+"//reports//"+filename;
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		
		reporter.config().setTheme(Theme.STANDARD);
		
		reporter.config().setReportName("Amazon Test Report");
				
		 extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Environment", "SIT");
		
		extent.setSystemInfo("Executed by", "Katraj Batch");
		
		extent.setSystemInfo("Browser", "Chrome");
		
		return extent;
		
		
	}

}
