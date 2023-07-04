package selenium.elements;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReactDatePicker {


	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test
	public void selectDate() {
		try {
			WebElement element = driver.findElement(By.className("react-datepicker-wrapper"));
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();

			Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
			month.selectByIndex(0);

			Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
			year.selectByIndex(0);

			List<WebElement> day = driver.findElements(By.className("react-datepicker__day"));

			for (WebElement myday : day) {
				myday.click();
				break;
			}

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

}
