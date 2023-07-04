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

public class Selectable {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		driver = new ChromeDriver(cr);

		driver.get("https://demoqa.com/selectable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 0)
	public static void selectableList() throws InterruptedException {

		List<WebElement> elements = driver.findElements(By.cssSelector("#verticalListContainer li"));

		// Create an instance of Actions class
		Actions actions = new Actions(driver);

		// Click one by one
		for (WebElement element : elements) {
			
			actions.click(element).perform();
		}
		// Click and remove element one by one
		for (WebElement element : elements) {
			actions.click(element).perform();
		}

	}

	@Test(priority = 1)
	public static void selectableGrid() throws InterruptedException {

		driver.findElement(By.id("demo-tab-grid")).click();
		List<WebElement> elements = driver.findElements(By.cssSelector("#gridContainer .list-group-item"));

		// Create an instance of Actions class
		Actions actions = new Actions(driver);

		// Click and select element one by one
		for (WebElement element : elements) {
			actions.click(element).perform();
		}
		// Click and remove element one by one
		for (WebElement element : elements) {
			actions.click(element).perform();
		}

	}
}
