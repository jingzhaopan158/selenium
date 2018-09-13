package com.dangjian.selenium.business;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.handle.signOutHandle;

public class signOutPro {
	public DriverBase driver;
	public signOutHandle signouthandle;
	public signOutPro(DriverBase driver) {
		this.driver = driver;
		signouthandle = new signOutHandle(driver);
	}
	
	public void signOut() throws Exception {
		signouthandle.clickAdmin();
		signouthandle.clickSginOut();
	}

}
