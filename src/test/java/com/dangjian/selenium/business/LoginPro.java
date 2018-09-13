package com.dangjian.selenium.business;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.handle.loginPageHandle;

public class LoginPro {
	
	public loginPageHandle lph;
    public 	LoginPro(DriverBase driver){
    	lph = new loginPageHandle(driver);
    }
    
    public void login(String username,String password) throws Exception{
    	if(lph.assertLoginPage()){
    		lph.sendKeysUser(username);
        	lph.sendKeysPassword(password);
        	lph.clickLoginButton();
        	lph.clickBackEnd();
    	}else{
    		System.out.println("ҳ�治���ڻ���״̬����ȷ");
    	}
    	
    }

}
