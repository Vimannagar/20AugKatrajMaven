package extentlisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testclass.BaseTest;
import utility.Screenshot;

public class TestNGListeners extends BaseTest   implements ITestListener {

	public ExtentReports extent = ExtentReportGen.extentReportGenerator();
	
	public static ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started : "+ result.getName());
		
		 test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed : "+ result.getName());
		
		test.log(Status.PASS, "Test case passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
System.out.println("Test case failed : "+ result.getName());

		test.fail(result.getThrowable());
		
		Screenshot sc = new Screenshot();
		
		try {
			String path = sc.captureScreenShot(driver, result.getName());
			
			test.addScreenCaptureFromPath(path);
		} 
		catch (Exception e) {
			
			String message = e.getMessage();
			
			System.out.println(message);
			
			System.out.println("Inside catch block of test failure method");
			
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped : "+ result.getName());	
		
		test.log(Status.SKIP, "Test case got skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test tag started : "+ context.getName());	
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag finished : "+ context.getName());
		
		extent.flush();
	}
	
	

}
