package selenium.problems.ui;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserConfig {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		driver = new ChromeDriver(cr);
		driver.get("https://demo.automationtesting.in/AutoComplete.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@AfterTest
	public void quitBrowser() {
		driver.quit();
		System.out.println("Execution is completed");
	}
}
