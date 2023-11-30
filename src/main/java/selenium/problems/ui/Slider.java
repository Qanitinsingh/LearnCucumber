package selenium.problems.ui;

import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		driver = new ChromeDriver(cr);
		driver.get("https://demo.automationtesting.in/Slider.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 1)
	public void slide() throws InterruptedException {
		int width = driver.findElement(By.cssSelector("#slider a")).getSize().width;
		System.out.println(width);
		WebElement slider = driver.findElement(By.cssSelector("#slider a"));

		Actions moveSlider = new Actions(driver);
		//slider.click();
		moveSlider.dragAndDropBy(slider, 683, 215).click().build().perform();
		// Install page ruler extension in your browser to get offset values
		//action.perform();
		Thread.sleep(2000);

	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
		System.out.println("Execution is completed");
	}
}
