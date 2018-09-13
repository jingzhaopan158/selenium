package com.dangjian.selenium.business;



import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.handle.addAnnouncementHandle;

public class addAnnouncementPro {
	
	public DriverBase driver;
	public addAnnouncementHandle aannouncementh;
	public addAnnouncementPro(DriverBase driver) {
		this.driver = driver;
		aannouncementh = new addAnnouncementHandle(driver);
	}
	
	

	public void addAnnouncement(String title,String content  ) throws Exception {
		 if(aannouncementh.assertAaaAnnouncementPage()){
			aannouncementh.sendKeysTitle(title);
			aannouncementh.sendKeysContent(content);
			aannouncementh.clicksubmit(); 
			driver.zuiding();
		 }else{
	    		System.out.println("新增公告失败");
	    	}
	 }

}
