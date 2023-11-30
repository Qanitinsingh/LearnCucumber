package selenium.advance.methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Headless {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
    	WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--headless=new");
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
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

