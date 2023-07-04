package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import javamethod.RegisterMethods;

public class Sample {
	private WebDriver driver;

	public Sample() {
		driver = Hooks.driver;
	}

	
	@When("User enter the first name {string}")
	public void user_enter_the_first_name(String value) {
	    RegisterMethods.enterFirstName(driver, value);
	}

	@And("Enter the last name {string}")
	public void enter_the_last_name(String value) {
		RegisterMethods.enterLastName(driver, value);
	}
}
