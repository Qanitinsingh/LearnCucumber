package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javamethod.ZomatoMethods;

public class Zomato {

	WebDriver driver;

	@Given("I am on login page")
	public void i_am_on_login_page() {

		ZomatoMethods.login();

		throw new io.cucumber.java.PendingException();
	}

	@Given("I enter my email as {string} and Password as {string}")
	public void i_enter_my_email_as_and_password_as(String string, String string2) {

		ZomatoMethods.enterEmail();
		
		
		ZomatoMethods.enterPasswords();

		throw new io.cucumber.java.PendingException();
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I should login into the portal")
	public void i_should_login_into_the_portal() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
