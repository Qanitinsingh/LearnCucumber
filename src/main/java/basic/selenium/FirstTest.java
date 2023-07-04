package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(cr);

		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.findElement(By.cssSelector(".card:nth-of-type(1)")).click();

		driver.findElement(By.cssSelector(".element-group:nth-of-type(1) #item-0")).click();

		driver.findElement(By.id("userName")).sendKeys("Vaibhav");

//		
//		driver.findElement(By.cssSelector(".card:nth-of-type(2)")).click();
//		driver.findElement(By.cssSelector(".element-group:nth-of-type(2) #item-0")).click();
//		
//		driver.findElement(By.id("firstName")).sendKeys("Vaibhav");
//		driver.findElement(By.id("lastName")).sendKeys("QA");
//		driver.findElement(By.id("userEmail")).sendKeys("Vaibhav@gmail.com");
//		driver.findElement(By.id("userNumber")).sendKeys("8557037939");
		// driver.quit();

	}

}
