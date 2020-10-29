package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.googleSearchPageObjects;

public class googleSearchPageTest {
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearchTest();
	}
	
	public static void googleSearchTest(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\Testing\\Tools\\eclipse\\workspace\\second\\Drivers\\driverChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		
		googleSearchPageObjects searchpageOBJ = new googleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		
		searchpageOBJ.setTextInSearchBox("linkedin");
		
		searchpageOBJ.clickSearchButton();
		
		driver.close();
		
	}

}
