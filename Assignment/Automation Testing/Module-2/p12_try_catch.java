package Assigmnet1;

import java.util.Scanner;

public class p12_try_catch {

	public static void main(String[] args) {
		//single try and catch block
  	  
 	   try {
 		   int i,j;
 		   Scanner sc = new Scanner(System.in);
 		   System.out.println("enter i : ");  
 		   i=sc.nextInt();
 		   System.out.println(" enter j : ");
 		   j=sc.nextInt();
 		   
		   int divide = i/j ;
		   System.out.println(divide);
 	   }
 	   catch (Exception e) {
			
		}
 	   System.out.println("denominator should be zero");
 	   

	}

}
