package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.io.File;
import java.io.FileInputStream;

import org.apache.logging.log4j.core.util.FileUtils;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.mongodb.MapReduceCommand.OutputType;

import common.Screenshot;



@RunWith(Cucumber.class)
public class LoginStepDefination extends Screenshot {
	
	public static WebDriver driver;

   @Given("^User is into ebay login page$")
    public void user_is_into_ebay_login_page() {
	   //System.out.println("login to user page");
	   try {
       // FileInputStream file=new FileInputStream();
	   //Thread.sleep(5000L);
        System.setProperty("webdriver.chrome.driver", "D:\\Channur\\Selenium Projects\\Test\\driver32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Thread.sleep(1000L);
        driver.get("https://www.facebook.com/");
	   }
	   catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }	   
    }  

    @When("^Title is ebay login$")
    public void title_is_ebay_login() throws Throwable {
    	
    	 System.out.println("test pass");
    }

    @Then("^User has enterd \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_has_enterd_username_and_password(String uname, String ppass) throws Throwable {
    	driver.findElement(By.id("email")).sendKeys(uname);
    	driver.findElement(By.id("pass")).sendKeys(ppass);
    	 
    }

    @Then("^User is clicked on sign button$")
    public void user_is_clicked_on_sign_button() throws Throwable {
    	driver.findElement(By.id("u_0_b")).click();
    	 //System.out.println("usr into login page");
    }

    @And("^User should navigate home page$")
    public void user_should_navigate_home_page() throws Throwable {
    
    	 System.out.println("Welcome to home page");
    }
    
    @Then("^close driver$")
    public void close_driver() throws Throwable {
    	driver.close(); 
        //throw new PendingException();
    }
}