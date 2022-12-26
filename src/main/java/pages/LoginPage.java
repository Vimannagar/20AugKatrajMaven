package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class LoginPage {

private	WebDriver driver;

private	By hoverelement = By.xpath("//*[@id='nav-link-accountList']");

private	By signinhover = By.xpath("//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-button']");

private	By email = By.xpath("//*[@id='ap_email']");

private	By continueemail = By.xpath("//*[@type='submit']");

private	By passwordtext = By.xpath("//*[@id='ap_password']");

private	By finalsignin = By.xpath("//*[@id='signInSubmit']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUsername(String usname)
	{
		WebElement hover = driver.findElement(hoverelement);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(hover).perform();
		
		driver.findElement(signinhover).click();
		
		
		
		driver.findElement(email).sendKeys(usname);
		
		driver.findElement(continueemail).click();
		
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(passwordtext).sendKeys(pwd);
	}
	
	public void finalSignin()
	{
		driver.findElement(finalsignin).click();
	}
	
	public String getTitleOfPage()
	{
		String title = driver.getTitle();
		
		System.out.println(title);
		
		return title;
	}
	
	

}
