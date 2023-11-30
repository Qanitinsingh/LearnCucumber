package seleniu.inetractions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DragAndDrop {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();

	}

	@Test(priority = 1)
	public void dragAndDrop() throws InterruptedException  {
		WebElement frame= driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		Thread.sleep(2000);
	}
	@AfterTest
	public void quitBrowser() {
		driver.quit();
		System.out.println("Execution is completed");
	}
}
