package selenium.practice.form;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass {
	public static WebDriver driver;

	public static void main(String agrs[]) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.findElement(By.id("alertButton")).click();

		driver.switchTo().alert().accept();

		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmButton")).click();

		driver.switchTo().alert().accept();

		driver.findElement(By.id("promtButton")).click();

		driver.switchTo().alert().sendKeys("Rajesh");
		driver.switchTo().alert().accept();
		
		System.out.println("All test pass");

	}

}
