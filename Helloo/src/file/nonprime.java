package file;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class nonprime {
	public static void main(String atgs[]) {
		String strFilePath = "C://Users//Chandu//eclipse-workspace//files//nonprime.txt";
		try
	    {
	      FileOutputStream fos = new FileOutputStream(strFilePath);
	     
	       DataOutputStream dos = new DataOutputStream(fos);
	       boolean isPrime = true;
	       int count=0;
	       System.out.println("Enter prime size:");
	       Scanner s=new Scanner(System.in);
	       int m=s.nextInt();
	       for (int j = 1; j <= m; j++) {
	    	   isPrime = CheckPrime(j);
	    	   if (!isPrime) {
	    		   System.out.print(j+"  ");
	    		   count++;
	    		   dos.writeInt(j);
	    	       
	    	   }
	      }
	       
	       System.out.println();
	       System.out.println("non primes are:"+count);
	       System.out.println("primes are:"+(m-count));
	       System.out.println("Inserting into file completed");
	        dos.close();
	    }
	    catch (IOException e)
	    {
	      System.out.println("IOException : " + e);
	    }
	 }
	  public static boolean CheckPrime(int numberToCheck) {
	      int remainder;
	      for (int i = 2; i <= numberToCheck / 2; i++) {
	          remainder = numberToCheck % i;
	          if (remainder == 0) {
	              return false;
	          }
	      }
	      return true;

	    
	    }
	
}

