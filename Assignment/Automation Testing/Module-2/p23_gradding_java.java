package Assigmnet1;

import java.util.Scanner;

public class p23_gradding_java {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println(" enter marks :");
		  int mark = sc.nextInt();
		   
		  
		  if (mark >= 91 && mark <=100) {
			  System.out.println(" grade : AA");		  
		                                }  
		  else if  (mark >=81 && mark <=90 ) {
			  System.out.println(" grade : AB");		
		                                     }
		  else if (mark >=71 && mark <=80){
			  System.out.println(" grade : BB");			  
                                    		}
		  else if (mark >=61 && mark <=70) {
			  System.out.println(" grade :BC");
		                                     }
		  else if (mark >=51 && mark <=60) {
			  System.out.println(" grade :CD");
		                                   }
		  else if (mark >=41 && mark <=50) {
			  System.out.println(" grade :DD");
			  
		                                  }
		  else  if (mark <=40){
			  System.out.println(" fail ");
			  
		  }
		  
	}

}
