package com.dangjian.selenium.util;

import org.openqa.selenium.By;

import com.dangjian.selenium.util.ProUtil;

public class getByLocator {
	public static By getLocator(String key){
		ProUtil pro = new ProUtil("C:\\Users\\Administrator\\eclipse-workspace\\selenium\\lib\\1elementproperties_dj.txt");
		String locator = pro.getPro(key);
		String locatorType = locator.split(">")[0];
		String locatorValue = locator.split(">")[1];
		
		if(locatorType.equals("id")){
			return By.id(locatorValue);
		}else if(locatorType.equals("name")){
			return By.name(locatorValue);
		}else if(locatorType.equals("className")){
			return By.className(locatorValue);
		}else if(locatorType.equals("linkText")){
			return By.linkText(locatorValue);
		}else{
			return By.xpath(locatorValue);
		}
	}

}
