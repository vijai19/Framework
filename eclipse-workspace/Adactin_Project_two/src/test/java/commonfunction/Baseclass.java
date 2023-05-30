package commonfunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver = null;
	public static Properties properti = null;
	public static ExtentSparkReporter html;
	public static ExtentReports extent;
	public static ExtentTest test;

	Logger logger = Logger.getLogger(Baseclass.class);

	public Properties loadProperty() throws IOException {

		FileInputStream fileInput = new FileInputStream("config.properties");
		properti = new Properties();
		properti.load(fileInput);
		return properti;
	}

	@BeforeSuite
	public void launchingBrowser() throws IOException {
		html = new ExtentSparkReporter("extentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(html);

		PropertyConfigurator.configure("log4j.properties");
		loadProperty();
		String browser = properti.getProperty("browser");
		String url = properti.getProperty("url");

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			logger.info("launching the application");
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		}else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
		else if (browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
		logger.info("closing the application");
		driver.quit();

	}
}
