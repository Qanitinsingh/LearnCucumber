package tdd.approach.old;

import org.openqa.selenium.By;

public class RegisterOR {

	public static final By REGISTER_MENU = By.cssSelector(".active a[href='Register.html']");
	public final static By FNAME = By.cssSelector("input[placeholder='First Name']");
	public static final By LNAME = By.cssSelector("input[placeholder='Last Name']");
	public static final By ADDRESS = By.cssSelector("#basicBootstrapForm textarea");
	public static final By EMAIL = By.cssSelector("input[type='Email']");
	public static final By PHONE = By.cssSelector("input[type='tel']");

	public static final By MALE = By.cssSelector("#basicBootstrapForm input[value='Male']");
	public static final By FEMALE = By.cssSelector("#basicBootstrapForm input[value='FeMale']");
	public static final By HOBBIES_CRICKET = By.id("checkbox1");

	public static final By SKILLS = By.id("Skills");

	public static final By LANGUAGE = By.id("msdd");
	public static final By LANGUAGE_OPTIONS = By.cssSelector(".ui-corner-all li");

	public static final By COUNTRY = By.cssSelector("#select2-country-results li:last-child");
	public static final By DOB_YEAR = By.id("yearbox");
	public static final By DOB_MONTH = By.xpath("//select[@placeholder='Month']");
	public static final By DOB_DATE = By.xpath("//select[@placeholder='Day']");
	public static final By CHOOSE_IMAGE = By.id("imagesrc");
	public static final By PASSWORD = By.id("firstpassword");
	public static final By C_PASSWORD = By.id("secondpassword");
	public static final By SUBMIT = By.id("submitbtn");
}