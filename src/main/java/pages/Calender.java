package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {
	
	private	WebDriver driver;

private	By calenderlink = By.xpath("//*[@id='top_nav_root']//*[text()='Calendar']");

private	By choosetime = By.xpath("//*[@class='dhx_scale_hour' and  text()='09:00 AM' ]");

		
private	By entertext	= By.xpath("//*[@class='dhx_cal_ltext']//textarea");

private	By servicetype = By.xpath("//ul[@class='select2-selection__rendered']");


private	By selectddvalue = By.xpath("(//*[@class='select2-results__options']//li)[2]");



private	By savebutton = By.xpath("//*[@class='dhx_save_btn']/following-sibling::div");



private By clientname = By.xpath("//*[@name='client']");

public Calender(WebDriver driver)
{
	this.driver = driver;
	
}

public void bookAppointment()
{
	driver.findElement(calenderlink).click();
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	Actions act = new Actions(driver);
	
	act.doubleClick(driver.findElement(choosetime)).perform();
}


public void enterDetails()
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	
	wait.until(ExpectedConditions.elementToBeClickable(entertext));
	
	driver.findElement(entertext).sendKeys("test text");
	
	driver.findElement(servicetype).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(selectddvalue));
	
	driver.findElement(selectddvalue).click();
	
	driver.findElement(clientname).sendKeys("Test client");
	
	driver.findElement(savebutton).click();
		
	
}





}
