package gid.aakib;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.driverconnection;

public class fb_createaccount {
         public static void main(String[] args) throws InterruptedException {
        	 String url = "https://www.facebook.com/";
        	WebDriver Driver = driverconnection.getDriver(url);
        	Driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
        	Thread.sleep(2000);
        	
        	Driver.findElement(By.name("firstname")).sendKeys("aakib");
        	Driver.findElement(By.name("lastname")).sendKeys("sandhi");

        	Driver.findElement(By.name("reg_email__")).sendKeys("sandhiaakib5@gmail.com");
        	Driver.findElement(By.name("reg_passwd__")).sendKeys("S@ndhi9596");
        	Driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Sandhiaakib5@gmail.com");
        	Driver.findElement(By.xpath("//button[@type='submit']")).click();
        	
     		
}
}