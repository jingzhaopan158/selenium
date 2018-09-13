package com.dangjian.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {

	public WebDriver driverName(String browser) {
		if(browser.equalsIgnoreCase("ChromeDriver")){
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			return new ChromeDriver();
		}else{
            System.setProperty("webdriver.firefox.marionette", "D:\\java\\geckodriver\\geckodriver-v0.14.0-win64\\geckodriver.exe");
			return new FirefoxDriver();
		}
		
	}

}
