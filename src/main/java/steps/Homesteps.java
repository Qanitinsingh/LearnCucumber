package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.elements.Checkbox;

public class Homesteps {
	private WebDriver driver;

	public Homesteps() {
		driver = Hooks.driver;
	}

	@Given("User is on Home page")
	public void user_is_on_home_page() {
		driver.get("https:/ /ww   w.flipkart.com/");

	}

	@Given("successfully logged in into the portal")
	public void successfully_logged_in_into_the_portal() {
		System.out.println("User is landed on home page");

	}

	@Given("navigated to the product page from the sale banner")
	public void navigated_to_the_product_page_from_the_sale_banner() throws InterruptedException {
		System.out.println("User is landed on home page");

	}

	@When("user click on the product {string}")
	public void user_click_on_the_product(String string) {
		System.out.println("User is landed on home page");

	}

	@When("navigated to the product detail page")
	public void navigated_to_the_product_detail_page() {
		System.out.println("User is landed on home page");

	}

	@When("click on the add to cart button")
	public void click_on_the_add_to_cart_button() {
		System.out.println("User is landed on home page");

	}

	@When("Entered the billing address")
	public void entered_the_billing_address() {
		System.out.println("User is landed on home page");

	}

	@Then("user should be able to place the order")
	public void user_should_be_able_to_place_the_order() {
		System.out.println("User is landed on home page");

	}

	@Then("email should tirgger on the registered address")
	public void email_should_tirgger_on_the_registered_address() {
		System.out.println("User is landed on home page");

	}

	@Then("message should trigger to the registered mobile")
	public void message_should_trigger_to_the_registered_mobile() {
		System.out.println("User is landed on home page");

	}

	@Then("mobile number should be blocked already")
	public void mobile_number_should_be_blocked_already() {
		System.out.println("User is landed on home page");

	}
}
