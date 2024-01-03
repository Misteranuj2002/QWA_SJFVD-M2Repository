package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPreceding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		//to move towards previous sibling
		
		driver.findElement(By.xpath("//section[@id='customModal']/preceding-sibling::section[@id='updateModal']"));
		

	}

}
