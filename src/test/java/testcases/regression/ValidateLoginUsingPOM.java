package testcases.regression;


import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class ValidateLoginUsingPOM extends BaseTest {
	
	
	@Test
	public void validateLoginTest1()
	{
		//LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		LoginPage loginPage=new LoginPage();
		
		loginPage.usernameTextbox("reyaz0806");
		
		loginPage.passwordTextbox("reyaz123");
		
		loginPage.loginButton();
		
		loginPage.verifyTitle("Adactin.com - Search Hotel");
		
		
	}

}
