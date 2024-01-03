package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vistara {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?utm_source=bing&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=:G:s&s_kwcid=AL!596!3!!e!!o!!vistara%2520airlines&s_kwcid=AL!596!3!!e!!o!!vistara%2520airlines");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name='flightSearchFrom']")).sendKeys("pune");
		Thread.sleep(2000);
		driver.findElement(By.id("acceptAllBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[contains(placeholder='Select Arrival City')]")).sendKeys("nagpur");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[contains(id='departCalendarDiv')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[contains(data-date='27')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[id='return-radio']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[data-date='28']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='widget-btn aubergine-button-dark search_book_flights'])")).click();
		
	}
}
