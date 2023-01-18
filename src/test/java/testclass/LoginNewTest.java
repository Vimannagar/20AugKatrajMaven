package testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;
import utility.ReadProperties;

public class LoginNewTest extends TestNGListeners
{
		
	@Test(priority = 2)
	public void verifyLogin() throws IOException
	{
		loginpagenew.enterUsername(ReadProperties.readProp("username"), ReadProperties.readProp("password"));
		
		test.info("Entered username as "+ReadProperties.readProp("username"));
		
		test.info("Entered password as "+ReadProperties.readProp("password"));
		
		
		test.info("Clicked on final signin button");
		
	}
	
	
	@Test(priority = 1)
	public void validateTitle()
	{
		String actualtitle = loginpage.getTitleOfPage();
		
		boolean ispresent = actualtitle.contains("TheraNest");
		
		test.info("Verifying the title of page");
		
		Assert.assertEquals(ispresent, true);
		
		
	}

}
