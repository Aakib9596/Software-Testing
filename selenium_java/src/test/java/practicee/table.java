package practicee;

import java.util.List;

import javax.lang.model.element.Element;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import javax.tools.Diagnostic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import gid.aakib.techlist_form;
import util.driverconnection;

public class table {
	public static void main(String[] args) {
		String url = "https://www.w3schools.com/html/html_tables.asp";
		WebDriver driver = driverconnection.getDriver(url);
		List<WebElement> thead = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("table head row: " + thead.size());
		for (int r = 1; r <= thead.size(); r++) {
			WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[" + r + "]"));
			String text = data.getText();
			System.out.print(text + "  ");
		}
		   System.out.println();
		 
		 List<WebElement> number_of_raws = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		 for (int r1=1;r1<=number_of_raws.size();r1++) {

		      List<WebElement> c1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+r1+"]/td"));
		   for(int c2=1;c2<=c1.size();c2++) {
			    WebElement data1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r1+"]/td["+c2+"]"));
		        String text1 = data1.getText();
		        System.out.print(text1+" || ");
		        		
		   
		   }
		      System.out.println();
		 }
		   
	/*	   for ()
			List<WebElement> tdata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
			for (int c = 1; c <= tdata.size(); c++) {
				
				WebElement data1 =driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/td[" + c + "]"));
				
				String text1 = data1.getText();
				
				System.out.print(text1 + "  ");

			}*/

		}

	
}
