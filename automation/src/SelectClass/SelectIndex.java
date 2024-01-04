package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
        
        //identify dropdown
        
        WebElement dropdownElement = driver.findElement(By.id("Select"));
        
        //create object of select class
        
        Select s = new Select(dropdownElement)    ;    
        //use by index
        
        s.selectByIndex(7);
}
}
