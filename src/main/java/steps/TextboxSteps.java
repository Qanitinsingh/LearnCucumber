package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javamethod.TextBoxMethods;

public class TextboxSteps {

	@Given("User is on Text Box page {string}")
	public void user_is_on_text_box_page(String url) {

		TextBoxMethods.launchBrowser(url);

	}

	@When("User enters his FullName as {string}")
	public void user_enters_his_full_name_as(String fname) {
		TextBoxMethods.enterFullName(fname);

	}

	@And("Email as {string}")
	public void email_as(String email) {
		TextBoxMethods.enterEmail(email);

	}

	@And("Current address as {string} and Parmanent address as {string}")
	public void current_address_as_and_parmanent_address_as(String currentaddress, String parmanantAddress) {
		TextBoxMethods.enterCurrentAddress(currentaddress);
		TextBoxMethods.enterParmanentAddress(parmanantAddress);
	}

	@And("Clicks on the submit button")
	public void clicks_on_the_submit_button() {
		TextBoxMethods.clickSubmit();

	}

	@Then("Entered data should display below the form")
	public void entered_data_should_display_below_the_form() {
		TextBoxMethods.verifyOutput();

	}

}
