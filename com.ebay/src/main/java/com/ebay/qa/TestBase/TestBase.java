package com.ebay.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;

	public TestBase() {
		try {
			 prop = new Properties();
			FileInputStream f2 = new FileInputStream(
					"D:\\Channur\\Selenium Projects\\com.ebay\\src\\main\\java\\com\\ebay\\qa\\config\\config.properties");
			prop.load(f2);
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void initialization1() {
		String BrowserNw = prop.getProperty("Browser");
		if (BrowserNw.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Channur\\Selenium Projects\\Test\\driver32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (BrowserNw.equals("IE")) {
			System.setProperty("webdriver.internet.driver",
					"D:\\Channur\\Selenium Projects\\Test\\driver32\\chromedriver.exe");
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}

}
