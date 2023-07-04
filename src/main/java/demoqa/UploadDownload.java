package demoqa;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.RegisterOR;

public class UploadDownload {
	public static WebDriver driver;
	public static String downloadPath = "C:\\Users\\NITIN\\Downloads";

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
		// Locate text option in the menu
		WebElement element = driver.findElement(By.cssSelector(".element-group:first-child li:nth-child(8)"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", element);

	}

	@Test(priority = 0)
	public void uploadImage() throws InterruptedException {
		try {
			WebElement UploadImg = driver.findElement(RegisterOR.CHOOSE_IMAGE);
			Thread.sleep(3000);
			UploadImg.sendKeys(new java.io.File("TestData/userimage.jpg").getAbsolutePath());
			Thread.sleep(3000);
			driver.quit();
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

//	@Test(priority = 0)
//	public void downloadImage() throws InterruptedException {
//
//		//driver.findElement(By.id("downloadButton")).click();
//		
//		//Assert.assertTrue(isFileDownloaded(downloadPath, "mailmerge.xls"), "Failed to download Expected document");
//
//	}
}
