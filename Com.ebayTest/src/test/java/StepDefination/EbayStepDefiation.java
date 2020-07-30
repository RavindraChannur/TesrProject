package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbayStepDefiation {

	public WebDriver driver;
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "D:\\Channur\\Selenium Projects\\com.test\\driver\\chromedriver.exe");
	     driver=new ChromeDriver();
	    driver.get("https://beginnersbook.com/");
	    driver.manage().window().maximize();
	}

	@When("^Enter the user name$")
	public void enter_the_user_name() throws Throwable {
	   System.out.println("TEst1");
	   driver.findElement(By.xpath("/html/body/div/div/div/main/article/div/div[2]/div[1]/div[1]/a/span")).click();
	   
	}

	@Then("^Enter password$")
	public void enter_password() throws Throwable {
		   System.out.println("Title printing");
		   System.out.println(driver.getTitle());
	}

	@Then("^enter into Login button$")
	public void enter_into_Login_button() throws Throwable {
		   System.out.println("clicking on java tutorials");
		   driver.findElement(By.xpath("//a[contains(text(),'Java Tutorial')]")).click();
	}

	@Then("^validate home page title after login successful$")
	public void validate_home_page_title_after_login_successful() throws Throwable {
		   System.out.println("after clicking on java tutorial validating title");
		   System.out.println(driver.getTitle());
	}

	
}
