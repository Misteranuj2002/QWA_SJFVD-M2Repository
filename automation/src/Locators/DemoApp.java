package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 //for registration
		 driver.findElement(By.className("ico-register")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("gender-male")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("FirstName")).sendKeys("anuj");
		 Thread.sleep(2000);
		 driver.findElement(By.id("LastName")).sendKeys("thakur");
		 Thread.sleep(2000);
		 driver.findElement(By.id("Email")).sendKeys("anujthakur91483@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.id("Password")).sendKeys("123456");
		 Thread.sleep(2000);
		 driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		 Thread.sleep(2000);
		 driver.findElement(By.id("register-button")).click();
		 Thread.sleep(2000);
		 //for login
		 driver.findElement(By.className("ico-login")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("Email")).sendKeys("anujthakur91483@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.id("Password")).sendKeys("123456");
		 Thread.sleep(2000);
		 driver.findElement(By.id("RememberMe")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.className("login-button")).click();
		 Thread.sleep(2000);
		 String title = driver.getTitle();
		 System.out.println(title);
}
}
