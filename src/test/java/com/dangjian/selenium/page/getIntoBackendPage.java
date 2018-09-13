package com.dangjian.selenium.page;

import org.openqa.selenium.WebElement;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.util.getByLocator;

public class getIntoBackendPage extends BasePage {

	
	public getIntoBackendPage(DriverBase driver) {
		super(driver);
		
	}
	
	

	
	
	/*
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~获取咨询管理element~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 */
	
	public WebElement getInformationManagementElement() {
		return element(getByLocator.getLocator("InformationManagement"));
	}
	
	
	/*
	 * 获取通知公告element
	 */
	public WebElement getNoticeBulletinElement() {
		return element(getByLocator.getLocator("InformationManagement"));
	}
	
	/*
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~活动管理element~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 */
	
	public WebElement getActivityManagementElement() {
		return element(getByLocator.getLocator("ActivityManagement"));
	}
	
	/*
	 * 获取投票选举element
	 */
	public WebElement getVoteElectionElement() {
		return element(getByLocator.getLocator("VoteElection"));
	}
	
	/*
	 * 获取调查问卷element
	 */
	public WebElement getQuestionnaireElement() {
		return element(getByLocator.getLocator("Questionnaire"));
	}
	
	/*
	 * 获取组织活动element
	 */
	public WebElement getOrganizationalActivityElement() {
		return element(getByLocator.getLocator("OrganizationalActivity"));
	}
	
	
	/*
	 * 获取新增按钮element
	 */
	
	public WebElement getNewAddElement() {
		return element(getByLocator.getLocator("NewAdd"));
	}
}
