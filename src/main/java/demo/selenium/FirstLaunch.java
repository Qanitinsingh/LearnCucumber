package demo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstLaunch {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(obj);
		driver.get("https://demoqa.com/automation-practice-form");
		// driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();

	}

	@Test
	public void matchHeading(String str) {

		String heading = driver.findElement(By.cssSelector(".practice-form-wrapper h5")).getText();
		System.out.println(heading);

		Assert.assertEquals(heading, str);
	}

}
