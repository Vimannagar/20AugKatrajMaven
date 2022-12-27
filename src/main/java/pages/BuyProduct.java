package pages;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyProduct {
	
	private WebDriver driver;
	
	private WebDriverWait wait;
	
	@FindBy(xpath = "(//*[@data-asin='B09GFPVD9Y']//div//h2//a)[1]")
	private WebElement  mobilelink;
	
	@FindBy(xpath="//*[@id='add-to-cart-button123']")
	private WebElement addtocart;
	
	public BuyProduct(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void addToCart()
	{
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		mobilelink.click();
		
		String parent = driver.getWindowHandle();
		
		Set<String> allwin = driver.getWindowHandles();
		
		for(String id :allwin)
		{
			if(!(id.equals(parent)))
			{
				driver.switchTo().window(id);
			}
		}
		
		addtocart.click();
		
	}
	

	
	
	
	
	
	

}
