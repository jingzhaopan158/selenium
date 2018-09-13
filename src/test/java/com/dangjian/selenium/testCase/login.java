package com.dangjian.selenium.testCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.dangjian.selenium.base.DriverBase;
import com.dangjian.selenium.business.LoginPro;
import com.dangjian.selenium.business.addAnnouncementPro;
import com.dangjian.selenium.business.getIntoBackendPro;
import com.dangjian.selenium.business.organizationalActivityPro;
import com.dangjian.selenium.business.questionnairePro;
import com.dangjian.selenium.business.signOutPro;
import com.dangjian.selenium.business.voteElectionPro;


public class login extends CaseBase {

	public DriverBase driver;
	public LoginPro loginpro;
	public addAnnouncementPro announcementPro;
	public getIntoBackendPro gitbp;
	public voteElectionPro voteep;
	public signOutPro signoutpro;
	public questionnairePro questionnairepro;
	public organizationalActivityPro organizationalactivitypro; 
	
	static Logger logger = Logger.getLogger(login.class);
	public login(){
		this.driver = InitDriver("ChromeDriver");
		loginpro = new LoginPro(driver);
		announcementPro = new addAnnouncementPro(driver);
		gitbp = new getIntoBackendPro(driver);
		voteep = new voteElectionPro(driver);
		signoutpro = new signOutPro(driver);
		questionnairepro = new questionnairePro(driver);
		organizationalactivitypro = new organizationalActivityPro(driver);
	}
	
	@BeforeSuite
	public void getLoginHome(){
		driver.get("http://192.168.0.112/login.html");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@BeforeMethod
	public void testLogin() throws Exception{
		logger.debug("这是第一次使用Log4j打印日志~~~~~~~~~~~~~~~~~~~~");
		loginpro.login("admin", "111111");
		
	}
	
	/*@Test
	public void getIntoBackend() throws Exception {
		gitbp.getIntoAddAnnouncement();
	}
	
	//新增通知公告
	@Test
	public void addAnnouncement() throws Exception  {
		announcementPro.addAnnouncement("自动化新增通知公告", "自动化新增通知公告内容");
		Thread.sleep(3000);
	}
	
	//新增投票选举
	@Test
	public void addVoteElection() throws Exception {
		voteep.addVoteElection("自动化选择Java还是Python", "Java", "1");	
	}
	
	//新增调查问卷
	@Test
	public void questionnaire() throws Exception  {
		String title = "缔科网络科技关于体检的调查问卷";
		String Introduction = "关心员工身体健康";
		String NameOfProblem = "是否支持体检？";
		String OptionData= "支持体检，不支持";
		questionnairepro.questionnaire(title, Introduction, NameOfProblem, OptionData);
	}*/
	
	//新增组织活动
	@Test
	public void organizationalActivity() throws Exception  {
		String title = "缔科网络科技去秦岭山旅游";
		String Address = "翠华山国家地质公园";
		String BriefIntroduction = "休闲娱乐度假健康运动";
		String Introduction = "翠华山和终南山";
		organizationalactivitypro.organizationalActivity(title, Address, BriefIntroduction, Introduction);
	}	

	@AfterMethod
	public void signOut() throws Exception {
		Thread.sleep(2000);
		signoutpro.signOut();
		
	}
	
	@AfterSuite
	public void close() {
		driver.stop();
	}

}
