package selenium.alert.frame.window;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ModalDailouge {
	
	

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public static void smallModal() throws InterruptedException {

		WebElement frame1 = driver.findElement(By.id("showSmallModal"));
		frame1.click();
		Thread.sleep(1000);
		WebElement closeFrame = driver.findElement(By.id("closeSmallModal"));
		closeFrame.click();
		

	}
	@Test
	public static void largeModal() throws InterruptedException {

		WebElement frame1 = driver.findElement(By.id("showLargeModal"));
		frame1.click();
		Thread.sleep(1000);
		WebElement closeFrame = driver.findElement(By.id("closeLargeModal"));
		closeFrame.click();
		

	}
	

}
