package keywords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class GenericKeywords extends BaseTest {
	
	public void startBrowser()
	{
		String browserName=configProperties.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
	}
	
	public void laucnhApp()
	{
		driver.get(configProperties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(configProperties.getProperty("implicitWait"))));
	}
	
	public void closeBrowser()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
	public void type(String locatorKey,String text)
	{
		//driver.findElement(By.xpath(locatorProperties.getProperty(locatorKey))).sendKeys(text);
		
		getElement(locatorKey).sendKeys(text);
	}
	
	public void click(String locatorKey)
	{
		getElement(locatorKey).click();
	}
	
	public void selectItemFromDropdown(String locatorKey,String option)
	{
		new Select(getElement(locatorKey)).selectByVisibleText(option);
	}
	
	public WebElement getElement(String locatorKey)
	{
		WebElement element=null;
		
		//Explicit wait 
		WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		myWait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
		
		element=driver.findElement(getLocator(locatorKey));
		
		return element;
		
	}
	
	public By getLocator(String locatorKey)
	{
		By by=null;
		if(locatorKey.endsWith("_id"))
		{
			by=By.id(locatorProperties.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("_name"))
		{
			by=By.name(locatorProperties.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("_linktext"))
		{
			by=By.linkText(locatorProperties.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("_xpath"))
		{
			by=By.xpath(locatorProperties.getProperty(locatorKey));
		}
		else
		{
			by=By.xpath(locatorProperties.getProperty(locatorKey));
		}
		return by;
	}
	
	public String getTitle()
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		return driver.getTitle();
		
	}

}
