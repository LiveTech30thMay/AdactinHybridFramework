package testcases.regression;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.UtilKit;

public class ValidateLoginUsingPOMandDataProvider extends BaseTest {
	
	
	@Test(dataProvider = "getTestData")
	public void validateLoginTest1(HashMap<String, String> dataMap)
	{
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.usernameTextbox(dataMap.get("username"));
		
		loginPage.passwordTextbox(dataMap.get("password"));
		
		loginPage.loginButton();
		
		loginPage.verifyTitle(dataMap.get("expectedTitle"));
		
		
	}

	@DataProvider
	public Object[][]  getTestData()
	{
		Object[][] data=new Object[1][1];
		
		data[0][0]=UtilKit.getTestDataFromExcel("TC001");
		
		return data;
	}
}
