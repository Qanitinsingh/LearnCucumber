package selenium.problems.ui;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v101.network.Network;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNetwork {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		DevTools devtools= ((ChromeDriver)driver).getDevTools();
		devtools.createSession();
		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devtools.send(Network.emulateNetworkConditions(false, 100, 2000, 1000, Optional.of(org.openqa.selenium.devtools.v101.network.model.ConnectionType.CELLULAR3G)));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		// you can change the connection type as per your need
	}

}
