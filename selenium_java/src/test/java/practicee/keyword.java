package practicee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.driverconnection;

public class keyword {
	public static void main(String[] args) {
		  String url ="https://www.google.com/";
		  WebDriver driver =  driverconnection.getDriver(url);
		 
		 WebElement serch = driver.findElement(By.id("APjFqb"))	;
		 
		  
		 Actions action = new Actions(driver);
		 action.click(serch)
		        .sendKeys("face book ")	
		        .pause(Duration.ofSeconds(4))
		        .keyDown(Keys.ARROW_DOWN)
		        .keyDown(Keys.ARROW_DOWN)
		        .keyDown(Keys.ARROW_DOWN)

		        .keyDown(Keys.ENTER)
		        .build()
		        .perform();
		        
}
}