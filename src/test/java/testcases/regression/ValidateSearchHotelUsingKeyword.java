package testcases.regression;

import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateSearchHotelUsingKeyword extends BaseTest {
	
	@Test
	public void validateLoginTest1() throws InterruptedException
	{
		
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.startBrowser();
		
		app.laucnhApp();
		
		app.type("username_textbox", "reyaz0806");
		
		app.type("password_textbox", "reyaz123");
		
		app.click("login_button");
		
		app.verifyTitle("Adactin.com - Search Hotel");
		
		app.selectItemFromDropdown("location_dropdown", "London");
		
		app.selectItemFromDropdown("noOfRooms_dropdown", "2 - Two");
		
		app.clearAndType("checkInDate_textbox", "06/09/2024");
		
		app.clearAndType("checkOutDate_textbox", "07/09/2024");
		
		app.click("search_button");
		
		Thread.sleep(3000);
		
		app.closeBrowser();
		
		
	}

}
