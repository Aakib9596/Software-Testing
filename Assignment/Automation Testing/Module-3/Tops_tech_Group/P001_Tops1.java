package Tops_tech_Group;

	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basic.driverconnection;

	public class P001_Tops1 {
		WebDriver driver ;
		@Test(priority = 1,groups = "sandhi")
	    public void browser () {
	    	String url  ="https://careercenter.tops-int.com";
	        driver = driverconnection.getDriver(url);
	    	
	    }
		@Test(dependsOnMethods = "browser",groups = "sandhi")
	    public void login () {
	    	WebElement username = driver.findElement(By.id("mobile"));
	    	username.sendKeys("9265457854");
	    	WebElement pass = driver.findElement(By.id("password"));
	    	pass.sendKeys("9265457854");
	    	driver.findElement(By.xpath("//form[@id='loginForm']/div[3]/input")).click();
	    	
	    }
	    @Test(dependsOnMethods = "login")
	    public void DropDown () {
	       WebElement Dropd = driver.findElement(By.xpath("//body/div[@id='main-header']/div[1]/div[1]/div[2]/div[1]/a[1]/span[2]/i[1]"));
	      
	       Actions action = new Actions(driver);
	       action.click(Dropd)
	             .keyDown(Keys.ARROW_DOWN)
	             .keyDown(Keys.ENTER)
	             .build()
	             .perform();
	     }
	        
	    
	    
	}	    
	    
	    
	    
	    
	


