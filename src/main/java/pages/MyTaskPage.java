package pages;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyTaskPage {
	
	private WebDriver driver;
	
	private WebDriverWait wait;
	
	@FindBy(xpath = "//*[@id='top_nav_root']//*[text()='My Tasks']")
	private WebElement  mytask;
	
	@FindBy(xpath="//*[@data-aqa='btnAddTask']")
	private WebElement addtask;
		
	@FindBy(xpath="//*[@name='title']")
	private WebElement tasktitle;
	
	@FindBy(xpath="//*[@class='search']")
	private WebElement associateclient;
	
	@FindBy(xpath="//*[@role='option']//span[text()='Barry Wane']")
	private WebElement selectclient;
	
	@FindBy(xpath="//*[@name='occurs']")
	private WebElement occurs;
	
	@FindBy(xpath="//*[@role='option']//span[text()='Just This Once']")
	private WebElement selectjustthisonce;
	
	@FindBy(xpath="//*[@name='dueDate']")
	private WebElement duedate;
	
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement submit;
	
	public MyTaskPage(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void navToMyTask()
	{
		mytask.click();
		
		driver.navigate().refresh();
		
	}
	
	public void addTask()
	{
		wait.until(ExpectedConditions.elementToBeClickable(addtask));
		
		addtask.click();
		
		tasktitle.sendKeys("Test title");
		
		associateclient.click();
		
		selectclient.click();
		
		occurs.click();
		
		selectjustthisonce.click();
		
		duedate.sendKeys("01/28/2023");
		
		submit.click();
	}
	

	
	
	
	
	
	

}
