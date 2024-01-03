package WebdDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");
		
		 driver.navigate().to("https://www.swiggy.com");
		 
		 Thread.sleep(2000); //used to delay the task for some seconds
		 driver.navigate().back();
		 
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 
		 driver.quit();
		 
	}

}
