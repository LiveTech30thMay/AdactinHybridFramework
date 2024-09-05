package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelPage {
	
	@FindBy(xpath="//select[@name='location']")
	WebElement locationDropdown;
	
	@FindBy(xpath="//select[@name='room_nos']")
	WebElement noOfRoomsDropdown;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	WebElement checkInDateTextbox;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	WebElement checkOutDateTextbox;
	
	@FindBy(xpath="//select[@name='adult_room']")
	WebElement adultsPerRoomDropdown;
	
	@FindBy(xpath="//input[@name='Submit']")
	WebElement searchButton;
	

}
