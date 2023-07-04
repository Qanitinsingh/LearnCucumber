package tdd.approach.old;

import java.awt.Robot;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterMethods {
	public static WebDriver driver;
	public static String value;

	@BeforeTest
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("disable-gpu");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
//		driver.navigate().to("");
//		driver.manage().timeouts()
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void getTitle() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "Register");
	}

	@Test
	public void verifyRegisterActive() {
		boolean isActive = driver.findElement(RegisterOR.REGISTER_MENU).isDisplayed();
		if (isActive == true) {
			System.out.println("Register option is active in menu");
		} else {
			System.out.println("Register menu is not active and present");
		}
	}

	@Test(priority = 1)
	public void enterFirstName() {
		driver.findElement(RegisterOR.FNAME).sendKeys("Nitin"); // Static approach
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 2)
	public void enterLastName() {
		String lastname = "Singh"; // Defined Local Variable
		driver.findElement(RegisterOR.LNAME).sendKeys(lastname); // Calling element in POM
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 3)
	public void enterPendingData() {

//		String email = formdata.get(0);
//		driver.findElement(RegisterOR.EMAIL).sendKeys(email);
//		String phone = formdata.get(1);
//		driver.findElement(RegisterOR.PHONE).sendKeys(phone);
//		String password = formdata.get(2);
//		driver.findElement(RegisterOR.PASSWORD).sendKeys(password);
//		String cPassword = formdata.get(3);
//		driver.findElement(RegisterOR.C_PASSWORD).sendKeys(cPassword);
//		String address = formdata.get(4);
//		driver.findElement(RegisterOR.ADDRESS).sendKeys(address);

	}

	@Test(priority = 5)
	public void selectCountry() throws InterruptedException {
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

	@Test(priority = 4)
	public void clickHobbyCIRCKET() {
		driver.findElement(RegisterOR.HOBBIES_CRICKET).click(); // Static approach
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 6)
	public void selectGenderMale() {
		boolean gen = driver.findElement(RegisterOR.MALE).isDisplayed();
		if (gen == true) {
			driver.findElement(RegisterOR.MALE).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

	}

	@Test(priority = 7)
	public void selectSkills() throws InterruptedException {

		WebElement multiSelectTagDropdownWebElement = driver.findElement(RegisterOR.LANGUAGE);
		multiSelectTagDropdownWebElement.click();
		WebElement dropdown = driver.findElement(RegisterOR.LANGUAGE_OPTIONS);
		dropdown.click();
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void selectDOB() {
		Select se = new Select(driver.findElement(RegisterOR.DOB_YEAR));
		se.selectByValue("1990");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select se1 = new Select(driver.findElement(RegisterOR.DOB_MONTH));
		se1.selectByVisibleText("June");
		Select se2 = new Select(driver.findElement(RegisterOR.DOB_DATE));
		se2.selectByValue("27");


	}

	@Test(priority = 9)
	public void selectLanguage() throws InterruptedException {

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

	@Test(priority = 10)
	public void imageUpload() {
		try {
			WebElement UploadImg = driver.findElement(RegisterOR.CHOOSE_IMAGE);
			Thread.sleep(3000);
			UploadImg.sendKeys(new java.io.File("Test_Data/User_image.png").getAbsolutePath());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 11)
	public void enterPasswords() {
		String password = "Nitin@123";
		String cPassword = "Nitin@123";// Defined Local Variable
		driver.findElement(RegisterOR.PASSWORD).sendKeys(password); // Calling element in POM
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(RegisterOR.C_PASSWORD).sendKeys(cPassword);
	}

	@Test(priority = 12)
	public void clickSubmit() {
		WebElement element = driver.findElement(RegisterOR.SUBMIT);

		// Use action class when click does not work
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
		System.out.println("Execution is completed");
	}
}
