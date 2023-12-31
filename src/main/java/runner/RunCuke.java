package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/Features/PracticeForm.feature", glue = "steps", plugin = {
		"json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, tags = "@Urgent")
public class RunCuke extends AbstractTestNGCucumberTests {

	// @DataTable and not @Smoke and not @Prod
}
