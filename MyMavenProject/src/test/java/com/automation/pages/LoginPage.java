package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(name="username") WebElement uname;
	
	@FindBy(name="password") WebElement pass;
	
	@FindBy(name="FormsButton2") WebElement loginButton;
	
	@FindBy(xpath="//a[@href='login.php']") WebElement loginlink;
	
	@FindBy(xpath="//center/b[contains(text(),'Successful Login')]") WebElement loginSuccess;
	
	
	
	
	public Boolean loginToApplication(String username,String password){
		
		loginlink.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginButton.click();
		
		return loginSuccess.isDisplayed();
		
		
	}
}
