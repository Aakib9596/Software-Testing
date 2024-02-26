package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class diverconnection {
	   public static WebDriver getDriver (String url )   {
		   System.setProperty("WebDriver.chrome.driver ", "C:\\Users\\CONCEPT\\Desktop\\java\\driver\\chromedriver-win64\\chromedriver.exe");	   
			WebDriver driver = new ChromeDriver ();   
			driver.manage().window().maximize();
			driver.get (url );
			return driver ;
			
			
		   }
		   
		  
		}


