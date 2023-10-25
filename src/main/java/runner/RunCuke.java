package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/Features/", glue = "steps", plugin = {
		"json:target/cucumber-reports/Cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, tags = "@Urgent")
public class RunCuke extends AbstractTestNGCucumberTests {

	// @DataTable and not @Smoke and not @Prod
}
