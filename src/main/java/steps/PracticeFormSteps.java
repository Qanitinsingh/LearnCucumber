package steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javamethod.PracticeFormMethods;
import selenium.alert.frame.window.HandleAlerts;

public class PracticeFormSteps {
	private WebDriver driver;

	public PracticeFormSteps() {
		driver = Hooks.driver;

	}

	@Given("User is on registration page {string}")
	public void user_is_on_registration_page(String str) throws InterruptedException {
		PracticeFormMethods.launchBrowser(driver, str );

	}

	@And("User enters firstName as {string}, Last name as {string} and email as {string}")
	public void enter_and(String fname, String lname, String email) throws Throwable {
		PracticeFormMethods.enterFnameLnameEmail(driver, fname, lname, email);

	}

	@When("User click on gender as {string}")
	public void user_click_on_gender_as(String string) throws AWTException {
		
		PracticeFormMethods.selectGender(driver);

	}

	@When("Enter Mobile number as {string}")
	public void enter_mobile_number_as(String mobile) throws InterruptedException {
		PracticeFormMethods.enterPhone(driver, mobile);
		

	}

	@When("User Enters Subject as {string}, Hobbies as {string}, Select Date and address as {string}")
	public void enter_date_and(String sub, String hob, String address) throws InterruptedException, AWTException {
		PracticeFormMethods.autoSuggestionDropdown(driver, sub);
		PracticeFormMethods.selectHobbies(driver, hob);
		PracticeFormMethods.selectDate(driver);
		PracticeFormMethods.enteraddress(driver, address);

	}

	@When("Upload the picture")
	public void upload_the_picture() throws InterruptedException {
		PracticeFormMethods.uploadImage(driver);

	}

	@When("Select state as {string} and city as {string}")
	public void select_state_as_and_city_as(String state, String city) {
		PracticeFormMethods.selectState(driver, state);
		PracticeFormMethods.selectcity(driver, city);
	}

	@When("Click on the submit button")
	public void click_on_the_submit_button() throws InterruptedException {
		PracticeFormMethods.Submit(driver);
	}

	@Then("User should register successfully into the portal")
	public void user_should_register_successfully_into_the_portal() throws InterruptedException {
		PracticeFormMethods.confirmRegister(driver);

	}

}
