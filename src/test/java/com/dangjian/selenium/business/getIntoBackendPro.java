package com.dangjian.selenium.business;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.handle.getIntoBackendHandle;

public class getIntoBackendPro {

	public DriverBase driver;
	public getIntoBackendHandle gibh;
	public getIntoBackendPro(DriverBase driver) {
		this.driver = driver;
		gibh = new getIntoBackendHandle(driver);
	}
	
	public void getIntoAddAnnouncement() throws Exception {
		
		gibh.clickInformationManagement();
		gibh.clickNoticeBulletin();
		gibh.clickNewAdd();
		Thread.sleep(3000);
	}
}
