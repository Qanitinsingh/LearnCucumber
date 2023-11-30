package selenium.widgets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/slider");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public static void slider() throws InterruptedException {
		String rangeSliderId = "#sliderContainer input";
		int desiredPosition = 60;

		// Find the range slider element
		WebElement rangeSlider = driver.findElement(By.cssSelector(rangeSliderId));

		// Get the width of the range slider
		int sliderWidth = rangeSlider.getSize().getWidth();

		// Calculate the position to move the slider
		int offset = (int) (sliderWidth * (desiredPosition / 100.0));

		// Use Actions class to interact with the range slider
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(rangeSlider, offset, 0).build().perform();

	}
}
