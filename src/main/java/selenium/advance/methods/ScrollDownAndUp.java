package selenium.advance.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDownAndUp {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();

		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();

	}

	@Test(priority = 1)
	public void dragAndDrop() throws InterruptedException {
		// Create an instance of JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down the page by 500 pixels
		js.executeScript("window.scrollBy(0, 500)");

		// Sleep for a while to see the scroll action
		try {
			Thread.sleep(2000); // You can adjust the sleep duration
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Scroll up the page by 500 pixels
		js.executeScript("window.scrollBy(0, -500)");

		// Sleep for a while to see the scroll action
		try {
			Thread.sleep(2000); // You can adjust the sleep duration
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
		System.out.println("Execution is completed");
	}

}
