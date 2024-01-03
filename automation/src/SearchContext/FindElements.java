package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//span[text()='✕']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.name("")).sendKeys("iphone");        //it will give firstly occured element
        
        /*List<WebElement> allIphone = driver.findElements(By.xpath("//div[contains(@class='_4rR01T']"));
        
        for(WebElement iphone:allIphone)
        {
        	System.out.println(iphone.getText());
        }*/
        
        

	}

}
