package com.dangjian.selenium.handle;





import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.page.addAnnouncementPage;

public class addAnnouncementHandle {
	
	public DriverBase driver;
	public addAnnouncementPage aannouncementp;
	public addAnnouncementHandle(DriverBase driver) {
		this.driver = driver;
		aannouncementp = new addAnnouncementPage(driver);
		
	}
	
	/*
	 * 输入标题
	 */
	public void sendKeysTitle(String title) throws Exception {
		
		aannouncementp.sendKeys(aannouncementp.getTitleElement(), title);
	}
	
	
	
	/*
	 * 输入内容
	 */
	
	public void sendKeysContent(String content) {
		WebElement dayElement =driver.findElement(By.xpath("//div[@id='notice_content']//iframe"));
		driver.frame(dayElement);
		aannouncementp.sendKeys(aannouncementp.getContentElement(), content);
		driver.defaultContent();
		
	}
	

	/*
	 * 输入通知人员
	 */
	
	public void clickNotifications() {
		aannouncementp.click(aannouncementp.getNotificationsElement());
		
	}
	
	/*
	 * 点击提交按钮
	 */
	
	public void clicksubmit() {
		aannouncementp.click(aannouncementp.getsubmitElement());
	}
	
	
	/*
	 * 判断是否是新增通知公告页面
	 */
	
	public boolean assertAaaAnnouncementPage() {
		return aannouncementp.assertElementIs(aannouncementp.getTitleElement());
	}
	
	
}
