package Test1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.googleSearchPageObjects;

public class testNGDemo {

	private static WebDriver driver = null;
	//public static void main(String[] args) {
	//googleSearchTest();
	//}
	@BeforeTest
	public void setupTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\Testing\\Tools\\eclipse\\workspace\\second\\Drivers\\driverChrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}

	@Test
	public static void googleSearchTest(){
		googleSearchPageObjects searchpageOBJ = new googleSearchPageObjects(driver);
		driver.get("https://google.com");
		searchpageOBJ.setTextInSearchBox("linkedin");
		searchpageOBJ.clickSearchButton();
	}

	@AfterTest
	public void closeTest(){
		driver.close();
		System.out.println("Last step");
	}


}
