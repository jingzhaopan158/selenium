package com.dangjian.selenium.handle;



import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.page.getIntoBackendPage;

public class getIntoBackendHandle {
	
	public DriverBase driver;
	public getIntoBackendPage gibep;
	public getIntoBackendHandle(DriverBase driver) {
		
		this.driver = driver;
		gibep = new getIntoBackendPage(driver);
	}
	
	/*
	 * 点击管理进入后端
	 
	public void clickBackEnd() throws Exception {
		gibep.click(gibep.getBackendElement());
		Thread.sleep(2000);
	}*/
		
	
	/*
	 * 点击咨询管理
	 */
	public void clickInformationManagement() throws InterruptedException {
		gibep.click(gibep.getInformationManagementElement());
		Thread.sleep(2000);
	}
	
	/*
	 * 点击通知公告
	 */
	public void clickNoticeBulletin() throws InterruptedException {
		gibep.click(gibep.getNoticeBulletinElement());
		Thread.sleep(2000);
	}
	
	/*
	 * 点击活动管理
	 */
	public void clickActivityManagement() throws InterruptedException {
		gibep.click(gibep.getActivityManagementElement());
		Thread.sleep(2000);
	}
	
	
	/*
	 * 点击投票选举
	 */
	public void clickVoteElection() throws InterruptedException {
		gibep.click(gibep.getVoteElectionElement());
		Thread.sleep(2000);
	}
	
	
	/*
	 * 点击新增按钮
	 */
	public void clickNewAdd() throws InterruptedException {
		gibep.click(gibep.getNewAddElement());
		Thread.sleep(2000);
	}
}
