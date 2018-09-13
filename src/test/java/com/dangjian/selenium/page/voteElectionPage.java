package com.dangjian.selenium.page;

import org.openqa.selenium.WebElement;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.util.getByLocator;

public class voteElectionPage extends BasePage {

	public voteElectionPage(DriverBase driver) {
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
	 * 获取投票有效时间element
	 */
	public WebElement getEffectiveTimeElement() {
		return element(getByLocator.getLocator("EffectiveTime"));
	}
	
	/*
	 * 获取添加新问题element
	 */
	public WebElement getAddProblemElement() {
		return element(getByLocator.getLocator("AddProblem"));
	}
	
	/*
	 * 获取投票内容1 element
	 */
	public WebElement getVotingContentElement() {
		return element(getByLocator.getLocator("VotingContent"));
	}
	
	
	/*
	 * 获取排序1 element
	 */
	public WebElement getVotingSortingElement() {
		return element(getByLocator.getLocator("VotingSorting"));
	}
	
	/*
	 * 获取提交按钮
	 */
	public WebElement getsubmitElement() {
		return element(getByLocator.getLocator("submit"));
	}
}
