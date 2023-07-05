package selenium.problems.ui;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindows {
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
	}

	@Test(priority = 1)
	public void clickWindow() throws InterruptedException {
		driver.findElement(GlobalOR.SWICTH_MENU).click();
		List<WebElement> value = driver.findElements(GlobalOR.SWICTH_TO_OPTIONS);
		for (int i = 0; i <= value.size(); i++) {
			value.get(1).click();
			driver.navigate().to("https://demo.automationtesting.in/Windows.html");
			break;
		}
	}

	@Test(priority = 3)
	public void openNewWindow() throws InterruptedException {
		driver.findElement(GlobalOR.CLICK_WINDOW).click();
		driver.findElement(GlobalOR.CLICK_WINDOW_OK).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				String title = driver.getTitle();
				System.out.println("New tab title= " + title);
				driver.close(); // closing child window
				Thread.sleep(4000);
				driver.switchTo().window(parentWindow); // cntrl to parent window
			}
		}

	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
		System.out.println("Execution is completed");
	}
}
