package com.dangjian.selenium.handle;


import org.openqa.selenium.WebElement;


import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.page.getIntoBackendPage;
import com.dangjian.selenium.page.questionnairePage;



public class questionnaireHandle {
	public DriverBase driver;
	public getIntoBackendPage getintobackendpage;
	public questionnairePage questionnairepage;

	public questionnaireHandle(DriverBase driver) {
		this.driver = driver;
		getintobackendpage = new  getIntoBackendPage(driver);
		questionnairepage = new questionnairePage(driver);
	}
	
	/*
	 * 点击活动管理
	 */
	
	public void clickActivityManagement() throws Exception  {
		getintobackendpage.click(getintobackendpage.getActivityManagementElement());
		Thread.sleep(2000);
	}
	
	
	/*
	 * 点击调查问卷
	 */
	public void clickVoteElection() throws Exception  {
		getintobackendpage.click(getintobackendpage.getQuestionnaireElement());
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
		questionnairepage.sendKeys(questionnairepage.getTitleElement(),title);
	}
	
	
	/*
	 * 点击上传图片
	 */
	public void clickCoverPhoto() throws Exception  {
		questionnairepage.click(questionnairepage.getCoverPhotoElement());
		Runtime.getRuntime().exec("D:\\AutoIt3\\shchtp\\shchtupian01.exe");
		Thread.sleep(2000);
	}
	
	/*
	 * 输入简介
	 */
	public void sendKeysbriefIntroduction(String Introduction) {
		questionnairepage.sendKeys(questionnairepage.getbriefIntroductionElement(),Introduction);
		driver.zuidi();
	}
	
	
	/*
	 * 填写有效时间
	 */
	public void clickEffectiveTime() throws Exception {
		WebElement data_input = questionnairepage.getTermofvalidityElement();
		data_input.sendKeys("2018-09-11 - 2018-09-12");
		questionnairepage.click(questionnairepage.getbriefIntroductionElement());
		Thread.sleep(2000);
	}
	
	/*
	 * 添加新问题
	 */
	public void sendKeysVotingOptions() throws Exception {
		questionnairepage.click(questionnairepage.getAddProblemElement());
		Thread.sleep(1000);
	}
	
	/*
	 * 填写问题名称
	 */
	public void sendKeysNameOfProblem(String NameOfProblem) throws Exception {
		questionnairepage.sendKeys(questionnairepage.getNameOfProblemElement(), NameOfProblem);
		Thread.sleep(1000);
	}
	
	/*
	 * 填写选项数据
	 */
	public void sendKeysOptionData(String OptionData) throws Exception  {
		questionnairepage.sendKeys(questionnairepage.getOptionDataElement(), OptionData);
		Thread.sleep(1000);
	}
	
	/*
	 * 填写问题类型
	 */
	public void clickTypeOfProblem() throws Exception  {
		questionnairepage.click(questionnairepage.getTypeOfProblemElement());
		Thread.sleep(1000);
		driver.xiayi();        
	}
	
	
	/*
	 * 点击提交按钮
	 */
	
	public void clicksubmit() throws Exception {
		questionnairepage.click(questionnairepage.getsubmitElement());
		Thread.sleep(3000);
	}
	
	
	
}
