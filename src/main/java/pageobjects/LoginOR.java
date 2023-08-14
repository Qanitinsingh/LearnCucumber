package pageobjects;

import org.openqa.selenium.By;

public class LoginOR {
// Email login
	public static final By USERNAME = By.id("userName");
	public static final By PASSWORD = By.id("password");
	public static final By LOGINBTN = By.className("loginbutton");
	public static final By NEWUSER = By.cssSelector("newUser");

	// Twitter Elements

	public static final By TWITTER_USERNAME = By.id("userName");
	public static final By TWITTER_PASSWORD = By.xpath("userName");
	public static final By TWITTER_LOGINBTN = By.cssSelector("userName");

	// INSTA Elements

	public static final By INSTA_USERNAME = By.xpath("userName");
	public static final By INSTA_PASSWORD = By.name("userName");
	public static final By INSTA_LOGINBTN = By.id("userName");
}
