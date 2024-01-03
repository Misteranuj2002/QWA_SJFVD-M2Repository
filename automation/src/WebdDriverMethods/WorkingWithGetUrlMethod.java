package WebdDriverMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetUrlMethod {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//to fetch current url
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
	
	
    

}
