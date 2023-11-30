package selenium.problems.ui;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);

		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test(priority = 0)
	public void datePickerFrom() throws InterruptedException {
		try {

			driver.findElement(By.xpath("//img[@class='imgdp']")).click();
			List<WebElement> columns = driver.findElements(By.cssSelector(".ui-datepicker-calendar tbody tr td"));
			for (WebElement cell : columns) {
				// Select 13th Date
				if (cell.getText().equals("13")) {
					cell.findElement(By.linkText("13")).click();
					break;
				}
			}
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 1)
	public void datePickerTo() throws InterruptedException {
		driver.findElement(By.id("datepicker2")).click();
		List<WebElement> columns = driver.findElements(By.cssSelector(".datepick tbody td"));
		for (WebElement cell : columns) {
			// Select 13th Date
			if (cell.getText().equals("19")) {
				cell.findElement(By.linkText("19")).click();
				Thread.sleep(2000);
				break;
			}
		}

	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
		System.out.println("Execution is completed");
	}
}
