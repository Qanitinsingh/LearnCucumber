package selenium.alert.frame.window;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsAndWindow {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 1)
	public void newTab() throws InterruptedException {

		driver.findElement(By.id("tabButton")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(0));

	}
	@Test(priority = 0)
	public void newwindow() throws InterruptedException {
		driver.findElement(By.id("windowButton")).click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.close();
		Thread.sleep(1000);
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		
	}
}
