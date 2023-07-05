package selenium.elements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import selenium.problems.DemoQAOR;

public class Webtable {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);

		driver.get("https://demoqa.com/webtables");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test(priority = 0)
	public void addData() throws InterruptedException {
		try {
			// Click on Element Icon to expand the menusssss
			driver.findElement(By.cssSelector(".element-group:first-child")).click();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			// Locate Web-table option in the menu
			driver.findElement(By.cssSelector(".left-pannel .element-group:first-child li:nth-child(4)")).click();

			// Click on Add and add data

			driver.findElement(By.id("addNewRecordButton")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			// Dynamic approach to add all input into List and then get one by one for send
			// keys
			List<String> formData = new ArrayList<>();
			formData.add("Nitin");
			formData.add("Singh");
			formData.add("Nitin@gmail.com");
			formData.add("35");
			formData.add("10000");
			formData.add("QA");
			System.out.println(formData);

			// Calling Webelement from the page Object repository and Input from the
			// arraylist
			
			driver.findElement(DemoQAOR.WEBTABLE_FIRSTNAME).sendKeys(formData.get(0));
			
			driver.findElement(DemoQAOR.WEBTABLE_LASTNAME).sendKeys(formData.get(1));
			
			driver.findElement(DemoQAOR.WEBTABLE_EMAIL).sendKeys(formData.get(2));
			driver.findElement(DemoQAOR.WEBTABLE_AGE).sendKeys(formData.get(3));
			driver.findElement(DemoQAOR.WEBTABLE_SALARY).sendKeys(formData.get(4));
			driver.findElement(DemoQAOR.WEBTABLE_DEPT).sendKeys(formData.get(5));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(DemoQAOR.WEBTABLE_SUBMIT).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			String tableText = driver.findElement(By.className("rt-tbody")).getText();
			if (tableText.contains("Nitin")) {
				System.out.println("Text is verified");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			// TODO: handle exception
		}
	}

	@Test(priority = 0)
	public void updateData() throws InterruptedException {
		try {
			// Click on Element Icon to expand the menusssss
			List<WebElement> record = driver.findElements(By.cssSelector(".action-buttons .mr-2"));
			record.get(3).click();

			// Dynamic approach to add all input into List and then get one by one for send
			// keys
			List<String> formUpdateData = new ArrayList<>();
			formUpdateData.add("Updated Nitin");
			formUpdateData.add("Updated Singh");
			formUpdateData.add("UpdatedNitin@gmail.com");
			formUpdateData.add("355");
			formUpdateData.add("10009");
			formUpdateData.add("UpdatedQA");
			System.out.println(formUpdateData);

			// Calling Webelement from the page Object repository and Input from the
			// arraylist
			driver.findElement(DemoQAOR.WEBTABLE_FIRSTNAME).clear();
			driver.findElement(DemoQAOR.WEBTABLE_FIRSTNAME).sendKeys(formUpdateData.get(0));
			driver.findElement(DemoQAOR.WEBTABLE_LASTNAME).clear();
			driver.findElement(DemoQAOR.WEBTABLE_LASTNAME).sendKeys(formUpdateData.get(1));
			driver.findElement(DemoQAOR.WEBTABLE_EMAIL).clear();
			driver.findElement(DemoQAOR.WEBTABLE_EMAIL).sendKeys(formUpdateData.get(2));
			driver.findElement(DemoQAOR.WEBTABLE_AGE).sendKeys(formUpdateData.get(3));
			driver.findElement(DemoQAOR.WEBTABLE_SALARY).sendKeys(formUpdateData.get(4));
			driver.findElement(DemoQAOR.WEBTABLE_DEPT).sendKeys(formUpdateData.get(5));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(DemoQAOR.WEBTABLE_SUBMIT).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			String tableText = driver.findElement(By.className("rt-tbody")).getText();
			if (tableText.contains("Updated Nitin")) {
				System.out.println("Text is verified");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			// TODO: handle exception
		}
	}
}
