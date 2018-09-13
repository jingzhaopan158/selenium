package com.jingzhaopan.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class test001 {

	private ChromeDriver driver;
	public static void main(String[] args) throws Exception {
		test001 cd = new test001();
		try {
			cd.init();
			cd.doLogin();
			cd.getIntoAnnouncement();
		    cd.addVoteElection();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://192.168.0.112/login.html ");
		Thread.sleep(3000);
		
	}
	
	public void doLogin() throws InterruptedException {
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("passWord")).clear();
		driver.findElement(By.name("passWord")).sendKeys("111111");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
	}
	
	public void getIntoAnnouncement() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='管理']")).click();
		driver.findElement(By.xpath("//ul[@class='layui-nav']/li[5]/a")).click();
		/*Thread.sleep(5000);
		Actions action = new Actions(driver);
		WebElement signout = driver.findElement(By.xpath("//a[@class='user']/span"));
		action.moveToElement(signout).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='fr li_person layui-nav-item']/dl/dd/a")).click();*/
	}
	

	public void addVoteElection() throws Exception {
		driver.findElement(By.xpath("//a[text()='组织活动']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='新增']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("title")).sendKeys("缔科网络科技去秦岭山旅游");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Runtime.getRuntime().exec("D:\\AutoIt3\\shchtp\\shchtupian01.exe");
		Thread.sleep(2000);
		
		//活动分类
		driver.findElement(By.xpath("//input[@class='layui-input layui-unselect']")).click();
		Actions action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).perform();   
        action.sendKeys(Keys.ENTER).perform();   
		
		//报名起止时间
        WebElement signUpTime = driver.findElement(By.xpath("//input[@class='layui-input time signUpTime']"));
        signUpTime.sendKeys("2018-09-12 12:00:00 - 2018-09-13 18:00:00");
		//活动起止时间
        WebElement activityTime = driver.findElement(By.xpath("//input[@class='layui-input time activityTime']"));
        activityTime.sendKeys("2018-09-14 14:00:00 - 2018-09-14 16:00:00");
       // driver.findElement(By.name("title")).click();
        Thread.sleep(2000);
		//活动地方
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
        driver.findElement(By.xpath("//div[text()='是']")).click();
      
        driver.findElement(By.name("activityAddress")).sendKeys("翠华山国家地质公园");
        
         //活动简介
         driver.findElement(By.name("activityBriefIntroduction")).sendKeys("休闲娱乐度假健康运动");
         //活动内容
         driver.findElement(By.name("activityIntroduction")).sendKeys("翠华山和终南山");
        // driver.findElement(By.xpath("//button[@class='layui-btn submit_btn']")).click();
        
        
        
        
		
		 
		
		/*driver.findElement(By.xpath("//div[@class='layui-form']/div[5]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table/tbody/tr[6]/td[4]")).click();
		driver.findElement(By.xpath("//table/tbody/tr[6]/td[5]")).click();
		driver.findElement(By.xpath("//div[@class='laydate-footer-btns']/span[2]")).click();*/
		/*driver.findElement(By.xpath("//div[@class='layui-form']/div[5]/div")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementByXpath('//div[@class='layui-form']/div[5]/div').readOnly=false;");
		driver.findElement(By.xpath("//div[@class='layui-form']/div[5]/div")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='layui-form']/div[5]/div")).sendKeys("2018-09-10 - 2018-09-11");
		WebElement data_input = driver.findElement(By.xpath("//input[@class='layui-input time termOfValidity']"));
		data_input.sendKeys("2018-09-10 - 2018-09-11");
		driver.findElement(By.name("briefIntroduction")).click();
		
		driver.findElement(By.xpath("//table[@class='layui-table']/tbody/tr[1]/td/a")).click();
		                            
		driver.findElement(By.xpath("//tbody[@class='questionList']/tr[1]/td[1]/input")).sendKeys("Java");
		
		driver.findElement(By.xpath("//tbody[@class='questionList']/tr[1]/td[3]/input")).sendKeys("1");
		driver.findElement(By.xpath("//tbody[@class='questionList']/tr[1]/td[2]/div")).click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).perform();   
        action.sendKeys(Keys.ENTER).perform();  */            

		
		
	}
	
	

}
