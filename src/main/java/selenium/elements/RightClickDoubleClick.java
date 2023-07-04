package selenium.elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickDoubleClick {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public static void doubleClick() {
		WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
		Actions ac = new Actions(driver);
		ac.moveToElement(doubleClickButton).doubleClick().build().perform();
	}

	@Test
	public static void rightClick() {

		WebElement rightClickbutton = driver.findElement(By.id("doubleClickBtn"));
		Actions ac = new Actions(driver);
		
		ac.moveToElement(rightClickbutton).contextClick().build().perform();

	}

	@Test
	public static void click() {

		List<WebElement> btn = driver.findElements(By.cssSelector(".col-md-6 .btn"));
		btn.get(2).click();
	}
}
