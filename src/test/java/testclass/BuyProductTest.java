package testclass;

import org.testng.annotations.Test;

public class BuyProductTest extends  BaseTest{
	
	@Test(priority = 5)
	public void verifyaddToCart()
	{
		buyproduct.addToCart();
	}

}
