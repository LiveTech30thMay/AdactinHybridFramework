package testcases.regression;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;
import utils.UtilKit;

public class ValidateSearchHotelUsingHybrid1 extends BaseTest {
	
	@Test(dataProvider = "getTestData")
	public void validateLoginTest1(HashMap<String, String> dataMap) throws InterruptedException
	{
		
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.startBrowser();
		
		app.laucnhApp();
		
		app.type("username_textbox", dataMap.get("username"));
		
		app.type("password_textbox", dataMap.get("password"));
		
		app.click("login_button");
		
		app.verifyTitle(dataMap.get("expectedTitle"));
		
		app.selectItemFromDropdown("location_dropdown", dataMap.get("Location"));
		
		app.selectItemFromDropdown("noOfRooms_dropdown", dataMap.get("Number of Rooms"));
		
		app.clearAndType("checkInDate_textbox", dataMap.get("Check In Date"));
		
		app.clearAndType("checkOutDate_textbox", dataMap.get("Check Out Date"));
		
		app.click("search_button");
		
		Thread.sleep(3000);
		
		app.verifyTitle(dataMap.get("expectedTitle2"));
		
		app.closeBrowser();
		
		
	}
	
	@DataProvider
	public Object[][] getTestData()
	{
		
		Object[][] data=new Object[1][1];
		
		data[0][0]=UtilKit.getTestDataFromExcel("TC006");
		
		return data;
		
	}

}
