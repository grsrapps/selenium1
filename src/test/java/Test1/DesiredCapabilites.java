package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilites {

	public static void main(String[] args) {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("something", true);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		//options.merge(capabilities);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\Testing\\Tools\\eclipse\\workspace\\second\\Drivers\\driverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Cricekt score");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		
		driver.quit();

	}

}
