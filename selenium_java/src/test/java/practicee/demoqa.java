package practicee;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class demoqa {
	
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("WebDriver.chrome.driver", "C:\\\\Users\\\\CONCEPT\\\\Desktop\\\\java\\\\driver\\\\chromedriver-win64\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();	
		  driver.manage().window().maximize();
		  driver.get("https://demoqa.com/alerts");
	      driver.findElement(By.id("alertButton")).click();
	      Thread.sleep(3000);
	      driver.switchTo().alert().accept();
	      driver.findElement(By.id("timerAlertButton")).click();
	      Thread.sleep(6000);
	      driver.switchTo().alert().accept();  
		  driver.findElement(By.id("confirmButton")).click();
		  driver.switchTo().alert().dismiss();
		  JavascriptExecutor sc= (JavascriptExecutor)driver;
		  sc.executeScript("window.scrollBy(0,300)", "");
		  driver.findElement(By.id("promtButton")).click();
		  Thread.sleep(2000);
		  driver.switchTo().alert().sendKeys("aakib");
		  
		  
	}
 
}
