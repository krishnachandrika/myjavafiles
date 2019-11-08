package program1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ass1 {
	public static void main(String args[]) {
		
		try
	    {
		   File fin=new File("sample.txt");  
		    int i=0;
		    int arr[] = new int[50];
		    int arr1[] = new int[50];
		       int count=0;
		    String r="";
		    BufferedReader b = new BufferedReader(new FileReader(fin));
		    while ((r = b.readLine()) != null) {
                i=Integer.parseInt(r);
                arr[count]=i;
               
                count++;
            }
	    }
		    
		    catch (IOException e)
		    {
		      System.out.println("IOException : " + e);
		    }
		
	}

}
