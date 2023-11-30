package selenium.widgets;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hover {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public static void mouseHover() throws InterruptedException {

		WebElement element = driver.findElement(By.id("toolTipButton"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

		String hoverText = driver.findElement(By.cssSelector("#buttonToolTopContainer .btn-success")).getText();
		System.out.println(hoverText);
	}

	@Test
	public static void mouseHoverClick() throws InterruptedException {

		WebElement element = driver.findElement(By.id("texFieldToolTopContainer"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

		String hoverText1 = driver.findElement(By.id("toolTipTextField")).getText();
		System.out.println(hoverText1);
	}

}
