package testclass;

import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;

public class CalenderTest extends  TestNGListeners{
	
	@Test(priority = 3)
	public void validateAppt()
	{
		test.info("booking appointment");
		calender.bookAppointment();
		
		calender.enterDetails();
		
	}

}
