package org.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Hotel_Page {
	@FindBy(xpath ="//select[@name='location']")
	public static WebElement location;
	
	@FindBy(xpath ="//select[@name='hotels']")
	public static WebElement hotels;
	
	@FindBy(xpath ="//select[@name='room_type']")
	public static WebElement roomtype;
	
	@FindBy(xpath ="//select[@name='room_nos']")
	public static WebElement no_of_rooms;
	
	@FindBy(xpath ="//input[@name='datepick_in']")
	public static WebElement checkin_date;
	
	
	@FindBy(xpath ="//input[@name='datepick_out']")
	public static WebElement checkout_date;
	
	
	@FindBy(xpath ="//select[@name='adult_room']")
	public static WebElement Adults_count;
	
	@FindBy(xpath ="//select[@name='child_room']")
	public static WebElement childrens_count;
	
	@FindBy(xpath ="//input[@name='Submit']")
	public static WebElement search_button;
}
