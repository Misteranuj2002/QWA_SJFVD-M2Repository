package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");
		 driver.findElement(By.name("username")).sendKeys("_anuj._.thakur._.02_");
		 driver.findElement(By.name("password")).sendKeys("*******");
		 driver.findElement(By.className("_acap")).click();
		
		 //driver.getCurrentUrl();
		 driver.quit();
		
	}
 
	
}
