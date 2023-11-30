package docker.actions;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSafariInDocker {

	
	public static WebDriver driver;

	@BeforeTest
	// This method we use weather docker is installed in machine or not
	public void checkDockerInstalled() {
		boolean dockerPresent = WebDriverManager.isDockerAvailable();
		System.out.println(dockerPresent);

	}

	@Test
	public void executeTestInSafari() {

		/*
		 * Another relevant new feature available in WebDriverManager 5 is the ability
		 * to create browsers in Docker containers out of the box. we need to invoke the
		 * method browserInDocker() in conjunction with create() of a given manager. A
		 * possible inconvenience of using browsers in Docker is that we cannot see what
		 * is happening inside the container by default. To improve this situation,
		 * WebDriverManager allows connecting to the remote desktop session simply by
		 * invoking the method enableVnc() of a dockerized browser.
		 */
		WebDriverManager wd = WebDriverManager.safaridriver().browserInDocker().enableVnc();

		driver = wd.create();

		URL url = wd.getDockerNoVncUrl();
		System.out.println(url);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Nitin");
	}

}
