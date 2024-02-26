package gid.aakib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.TimeoutExceededException;
import util.driverconnection;

public class web {
	public static void main (String []args)throws TimeoutExceededException{
		String url ="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = driverconnection.getDriver(url);

	   List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
       System.out.println(row.size());
       for (int r=2;r<=row.size();r++) {
    	   List<WebElement> col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td"));
            System.out.println(col.size());
            for(int c=1;c<=col.size();c++) {
            	WebElement text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]/span"));
            	System.out.print( text.getText()+" ");
            }
             
            System.out.println();
       }
				
		
	}

}
