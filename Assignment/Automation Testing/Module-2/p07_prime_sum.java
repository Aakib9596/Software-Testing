package Assigmnet1;

import java.util.Scanner;

public class p07_prime_sum {
	public static void main(String[] args) {
	
			int k=0,devide=0;
			long sum=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number : ");
			int number = sc.nextInt();
			for(int j=1;j<=number;j++)
			{
			for (int i=2;i<=j-1;i++)
			  {
				if (j%i==0)
				{
					k++;
					devide = i;
				}
			  }
			
			if(k==0)
			{
				System.out.println(j+" is Prime number");
				sum= sum+j;
				if(j==number)
				{
					System.out.println("total of prime numbers from 1 to "+number+" is : "+sum);
				}
				
			}
			else
			{
				System.out.print(j+" is not Prime number");
				System.out.println(" and "+j+" is devided by "+devide);
				k=0;
				if(j==number)
				{
					System.out.println("total sum of prime numbers from 1 to "+number+" is : "+sum);
				}
				
			}
			
			// TODO Auto-generated method stub

		}
	}

}


