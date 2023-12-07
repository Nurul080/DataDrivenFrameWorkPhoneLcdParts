package com.phonelcdparts.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	WebDriver driver;
	
	
	
	public void takeScreenShot(String screenShortName) {
		TakesScreenshot screenShot=((TakesScreenshot)driver);
		File SrcFile = screenShot.getScreenshotAs(OutputType.FILE);
		long time = System.currentTimeMillis();
		String fileWithPath ="ScreenShot/"+time+screenShortName+".png";
		File DestFile = new File(fileWithPath);
				
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}

