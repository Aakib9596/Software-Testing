package Assigmnet1;

public class p05_amstrong_number {
	public static void main(String[] args) {
		  int n1 = 371, originalNumber, remainder, result = 0;

	         originalNumber = n1;

	         while (originalNumber != 0)
	         {
	             remainder = originalNumber % 10;
	             result += Math.pow(remainder, 3);
	             originalNumber /= 10;
	         }

	         if(result == n1)
	             System.out.println(n1 + " is an Armstrong number.");
	         else
	             System.out.println(n1 + " is not an Armstrong number.");
	         
	         
	}

}
