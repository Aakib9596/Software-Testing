package gid.aakib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openbrowser {
	public static void main(String[] args) throws InterruptedException {
		
		// crome 
	/*     System.setProperty("webdriver.chrome.driver", "C:\\Users\\CONCEPT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://insydegst.in/login");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();  */
		
		// microsoft edge
	/*	System.setProperty("webdriver.edge.driver", "C:\\Users\\CONCEPT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver Driver = new EdgeDriver();
	    Driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
		Driver.manage().window().maximize();*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CONCEPT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email =  driver.findElement(By.id("email"));
		email.sendKeys("sandhiaakib5@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("S@ndhi9596");
		WebElement login = driver.findElement(By.xpath("//div[@class='_6ltg']"));
	    login.click();
	    WebElement logout = driver.findElement(By.xpath("//div[@class='xu06os2_x1ok221b']"));
	    logout.click();
	    System.out.println("logout");
		
		
		
		
			
		   
		
		 
		 
	}
	

}
