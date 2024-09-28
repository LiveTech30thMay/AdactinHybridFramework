package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	//WebElements
	//methods on WebElements
	
	//WebElement usernameTextbox=driver.findElement(By.xpath("//input[@name='username']"));
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']") 
	WebElement usernameTextbox;
	
	@FindBy(xpath="//input[@name='password']") 
	WebElement passwordTextbox;
	
	@FindBy(xpath="//input[@name='login']") 
	WebElement loginButton;

	
	public void usernameTextbox(String text)
	{
		usernameTextbox.sendKeys(text);
		test.info("Entered text "+text+" into textbox "+usernameTextbox);
	}
	
	public void passwordTextbox(String text)
	{
		passwordTextbox.sendKeys(text);
		test.info("Entered text "+text+" into textbox "+passwordTextbox);
	}
	
	public void loginButton()
	{
		loginButton.click();
		test.info("Clicked button  "+loginButton);
	}
	
	
}
