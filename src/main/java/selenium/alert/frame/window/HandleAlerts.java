package selenium.alert.frame.window;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 0)
	public static void simpleAlert() {
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();

	}

	@Test(priority = 1)
	public static void timerAlertButton() throws InterruptedException {
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
	}

	@Test(priority = 2)
	public static void confirmAlertButton() throws InterruptedException {
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().accept();

	}

	@Test(priority = 3)
	public static void promptAlertButton() throws InterruptedException {
		String text = "Nitin";
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();

		String matchText = driver.findElement(By.id("promptResult")).getText();
		if (matchText.contains(text)) {
			System.out.println("Test pass");

		} else {
			System.out.println("Test fail");
		}

	}

}
