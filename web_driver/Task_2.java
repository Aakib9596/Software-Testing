package web_driver;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

import util.driverconnection;

public class Task_2 {
   
	public static void main(String[] args) {
	String url = "https://demoqa.com/webtables";
	WebDriver driver = driverconnection.getDriver(url);
	
	driver.findElement(By.id("addNewRecordButton")).click();
	driver.findElement(By.id("firstName")).sendKeys("aakib");
	driver.findElement(By.id("lastName")).sendKeys("sandhi");
	driver.findElement(By.id("userEmail")).sendKeys("sandhiaakib5@gmail.com");
	driver.findElement(By.id("age")).sendKeys("25");
	driver.findElement(By.id("salary")).sendKeys("20000");
	driver.findElement(By.id("department")).sendKeys("null");
	driver.findElement(By.id("submit")).click();
	driver.findElement(By.xpath("//*[@id=\"delete-record-1\"]")).click();

	
	
}
	
}