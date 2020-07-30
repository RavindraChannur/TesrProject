package StepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStepdefination {

	@Given("^User is into ebay Home page$")
	public void user_is_into_ebay_Home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Given user in home");
	}

	@When("^Title is ebay Home$")
	public void title_is_ebay_Home() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Title is ebay");
	}

	@Then("^User has enterd click button$")
	public void user_has_enterd_click_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user enterd button");
	}

	@Then("^User is clicked on Next button$")
	public void user_is_clicked_on_Next_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("clickd Next");
	}

	@Then("^User should navigate logout page$")
	public void user_should_navigate_logout_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("log out");
	}

}
