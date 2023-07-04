package javamethod;

import java.sql.SQLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.http.NoHttpResponseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobjects.RegisterOR;

public class RegisterMethods {

	final static Logger logger = LoggerFactory.getLogger(RegisterMethods.class);

	public static void getTitle(WebDriver driver, String str1) {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, str1);
	}

//	@Description("Verify the register link is active or not")
//	@Severity(SeverityLevel.CRITICAL)
	public static void verifyRegisterActive(WebDriver driver) {
		boolean isActive = driver.findElement(RegisterOR.REGISTER_MENU).isDisplayed();
		if (isActive == true) {
			System.out.println("Register option is active in menu");
		} else {
			System.out.println("Register menu is not active and present");
		}
	}

	public static void enterFirstName(WebDriver driver, String str1) {

		driver.findElement(RegisterOR.FNAME).sendKeys(str1); // Best approach
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void dummy(WebDriver driver, String str1) {
		try {
			driver.findElement(RegisterOR.FNAME).sendKeys(str1); // Best approach
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void launchBrowser(WebDriver driver, String str1) {
		try {
			driver.get(str1);
		} catch (TimeoutException e) {
			logger.info("Seems page timeout exception", e);
		} catch (Exception e) {
			logger.info("URL not well formed exception", e);
		}

	}

	public static void enterLastName(WebDriver driver, String value) {

		try {
			driver.findElement(RegisterOR.LNAME).sendKeys("Monika"); // Calling element in POM
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void enterEmail(WebDriver driver, String value) {
		try {
			driver.findElement(RegisterOR.EMAIL).sendKeys(value); // Calling element in POM
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (NoSuchElementException e) {
			logger.info("EMAIL- Element is not present on the register page", e);
		} catch (TimeoutException e) {
			logger.info("Time out execption is there on the register page ", e);
		}

	}

	public static void enterPassword(WebDriver driver, String value) {

		try {

			driver.findElement(RegisterOR.PASSWORD).sendKeys(value); // Calling element in POM
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}

	}

	public static void enter(WebDriver driver) {

	}

	public static void enterCpassword(WebDriver driver, String value) {

		driver.findElement(RegisterOR.C_PASSWORD).sendKeys(ZomatoMethods.name); // Calling element in POM
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void enterPendingData(WebDriver driver) {
		ArrayList<String> formdata = new ArrayList<String>(); // Because by default size is 10
		formdata.add("Nitin@yahoo.com");
		formdata.add("8557037939");
		formdata.add("Nitin@1234");
		formdata.add("Nitin@1234");
		formdata.add("Mohali");
		String email = formdata.get(0);
		driver.findElement(RegisterOR.EMAIL).sendKeys(email);
		String phone = formdata.get(1);
		driver.findElement(RegisterOR.PHONE).sendKeys(phone);
		String password = formdata.get(2);
		driver.findElement(RegisterOR.PASSWORD).sendKeys(password);
		String cPassword = formdata.get(3);
		driver.findElement(RegisterOR.C_PASSWORD).sendKeys(cPassword);
		String address = formdata.get(4);
		driver.findElement(RegisterOR.ADDRESS).sendKeys(address);

	}

	public static void selectCountry(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		List<WebElement> country = driver.findElements(RegisterOR.COUNTRY);
		for (WebElement a : country) {
			a.click();
			Thread.sleep(2000);
//			Select se = new Select(driver.findElement(By.id("yearbox")));
//			
//			se.selectByIndex(0);
//			se.selectByValue("1990");
//			se.selectByVisibleText("1987");

			break;
		}
	}

	public static void clickCircket(WebDriver driver, String str1) {
		try {
			String hobbiesName = driver.findElement(RegisterOR.HOBBIES_CRICKET).getText();
			if (hobbiesName.equalsIgnoreCase(str1))
				driver.findElement(RegisterOR.HOBBIES_CRICKET).click(); // Static approach
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (NoSuchElementException e) {
			logger.info("Element is not present or visible in 10 seconds", e);
		} catch (TimeoutException e) {
			logger.info("Element is not present or visible in 10 seconds", e);
		}
	}

	public static void selectGenderMale(WebDriver driver) {
		boolean gen = driver.findElement(RegisterOR.MALE).isDisplayed();
		if (gen == true) {

			driver.findElement(By.cssSelector("#basicBootstrapForm input[value='male']")).click();
			driver.findElement(RegisterOR.MALE).click();

			// POM
			// Abstraction in Java
			// Dynamic framework
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

	}

	public static void selectSkills(WebDriver driver) throws InterruptedException {

		WebElement multiSelectTagDropdownWebElement = driver.findElement(RegisterOR.LANGUAGE);
		multiSelectTagDropdownWebElement.click();
		WebElement dropdown = driver.findElement(RegisterOR.LANGUAGE_OPTIONS);
		dropdown.click();
		Thread.sleep(2000);
	}

	public static void selectDOB(WebDriver driver, String year, String month, String date) {
		Select se = new Select(driver.findElement(RegisterOR.DOB_YEAR));
		se.selectByValue(year);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select se1 = new Select(driver.findElement(RegisterOR.DOB_MONTH));
		se1.selectByVisibleText(month);
		Select se2 = new Select(driver.findElement(RegisterOR.DOB_DATE));
		se2.selectByValue(date);
	}

	public static void selectLanguage(WebDriver driver) throws InterruptedException {

		@SuppressWarnings("unused")
		WebElement dropDown = driver.findElement(RegisterOR.LANGUAGE);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		List<WebElement> value = driver.findElements(RegisterOR.LANGUAGE_OPTIONS);
		for (int i = 0; i <= value.size() - 1; i++) {
			if (value.get(i).getText().contains("French")) {
				Thread.sleep(3000);
				value.get(i).click();
				break;
			}
		}
	}

	public static void imageUpload(WebDriver driver) {
		try {
			WebElement UploadImg = driver.findElement(RegisterOR.CHOOSE_IMAGE);
			Thread.sleep(3000);
			UploadImg.sendKeys(new java.io.File("TestData/userimage.jpg").getAbsolutePath());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void enterPasswords(WebDriver driver) {
		String password = "Nitin@123";
		String cPassword = "Nitin@123";// Defined Local Variable
		driver.findElement(RegisterOR.PASSWORD).sendKeys(password); // Calling element in POM
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(RegisterOR.C_PASSWORD).sendKeys(cPassword);
	}

	public static void clickSubmit(WebDriver driver) {
		WebElement element = driver.findElement(RegisterOR.SUBMIT);

		// Use action class when click does not work
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void demo(WebDriver driver) {
		WebElement element = driver.findElement(By.cssSelector("a[href='Interactions.html']"));
		// Use action class when click does not work
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("a[href='Selectable.html']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Selectable");

	}
}
