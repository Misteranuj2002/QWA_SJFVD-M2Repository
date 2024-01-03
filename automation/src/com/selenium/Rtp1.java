package com.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Rtp1 {
	static WebDriver driver;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("select no.");
        System.out.println("1-chrome");
        System.out.println("2-firefox");
        System.out.println("3-edge");
        System.out.println("4-safari");
        
        String browser = sc.next();
        
        if (browser == "1") {
        	driver = new ChromeDriver();			
		}
        else if (browser == "2") {
        	driver = new FirefoxDriver();
		}
        else if (browser == "3") {
        	driver = new EdgeDriver();
		}
        else if (browser == "4") {
        	driver = new SafariDriver();
		}
        else {
			System.out.println("invalid browser");
		}
        
		
	}

}
