package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://laptop-pie5hb01/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		Thread.sleep(2000);
		  
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click();

	}

}
