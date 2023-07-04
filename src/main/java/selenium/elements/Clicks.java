package selenium.elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clicks {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);

		driver.get("https://demoqa.com/elements");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.cssSelector(".element-group:first-child")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector(".left-pannel .element-group:first-child li:nth-child(5)")).click();
	}

	@Test(priority = 1)
	public void dynamicClick() throws InterruptedException {

		// If element exact locator is not working then use Java and handle dynamic
		// element using list iterator
		List<WebElement> button = driver.findElements(By.cssSelector("div.col-md-6 button"));
		button.get(2).click();
		String verifyRightclick = driver.findElement(By.id("dynamicClickMessage")).getText();

		Assert.assertEquals(verifyRightclick, "You have done a dynamic click");
	}

	@Test(priority = 0)
	public void doubleClick() throws InterruptedException {

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("doubleClickBtn"))).doubleClick().build().perform();

	}

	@Test(priority = 2)
	public void rightClick() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("rightClickBtn"))).contextClick().build().perform();

		String verifyRightclick = driver.findElement(By.id("rightClickMessage")).getText();

		Assert.assertEquals(verifyRightclick, "You have done a right click");
	}
}
