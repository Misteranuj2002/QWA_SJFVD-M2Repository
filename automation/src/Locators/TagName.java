package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	  WebElement button = driver.findElement(By.tagName("input"));
	  button.sendKeys(Keys.ENTER);
	    
	   }
	

}
