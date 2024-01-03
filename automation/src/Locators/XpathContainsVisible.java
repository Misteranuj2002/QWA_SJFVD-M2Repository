package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsVisible {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chat.openai.com/c/33ec307a-784b-42bc-9958-a80b495368f4#");
		
		//driver.findElement(By.id("prompt-textarea")).sendKeys("write objective for resume",Keys.ENTER);
         driver.findElement(By.linkText("Log in")).click();
	}

}
