package pageobjects;

import org.openqa.selenium.By;

public class ElemenetsTextBox {
	public final static By TEXTBOX_OPTION = By.cssSelector(".element-group:first-child .element-list .menu-list #item-0");
	public final static By CHECKBOX_OPTION = By.cssSelector(".element-group:first-child .element-list .menu-list #item-1");
	public final static By RADIO_BUTTON = By.cssSelector(".element-group:first-child .element-list .menu-list #item-2");

	public final static By FULL_NAME = By.id("userName");
	public static final By EMAIL = By.id("userEmail");
	public static final By CURRENT_ADDRESS = By.id("currentAddress");
	public static final By PARMANANT_ADDRESS = By.id("permanentAddress");
	public static final By SUBMIT = By.id("submit");
}
