package SelfProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.TracedHttpClient;
import org.w3c.dom.Text;

public class AcTitime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://laptop-pie5hb01/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        
        Thread.sleep(2000);
        driver.findElement(By.id("loginButton")).click();
        
        Thread.sleep(3000);
        driver.findElement(By.name("usersSelector.selectedUser")).click();
        driver.findElement(By.xpath("(//img[@class='sizer' and @width='84'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[value='Create New User']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("test engineer 2");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password' and @name='passwordText']")).sendKeys("manager");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password' and @name='passwordTextRetype']")).sendKeys("manager");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ajay");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("kawal");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        
	}

}
