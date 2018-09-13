package com.dangjian.selenium.page;

import org.openqa.selenium.WebElement;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.util.getByLocator;

public class organazationalActivityPage extends BasePage {

	public organazationalActivityPage(DriverBase driver) {
		super(driver);
		
	}
	
	/*
	 * 获取投票标题element
	 */
	public WebElement getTitleElement() {
		return element(getByLocator.getLocator("title"));
	}
	
	/*
	 * 获取封面图片element
	 */
	
	public WebElement getCoverPhotoElement() {
		return element(getByLocator.getLocator("CoverPhoto"));
	}
	
	/*
	 * 获取活动分类element
	 */
	public WebElement getActivityClassificationElement() {
		return element(getByLocator.getLocator("ActivityClassification"));
	}
	
	/*
	 * 获取报名起止时间element
	 */
	public WebElement getsignUpTimeElement() {
		return element(getByLocator.getLocator("signUpTime"));
	}
	
	/*
	 * 获取活动起止时间element
	 */
	public WebElement getactivityTimeElement() {
		return element(getByLocator.getLocator("activityTime"));
	}
	
	
	/*
	 * 获取活动地址element
	 */
	public WebElement getactivityAddressElement() {
		return element(getByLocator.getLocator("activityAddress"));
	}
	
	/*
	 * 获取活动简介element
	 */
	public WebElement getactivityBriefIntroductionElement() {
		return element(getByLocator.getLocator("activityBriefIntroduction"));
	}
	/*
	 * 获取活动内容element
	 */
	public WebElement getactivityIntroductionElement() {
		return element(getByLocator.getLocator("activityIntroduction"));
	}
	/*
	 * 获取活动是否评论element
	 */
	public WebElement getAllowCommentsElement() {
		return element(getByLocator.getLocator("AllowComments"));
	}
	/*
	 * 获取提交按钮
	 */
	public WebElement getsubmitElement() {
		return element(getByLocator.getLocator("submit"));
	}
}
