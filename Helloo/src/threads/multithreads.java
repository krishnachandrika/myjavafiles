package threads;

public class multithreads extends Thread {
	public void run(){  
		for(int i=5;i>0;i--){  
		    try{
		    	Thread.sleep(1000);
		    	}catch(InterruptedException e){
		    		System.out.println(e);
		    		}  
		    System.out.println(i);  
		    
		  }
	    System.out.println(Thread.currentThread().getId()+" Exiting");  
	}
	public static void main(String args[]){  
		  Thread t1=new Thread(new multithreads());  
		  Thread t2=new Thread(new multithreads());  
		  Thread t3=new Thread(new multithreads());  
		  t1.start();  
		  t2.start();
		  t3.start();

	}

}
