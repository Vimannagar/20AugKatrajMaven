package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperties {
	
	public static String readProp(String value) throws IOException
	{
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"//src//test//resources//TestData//config.properties";
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		prop.load(fis);
		
		String valuefromconfig = prop.getProperty(value);
		
		return valuefromconfig;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"//config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		
		String value = prop.getProperty("browser");
		
		System.out.println(value);	
		WebDriver driver;
		
		if(value.equalsIgnoreCase("chrome"))
		{
			 driver =  new ChromeDriver();
		}
		
		else if(value.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		
		
		
	}

}
