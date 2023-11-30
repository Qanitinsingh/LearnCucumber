package selenium.widgets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgressBar {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		driver = new ChromeDriver(cr);

		driver.get("https://demoqa.com/progress-bar");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public static void handleProgressBar() throws InterruptedException {

		/*
		 * we use the JavascriptExecutor interface provided by Selenium to execute
		 * JavaScript code and modify the style attribute of the progress bar element.
		 * After launching the application and locating the progress bar element, we
		 * create a JavascriptExecutor instance by casting the WebDriver object. Then,
		 * we define a JavaScript script that sets the style attribute of the progress
		 * bar to a desired value. In this example, we set it to "width: 50%",
		 * indicating a progress of 50%. Adjust the script according to your desired
		 * progress value and progress bar implementation.
		 */

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		String progressBarScript = "arguments[0].setAttribute('style', 'width: 75%');";
		
		
		
		js.executeScript(progressBarScript, driver.findElement(By.id("startStopButton")));
	}
}