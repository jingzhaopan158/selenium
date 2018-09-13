package com.dangjian.selenium.business;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.handle.questionnaireHandle;

public class questionnairePro {

	public DriverBase driver;
	public questionnaireHandle questionnairehandle;
	public questionnairePro(DriverBase driver) {
		this.driver = driver;
		questionnairehandle = new questionnaireHandle(driver);
	}
	
	public void questionnaire(String title,String Introduction,String NameOfProblem,String OptionData) throws Exception {
		questionnairehandle.clickActivityManagement();
		questionnairehandle.clickVoteElection();
		questionnairehandle.clickNewAdd();
		questionnairehandle.sendKeysTitle(title);
		questionnairehandle.clickCoverPhoto();
		questionnairehandle.sendKeysbriefIntroduction(Introduction);
		questionnairehandle.clickEffectiveTime();
		questionnairehandle.sendKeysVotingOptions();
		questionnairehandle.sendKeysNameOfProblem(NameOfProblem);
		questionnairehandle.sendKeysOptionData(OptionData);
		questionnairehandle.clickTypeOfProblem();
		questionnairehandle.clicksubmit();
	}
		
}
