package testclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.BuyProduct;
import pages.Calender;
import pages.ClientPage;
import pages.HomePage;
import pages.LoginPage;
import pages.LoginPageNew;
import pages.MyTaskPage;
import utility.ReadProperties;

public class BaseTest {

public	static WebDriver driver;

public	LoginPage loginpage;

public	HomePage homepage;

public	BuyProduct buyproduct;

public LoginPageNew loginpagenew;

public MyTaskPage mytaskpage;

public ClientPage clientpage;


public Calender calender;

	@BeforeSuite
	public void initBrowser() throws InterruptedException, IOException {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(ReadProperties.readProp("testsiteurl"));
		
		driver.manage().deleteAllCookies();

		Thread.sleep(5000);
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

	@BeforeClass
	public void createObject() {
		loginpage = new LoginPage(driver);

		homepage = new HomePage(driver);

		buyproduct = new BuyProduct(driver);
		
		loginpagenew = new LoginPageNew(driver);
		
		calender = new Calender(driver);
		
		mytaskpage = new MyTaskPage(driver);
		
		clientpage = new ClientPage(driver);

	}

}
