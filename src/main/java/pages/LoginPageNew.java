package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPageNew {
	private	WebDriver driver;

	

	private	By email = By.xpath("//*[@name='Email']");

	private	By password = By.xpath("//*[@name='Password']");

	private	By loginbutton = By.xpath("//*[@type='submit']");

	private	By finalsignin = By.xpath("//*[@id='signInSubmit']");
		
		
		public LoginPageNew(WebDriver driver)
		{
			this.driver = driver;
		}
		
		public void enterUsername(String usname, String pwd)
		{
			driver.findElement(email).sendKeys(usname);
			
			driver.findElement(password).sendKeys(pwd);
			
			driver.findElement(loginbutton).click();
			
		}
		
		
		
		

}
