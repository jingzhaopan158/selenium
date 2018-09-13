package com.dangjian.selenium.handle;

import org.openqa.selenium.WebElement;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.page.getIntoBackendPage;
import com.dangjian.selenium.page.organazationalActivityPage;


public class organizationalActivityHandle {

	public DriverBase driver;
	public getIntoBackendPage getintobackendpage;
	public organazationalActivityPage activitypage;
	
	public organizationalActivityHandle(DriverBase driver) {
		this.driver = driver;
		getintobackendpage = new  getIntoBackendPage(driver);
		activitypage = new organazationalActivityPage(driver);
	}
	
	/*
	 * 点击活动管理
	 */
	
	public void clickActivityManagement() throws Exception  {
		getintobackendpage.click(getintobackendpage.getActivityManagementElement());
		Thread.sleep(2000);
	}
	
	
	/*
	 * 点击组织活动
	 */
	
	public void clickOrganizationalActivity() throws Exception {
		getintobackendpage.click(getintobackendpage.getOrganizationalActivityElement());
		Thread.sleep(2000);
	}
	
	/*
	 * 点击新增
	 */
	public void clickNewAdd() throws Exception {
		getintobackendpage.click(getintobackendpage.getNewAddElement());
		Thread.sleep(2000);
	}
	
	
	/*
	 * 输入标题
	 */
	public void sendKeysTitle(String title) {
		activitypage.sendKeys(activitypage.getTitleElement(),title);
	}
	/*
	 * 输入活动宣传图片
	 */
	public void clickCoverPhoto() throws Exception  {
		activitypage.click(activitypage.getCoverPhotoElement());
		Runtime.getRuntime().exec("D:\\AutoIt3\\shchtp\\shchtupian01.exe");
		Thread.sleep(2000);
	}
	/*
	 * 输入活动分类
	 */
	public void sendKeysActivityClassification() {
		activitypage.click(activitypage.getActivityClassificationElement());
		driver.xiayi();
	}
	/*
	 * 输入报名起止时间
	 */
	public void clicksignUpTime() {
		WebElement signUpTime =activitypage.getsignUpTimeElement();
		signUpTime.sendKeys("2018-09-12 12:00:00 - 2018-09-13 18:00:00");
	}
	
	/*
	 * 输入活动起止时间
	 */
	public void clickactivityTime() {
		WebElement activityTime =activitypage.getactivityTimeElement();
		activityTime.sendKeys("2018-09-14 14:00:00 - 2018-09-14 16:00:00");
		driver.zuidi();
	}
	
	
	/*
	 * 点击是否评论
	 */
	public void clickAllowComments() {
		activitypage.click(activitypage.getAllowCommentsElement());
	}
	
	/*
	 * 输入活动地址
	 */
	public void sendKeysactivityAddress(String Address) {
		activitypage.sendKeys(activitypage.getactivityAddressElement(),Address);
	}
	
	/*
	 * 输入活动简介
	 */
	public void sendKeysactivityBriefIntroduction(String BriefIntroduction) {
		activitypage.sendKeys(activitypage.getactivityBriefIntroductionElement(), BriefIntroduction);
	}
	
	/*
	 * 输入活动内容
	 */
	public void sendKeysactivityIntroduction(String Introduction) {
		activitypage.sendKeys(activitypage.getactivityIntroductionElement(), Introduction);
	}
	
	
	/*
	 * 点击提交按钮
	 */
	
	public void clicksubmit() {
		activitypage.click(activitypage.getsubmitElement());
	}
}
