package Assigmnet1;

public class p03_factorial_of_number {
      public static void main(String[] args) {
    	    int a,fact=1;
		     
	         int number=5;   //5 factorial =  5*4*3*2*1 =120
	         for(a=1;a<=number;a++){
	         fact=fact*a;
	                               }
	         System.out.println("Factorial of "+number+" is: " + fact);
	         
	}
}
