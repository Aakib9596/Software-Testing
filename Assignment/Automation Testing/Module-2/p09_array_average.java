package Assigmnet1;

public class p09_array_average {
	public static void main(String[] args) {
		 // avarage of array element  
		   int [] numbers = new int [] {2,4,678,5,4,2};
		   int sum = 0 ;
		   for (int a = 0 ; a <numbers.length ; a ++) {
			   sum = sum + numbers[a];
		   }
		    float avarage =   sum / numbers.length;
		    System.out.println("avarage value  of given array numbers " + avarage);
	}

}
