package com.dangjian.selenium.testCase;

import com.dangjian.selenium.base.DriverBase;

public class CaseBase {
	public DriverBase InitDriver(String browser){
		return new DriverBase(browser);
	}

}
