package javamethod;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.TextBoxElements;

public class TextBoxMethods {

	public static WebDriver driver;

	public static void launchBrowser(String systemURL) {
		try {
			WebDriverManager.chromedriver().setup();

			ChromeOptions cr = new ChromeOptions();
			cr.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(cr);
			driver.get(systemURL);
		} catch (TimeoutException e) {
			// TODO: handle exception
		}
		
	}

	public static void enterFullName(String fullname) {
		try {
			driver.findElement(TextBoxElements.FULL_NAME).sendKeys(fullname);
		} catch (NoSuchElementException e) {
			
		}

	}

	public static void enterEmail(String userEmail) {
		
		try {
			driver.findElement(TextBoxElements.EMAIL).sendKeys(userEmail);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public static void enterCurrentAddress(String caddress) {
		try {
			driver.findElement(TextBoxElements.CURRENT_ADDRESS).sendKeys(caddress);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public static void enterParmanentAddress(String paddress) {
		try {
			driver.findElement(TextBoxElements.PARMANENT_ADDRESS).sendKeys(paddress);
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

	public static void clickSubmit() {
		try {
			driver.findElement(TextBoxElements.SUBMIT).click();
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		}
		
	}

	public static void verifyOutput() {

		boolean output = driver.findElement(TextBoxElements.FORM_OUTPUT).isDisplayed();
		if (output == true) {
			System.out.println("Test pass");
		}
	}
}
