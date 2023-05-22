package launching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowser {
	WebDriver driver = null;

	@Parameters("browsername")
	@BeforeTest
	public void lauchingBrowser(String browsername) {

		System.out.println("Browser name is :" + browsername);

		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browsername.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}

	}

	@Test
	public void preform() throws Exception {
		driver.get("https://www.youtube.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='search']"))
		.sendKeys("automation step by step");
        
		Thread.sleep(3000);

	}

	
	  @Test public void preformtonext() throws Exception  {
	  driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
	  Thread.sleep(6000);
	  }
	 
	@AfterTest
	public void closethebrowser() {
		driver.close();

	}

}
