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

public class ClientPage {
private WebDriver driver;
	
	private WebDriverWait wait;
	
	@FindBy(xpath = "//*[@id='top_nav_root']//*[text()='Clients']")
	private WebElement  clients;
	
	@FindBy(xpath="//*[@data-aqa='btnAddNewClient']")
	private WebElement addclientbutton;
	
	@FindBy(xpath="//*[@name='firstName']")
	private WebElement firstname;
	
	@FindBy(xpath="//*[@name='lastName']")
	private WebElement lastname;
		
	@FindBy(xpath="//*[@data-aqa='btnSaveClient']")
	private WebElement saveclient;
	
	public ClientPage(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void navToClients()
	{
		clients.click();
		
		driver.navigate().refresh();
	}
	
	public void addNewClient()
	{
		wait.until(ExpectedConditions.visibilityOf(addclientbutton));
		
		addclientbutton.click();
		
		firstname.sendKeys("Stewart");
		
		lastname.sendKeys("Richardson");
		
		saveclient.click();
	}
	

}
