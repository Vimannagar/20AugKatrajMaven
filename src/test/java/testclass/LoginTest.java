package testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;
import utility.ReadProperties;

public class LoginTest extends TestNGListeners
{
		
	@Test(priority = 2)
	public void verifyLogin() throws IOException
	{
		loginpage.enterUsername(ReadProperties.readProp("username"));
		
		test.info("Entered username as "+ReadProperties.readProp("username"));
		
		loginpage.enterPassword(ReadProperties.readProp("password"));
		
		test.info("Entered password as "+ReadProperties.readProp("password"));
		
		loginpage.finalSignin();
		
		test.info("Clicked on final signin button");
		
	}
	
	
	@Test(priority = 1)
	public void validateTitle()
	{
		String actualtitle = loginpage.getTitleOfPage();
		
		boolean ispresent = actualtitle.contains("Shopping");
		
		test.info("Verifying the title of page");
		
		Assert.assertEquals(ispresent, true);
		
		
	}

}
