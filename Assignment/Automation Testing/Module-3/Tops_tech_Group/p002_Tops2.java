package Tops_tech_Group;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class p002_Tops2 {
	WebDriver driver;
	@Test(groups = "sandhi")
	  public void Education_detail  () {
		   WebElement Dropd1 = driver.findElement(By.xpath("//body/div[@id='main-header']/div[1]/div[1]/div[2]/div[1]/a[1]/span[2]/i[1]"));
		      
	       Actions acti = new Actions(driver);
	       acti.click(Dropd1)
	             .pause(Duration.ofSeconds(3))
	             .keyDown(Keys.ARROW_DOWN)
	             .keyUp(Keys.ARROW_DOWN)
	             .keyDown(Keys.ARROW_DOWN)
	             .keyUp(Keys.ARROW_DOWN)
	             .keyDown(Keys.ENTER)
	             .build()
	             .perform();
	  
	  
	  
	  }
}