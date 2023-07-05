package selenium.problems.ui;

import org.openqa.selenium.By;

public class GlobalOR {

	public static final By HOME = By.cssSelector(".navbar-nav li a[href='Index.html']");
	public static final By WEBTABLE = By.cssSelector(".navbar-nav li a[href='WebTable.html']");

	public static final By SWICTH_MENU = By.cssSelector(".navbar-nav li:nth-of-type(4) a[href='SwitchTo.html']");
	public static final By SWICTH_TO_OPTIONS = By.cssSelector(".navbar-nav li:nth-of-type(4)  ul li");
// Alerts page elements
	public static final By ALERT_WITH_OK_TAB = By.cssSelector(".pullleft ul li.active");
	public static final By ALERT_WITH_OK_CANCEL = By.cssSelector(".pullleft ul li:nth-of-type(2)");
	public static final By ALERT_WITH_TEXT = By.cssSelector(".pullleft ul li:last-child");
	
	// Window elements
	
	public static final By CLICK_NEWTAB = By.cssSelector("#Tabbed .btn");
	public static final By CLICK_WINDOW_OK = By.cssSelector("#Seperate .btn");
	public static final By CLICK_WINDOW = By.cssSelector("li a[href='#Seperate']");
	public static final By WIDGETS_MENU = By.cssSelector(".navbar-nav li:nth-of-type(5) a[href='Widgets.html']");
	public static final By WIDGETS_OPTIONS = By.cssSelector(".navbar-nav li:nth-of-type(5)  ul li");
	public static final By INTERACTION_MENU = By
			.cssSelector(".navbar-nav li:nth-of-type(6) a[href='Interactions.html']");

	public static final By INTERACTION_DRAG = By
			.cssSelector("a[href='Interactions.html']");
	public static final By DRAGDROP = By
			.xpath("//a[normalize-space()='Drag and Drop']");
	public static final By DRAGDROP_STATIC = By
			.xpath("//a[normalize-space()='Static']");
	public static final By DRAGDROP_DYNAMIC = By
			.cssSelector(".navbar-nav li:nth-of-type(6)  ul.childmenu li:last-child a");

	public static final By INTERACTION_SELECTABLE = By
			.cssSelector(".navbar-nav li:nth-of-type(6) li a[href='Selectable.html']");

	public static final By INTERACTION_RESIZEABLE = By.cssSelector("a[href='Resizable.html']");

	public static final By VIDEO = By.cssSelector(".navbar-nav li:nth-of-type(7) a[href='SwitchTo.html']");
	public static final By VIDEO_YOUTUBE = By.cssSelector("a[href='Youtube.html']");
	public static final By VIDEO_VIMEO = By.cssSelector("a[href='Vimeo.html']");

	public static final By MORE = By.cssSelector(".navbar-nav li:nth-of-type(9) a[href='#']");
	public static final By MORE_CHARTS = By.cssSelector(".navbar-nav li:nth-of-type(9) ul li:first-child");
	public static final By MORE_MODALS = By.cssSelector(".navbar-nav li:nth-of-type(9) ul li:last-child");
	public static final By MORE_DYNAMICDATA = By.cssSelector(".navbar-nav li:nth-of-type(9) ul li:last-child");

}
