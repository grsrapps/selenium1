package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class googleSearchPageObjects {
	
	WebDriver driver = null;
	
	By TextBoxSearch = By.name("q");
	By ButtonClick = By.name("btnK");

	public googleSearchPageObjects(WebDriver driver){
		
		this.driver = driver;
	}
	public void setTextInSearchBox(String Text){
		driver.findElement(TextBoxSearch).sendKeys(Text);
	}
	
	public void clickSearchButton(){
		driver.findElement(ButtonClick).sendKeys(Keys.RETURN);
	}
}