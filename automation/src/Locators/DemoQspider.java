package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQspider {
    public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		//driver.findElement(By.className("hover:text-slate-700")).click();
		
		driver.findElement(By.id("name")).sendKeys("anuj");
		driver.findElement(By.id("email.")).sendKeys("anujthakur91483@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		
		//driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		

		
	}
}
