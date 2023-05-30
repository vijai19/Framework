package org.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {

	@FindBy(xpath = "//input[@name='username']")
	public static WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement password;
	
	@FindBy(xpath = "//input[@name='login']")
	public static WebElement login_button;
}
