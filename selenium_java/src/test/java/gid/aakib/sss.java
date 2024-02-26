package gid.aakib;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import util.driverconnection;

public class sss {
	public static void main(String[] args) {
		
	

	
		String url = "https://careercenter.tops-int.com";
		WebDriver driver = driverconnection.getDriver(url);
		try { 
			File  screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("C:\\Users\\CONCEPT\\Pictures\\Camera Roll\\aakib.png"));
			
		} catch (Exception e) {
			
			// TODO: handle exception
		}
    
	}
}