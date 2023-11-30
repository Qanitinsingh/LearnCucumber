package selenium.problems.ui;
//package tdd.approach;
//
//import java.time.Duration;
//import java.util.ArrayList;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class RightClickDoubleClick {
//	public static WebDriver driver;
//
//	@BeforeTest
//	public void setup() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://demo.automationtesting.in/Register.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//
//	}
//
//	@Test(enabled = false)
//	public void singleClick() {
//		Actions actions = new Actions(driver);
//		WebElement btnElement = driver.findElement(By.xpath("//button[@id='Button1']"));
//
//		actions.contextClick(btnElement).perform();
//		// actions.doubleClick(btnElement).perform();
//	}
//
//	@Test(enabled = false)
//	public void doubleClick() throws InterruptedException {
//		driver.navigate().to("https://demo.automationtesting.in/Accordion.html");
//		Actions actions = new Actions(driver);
//		WebElement btnElement1 = driver.findElement(By.cssSelector("a[href='#collapse2']"));
//
//		actions.doubleClick(btnElement1).perform();
//		/* my suggest is to use click operation two time as double click is too fast. */
//	}
//
//	@Test(priority = 1)
//	public void doubleClickSelect() throws InterruptedException {
//		driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
//		Actions actions = new Actions(driver);
//		WebElement btnElement2 = driver.findElement(By.xpath("//img[@src=\"data-samples/images/popup_pic.gif\"]"));
//
//		actions.contextClick(btnElement2).perform();
//		WebElement pInfo = driver.findElement(By.cssSelector("td #dm2m1i1tdT"));
//		actions.moveToElement(pInfo).build().perform();
//		WebElement installation = driver.findElement(By.cssSelector("td #dm2m2i1tdT"));
//		actions.moveToElement(installation).build().perform();
//		WebElement description = driver.findElement(By.cssSelector("td #dm2m3i0tdT"));
//		actions.moveToElement(description).build().perform();
//		WebElement descriptionclick = driver.findElement(By.cssSelector("td #dm2m3i0tdT"));
//		descriptionclick.click();
//
//		// Switching to new window and move 
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
////
////		// Then Perform Actions
////	//	WebDriverWait wait = new WebDriverWait(driver, 20);
////		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("subtitleTd")));
////		String present = driver.findElement(By.className("subtitleTd")).getText();
////
////		System.out.println(present);
////	}
//
//	@AfterTest
//	public void quitBrowser() {
//		driver.quit();
//		System.out.println("Execution is completed");
//	}
//}
