package testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;

public class HomeTest extends TestNGListeners {
	
	
	
	@Test(priority = 3)
	public void validateSearch()
	{
		homepage.searchProduct();
		
		test.info("product has been searched");
	}
	
	
	@Test(priority = 4)
	public void verifyTitle()
	{
		String title = loginpage.getTitleOfPage();
		
		boolean ispresent = title.contains("Mobile");
		
		test.info("verifying the title of the page");
		
		Assert.assertEquals(ispresent, true);
		
	}

}
