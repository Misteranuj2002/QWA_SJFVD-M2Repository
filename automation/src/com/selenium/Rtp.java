package com.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Rtp {
	
	static WebDriver driver;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter browser name");
        String browser = sc.next();
        
        if (browser == "chrome") {
			driver = new ChromeDriver();
		}
        else if (browser == "firefox") {
			driver = new FirefoxDriver();
		}
        else if (browser == "edge") {
			driver = new EdgeDriver();
		}
        else if (browser == "safari") {
			driver = new SafariDriver();
		}
        else {
			System.out.println("invalid browser");
		}
	}

}
