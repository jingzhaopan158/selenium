package com.dangjian.selenium.handle;



import org.openqa.selenium.WebElement;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.page.getIntoBackendPage;
import com.dangjian.selenium.page.voteElectionPage;

public class voteElectionHandle {

	public DriverBase driver;
	public voteElectionPage voteelection;
	public getIntoBackendPage getintobackendpage;
	public voteElectionHandle(DriverBase driver) {
		this.driver = driver;
		getintobackendpage = new  getIntoBackendPage(driver);
		voteelection = new voteElectionPage(driver);
	}
	
	

	/*
	 * 点击活动管理
	 */
	
	public void clickActivityManagement()  {
		getintobackendpage.click(getintobackendpage.getActivityManagementElement());
		
	}
	
	/*
	 * 点击投票选举
	 */
	public void clickVoteElection()  {
		getintobackendpage.click(getintobackendpage.getVoteElectionElement());
		
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
		voteelection.sendKeys(voteelection.getTitleElement(),title);
	}
	
	
	/*
	 * 点击上传图片
	 */
	public void clickCoverPhoto() throws Exception  {
		voteelection.click(voteelection.getCoverPhotoElement());
		Runtime.getRuntime().exec("D:\\AutoIt3\\shchtp\\shchtupian01.exe");
		Thread.sleep(2000);
	}
	
	/*
	 * 填写有效时间
	 */
	public void clickEffectiveTime() {
		WebElement data_input = voteelection.getEffectiveTimeElement();
		data_input.sendKeys("2018-09-11 - 2018-09-12");
	}
	
	/*
	 * 添加新问题
	 */
	public void sendKeysVotingOptions() {
		voteelection.click(voteelection.getAddProblemElement());
		
	}
	
	/*
	 * 填写投票内容
	 */
	public void sendKeysVotingContent(String content) {
		voteelection.sendKeys(voteelection.getVotingContentElement(), content);
	}
	
	/*
	 * 填写投票排序
	 */
	public void sendKeysVotingSorting(String sorting) throws Exception {
		voteelection.sendKeys(voteelection.getVotingSortingElement(), sorting);
		Thread.sleep(2000);
	}
	
	/*
	 * 点击提交按钮
	 */
	
	public void clicksubmit() {
		voteelection.click(voteelection.getsubmitElement());
	}



	
	
}
