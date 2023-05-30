package testscripts;

import org.openqa.selenium.support.PageFactory;
import org.pageobjects.Login_Page;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import commonfunction.Baseclass;

public class Test_Pending_leave_Request extends Baseclass{
	
	Logger logger = Logger.getLogger(Test_Pending_leave_Request.class);
	@Test
	public void pendingThing() {
		
		PageFactory.initElements(driver, Login_Page.class);
		Login_Page.username.sendKeys(properti.getProperty("username"));
		Login_Page.password.sendKeys(properti.getProperty("password"));
		logger.info("user sucessfully logged into application");
		Login_Page.login_button.click();
		

	}

}
