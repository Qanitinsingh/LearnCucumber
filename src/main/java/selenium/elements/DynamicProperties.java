package selenium.elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicProperties {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public static void enableAfter5Sec() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
		element.click();
		System.out.println("Element clicked");
	}
	@Test
	public static void visibleAfter5Sec() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter")));
		element.click();
		System.out.println("Element visible");
	}
	@Test
	public static void colorChange() {

		WebElement t = driver.findElement(By.id("colorChange"));
	      //obtain color in rgba
	      String s = t.getCssValue("color");
	      // convert rgba to hex
	      String c = Color.fromString(s).asHex();
	      System.out.println("Color is :" + s);
	      System.out.println("Hex code for color:" + c);
	}
}
