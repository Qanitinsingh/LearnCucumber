package javamethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.PracticeFormOR;

public class PracticeFormE2E {

	public static WebDriver driver;
	static String filePath = "TestData/userimage.jpg";

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public static void enterData() throws InterruptedException {

		driver.findElement(PracticeFormOR.FIRST_NAME).sendKeys("Nitin");
		driver.findElement(PracticeFormOR.LAST_NAME).sendKeys("Singh");
		driver.findElement(PracticeFormOR.EMAIL).sendKeys("Nitin@gmail.com");
		driver.findElement(PracticeFormOR.CURRENT_ADDRESS).sendKeys("SBP Mohali");
		driver.findElement(PracticeFormOR.PHONE).sendKeys("8557037939");
		// Select Gender
		WebElement gender = driver.findElement(PracticeFormOR.GENDER_OTHERS);

		Actions actions = new Actions(driver);
		actions.moveToElement(gender).click().build().perform();
		// Select HOBBIES
		WebElement element = driver.findElement(PracticeFormOR.HOBBIES);

		actions.moveToElement(element).click().build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Select subject
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(PracticeFormOR.AUTOSUGGESTION));

		ele.sendKeys("Maths");
		Thread.sleep(1000); // out of selenium

		driver.findElement(PracticeFormOR.AUTOSUGGESTION_OPTIONS).click();
		// Select date
		WebElement datepicker = driver.findElement(PracticeFormOR.DATEPICKER);

		actions.moveToElement(datepicker).click().build().perform();

		Select month = new Select(driver.findElement(PracticeFormOR.DATE_MONTH));
		month.selectByIndex(0);

		Select year = new Select(driver.findElement(PracticeFormOR.DATE_YEAR));
		year.selectByValue("2023");

		List<WebElement> day = driver.findElements(PracticeFormOR.DATE);

		for (WebElement myday : day) {
			System.out.println(myday);
			myday.click();
			break;
		}
		// uploadimage
		WebElement UploadImg = driver.findElement(PracticeFormOR.UPLOAD_IMAGE);

//		Thread.sleep(3000);
		UploadImg.sendKeys(new java.io.File(filePath).getAbsolutePath());
//
//		Thread.sleep(3000);
		// Select state
		WebElement state = driver.findElement(PracticeFormOR.STATE);

		actions.moveToElement(state).click().build().perform();

		WebElement stateValue = driver.findElement(PracticeFormOR.STATE_VALUE);
		stateValue.click();
		// Select city
		driver.findElement(PracticeFormOR.CITY).click();
		WebElement city = driver.findElement(PracticeFormOR.CITY_VALUE);
		city.click();
		// Click Submit
		WebElement submit = driver.findElement(PracticeFormOR.SUBMIT);

		Thread.sleep(1000);
		actions.moveToElement(submit).click().build().perform();
		// confirm popup
		WebElement confirm = driver.findElement(PracticeFormOR.CONFIRMATION_POPUP);

		Thread.sleep(1000);
		actions.moveToElement(confirm).click().build().perform();
		
		driver.quit();
	}

}
