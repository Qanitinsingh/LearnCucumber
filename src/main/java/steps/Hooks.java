package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static WebDriver driver;

	@Before 
	public void setup() {
		WebDriverManager.chromedriver().setup();
		// Above line we used to setup the conenction between selenium and installed browser automatically
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		driver = new ChromeDriver(cr);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@After
	public void tearDown(Scenario scenario) {
		try {
			
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			if (scenario.isFailed()) {
				TakesScreenshot ts = (TakesScreenshot) driver;
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (driver != null)
			driver.quit();

	}

}
