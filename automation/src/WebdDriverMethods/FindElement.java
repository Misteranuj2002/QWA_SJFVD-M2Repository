package WebdDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//span[text()='✕']")).click();
        
        driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).click();
        //it will give firstly occured element
        
        driver.findElement(By.xpath("//div[contains(@class='_4rR01T']")).click();
        
        
        
	}

}
