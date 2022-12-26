package testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.ReadProperties;

public class LoginTest extends BaseTest
{
		
	@Test(priority = 2)
	public void verifyLogin() throws IOException
	{
		loginpage.enterUsername(ReadProperties.readProp("username"));
		
		loginpage.enterPassword(ReadProperties.readProp("password"));
		
		loginpage.finalSignin();
	}
	
	
	@Test(priority = 1)
	public void validateTitle()
	{
		String actualtitle = loginpage.getTitleOfPage();
		
		boolean ispresent = actualtitle.contains("Shopping");
		
		Assert.assertEquals(ispresent, true);
	}

}
