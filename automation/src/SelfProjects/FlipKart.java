package SelfProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com");
	
	Thread.sleep(2000);
	
	
	driver.findElement(By.cssSelector("[class='Pke_EE']")).sendKeys("laptops",Keys.ENTER);
	
	Thread.sleep(2000);
	
	List<WebElement> laptops = driver.findElements(By.cssSelector("[class='_4rR01T']"));
	
	List<WebElement> price = driver.findElements(By.cssSelector("[class='_30jeq3 _1_WHN1']"));
	
	for(WebElement list:laptops)
	{
		System.out.println(list.getText());
	}
	
	for(WebElement pri:price)
	{
		System.out.println(pri.getText());
	}
	
	driver.quit();
	}
	
	
	}
