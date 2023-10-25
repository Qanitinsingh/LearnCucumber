package pageobjects;

import org.openqa.selenium.By;

public class PracticeFormOR {
	public static String name = "Nitin";

	public static final By FIRST_NAME= By.id("firstName");
	public static final By LAST_NAME = By.id("lastName");
	public static final By EMAIL = By.id("userEmail");
	public static final By PHONE = By.id("userNumber");
	public static final By CURRENT_ADDRESS = By.id("currentAddress");

	public static final By GENDER_MALE = By.id("gender-radio-1");
	public static final By GENDER_FEMALE = By.id("gender-radio-2");
	public static final By GENDER_OTHERS = By.id("gender-radio-3");
	public static final By AUTOSUGGESTION = By.cssSelector(".subjects-auto-complete__value-container input");

	public static final By AUTOSUGGESTION_OPTIONS = By.xpath("//div[@id='react-select-2-option-0']");

	public static final By HOBBIES = By.id("hobbies-checkbox-1");

	public static final By DATEPICKER = By.className("react-datepicker-wrapper");

	public static final By DATE_MONTH = By.className("react-datepicker__month-select");
	public static final By DATE_YEAR = By.className("react-datepicker__year-select");
	public static final By DATE = By.className("react-datepicker__day");

	public static final By UPLOAD_IMAGE = By.id("uploadPicture");
	public static final By STATE = By.id("state");
	public static final By STATE_VALUE = By.id("react-select-3-option-0");

	public static final By CITY = By.id("city");
	public static final By CITY_VALUE = By.id("react-select-4-option-1");

	public static final By SUBMIT = By.id("submit");

	public static final By CONFIRMATION_POPUP = By.id("closeLargeModal");

}
