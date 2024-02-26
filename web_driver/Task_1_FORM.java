package web_driver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.driverconnection;

public class Task_1_FORM {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   String url = "https://demoqa.com/automation-practice-form";
		   WebDriver driver = driverconnection.getDriver(url);  
		   
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   WebElement address= driver.findElement(By.id("currentAddress"));
		   js.executeScript("arguments[0].scrollIntoView();", address);
		  
		   driver.findElement(By.id("firstName")).sendKeys(" aakib ");
		   driver.findElement(By.id("lastName")).sendKeys(" sandhi ");
	  	   driver.findElement(By.id("userEmail")).sendKeys(" sandhiaakib5@gmail.com");
	 	   driver.findElement(By.id("userNumber")).sendKeys("9265457854");
	       driver.findElement(By.id("currentAddress")).sendKeys("143, sandhi vass\nAt:Nanivada\nTa:kheralu\nDi: Mahesana\n384325");
	  	   
	       driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		   driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[2]")).click();
		   driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[3]")).click();
		   driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[1]")).click();
	       driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\CONCEPT\\Downloads\\WhatsApp Image 2023-12-12 at 8.43.45 PM.jpeg");

		   //SUBJECT
		   WebElement subject= driver.findElement(By.id("subjectsContainer"));
		      Actions action = new Actions(driver);
		      action.click(subject)
		            .sendKeys("maths")
		            .keyDown(Keys.ARROW_DOWN)
		            .keyDown(Keys.ENTER)
		            .sendKeys("Arts")
		            .keyDown(Keys.ARROW_DOWN)
		            .keyDown(Keys.ENTER)
		            .build()
		            .perform();

		   
		   // DOB
		      
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//div[@id ='dateOfBirth']/div/div/input")).click();
		   
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("react-datepicker")));
	   
	       WebElement yeardropd = driver.findElement(By.className("react-datepicker__year-select"));
		   yeardropd.click();
		   Select year = new Select(yeardropd);
	       year.selectByValue("1998");
	     
	    
	       WebElement monthdropd = driver.findElement(By.className("react-datepicker__month-select"));
	       monthdropd.click();
	       Select month = new Select(monthdropd);
	       month.selectByVisibleText(" April ");
	      
	        
	       List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker']/div[2]/div[2]/div/div"));
	       System.out.println(dates.size());
	       for(WebElement e :dates) {
	          if (e.getText().equals("4")) {
	        	e.click();
	       }
	       }
	   
	    	File  screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFile(screenshot, new File("C:\\Users\\CONCEPT\\Pictures\\Camera Roll\\aakib2.png"));
	   		driver.quit();      
}
	}









