package testscripts;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.pageobjects.Search_Hotel_Page;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import commonfunction.Baseclass;

public class Test_User_Role extends Baseclass{
	Logger logger = Logger.getLogger(Test_User_Role.class);
	
	public void selectLocation() {
		Select pick = new Select(Search_Hotel_Page.location);
		pick.selectByValue("Sydney");

	}
	public void selectHotel() {
		Select hotel = new Select(Search_Hotel_Page.hotels);
		hotel.selectByValue("Hotel Sunshine");

	}
	public void selectRoomtypr() {
		Select roomtype = new Select(Search_Hotel_Page.roomtype);
		roomtype.selectByIndex(2);

	}
	public void selectNo_of_Rooms() {
		Select rooms = new Select(Search_Hotel_Page.no_of_rooms);
		rooms.selectByIndex(3);

	}
	public void selectCheckInDate() {
		Search_Hotel_Page.checkin_date.sendKeys("11/05/2023");

	}
	public void selectCheckOutDate() {
		Search_Hotel_Page.checkout_date.sendKeys("12/05/2023");

	}
	public void adultsPerRoom() {
		Select arooms = new Select(Search_Hotel_Page.Adults_count);
		arooms.selectByIndex(3);

	}
	public void childrensPerRoom()  {
		Select crooms = new Select(Search_Hotel_Page.childrens_count);
		crooms.selectByIndex(2);
		
		

	}
	public void clickSearchButton() {
		Search_Hotel_Page.search_button.click();
		
		
		

	}
	@Test
	public void fillDetails() throws InterruptedException  {
		
		PageFactory.initElements(driver, Search_Hotel_Page.class);
		selectLocation();
		// creates a toggle for the given test, adds all log events under it    
				test = extent.createTest("MyFirstTest", "Sample description");

				// log(Status, details)
				test.log(Status.INFO, "This step shows usage of log(status, details)");

				// info(details)
				test.info("This step shows usage of info(details)");

				// log with snapshot
				test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

				// test with snapshot
				test.addScreenCaptureFromPath("screenshot.png");
		selectHotel();
		selectRoomtypr();
		// creates a toggle for the given test, adds all log events under it    
				test = extent.createTest("MyFirstTest", "Sample description");

				// log(Status, details)
				test.log(Status.INFO, "This step shows usage of log(status, details)");

				// info(details)
				test.info("This step shows usage of info(details)");

				// log with snapshot
				test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

				// test with snapshot
				test.addScreenCaptureFromPath("screenshot.png");
		selectNo_of_Rooms();
		test.info("selected number of rooms");
		selectCheckInDate();
		test.info("entered  check in date");
		selectCheckOutDate();
		test.info("entered  check out date");
		adultsPerRoom();
		childrensPerRoom();
		clickSearchButton();
		
		logger.info("selected the details");
		
	}

}
