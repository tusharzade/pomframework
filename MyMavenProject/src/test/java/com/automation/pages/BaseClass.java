package com.automation.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utility.BrowserFactory;
import com.automation.utility.ConfigDataProvider;
import com.automation.utility.ExcelDataProvider;
import com.automation.utility.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpSuite(){
		
		excel= new ExcelDataProvider();
		config=new ConfigDataProvider();
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/loginfree.html"));
		report = new ExtentReports();
		report.attachReporter(extent);
	}

	@BeforeClass
	public void setup() {
		System.out.println(config.getDataFromConfig("appURL"));
		driver = BrowserFactory.startApplication(driver, config.getDataFromConfig("Browser"),config.getDataFromConfig("appURL"));
	}

	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void teardownmethod(ITestResult result){
		
		if (result.getStatus()==ITestResult.FAILURE) {
			Helper.captureScreenShots(driver);
		}
		report.flush();
		
	}

}
