package selenium.elements;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksAndImages {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/elements");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Click on Element Icon to expand the menu
		driver.findElement(By.cssSelector(".element-group:first-child")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Locate CheckBox option in the menu
		WebElement element = driver.findElement(By.cssSelector(".element-group:first-child li:nth-child(7)"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", element);
	}

	@Test(priority = 1)
	public void brokenImage() throws InterruptedException {
		try {
			// Get all images of the webpage
			List<WebElement> images = driver.findElements(By.tagName("img"));
			{
				// Get first Image as we have only one here
				WebElement image = images.get(0);

				// Validate image display using JavaScript executor
				try {
					boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript(
							"return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);",
							image);
					if (imageDisplayed == true) {
						System.out.println("DISPLAY - OK");
					} else {
						System.out.println("DISPLAY - BROKEN");
					}
				} catch (Exception e) {
					System.out.println("Error Occured");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Test(priority = 0)
	public void brokenLink(String linkUrl) throws InterruptedException, MalformedURLException, IOException {
		  List<WebElement> links = driver.findElements(By.tagName("a"));

	        // Verify links
	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	        
	                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	                connection.setRequestMethod("HEAD");
	                try {
						connection.connect();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	                int responseCode = 0;
					try {
						responseCode = connection.getResponseCode();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                if (responseCode >= 400) {
	                    System.out.println("Broken link found: " + url + " - Response Code:");
	                }
	             
	        }
	}

}
