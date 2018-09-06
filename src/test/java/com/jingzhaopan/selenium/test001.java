package com.jingzhaopan.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test001 {

	private ChromeDriver driver;
	public static void main(String[] args) {
		test001 cd = new test001();
		try {
			cd.init();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://47.104.72.111/login.html ");
		Thread.sleep(3000);
		
	}


}
