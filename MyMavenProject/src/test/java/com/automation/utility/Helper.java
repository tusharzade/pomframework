package com.automation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	public static void captureScreenShots(WebDriver driver) {

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("./Screenshots/"+ getCurrentDate() +".png"));
			System.out.println("SS taken");
		} catch (IOException e) {
			System.out.println(" unale to take screenshot");
		}
	}
	
	public static String getCurrentDate(){
		
		DateFormat format = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		
		return format.format(currentDate);		
	}

	public void handleFrames() {

	}

	public void handleAlerts() {

	}

	public void multipleWindows() {

	}

}
