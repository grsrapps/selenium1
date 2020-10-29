package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		googleSearch();
	}
	
	public static void googleSearch(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\Testing\\Tools\\eclipse\\workspace\\second\\Drivers\\driverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("linkdein");
		driver.findElement(By.name("btnk")).click();
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		System.out.println("Last Step");
		//driver.close();
	}

}
