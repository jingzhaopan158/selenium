package com.dangjian.selenium.business;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.handle.voteElectionHandle;

public class voteElectionPro {

	public DriverBase driver;
	public voteElectionHandle voteelectionhandle;
	
	public voteElectionPro(DriverBase driver) {
		this.driver = driver;
		voteelectionhandle = new voteElectionHandle(driver);
	}
	
	public void addVoteElection(String title,String content,String sorting) throws Exception {
		voteelectionhandle.clickActivityManagement();
		Thread.sleep(3000);
		voteelectionhandle.clickVoteElection();
		Thread.sleep(3000);
		voteelectionhandle.clickNewAdd();
		Thread.sleep(3000);
		
		
		voteelectionhandle.sendKeysTitle(title);
		voteelectionhandle.clickCoverPhoto();
		voteelectionhandle.clickEffectiveTime();
		voteelectionhandle.sendKeysVotingOptions();
		voteelectionhandle.sendKeysVotingContent(content);
		voteelectionhandle.sendKeysVotingSorting(sorting);
		voteelectionhandle.clicksubmit();
	}
}
