package Assigmnet1;


abstract class parent {
	public abstract void message(); 
}
 class firstsubclass extends parent {
	 public void message() {
		 System.out.println("this is firts subclass");		
	}
 }
 class secoundsubclass extends parent {
	 public void message() {
		 System.out.println("this is secound subclass ");
		
	}
 }

public class p22_abstract_class {
	public static void main(String[] args) {
		 parent a1 = new firstsubclass();
		 parent a2 = new secoundsubclass();
		  
		 a1.message();
		 a2.message();
		 System.out.println(a1);
		 System.out.println(a2);
	}
	

}
