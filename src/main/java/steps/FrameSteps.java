package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import javamethod.PracticeFormMethods;

public class FrameSteps {

	private WebDriver driver;

	public FrameSteps() {
		driver = Hooks.driver;

	}

	@Given("User is on Frame page {string}")
	public void user_is_on_registration_page(String str) throws InterruptedException {
		PracticeFormMethods.launchBrowser(driver, str);

	}

}
