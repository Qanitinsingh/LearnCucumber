package seleniu.inetractions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		driver = new ChromeDriver(cr);

		driver.get("https://demoqa.com/sortable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public static void sortable() throws InterruptedException {

		List<WebElement> elements = driver.findElements(By.cssSelector("#demo-tabpane-list .list-group-item-action"));

		// Create an instance of Actions class
		Actions actions = new Actions(driver);

		// Click and hold each element, then move and release
		for (WebElement element : elements) {
			actions.clickAndHold(element).moveByOffset(50, -49) // Adjust the move offset as needed
					.release().perform();
		}

	}

}
