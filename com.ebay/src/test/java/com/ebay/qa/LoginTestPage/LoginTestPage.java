package com.ebay.qa.LoginTestPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.HomePage.HomePage;
import com.ebay.qa.LoginPage.LoginPage;
import com.ebay.qa.LoginPage.LoginPage1;
import com.ebay.qa.TestBase.TestBase;

public class LoginTestPage extends TestBase{

	public LoginPage page;
	public HomePage home;
	public LoginPage1 page1;
	
	public LoginTestPage() {
		super();
	}
	
	@BeforeMethod
	public void setup1() {
		initialization1();
		page=new LoginPage();
		//page1=new LoginPage1();
		
	}
	
	
	@Test
	public void login() {
		home=page.pawenter1(prop.getProperty("username"), prop.getProperty("password"));
//		
	}
	
	
	
	
}
