package xlreader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.diverconnection;

public class xl_data_reader {
	WebDriver driver;
	@BeforeClass
	public void browser() {	
       String url ="https://www.facebook.com";
       WebDriver driver = diverconnection.getDriver(url);
	} 
	@Test(dataProvider = "dp")
	public void login (String email, String pass) throws InterruptedException {
    	WebElement usernmae = driver.findElement(By.id("email"));
    	usernmae.clear();
    	usernmae.sendKeys(email);
    	WebElement password = driver.findElement(By.id("pass"));
    	password.clear();
    	password.sendKeys(pass);
        Thread.sleep(3000);
	}
    @DataProvider(name= "dp")
	public static Object[][] getdata () {
       sandhi aa = new sandhi("C:\\Users\\CONCEPT\\Desktop\\AJIO.xlsx", "LOGIN");
       int row = aa.rowcount();
       System.out.println("total number of row "+row );
       int col = aa.columcount();
       System.out.println("total number of colum "+ col);
       
       Object obj [][] = new Object [row ][col];
       for (int i = 0;i<row;i++) {
    	   for (int j = 0;j<col;j++) {
    		   String data = aa.getdata(i, j);
    		   System.out.println(data);
    	       obj[i][j]= data ;
    	       
    	   }
       }
    		   
    
     return obj;
    
    
    }
}
