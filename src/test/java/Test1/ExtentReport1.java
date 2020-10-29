package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport1 {

	public static void main(String[] args) {
		extentreport();

	}
	
	public static void extentreport(){
		
		// initialize the HtmlReporter
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		//create a external report and attache to above report
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Google Search","This is test to validate google search functialinity");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\Testing\\Tools\\eclipse\\workspace\\second\\Drivers\\driverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test Case");
		driver.get("https://www.google.com/");
		
		test1.pass("Navigate to google.com");
		driver.findElement(By.name("q")).sendKeys("cricket news");
		
		test1.pass("Entered text in serarch box");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		test1.pass("Pressed keyboard");
		
		driver.close();
		driver.quit();
		
		test1.pass("Closed browser");
		
		test1.info("Test Completed");
		
		extent.flush();
	}

}
