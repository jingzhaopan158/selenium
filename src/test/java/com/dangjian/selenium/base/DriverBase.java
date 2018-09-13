package com.dangjian.selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dangjian.selenium.base.SelectDriver;

public class DriverBase {
	public WebDriver driver;
	public DriverBase(String browser) {
		SelectDriver selectDriver = new SelectDriver();
		this.driver = selectDriver.driverName(browser);
		driver.manage().window().maximize();
	}
	
	public void stop() {
		System.out.println("stop webdriver");
		driver.close();
	}
	
	/*
	 * ��װElement����
	 */
	public WebElement findElement(By by) {
		WebElement element = driver.findElement(by);
		return element;
	}
	
	/*
	 * get��װ
	 */
	public void get(String url){
		driver.get(url);
	}

	/*
	 * ����
	 */
	public void back() {
		driver.navigate().back();
	}

	

	public void frame(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void defaultContent() {
		driver.switchTo().defaultContent();
	}
	
	public void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	public void zuiding() {
		((JavascriptExecutor)driver).executeScript("document.documentElement.scrollTop=0");
	}
	
	public void zuidi() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");  
	}
	
	public void xiayi() {
		Actions action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).perform();   
        action.sendKeys(Keys.ENTER).perform();    
	}
}
