package com.dangjian.selenium.page;

import org.openqa.selenium.WebElement;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.util.getByLocator;

public class questionnairePage extends BasePage {
	

	public questionnairePage(DriverBase driver) {
		super(driver);
		
	}
	
	
	/*
	 * 获取标题element
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
	 * 获取简介element
	 */
	
	public WebElement getbriefIntroductionElement() {
		return element(getByLocator.getLocator("briefIntroduction"));
	}
	
	/*
	 * 获取投票有效期element
	 */
	public WebElement getTermofvalidityElement() {
		return element(getByLocator.getLocator("Termofvalidity"));
	}
	
	
	/*
	 * 获取添加新问题element
	 */
	public WebElement getAddProblemElement() {
		return element(getByLocator.getLocator("AddProblem"));
	}
	
	/*
	 * 获取问题名称1 element
	 */
	public WebElement getNameOfProblemElement() {
		return element(getByLocator.getLocator("NameOfProblem"));
	}
	
	
	/*
	 * 获取选项数据3 element
	 */
	public WebElement getOptionDataElement() {
		return element(getByLocator.getLocator("OptionData"));
	}
	
	/*
	 * 获取选项数据2 element
	 */
	public WebElement getTypeOfProblemElement() {
		return element(getByLocator.getLocator("TypeOfProblem"));
	}
	
	
	/*
	 * 获取提交按钮
	 */
	public WebElement getsubmitElement() {
		return element(getByLocator.getLocator("submit"));
	}
	
	
}
