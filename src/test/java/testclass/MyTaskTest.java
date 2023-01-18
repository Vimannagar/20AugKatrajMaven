package testclass;

import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;

public class MyTaskTest extends  TestNGListeners{
	
	@Test(priority = 4)
	public void verifyaddToCart()
	{
		test.info("adding the product inside the cart");
		mytaskpage.navToMyTask();
		
		mytaskpage.addTask();
		
		
	}

}
