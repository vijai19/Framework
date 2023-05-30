package org.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Book_Hotel_Page {

	@FindBy(xpath ="//input[@name='radiobutton_0']")
	public static WebElement button;
	
	@FindBy(xpath ="//*[@id=\"continue\"]")
	public static WebElement clickContinue;
	
	@FindBy(xpath ="//*[@id=\"first_name\"]")
	public static WebElement fname;
	
	@FindBy(xpath ="//*[@id=\"last_name\"]")
	public static WebElement lname;
	
	@FindBy(xpath ="//*[@id=\"address\"]")
	public static WebElement billing_address;
	
	@FindBy(xpath ="//*[@id=\"cc_num\"]")
	public static WebElement credit_num;
	
	@FindBy(xpath ="//*[@id=\"cc_type\"]")
	public static WebElement credit_type;
	
	@FindBy(xpath ="//*[@id=\"cc_exp_month\"]")
	public static WebElement selectmonth;
	
	@FindBy(xpath ="//*[@id=\"cc_exp_year\"]")
	public static WebElement selectyear;
	
	@FindBy(xpath ="//*[@id=\"cc_cvv\"]")
	public static WebElement cvv_number;
	
	@FindBy(xpath ="//*[@id=\"book_now\"]")
	public static WebElement book_now;
	
	@FindBy(xpath ="//*[@id=\"order_no\"]")
	public static WebElement order_num;
	
	@FindBy(xpath ="//*[@id=\"logout\"]")
	public static WebElement logout;
}
