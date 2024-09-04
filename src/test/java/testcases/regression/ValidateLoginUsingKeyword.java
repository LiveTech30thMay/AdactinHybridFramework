package testcases.regression;

import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateLoginUsingKeyword extends BaseTest {
	
	@Test
	public void validateLoginTest1()
	{
		
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.startBrowser();
		
		app.laucnhApp();
		
		app.type("username_textbox", "reyaz0806");
		
		app.type("password_textbox", "reyaz123");
		
		app.click("login_button");
		
		app.verifyTitle("Adactin.com - Search Hotel");
		
		app.closeBrowser();
		
		
	}

}
