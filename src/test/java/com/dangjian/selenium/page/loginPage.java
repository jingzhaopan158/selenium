package com.dangjian.selenium.page;

import org.openqa.selenium.WebElement;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.util.getByLocator;


public class loginPage extends BasePage {
	public loginPage(DriverBase driver) {
		super(driver);
	}
	
	
	/*
	 * ��ȡ�û��������
	 */
	public WebElement getUserElement(){
		return element(getByLocator.getLocator("username"));
	}


	/*
	 * ��ȡ���������Element
	 */
	public WebElement getPasswordElement(){
		return element(getByLocator.getLocator("userpass"));
	}
	/*
	 * ��ȡ��¼��ťElement
	 */
	public WebElement getLoginButtonElement(){
		return element(getByLocator.getLocator("button"));
	}
	
	
	/*
	 * 获取管理按钮element
	 */
	public WebElement getBackendElement() {
		return element(getByLocator.getLocator("backend"));
	}
	
	
	/*
	 * 获取用户管理按钮element
	 */
	
	public WebElement getAdminElement() {
		return element(getByLocator.getLocator("admin"));
	}
	
	/*
	 * 获取退出按钮element
	 */
	public WebElement getSignOutElement() {
		return element(getByLocator.getLocator("signout"));
	}
	
}
