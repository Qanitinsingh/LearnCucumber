package selenium.elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/elements");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test(priority = 0)
	public static void handleCheckBox() throws InterruptedException {
		
			// Click on Element Icon to expand the menu
			driver.findElement(By.cssSelector(".element-group:first-child")).click();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			// Locate CheckBox option in the menu
			driver.findElement(By.cssSelector(".left-pannel .element-group:first-child li:nth-of-type(2)")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			// Expand Home
			driver.findElement(By.cssSelector(".check-box-tree-wrapper .rct-collapse-btn")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			// Click in all checkboxes one by one

			
			List <WebElement> els = driver.findElements(By.cssSelector(".rct-node-collapsed .rct-icon-uncheck"));
			for ( WebElement el : els ) {
			    if ( !el.isSelected() ) {
			        el.click();
			     break;
			    }
			}
			Thread.sleep(2000);
		driver.quit();
	}
}
