package testscripts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.pageobjects.Book_Hotel_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunction.Baseclass;

public class Book_Hotel extends Baseclass {

	public void clickRadioButton() {
		Book_Hotel_Page.button.click();
	}

	public void clickContinueButton() {
		Book_Hotel_Page.clickContinue.click();
	}

	public void enter_Fname() {
		Book_Hotel_Page.fname.sendKeys("Aegon");

	}

	public void enter_Lname() {
		Book_Hotel_Page.lname.sendKeys("Aegon");

	}

	public void enter_Baddress() {
		Book_Hotel_Page.billing_address.sendKeys("chenai");

	}

	public void cNumber() {
		Book_Hotel_Page.credit_num.sendKeys("1234567890098765");

	}

	public void cType() {
		Select type = new Select(Book_Hotel_Page.credit_type);
		type.selectByIndex(2);
	}

	public void sMonth() {
		Select type = new Select(Book_Hotel_Page.selectmonth);
		type.selectByIndex(10);
	}

	public void sYear() {
		Select type = new Select(Book_Hotel_Page.selectyear);
		type.selectByIndex(17);
	}

	public void cvv_Num() {
		Book_Hotel_Page.cvv_number.sendKeys("111");
	}

	public void bookNow() {
		Book_Hotel_Page.book_now.click();
	}
	public void order_number() {
	String value =	Book_Hotel_Page.order_num.getAttribute("value");
	
	
	Assert.assertEquals(value, value);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	public void logging_out() {
		Book_Hotel_Page.logout.click();
	}


	@Test
	public void bookingConfirmation() {
		PageFactory.initElements(driver, Book_Hotel_Page.class);
		
		clickRadioButton();
		clickContinueButton();
		enter_Fname();
		enter_Lname();
		enter_Baddress();
		cNumber();
		cType();
		sMonth();
		sYear();
		cvv_Num();
		bookNow();
		order_number();
		logging_out();
		
	}

}
