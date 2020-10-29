package Test1;

import org.openqa.selenium.By;
import Pages.googleSearchPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchTest {

	static WebDriver driver = null;
	public static void main(String[] args) {
		
		googleSearch();
	}
	
	public static void googleSearch(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\Testing\\Tools\\eclipse\\workspace\\second\\Drivers\\driverChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		
		//driver.findElement(By.name("q")).sendKeys("linkdein");
		//driver.findElement(By.name("btnk")).click();
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		googleSearchPage.textbox_search(driver).sendKeys("linkedin");
		
		googleSearchPage.button_click(driver).sendKeys(Keys.RETURN);
		System.out.println("Last Step");
		//driver.close();
	}

}
