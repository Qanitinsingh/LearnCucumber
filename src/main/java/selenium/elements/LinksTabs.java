package selenium.elements;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTabs {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test(priority = 0)
	public void newTabHandle() throws InterruptedException {
		try {

			driver.findElement(By.cssSelector(".card:first-child svg")).click();
			// Click on Element Icon to expand the menu
			driver.findElement(By.cssSelector(".element-group:first-child")).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			// Locate Link option in the menu

			// But selenium click will not work on this method
			WebElement element = driver.findElement(By.cssSelector(".element-group:first-child li:nth-child(6)"));
			/*
			 * Unable to locate elementorg.openqa.selenium.ElementClickInterceptedException:
			 * element click intercepted: Element <li class="btn btn-light "
			 * id="item-5">...</li> is not clickable at point (200, 680).
			 * 
			 * 
			 * 
			 * /* Using JavaScript click it worked but we bypassed the actual reason which
			 * may be a potential bug or a bad UX design. When we enter search keyword then
			 * google shows auto suggestions and HIDES THE SEARCH BUTTON. As per Official
			 * Selenium Doc – ElementClickInterceptedException Indicates that a click could
			 * not be properly executed because the target element was obscured in some way
			 */

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click()", element);

			driver.findElement(By.cssSelector(".col-md-6 a#simpleLink[href='https://demoqa.com']")).click();
			Thread.sleep(1000);
			// hold all window handles in array list
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			// switch to new tab
			driver.switchTo().window(newTb.get(1));
			boolean joinNow = driver.findElement(By.className("banner-image")).isDisplayed();

			if (joinNow == true) {
				System.out.println("Page title of new tab: " + driver.getTitle());
				driver.close();
				Thread.sleep(1000);
			}
			// switch to parent window
			driver.switchTo().window(newTb.get(0));
			System.out.println("Page title of parent window: " + driver.getTitle());
			Thread.sleep(2000);
			driver.quit();
		} catch (

		ElementClickInterceptedException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			// TODO: handle exception
		}
	}

}
