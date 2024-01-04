package Assigmnet1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p13_multipke_try_catch {

	public static void main(String[] args) throws ArithmeticException,InputMismatchException{
		   try {
	   			Scanner sc= new Scanner(System.in);
	   			System.out.println("enter i = ");
	   			int i = sc.nextInt();
	   			System.out.println("enter j = ");
	   			int j = sc.nextInt();
	   			int k = i/j;
	   			System.out.println(k);
	   		} catch (ArithmeticException e) {
	   			System.out.println("denominator should be greater than 0");
	   		}
	   		catch(InputMismatchException e) {
	   			System.out.println("denominator should be numeric");
	   		}
	   		catch(Exception e){
	   			e.printStackTrace();
	   		}
	   		finally {
	  			System.out.println("this will executes everytime");
	   		}
		 }        

	}


