package seleniu.inetractions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.lu.dann;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/resizable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public static void resizable1() throws InterruptedException {

		WebElement ele = driver.findElement(By.cssSelector("#resizableBoxWithRestriction .react-resizable-handle-se"));

		Actions ac = new Actions(driver);
		ac.dragAndDropBy(ele, 500, 300).perform();

	}

	@Test
	public static void resizable2() throws InterruptedException {

		WebElement ele = driver.findElement(By.cssSelector(".resizable-nolimit .react-resizable-handle-se"));

		Actions ac = new Actions(driver);
		ac.dragAndDropBy(ele, 1215, 380).perform();

		driver.quit();
	}

}
