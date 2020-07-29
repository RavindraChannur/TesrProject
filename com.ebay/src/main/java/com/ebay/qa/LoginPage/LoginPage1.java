package com.ebay.qa.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.TestBase.TestBase;

public class LoginPage1 extends TestBase {
	LoginPage1 login;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/span[1]/a[1]")
	WebElement Loginbutton;
	
	
	public LoginPage1() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage login() {
		Loginbutton.click();
		return new LoginPage();
	}
	
	
}
