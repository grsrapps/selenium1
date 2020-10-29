package second;

//import java.awt.List;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class second {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		//WebElement textbox = driver.findElement(By.name("q"));
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("linkedin");;
		List<WebElement> listOfInputElement = driver.findElements(By.xpath("//input"));
		int count = listOfInputElement.size();
		System.out.println("Count of Input element ="+count);
		//textbox.sendKeys("linkedin");
		//driver.close();
		//driver.quit();
	}

}
