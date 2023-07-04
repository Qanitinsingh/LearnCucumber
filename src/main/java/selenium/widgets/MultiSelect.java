package selenium.widgets;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		driver = new ChromeDriver(cr);

		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public static void selectValue() throws InterruptedException {

		WebElement dropdown = driver.findElement(By.cssSelector(".css-1hwfws3:first-child"));
		Actions ac = new Actions(driver);
		ac.moveToElement(dropdown).click().build().perform();

		List<WebElement> tabs = driver.findElements(By.className("css-yt9ioa-option"));
		for (int i = 1; i <= tabs.size(); i++) {
			tabs.get(i).click();
			break;

		}
	}

	@Test
	public static void selectOne() throws InterruptedException {

		WebElement dropdown = driver.findElement(By.cssSelector("#selectOne .css-1hwfws3"));
		Actions ac = new Actions(driver);
		ac.moveToElement(dropdown).click().build().perform();

		List<WebElement> tabs = driver.findElements(By.className("css-yt9ioa-option"));
		for (int i = 1; i <= tabs.size(); i++) {
			tabs.get(i).click();
			break;

		}
	}

	@Test
	public static void oldSelect() throws InterruptedException {

		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		Actions ac = new Actions(driver);
		ac.moveToElement(dropdown).click().build().perform();
		Select se = new Select(driver.findElement(By.id("oldSelectMenu")));
		se.selectByIndex(5);
	}

	@Test
	public static void multiSelect() throws InterruptedException {

		WebElement dropdown = driver
				.findElement(By.cssSelector("#selectMenuContainer .row:nth-of-type(7) .css-1hwfws3"));
		Actions ac = new Actions(driver);

		ac.moveToElement(dropdown).click().build().perform();
		Thread.sleep(1000);

		List<WebElement> tabs = driver.findElements(By.className("css-yt9ioa-option"));
		for (int i = 1; i <= tabs.size(); i++) {
			tabs.get(i).click();
			break;

		}
	}

	@Test
	public static void multiSelect1() throws InterruptedException {

		Select oSel = new Select(driver.findElement(By.id("cars")));

		if (oSel.isMultiple()) {

			// Selecting multiple values by index
			oSel.selectByIndex(1);
			oSel.selectByIndex(2);

			// Or selecting by values
			oSel.selectByValue("volvo");
			oSel.selectByValue("audi");

			// Or selecting by visible text
			oSel.selectByVisibleText("Volvo");
			oSel.selectByVisibleText("Opel");
		}
	}
}
