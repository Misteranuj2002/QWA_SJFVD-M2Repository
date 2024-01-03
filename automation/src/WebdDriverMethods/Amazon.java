package WebdDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //to maximize windows
		
		driver.get("https://amazon.in/");  //to navigate to any link
		
		System.out.println(driver.getTitle()); //to fetch title of web application
		
		driver.manage().window().minimize();  //to minimize windows
		
				
	}

}
