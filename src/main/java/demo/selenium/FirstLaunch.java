package demo.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstLaunch {

	public static WebDriver driver;

	@Test
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		
		
		
		
		ChromeOptions chromeOption = new ChromeOptions();
		chromeOption.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOption);
		driver.get("https://alphabetaqa.com/blog/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String userName = "Nitin Singh";
		System.out.println(userName);

	}

}
