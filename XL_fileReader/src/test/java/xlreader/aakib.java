package xlreader;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.diverconnection;

public class aakib {
	WebDriver driver ;
	
@BeforeTest	
  public void openbrowsers ( ) {
	  String url  = "https://www.facebook.com";
	   driver = diverconnection.getDriver(url);
	  
  }
  @Test(dataProvider = "dp")
  public void login (String email, String pass ) throws InterruptedException {
	  System.out.println(email + " " + pass);
	  WebElement username = driver.findElement(By.id("email"));
	  username.clear();
	  username.sendKeys(email);
      WebElement password = driver.findElement(By.id("pass"));
      password.clear();
      password.sendKeys(pass);
      Thread.sleep(3000); 
  } 

  	@DataProvider(name = "dp")
  public static Object[][] data () {
	    sandhi e = new sandhi("C:\\Users\\CONCEPT\\Desktop\\AJIO.xlsx", "LOGIN");	
		int row = e.rowcount();
		System.out.println(" total number of row "+ row );
		int col = e.columcount();
		System.out.println("total number of colum"+ col );
 
  Object obj [][] = new Object[row ][col];
		 for (int i=0;i<row;i++) {
			 for (int j =0;j<col;j++) {
			 String data = e.getdata(i, j);	 
			System.out.println(data+" : "+i+" : "+j);
			obj[i][j]= data;
			
			 }
		 }
  return obj;
  
  }
		  
  
  
  
  }
    
    

