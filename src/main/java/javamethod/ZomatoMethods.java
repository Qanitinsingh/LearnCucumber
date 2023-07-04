package javamethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageobjects.ZomatoObject;

public class ZomatoMethods {

	public static WebDriver driver;
	static String name = "Nitin";
	static String password = "Nitin@123";

	public static void login() {
		driver.get("https://www.zomato.com/");

	}

	public static void enterEmail() {

		driver.findElement(ZomatoObject.EMAIL).sendKeys(name);
		driver.findElement(ZomatoObject.EMAIL).sendKeys(password);
	}

	public static void enterPasswords() {

		driver.findElement(By.id("password")).sendKeys(name);

	}
}
