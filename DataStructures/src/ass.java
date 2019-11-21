package assignment;

import java.util.Arrays;

public class ass {
	static boolean repeat(String str) {  
		
		int n=str.length(); 
		char arr[] = str.toCharArray(); 
		Arrays.sort(arr); 
		for (int i=0;i<n - 1;i++) { 
			if (arr[i]==arr[i+1]) 
				return true; 
			
		} 
		return false; 
		
	} 
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1="good";
	     System.out.println(repeat(str1));
	     String str2="machine";
	     System.out.println(repeat(str2));
	    

	}

}
