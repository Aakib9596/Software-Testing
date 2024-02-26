package gid.aakib;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import util.driverconnection;

public class screenshot {
	public static void getscreenshot (WebDriver driver , String path) throws IOException {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
        System.out.println("ss taken");		
		
		
	}
	
  public static void main(String[] args) throws IOException {
	  String url = "https://www.facebook.com";
	  WebDriver driver = driverconnection.getDriver(url);
	   getscreenshot(driver, "C:\\Users\\CONCEPT\\Desktop\\java\\selenium lecture");
}
}
