package aakib.tops;
import java.security.PublicKey;
import java.time.Duration;
import java.util.Set;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v117.heapprofiler.model.LastSeenObjectId;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.Either;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.description.annotation.AnnotationDescription.Latent;
import util.divercnnect;

 
class TOPS {
	String url = "https://careercenter.tops-int.com";
    WebDriver driver = divercnnect.getdriver(url);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
   public   void  login () {
		
		WebElement username = driver.findElement(By.id("mobile"));
		username.sendKeys("9265457854");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("9265457854");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
		login.click();
	 }
   
	public void aakib () {
		WebElement DropDown = driver.findElement(By.xpath("//body/div[@id='main-header']/div[1]/div[1]/div[2]/div[1]/a[1]/span[2]/i[1]"));
		 Actions action = new Actions(driver);
		    action.click(DropDown)
		          .pause(Duration.ofSeconds(3))
		          .keyDown(Keys.ARROW_DOWN)
		          .keyDown(Keys.ENTER)
		          .build()
		          .perform(); 
	}		    
	public void personal_detail () throws InterruptedException {
		
		//profile image
		//driver.findElement(By.id("profileImage")).sendKeys("C:\\Users\\CONCEPT\\Downloads\\WhatsApp Image 2023-12-23 at 3.07.25 PM.jpeg");
		
		
		
		WebElement salutation = driver.findElement(By.id("select2-salutation-container"));
		Actions action = new Actions(driver);
		action.click(salutation)
		      .keyDown(Keys.ENTER)
		      .build()
		      .perform();
		//firstName
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.clear();
		firstname.sendKeys("Aakib");
		         
		//lastName
		WebElement lastname = driver.findElement(By.id("lastName"));
	    lastname.clear();
	    lastname.sendKeys("sandhi");
	    
		//email
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("sandhiaakib5@gamil.com");

     	//linkedln Id	
		WebElement Linid = driver.findElement(By.id("linkedin_id"));
		Linid.clear();
		Linid.sendKeys("https://www.linkedin.com/checkpoint/challenge/AgGJYnojpoWIOgAAAYxejI0_7Y6huPoq6aZQHQIVvtrbfEEG3rVw0hrI1OnuWa0gbJJUJS3I0qhP_yJ4ft0Cno_86OR1_w?pageInstance=urn%3Ali%3Apage%3Ad_checkpoint_ch_captchaV2Challenge%3BWBTSsZD9Q6iDhDSjOD%2B65A%3D%3D&ut=2NBpfREgvBYb");
	    //Instagram Id
		WebElement Instid=driver.findElement(By.id("instagram_id"));
		Instid.clear();
		Instid.sendKeys("https://www.instagram.com/accounts/login/https://www.instagram.com/accounts/login/https://www.instagram.com/accounts/login/https://www.instagram.com/accounts/login/https://www.instagram.com/accounts/login/https://www.instagram.com/accounts/login/https://w");
	    
	   
//	    js.executeScript("window.scrollBy(0,250)", "");
	    
	    // gender
	    driver.findElement(By.xpath("//*[@id=\"select2-gender-container\"]/span")).click();
	    WebElement gender = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
	    Actions action4 = new Actions(driver);
		action4.click(gender)
		      .sendKeys("male")
		//    .keyDown(Keys.ARROW_DOWN)  {female}
		      .pause(Duration.ofSeconds(2))
		      .keyDown(Keys.ENTER)             
		      .build()
		      .perform();
	   
	    // Material status
		driver.findElement(By.xpath("//*[@id=\"select2-maritalStatus-container\"]/span")).click();
		WebElement material_status = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		Actions action5 = new Actions(driver);
			action5.click(material_status )
			       .sendKeys("Married")
			       .pause(Duration.ofSeconds(2))
			       .keyDown(Keys.ARROW_DOWN)
	               .keyDown(Keys.ENTER)
	               .build()
	               .perform();
	    Thread.sleep(3000);	
	    
		driver.findElement(By.id("birthdate")).sendKeys("04/29/1998");	    	
		js.executeScript("window.scrollBy(0,300)", "");
			
	    //fatherName
	    WebElement father_name = driver.findElement(By.id("fatherName"));
		father_name.clear();
		father_name.sendKeys("salimbhai");
				       
		//gardianName
		WebElement gardian_name = driver.findElement(By.id("guardianName"));
		gardian_name.clear();
		gardian_name.sendKeys("salimbhai");
				       
		//mother Name
		WebElement mother_name = driver.findElement(By.id("motherName"));
		mother_name.clear();
		mother_name.sendKeys("salimbhai");
					       
		//religion
		driver.findElement(By.xpath("//span[@id='select2-religion-container']/span")).click();
		WebElement religion = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		Actions action9 = new Actions(driver);
	    action9.click(religion )
	            .sendKeys("muslim")
		        .keyDown(Keys.ENTER)
		        .build()
		        .perform();
		 
		 
		//category
	    driver.findElement(By.xpath("//span[@id=\"select2-category-container\"]/span")).click();
	    WebElement category = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		Actions action10 = new Actions(driver);
		action10.click(category )
		        .sendKeys("OBC")
		        .keyDown(Keys.ENTER)
		        .build()
		        .perform();
    	//disability
		driver.findElement(By.xpath("//span[@id='select2-disability-container']/span")).click();
		WebElement disability = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
	    Actions action11 = new Actions(driver);
		    action11.click(disability )
		            .pause(Duration.ofSeconds(2))
		            .sendKeys("no")
			        .keyDown(Keys.ENTER)
			        .build()
			        .perform();
		//ID type 
		 driver.findElement(By.xpath("//span[@id='select2-idType-container']/span")).click();   
		 WebElement ID_type = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		 Actions action12 = new Actions(driver);
		 action12.click(ID_type )
		         .sendKeys("aadhar")
				 .keyDown(Keys.ENTER)
				 .build()
				 .perform();    
		 
		//ID number
		 WebElement ID_number = driver.findElement(By.id("idNo"));
	     ID_number.clear();
		 ID_number.sendKeys("71858396800");
		 
		//Education level
		 WebElement Education = driver.findElement(By.id("select2-educationLevel-container"));
		 Actions action14 = new Actions(driver);
		 action14.click(Education )
				 .keyDown(Keys.ENTER)
				 .build()
				 .perform();    
		
		js.executeScript("window.scrollBy(300,500)", ""); 
		 
		//address
		WebElement address = driver.findElement(By.id("address"));
		address.clear();
		address.sendKeys("AT.PO.-nanivada,TA.-kheralu,DI.-mahesana,384325");
					       
		//Pincode
		WebElement pincode = driver.findElement(By.id("pincode"));
		pincode.clear();
	    pincode.sendKeys("384325");
					        
		//country 
		WebElement country = driver.findElement(By.id("select2-country-container"));
		Actions action17 = new Actions(driver);
		action17.click(country) 
		         .keyDown(Keys.ENTER)
				 .build()
				 .perform() ; 
		  
		//state 
		WebElement state = driver.findElement(By.id("select2-state-container"));
		Actions action18 = new Actions(driver);
		action18.click(state) 
		         .keyDown(Keys.ENTER)
				 .build()
				 .perform() ; 
		   
		//district
		WebElement district = driver.findElement(By.id("select2-district-container"));
		Actions action19 = new Actions(driver);
		action19.click(district) 
		         .keyDown(Keys.ENTER)
				 .build()
				 .perform() ; 
		    
		//city 
		WebElement city = driver.findElement(By.id("select2-city-container"));
		Actions action20 = new Actions(driver);
		action20.click(city) 
		         .keyDown(Keys.ENTER)
				 .build()
				 .perform() ; 
		//training
		WebElement training = driver.findElement(By.id("select2-trainingStatus-container"));
		Actions action21 = new Actions(driver);
		action21.click(training) 
		         .keyDown(Keys.ENTER)
				 .build()
				 .perform() ; 
	    // Aaddhar card
		driver.findElement(By.id("aadharFront")).sendKeys("C:\\Users\\CONCEPT\\Downloads\\WhatsApp Image 2023-12-12 at 8.43.45 PM.jpeg");
		driver.findElement(By.id("aadharBack")).sendKeys("C:\\Users\\CONCEPT\\Downloads\\WhatsApp Image 2023-12-12 at 8.43.45 PM.jpeg");
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();
      
	}
	
	public void Education_detail () throws InterruptedException {
		WebElement DropDown = driver.findElement(By.xpath("//body/div[@id='main-header']/div[1]/div[1]/div[2]/div[1]/a[1]/span[2]/i[1]"));
		Actions action = new Actions(driver);
		action.click(DropDown)
		      .pause(Duration.ofSeconds(3))
		      .keyDown(Keys.ARROW_DOWN)
		      .keyDown(Keys.ARROW_DOWN)
		      .keyDown(Keys.ENTER)
		      .build()
		      .perform(); 
		
	    //add education details	
	    driver.findElement(By.linkText("+ Add Education Details")).click();
	   
	    driver.findElement(By.id("degree")).sendKeys("10thpass");
	    driver.findElement(By.id("collegeName")).sendKeys("municipal high school ,kheralu");
	    driver.findElement(By.id("passingYear")).sendKeys("2019");
	    driver.findElement(By.id("result")).sendKeys("70");
	    driver.findElement(By.id("eduResultUnit")).click();
	    driver.findElement(By.xpath("//div[@id='mobileAddBtnSection-courseEdu']/div/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[4]/div[2]/div/a[2]")).click();
	    driver.switchTo().alert().accept();
	    driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();
	
	
	
	}
	    // change_password	
	public void change_password  () {
		WebElement DropDown = driver.findElement(By.xpath("//body/div[@id='main-header']/div[1]/div[1]/div[2]/div[1]/a[1]/span[2]/i[1]"));
		Actions action = new Actions(driver);
		action.click(DropDown)
		      .pause(Duration.ofSeconds(3))
		      .keyDown(Keys.ARROW_DOWN)
		      .keyDown(Keys.ARROW_DOWN)
		      .keyDown(Keys.ARROW_DOWN)
		      .keyDown(Keys.ENTER)
		      .build()
		      .perform(); 
		
		driver.findElement(By.id("current_password")).sendKeys("9265457854");
		driver.findElement(By.id("new_password")).sendKeys("123456");
        driver.findElement(By.id("confirm_password")).sendKeys("123456");
	    WebElement confirm =  driver.findElement(By.id("changePasswordSubmit"));
	    confirm.click();
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();

	}
	    //logout
	  public void log_out  () {
	    WebElement DropDown = driver.findElement(By.xpath("//body/div[@id='main-header']/div[1]/div[1]/div[2]/div[1]/a[1]/span[2]/i[1]"));
	 		Actions action = new Actions(driver);
	 		action.click(DropDown)
	 		      .pause(Duration.ofSeconds(3))
	 		      .keyDown(Keys.ARROW_DOWN)
	 		      .keyDown(Keys.ARROW_DOWN)
	 		      .keyDown(Keys.ARROW_DOWN)
	 		      .keyDown(Keys.ARROW_DOWN)
	 		      .keyDown(Keys.ENTER)
	 		      .build()
	 		      .perform(); 
	 		
	  }
	//notification
	public void notification() {
		driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/a[1]")).click();
		
		WebElement filter = driver.findElement(By.id("notificationFilter"));
		Actions action23 = new Actions(driver);
		action23.click(filter)
		        .keyDown(Keys.ARROW_DOWN)
		        .keyDown(Keys.ARROW_DOWN)
		        .keyDown(Keys.ENTER)
                .build()
                .perform();
	
	   WebElement view_account = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/label[1]"));	
	   view_account.click();
	   driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();

	}	
	
	//my course	
	public void My_Course() throws InterruptedException  {
		//courses details
		 driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/div/div")).click();
		 Thread.sleep(2000);
	     driver.findElement(By.linkText("Course Details")).click();	
	     Thread.sleep(2000);
	     driver.findElement(By.id("course-course-tab")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("course-attendance-tab")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("course-accounts-tab")).click();
    	 driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();

	     
	     //project
	     WebElement project =  driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/div/div"));
	     Actions action =  new Actions(driver);
	     action.click(project)	           
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
               .keyDown(Keys.ENTER)
               .build()
               .perform();
		 Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@id='course-project']/div/div[1]/h4/a")).click();
	     Thread.sleep(3000);
	     
	    //assignment
	     WebElement Assignment  =  driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/div/div"));
	     Actions action1 =  new Actions(driver);
	     action1.click(Assignment)	
	           .pause(Duration.ofSeconds(2))
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
               .keyDown(Keys.ENTER)
               .build()
               .perform();
	     
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
         Thread.sleep(3000);
      
         //assessment
	     WebElement Assessment  =  driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/div/div"));
	     Actions action2 =  new Actions(driver);
	     action2.click(Assessment)
               .pause(Duration.ofSeconds(2))
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
               .keyDown(Keys.ENTER)
               .build()
               .perform();
	     
	     js.executeScript("window.scrollBy(0,document.body.Bottom)");
         Thread.sleep(3000); 
         
         //InterView
	     WebElement interview  =  driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/div/div"));
	     Actions action3 =  new Actions(driver);
	     action3.click(interview)
               .pause(Duration.ofSeconds(2))
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
               .keyDown(Keys.ENTER)
               .build()
               .perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='accordion-body']/div/a[2]")).click();
	    
		  String mainwin = driver.getWindowHandle();
		  Set<String> allwin = driver.getWindowHandles();
		   for (String win : allwin) {
			   if (!win.equals(mainwin)) {
				   driver.switchTo().window(win);
				   Thread.sleep(2000);
			   }
	}
	}
	//resume
	public void resume () throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[4]")).click();
		
	 // personal detail
      WebElement title =  driver.findElement(By.id("title"));
      title.clear();
	  title.sendKeys("Manual & Automation tetsing");      
      
	  WebElement contact =  driver.findElement(By.id("contact"));
	  contact.clear();
	  contact.sendKeys("9265457854");      
	      
	      
  	  WebElement email =  driver.findElement(By.id("email"));
  	  email.clear();
	  email.sendKeys("sandhiakib5@gmail.com");      
      driver.findElement(By.id("dob")).sendKeys("04-29-1998");
	     
	  WebElement addresh =   driver.findElement(By.id("address"));
	  addresh.clear();
	  addresh.sendKeys("At.po.-nanivada,Ta.-kheralu,Di.- Mahesana ,384325");
    
	      
	 	driver.findElement(By.id("linkedinLink")).sendKeys("https://www.linkedin.com/checkpoint/challenge/AgGJYnojpoWIOgAAAYxejI0_7Y6huPoq6aZQHQIVvtrbfEEG3rVw0hrI1OnuWa0gbJJUJS3I0qhP_yJ4ft0Cno_86OR1_w?pageInstance=urn%3Ali%3Apage%3Ad_checkpoint_ch_captchaV2Challenge%3BWBTSsZD9Q6iDhDSjOD%2B65A%3D%3D&ut=2NBpfREgvBYb");
	    driver.findElement(By.id("githubLink")).sendKeys("https://github.com/Aakib9596/Aakib-9596");
	    driver.findElement(By.id("personalDetailSubmit")).click();
	    
	//profile summary
	    
	   driver.findElement(By.id("v-pills-profile-tab")).click();
	   Thread.sleep(3000);
	   js.executeScript("window.scrollBy(0,document.body.top)");
	   
	   WebElement summary = driver.findElement(By.id("summeryContent"));
	   summary.clear();
	   summary.sendKeys(" i am aakib");
	   Thread.sleep(2000);
  	   driver.findElement(By.id("personalDetailSubmit")).click();
	   
   // technical skill
  	   
  	   driver.findElement(By.id("v-pills-technical-tab")).click();
	   js.executeScript("window.scrollBy(0,document.body.top)");

  	   driver.findElement(By.id("programmingLanguages")).sendKeys("java");
  	   driver.findElement(By.id("databases")).sendKeys("My SQL");
  	   driver.findElement(By.id("webServers")).sendKeys("webServers");
	   js.executeScript("window.scrollBy(0,document.body.bottom)");

  	   driver.findElement(By.id("softwares")).sendKeys("jira");
  	   driver.findElement(By.id("systems")).sendKeys("windows");
  	   driver.findElement(By.xpath("//div[@id='v-pills-technical']/form/div[6]/div/input")).click();
  	   
   // EXpireance 
  	   driver.findElement(By.id("v-pills-projects-tab")).click();
  	   Thread.sleep(2000);
  	   driver.findElement(By.linkText("+ Add Experience Details")).click();
  	   Thread.sleep(2000);
  	   driver.findElement(By.id("companyName")).sendKeys("AKAL information pvt.ltd.");
  	   driver.findElement(By.id("position")).sendKeys("Soft.Engg.");
  	   driver.findElement(By.id("jobDescriptionText")).sendKeys("mumbai"); 
  	   driver.findElement(By.id("jobTenureFrom")).sendKeys("07/20/2022");
  	   driver.findElement(By.id("jobTenureTo")).sendKeys("05/20/2023");
  
  	   driver.findElement(By.id("companyDetailsFormSubmit")).click();
  	   Thread.sleep(2000);
  	   driver.findElement(By.xpath("//div[@id='v-pills-projects']/div/div[1]/div[1]/div[2]/a[2]")).click();
  	   Thread.sleep(2000);
  	   driver.switchTo().alert().accept();
  	   
  	   js.executeScript("window.scrollBy(0,document.body.bottom)");
  	   Thread.sleep(2000);

  	   driver.findElement(By.xpath("//div[@id='v-pills-projects']/div/div[3]/div/input")).click();
//	
   // education
  	    
      driver.findElement(By.id("v-pills-education-tab")).click();
      Thread.sleep(2000);
      driver.findElement(By.linkText("+ Add Education Details")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("degree")).sendKeys("10thpass");
	  driver.findElement(By.id("collegeName")).sendKeys("municipal high school ,kheralu");
	  driver.findElement(By.id("passingYear")).sendKeys("2019");
	  driver.findElement(By.id("result")).sendKeys("70");
	  driver.findElement(By.id("eduResultUnit")).click();
	  driver.findElement(By.xpath("//div[@id='mobileAddBtnSection-courseEdu']/div/input")).click();
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,document.body.bottom)");	  

      driver.findElement(By.xpath("//div[@id='v-pills-education']/div/div[4]/div[2]/div/a[2]/i")).click();
       
	  driver.findElement(By.linkText("Save & Preview")).click();
      
	  String mainwin = driver.getWindowHandle();
	  Set<String> allwin = driver.getWindowHandles();
	   for (String win : allwin) {
		   if (!win.equals(mainwin)) {
			   driver.switchTo().window(win);
			   Thread.sleep(2000);

      driver.findElement(By.linkText("Download Resume")).click();
	 		   
  }
  }
	   driver.close();
	   driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();

	}
	
	//job tracker
	public void job_tracker() {
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[5]")).click();
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();
	}
	 
	//upload review 
	public void upload_review () {
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[6]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/a/img")).click();
	    driver.findElement(By.className("mfp-close")).click();
	    driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();
	}
	
	//rewards
	public void rewrda() {
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[7]")).click();
	    driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();

	}
	
	//refer
	public void refer_friends () {
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[8]")).click();
        driver.findElement(By.id("referFirstName")).sendKeys("sandhi");
        driver.findElement(By.id("referLastName")).sendKeys("aakib");
        driver.findElement(By.id("referMobile")).sendKeys("9265457854");
        driver.findElement(By.id("referCollegeName")).sendKeys("GECPL");
        driver.findElement(By.id("referEducation")).sendKeys("B.E/B.Tech");
        driver.findElement(By.id("referFriendSubmit")).click();
	    driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();

	}   
	   
	   
	} 
  	 
  	public class tops_career_center {
	public static void main(String[] args) throws InterruptedException {
		  TOPS aa = new TOPS();
		  aa.login();
		  aa.aakib();
		  aa.personal_detail();
		  
		  
		  
		  
		  
		  
		  
	}

}
