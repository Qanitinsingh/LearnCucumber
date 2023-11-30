package selenium.problems.ui;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--disable-web-security");
		cr.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(cr);

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 0)
	public void handleRadio() throws InterruptedException {
		try {

			List<WebElement> buttonList = driver.findElements(By.name("radiooptions"));

			int count = 0;
			for (WebElement radioButton : buttonList) {
				// Check if the radio button is already selected
				if (!radioButton.isSelected()) {
					radioButton.click();
					System.out.println("Selected radio button: " + radioButton.getAttribute("value"));
					count++;

					// Break the loop after selecting two radio buttons
					if (count == 2) {
						break;
					}
				}
			}

		} catch (ElementClickInterceptedException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}
}
