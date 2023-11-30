package selenium.widgets;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateAndTimePicker {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/date-picker");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public static void selectDate() throws InterruptedException {

		WebElement element = driver.findElement(By.id("datePickerMonthYearInput"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

		Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByIndex(0);

		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByValue("2023");

		List<WebElement> day = driver.findElements(By.className("react-datepicker__day"));

		for (WebElement myday : day) {
			System.out.println(myday);
			myday.click();
			break;
		}
	}

	@Test
	public static void selectDateandTime() throws InterruptedException {

		WebElement element = driver.findElement(By.id("dateAndTimePickerInput"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

		List<WebElement> day = driver.findElements(By.className("react-datepicker__day"));

		for (WebElement myday : day) {
			System.out.println(myday);
			myday.click();
			break;
		}
		List<WebElement> time = driver.findElements(By.className("react-datepicker__time-list"));

		for (WebElement mytime : time) {

			mytime.click();
			break;
		}

	}
}
