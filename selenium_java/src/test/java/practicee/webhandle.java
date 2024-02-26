package practicee;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.driverconnection;

public class webhandle {
   public static void main(String[] args) throws InterruptedException {
	     String url = "https://demo.guru99.com/popup.php";
	     WebDriver driver = driverconnection.getDriver(url);
	      
	    WebElement click = driver.findElement(By.linkText("Click Here"));
	    click.click();
	     String mainw = driver.getWindowHandle();
	     System.out.println(mainw);
	     
	       Set<String> allw = driver.getWindowHandles();
	    for (String win :allw) {
	    	if (!win.equals(mainw)) {
	    		driver.switchTo().window(win);
	    	}
	    }
	    driver.findElement(By.name("emailid")).sendKeys("sandhiaakib5@gmail.com");
	    driver.findElement(By.name("btnLogin")).click();
	    Thread.sleep(2000);
	    driver.close();
	    driver.switchTo().window(mainw);
	    driver.close();
	    
	    
	    
}
}
