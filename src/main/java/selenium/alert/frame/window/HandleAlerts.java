package selenium.alert.frame.window;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.Alerts;

public class HandleAlerts {
//	public static WebDriver driver;
//
//	@BeforeTest
//	public void launchBrowser() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions cr = new ChromeOptions();
//		cr.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(cr);
//		driver.get("https://demoqa.com/alerts");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}

	
	public static void simpleAlert(WebDriver driver) {
		try {
			driver.findElement(Alerts.SIMPLE_ALERT).click();
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
		}
		

	}

	
	public static void timerAlertButton(WebDriver driver) throws InterruptedException {
		try {
			driver.findElement(Alerts.TIMER_ALERT).click();
			Thread.sleep(6000);
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
		}
		
	}

	
	public static void confirmAlertButton(WebDriver driver) throws InterruptedException {
		try {
			driver.findElement(Alerts.CONFIRM_ALERT).click();
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
		}
		

	}

	
	public static void promptAlertButton(WebDriver driver,String str) throws InterruptedException {
		try {
			driver.findElement(Alerts.PROMPT_ALERT).click();
			driver.switchTo().alert().sendKeys(str);
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
		}
		

//		String matchText = driver.findElement(By.id("promptResult")).getText();
//		if (matchText.contains(text)) {
//			System.out.println("Test pass");
//
//		} else {
//			System.out.println("Test fail");
//		}
		driver.quit();
	}

}
