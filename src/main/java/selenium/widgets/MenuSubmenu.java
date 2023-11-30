package selenium.widgets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuSubmenu {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		driver = new ChromeDriver(cr);

		driver.get("https://demoqa.com/menu#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public static void subMenu() throws InterruptedException {
		
		WebElement menu= driver.findElement(By.cssSelector("#nav li:nth-of-type(2)"));
		Actions ac = new Actions(driver);
		ac.moveToElement(menu).perform();
		
		WebElement menu1= driver.findElement(By.cssSelector("#nav li:nth-of-type(2) ul li:nth-of-type(3)"));
		Actions ac1 = new Actions(driver);
		ac1.moveToElement(menu1).perform();
		
		WebElement lastMenu= driver.findElement(By.cssSelector("#nav li:nth-of-type(2) ul li:nth-of-type(3) li:first-child"));
		Actions ac3 = new Actions(driver);
		ac3.moveToElement(lastMenu).build().perform();

	}
}
