package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.automation.pages.AddUser;
import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;


public class LoginTestCRM extends BaseClass {
	
	
	

	@Test(priority=2)
	public void loginApplication() {
		
		
		logger=report.createTest("login");

		// System.out.println(driver.getTitle());

		LoginPage loginpgObj = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("open browser");

		Boolean check = loginpgObj.loginToApplication(excel.getStringData(0, 0, 0), excel.getStringData(0, 0, 0));
		
		if (check) {
			
			logger.pass("login successful");
			
		}
		else {
			logger.fail("login failed");
		}
	}
	
	@Test(priority=1)
	public void addingUser() {
		
		logger=report.createTest("addUser");

		
		// System.out.println(driver.getTitle());

		AddUser adduser = PageFactory.initElements(driver, AddUser.class);
		logger.info("open browser");

		adduser.createUserDemo(excel.getStringData(0, 0, 0), excel.getStringData(0, 0, 0));
		
		logger.pass("add user successful");
		
		//Helper.captureScreenShots(driver);
	}

}
