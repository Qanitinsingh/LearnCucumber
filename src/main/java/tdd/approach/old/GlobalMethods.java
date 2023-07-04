package tdd.approach.old;

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
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobjects.GlobalOR;

public class GlobalMethods {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 1)
	public void clickAlert() throws InterruptedException {
// MOve to a specific element you need Webelement not only find by id etc
		WebElement ele = driver.findElement(GlobalOR.SWICTH_MENU);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();

		List<WebElement> value = driver.findElements(GlobalOR.SWICTH_TO_OPTIONS);
		for (int i = 0; i <= value.size(); i++) {
			value.get(i).click();
			driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
			break;
		}
	}
//
//	@Test(priority = 2)
//	public void alertWithOk() {
//
//		boolean tab = driver.findElement(GlobalOR.ALERT_WITH_OK_TAB).isDisplayed();
//		if (tab == true) {
//			driver.findElement(By.cssSelector("#OKTab .btn")).click();
//			driver.switchTo().alert().accept();
//			driver.findElement(GlobalOR.ALERT_WITH_OK_CANCEL).click();
//		} else {
//			System.out.println("Alert with ok BUtton is not present in sidebar menu");
//		}
//	}
//
//	@Test(priority = 3)
//	public void alertWithOkAndCancel() {
//
//		boolean tab = driver.findElement(GlobalOR.ALERT_WITH_OK_CANCEL).isDisplayed();
//		if (tab == true) {
//			driver.findElement(By.cssSelector("#CancelTab .btn")).click();
//			driver.switchTo().alert().dismiss();
//			driver.findElement(GlobalOR.ALERT_WITH_TEXT).click();
//		} else {
//			System.out.println("Alert with ok and Cancel BUtton is not present in sidebar menu");
//		}
//	}
//

	@Test(priority = 4)
	public void alertWithText() {
		boolean tab = driver.findElement(GlobalOR.ALERT_WITH_TEXT).isDisplayed();
		if (tab == true) {
			driver.findElement(By.cssSelector("#Textbox .btn")).click();
	
			driver.switchTo().alert().sendKeys(" Nitin");
			driver.switchTo().alert().accept();
		} else {
			System.out.println("Alert with ok and Cancel BUtton is not present in sidebar menu");
		}
	}
	
	
		
		
	}

