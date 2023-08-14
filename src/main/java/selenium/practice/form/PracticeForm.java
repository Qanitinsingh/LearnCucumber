package selenium.practice.form;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
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

public class PracticeForm {

	public static WebDriver driver;
	public static String name = "Supriya";
	final static Logger logger = LogManager.getLogger(PracticeForm.class);
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		logger.info("Setup is done");

	}

	@Test(priority = 0)
	public void enterData() throws InterruptedException, AWTException {
		try {
			
		
			List<String> formData = new ArrayList();
			formData.add(0, "Rajesh");
			formData.add(1, "Singh");
			formData.add(2, "Nitin@gmail.com");
			formData.add(3, "8557037939");
			formData.add(4, "SBP Sec 116 Mohali");
		
			driver.findElement(PracticeFormOR.FIRSTNAME).sendKeys(formData.get(0));
			driver.findElement(PracticeFormOR.LASTTNAME).sendKeys(formData.get(1));
			driver.findElement(PracticeFormOR.EMAIL).sendKeys(formData.get(2));
			driver.findElement(PracticeFormOR.PHONE).sendKeys(formData.get(3));
			driver.findElement(PracticeFormOR.CURRENTADDRESS).sendKeys(formData.get(4));

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
			logger.info("Unable to locate element",e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 1)
	public void autoSuggestionDropdown() throws InterruptedException, AWTException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Inside DOM
			WebElement ele = wait.until(ExpectedConditions
					.presenceOfElementLocated(PracticeFormOR.AUTOSUGGESTION));

			ele.sendKeys("Maths");
			Thread.sleep(1000); // out of selenium

			driver.findElement(PracticeFormOR.AUTOSUGGESTION_OPTIONS).click();

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 2)
	public static void selectGender() throws AWTException {
		try {

			WebElement element = driver.findElement(PracticeFormOR.GENDER_MALE);

			Actions actions = new Actions(driver);

			actions.moveToElement(element).click().build().perform();

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 3)
	public void selectDate() {
		try {
			WebElement element = driver.findElement(PracticeFormOR.DATEPICKER);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();

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

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 4)
	public void selectHobbies() {
		try {
//			JavascriptExecutor jse = (JavascriptExecutor) driver;
//			jse.executeScript("window.scrollBy(0,250)");

			// If you dont use the scroldown code , it is opening the google ad
			WebElement element = driver.findElement(PracticeFormOR.HOBBIES);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void selectState() {
		try {
			WebElement element = driver.findElement(PracticeFormOR.STATE);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();

			WebElement se = driver.findElement(PracticeFormOR.STATE_VALUE);
			se.click();

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	@Test(dependsOnMethods = { "selectState" })
	public void selectcity() {
		try {
			driver.findElement(PracticeFormOR.CITY).click();
			WebElement se = driver.findElement(PracticeFormOR.CITY_VALUE);
			se.click();
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 6)
	public void uploadImage() throws InterruptedException {
		try {
			WebElement UploadImg = driver.findElement(PracticeFormOR.UPLOAD_IMAGE);

			Thread.sleep(3000);

			UploadImg.sendKeys(new java.io.File("TestData/userimage.jpg").getAbsolutePath());

			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (NoSuchWindowException e) {
			e.printStackTrace();

		}
	}

	@Test(priority = 7)
	public void Submit() throws InterruptedException {
		try {
			WebElement element = driver.findElement(PracticeFormOR.SUBMIT);
			Actions actions = new Actions(driver);
			Thread.sleep(1000);
			actions.moveToElement(element).click().build().perform();

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}
	@Test(priority = 8)
	public void confirmRegister() throws InterruptedException {
		try {
			WebElement element = driver.findElement(PracticeFormOR.CONFIRMATION_POPUP);
			Actions actions = new Actions(driver);
			Thread.sleep(1000);
			actions.moveToElement(element).click().build().perform();

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}
}
