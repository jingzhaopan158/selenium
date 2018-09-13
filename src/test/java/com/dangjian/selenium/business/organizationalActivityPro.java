package com.dangjian.selenium.business;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.handle.organizationalActivityHandle;

public class organizationalActivityPro {

	public DriverBase driver;
	public organizationalActivityHandle activityhandle;
	
	public organizationalActivityPro(DriverBase driver) {
		this.driver = driver;
		activityhandle = new organizationalActivityHandle(driver);
	}
	
	public void organizationalActivity(String title,String Address,String BriefIntroduction,String Introduction ) throws Exception {
		activityhandle.clickActivityManagement();
		activityhandle.clickOrganizationalActivity();
		activityhandle.clickNewAdd();
		Thread.sleep(2000);
		activityhandle.sendKeysTitle(title);
		activityhandle.clickCoverPhoto();
		activityhandle.sendKeysActivityClassification();
		activityhandle.clicksignUpTime();
		activityhandle.clickactivityTime();
		activityhandle.clickAllowComments();
		activityhandle.sendKeysactivityAddress(Address);
		activityhandle.sendKeysactivityBriefIntroduction(BriefIntroduction);
		activityhandle.sendKeysactivityIntroduction(Introduction);
		Thread.sleep(2000);
		activityhandle.clicksubmit();
	}
}

