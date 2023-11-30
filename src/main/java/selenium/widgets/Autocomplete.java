package selenium.widgets;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		driver = new ChromeDriver(cr);

		driver.get("https://demoqa.com/auto-complete");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public static void typemultiple() throws InterruptedException {
		WebElement autocompleteInput = driver.findElement(By.id("autoCompleteMultipleInput"));
		List<String> valuesToSelect = List.of("Yellow", "White", "Blue");

		for (String value : valuesToSelect) {
			// Step 3: Send keys to the input field
			autocompleteInput.sendKeys(value);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement dropdownOption = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-2-option-0")));
			dropdownOption.click();
			autocompleteInput.clear();
		}
	}

	@Test
	public static void typesingle() throws InterruptedException {
		WebElement value = driver.findElement(By.id("autoCompleteSingleInput"));
		value.click();
		value.sendKeys("Bla");
		
		List<WebElement> values = driver.findElements(By.className("auto-complete__menu-list"));
		for (WebElement element : values) {
			Thread.sleep(1000);
			String text = element.getText();
			System.out.println(text);
			if (text.equals("Black")) {
				element.click();
				break;
			}
		}

	}
}
