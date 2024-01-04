package Assigmnet1;


class mythread1  implements Runnable {
	
	
	       public void run(){
	       System.out.println("Thread is running");
	          }
	}

	public class p14_thread_runnable_interface {
	    public static void main(String[] args) {
	          mythread1 obj1 = new mythread1(); 
	         Thread t = new Thread(obj1); 
	         t.start();
	    }

	}	
			
			
					
		
