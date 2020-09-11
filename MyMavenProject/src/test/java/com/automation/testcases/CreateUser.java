package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.AddUser;
import com.automation.pages.BaseClass;
import com.automation.utility.Helper;


public class CreateUser extends BaseClass {

	@Test
	public void addingUser() {

		
		// System.out.println(driver.getTitle());

		AddUser adduser = PageFactory.initElements(driver, AddUser.class);

		adduser.createUserDemo(excel.getStringData(0, 0, 0), excel.getStringData(0, 0, 0));
		
		//Helper.captureScreenShots(driver);
	}

}
