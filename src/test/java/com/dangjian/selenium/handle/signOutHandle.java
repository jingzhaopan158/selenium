package com.dangjian.selenium.handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.page.loginPage;

public class signOutHandle {
	public DriverBase driver;
	public loginPage loginpage;
	public signOutHandle(DriverBase driver) {
		this.driver = driver;
		loginpage = new loginPage(driver);
	}
	
	/*
	 * 点击admin按钮
	 */
	public void clickAdmin() throws Exception {
		
		Thread.sleep(3000);
		WebElement signout = driver.findElement(By.xpath("//a[@class='user']/span"));
		driver.moveToElement(signout);
		Thread.sleep(1000);
	}

	/*
	 * 点击admin按钮
	 */
	public void clickSginOut() {
		loginpage.click(loginpage.getSignOutElement());
	}
}
