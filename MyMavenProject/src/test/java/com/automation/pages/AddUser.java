package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUser {

	WebDriver driver;

	public AddUser(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(name="username") WebElement adduname;
	
	@FindBy(name="password") WebElement addpass;
	
	@FindBy(name="FormsButton2") WebElement save;
	
	@FindBy(xpath="//a[@href='addauser.php']") WebElement adduserlink;
	
	
	
	
	public void createUserDemo(String username,String password){
		
		adduserlink.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		adduname.sendKeys(username);
		addpass.sendKeys(password);
		save.click();
		
		//loginSuccess.isDisplayed();
		
		
	}
}
