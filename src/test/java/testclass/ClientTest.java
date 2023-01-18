package testclass;

import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;

public class ClientTest extends  TestNGListeners{
	
	@Test(priority = 5)
	public void verifyAddClient()
	{
		test.info("adding client to the system");
		clientpage.navToClients();
		
		clientpage.addNewClient();
		
		
	} 
	
	

}
