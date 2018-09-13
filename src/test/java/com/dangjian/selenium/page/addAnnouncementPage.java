package com.dangjian.selenium.page;

import org.openqa.selenium.WebElement;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.util.getByLocator;

public class addAnnouncementPage extends BasePage {

	public addAnnouncementPage(DriverBase driver) {
		super(driver);
		
	}
	
	/*
	 * 获取标题element
	 */
	public WebElement getTitleElement() {
		return element(getByLocator.getLocator("title"));
	}
	
	
	/*
	 * 切换到输入内容框页面element
	 */
	public WebElement getIntoContentElement() {
		return element(getByLocator.getLocator("getinto"));
		
	}
	
	/*
	 * 获取内容element
	 */
	public WebElement getContentElement() {
		return element(getByLocator.getLocator("content"));
	}
	
	/*
	 * 获取通知人员
	 */
	public WebElement getNotificationsElement() {
		return element(getByLocator.getLocator("notifications"));
	}
	
	
	/*
	 * 获取提交按钮
	 */
	public WebElement getsubmitElement() {
		return element(getByLocator.getLocator("submit"));
	}
	

}
