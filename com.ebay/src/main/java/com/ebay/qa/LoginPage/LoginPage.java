package com.ebay.qa.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.HomePage.HomePage;
import com.ebay.qa.TestBase.TestBase;

public class LoginPage extends TestBase {
	public WebDriver driver;
	
	

	
	//userName
	@FindBy(xpath="//input[@name='username']")
	WebElement userid1;
////	
	@FindBy(xpath="//input[@name='password']")
	WebElement password1;
//	
//	//Password
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
//	
//	@FindBy(xpath="//input[@id='SignINAjx']")
//	WebElement submit;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
//	public void popup() {
//		driver.switchTo().alert().dismiss();
//	}
//	
//	public void order() {
//		Loginbutton.click();
//		//return new HomePage();
//	}
//	
//	public void setup(String username) {
//		userid1.sendKeys(username);
//		continue1.click();
//		//return new HomePage();
//	}
	
	public HomePage pawenter1(String un, String pwd) {
		userid1.sendKeys(un);
		password1.sendKeys(pwd);
		submit.click();
		return new HomePage();
		
	}

}
