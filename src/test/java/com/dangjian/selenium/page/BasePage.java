package com.dangjian.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.dangjian.selenium.base.DriverBase;

public class BasePage {
	public DriverBase driver;
	public BasePage(DriverBase driver){
		this.driver = driver;
	}
	
	/*
	 * ��λElement
	 * @param  By by
	 */

	public WebElement element(By by) {
		WebElement element = driver.findElement(by);
		return element;
	}
	
	/*
	 * �㼶��λ��ͨ�����ڵ㶨λ���ӽڵ�
	 * ��Ҫ���븸�ڵ���ӽڵ��by
	 */
	
	public WebElement nodeElement(By by,By nodeby) {
		WebElement el = this.element(by);
		return el.findElement(nodeby);
	}
	
	
	/*
	 * ��װ���
	 */
	public void click(WebElement element) {
		if(element !=null){
			element.click();
		}else{
			System.out.println("Ԫ��û�ж�λ�������ʧ��");
		}
	}
	
	
	
	/*
	 * ��װ����
	 */
	public void sendKeys(WebElement element,String value) {
		if(element !=null){
			element.sendKeys(value);
		}else{
			System.out.println(element+"Ԫ��û�ж�λ��������ʧ��"+value);
		}
	}
	
	
	/*
	 * �ж�Ԫ���Ƿ���ʾ
	 */
	public boolean assertElementIs(WebElement element) {
		return element.isDisplayed();
		
	}
	
	/*
	 * ��ȡ�ı���Ϣ
	 */
	public String getText(WebElement element) {
		return element.getText();
	}
	
	

}
