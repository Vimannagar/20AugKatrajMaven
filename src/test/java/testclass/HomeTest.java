package testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
	
	
	
	@Test(priority = 3)
	public void validateSearch()
	{
		homepage.searchProduct();
	}
	
	
	@Test(priority = 4)
	public void verifyTitle()
	{
		String title = loginpage.getTitleOfPage();
		
		boolean ispresent = title.contains("Mobile");
		
		Assert.assertEquals(ispresent, true);
		
	}

}
