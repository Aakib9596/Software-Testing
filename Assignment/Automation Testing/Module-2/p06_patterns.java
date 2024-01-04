package Assigmnet1;

public class p06_patterns {

	public static void main(String[] args) {
		//1)
		
	   	/*	1
			1 2
			1 2 3
			1 2 3 4 */
			
			  
			for (int r = 1 ; r <=4; r++) {
				for (int c=1 ; c<=r ; c++) {				
					System.out.print(c +" ");
				
				}
				System.out.println(); 
				}
		    
			// 2) 
			
		/*	1
			2 3
			4 5 6
			7 8 9 10 */
			
			
			    int count =1 ;
				for (int r = 1 ; r <=4; r++) {
					for (int c=1 ; c<=r ; c++) {
						System.out.print(count +" ");
						count++;				
					}
					System.out.println(); 
					}
				
			// 3)
				/*
				 * 0
				 * 10
				 * 010
				 * 1010
				 * 01010
				 */
				
				
			
				for(int r=1;r<=5;r++) {
				
					for(int c=1;c<=r;c++) {
						
						if((r+c)%2 ==0)
							{
							System.out.print("0");
							}
						else 
							{
							System.out.print("1");
							}
						}
					System.out.println();
				
				// TODO Auto-generated method stub

			}
				
				
			//3 Diamond pattern   
				
			     for ( int m = 1 ; m<=5 ;m++) {   // raws 
				 
				     for ( int n = 1 ; n <= 5-m ;n++) {  // left side space 
			    	  System.out.print(" ");
			      }
				
				  for ( int n = 1 ; n <=m *2-1 ;n ++) {  // print * ,middle and right side space
					  System.out.print("");
				  }
			  System.out.println();
			      }
			     
			      for  (int m = 5 -1;m >0 ;m--) {
			    	  
			    	  for  (int n = 1; n <= 5-m ;n++){
			    		  System.out.print(" ");
			    		  
			    	  }
			    	  for (int n = 1;n <= m* 2-1;n++){
			    		  System.out.print("*");
			    	  }
			    	  
			    	  System.out.println();
			      }
			      
			
			
		}

	}

