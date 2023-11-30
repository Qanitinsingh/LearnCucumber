package selenium.problems.ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static WebDriver driver;

	@Test
	public void firstMethod() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Nitin");

	}

}
