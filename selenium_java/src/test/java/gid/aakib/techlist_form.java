package gid.aakib;

import java.awt.Window;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import util.driverconnection;

public class techlist_form {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\CONCEPT\\Desktop\\java\\driver\\chromedriver-win64\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
   driver.findElement(By.name("firstname")).sendKeys("AAkib");
   driver.findElement(By.name("lastname")).sendKeys("sandhi");
   driver.findElement(By.id("sex-0")).click();
   driver.findElement(By.id("exp-0")).click();
   driver.findElement(By.id("datepicker")).sendKeys("29/4/1998");
   JavascriptExecutor js = (JavascriptExecutor)driver;
   js.executeScript("window.scrollBy(0,300)", "");
   driver.findElement(By.id("profession-1")).click();
   driver.findElement(By.id("tool-2")).click();
   
   WebElement  aa= driver.findElement(By.name("continents"));
   Select select = new Select(aa);
   select.selectByIndex(0);
   
   
   Thread.sleep(2000);
   driver.findElement(By.linkText("Browser Commands")).click();
   driver.findElement(By.id("photo")).sendKeys("C:\\Users\\CONCEPT\\Downloads\\WhatsApp Image 2023-12-12 at 8.43.45 PM.jpeg");
   driver.findElement(By.linkText("Click here to Download File")).click();
   
}
}