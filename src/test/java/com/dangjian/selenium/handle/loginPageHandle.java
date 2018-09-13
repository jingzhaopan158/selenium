package com.dangjian.selenium.handle;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.page.loginPage;


public class loginPageHandle {

	public DriverBase driver;
	public loginPage lp;
	public loginPageHandle(DriverBase driver) {
		this.driver = driver;
		lp = new loginPage(driver);
	}
	
	/*
	 * �����û���
	 */
	public void sendKeysUser(String username){
		lp.sendKeys(lp.getUserElement(),username);
	}
	

	/*
	 * ��������
	 */
	public void sendKeysPassword(String password){
		lp.sendKeys(lp.getPasswordElement(),password);
	}
	
	/*
	 * �����¼
	 */
	public void clickLoginButton() throws Exception{
		lp.click(lp.getLoginButtonElement());
		Thread.sleep(3000);
	}
	
	/*
	 * 点击管理进入后端
	 */
	public void clickBackEnd() throws Exception {
		lp.click(lp.getBackendElement());
		Thread.sleep(3000);
	}
	
	/*
	 * �ж��Ƿ��ǵ�¼ҳ��
	 */
	public boolean assertLoginPage(){
		return lp.assertElementIs(lp.getUserElement());
	}
	
}
