package WebdDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");
		
		String title = driver.getTitle();
		System.out.println("current title is "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("current url is "+ url);
		
		driver.close();
		
	}

}
