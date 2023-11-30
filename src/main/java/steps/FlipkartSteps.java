package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartSteps {
	
	public static WebDriver driver; 
	
	@Given("User is on landing page")
	public void user_is_on_landing_page() {
	   driver.get("flipkart.com");
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Enter the email id as {string} and password as {string}")
	public void enter_the_email_id_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Click on the login button")
	public void click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("User should be login into system successfully")
	public void user_should_be_login_into_system_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Logout button should display to user")
	public void logout_button_should_display_to_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should get a validation message {string}")
	public void user_should_get_a_validation_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Click on the Facbook Icon")
	public void click_on_the_facbook_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Enters the Facebook Login details as {string} and Password is {string}")
	public void enters_the_facebook_login_details_as_and_password_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Clicks on Login button on the facebook screen")
	public void clicks_on_login_button_on_the_facebook_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should successfully authencate from Facebook")
	public void user_should_successfully_authencate_from_facebook() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Redirect into the filpkart system")
	public void redirect_into_the_filpkart_system() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Facebook Profile photo should display as user image in flipkart")
	public void facebook_profile_photo_should_display_as_user_image_in_flipkart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
