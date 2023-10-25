package selenium.alert.frame.window;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsAndWindow {
	
//	public static WebDriver driver;
//	
//	public static void main (String args[]) throws InterruptedException
//	{
//		
//		TabsAndWindow obj = new TabsAndWindow();
//		
//		obj.launchBrowser();
//		obj.newTab(driver);
//		//obj.newwindow(driver);
//		
//		
//	}
	
	

//	public void launchBrowser() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions cr = new ChromeOptions();
//		cr.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(cr);
//		driver.get("https://demoqa.com/browser-windows");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}

	public static void newTab(WebDriver driver) throws InterruptedException {

		driver.findElement(By.id("tabButton")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));
		String pageHeading = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(pageHeading);
		driver.quit();
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(0));

	}

	public static void newwindow(WebDriver driver) throws InterruptedException {

		try {
			driver.findElement(By.id("windowButton")).click();
			String winHandleBefore = driver.getWindowHandle();
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}
			driver.close();
			Thread.sleep(1000);
			// Switch back to original browser (first window)
			driver.switchTo().window(winHandleBefore);

		} catch (NoSuchWindowException e) {
			// TODO: handle exception
		}

		catch (NoSuchElementException e) {
			// TODO: handle exception
		} catch (TimeoutException e) {
			// TODO: handle exception
		}

	}
}
