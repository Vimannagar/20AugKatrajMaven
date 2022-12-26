package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private	WebDriver driver;

private	By searchtextbox = By.xpath("//*[@id='twotabsearchtextbox']");

private	By searchbutton = By.xpath("//*[@id='nav-search-submit-button']");


public HomePage(WebDriver driver)
{
	this.driver = driver;
	
}

public void searchProduct()
{
	driver.findElement(searchtextbox).sendKeys("Mobile phone");
	
	driver.findElement(searchbutton).click();
}






}
