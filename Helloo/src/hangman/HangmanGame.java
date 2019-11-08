package hangman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
	static String c[]=new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	static int x=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			BufferedReader find=new BufferedReader(new FileReader("movies.txt"));
			String s=find.readLine();
		      String arr[]=new String[10000];
		      String arr1[]=new String[10000];
		    while(s!=null){  
		    arr1=s.split(" ");
		    s=find.readLine();
		    for(int i=0;i<arr1.length;i++) {
		    	arr[x]=arr1[i];
		    	x++;
		    	}
		    }
		    find.close();
		    Random r= new Random();
		    int randomNumbers=r.nextInt(arr.length);
		    String s1=arr[randomNumbers];
		      while(s1==null && s1!=" ") {
		    	  //System.out.println(arr[randomNumbers]);
		    	  randomNumbers=r.nextInt(arr.length);
		    	  s1=arr[randomNumbers];
		      }
		      System.out.println("\t\t\t\tWelcome to Hangman!");
		      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		      System.out.println(arr[randomNumbers]);
		      String word[]=new String[50];
		      String new1[]=new String[50];
		      for(int j=0;j<s1.length();j++) {
	    		  System.out.print("_ ");
	    		  word[j]=Character.toString(s1.charAt(j));
	    		  new1[j]="_";
	    	  }
		      System.out.println("Guess the word");
	    	  int count=0;
	    	  int temp=0;
	    	  int size=8;
	    	  for(int k=0;k<size;k++) {
	    		  if(temp!=s1.length()) {
	    		  System.out.println("You have" +size+" chances");
	    		  System.out.println();
	    		  for(int test=0;test<c.length;test++) {
	    		  System.out.print(c[test]+" ");
	    		  }
	    		  System.out.println();
	    		  System.out.println(s1.length());
	    		  System.out.println("Guess a letter");
	     		  Scanner sc=new Scanner(System.in);
	    		  String words=sc.next();
	    		  for(int a=0;a<s1.length();a++) {
	    			  
	    			 if(temp!=s1.length()) {
	    			if(word[a].equals(words)) {
	    				new1[a]=words;
	    				System.out.print(new1[a]+" ");
	    				if(size<=8) {
	    				size=size+1;
	    				if(temp!=s1.length())
	    				k=k+1;
	    				int countword=0;
	    				countword=1;
	    				if(countword==1)
	    					k=k-1;
	    				}
	    				temp=temp+1;
	    				
	    				for(int tes=0;tes<c.length;tes++) {
	    					if(words.equals(c[tes])) {
	    						c[tes]="";
	    					}
	    				}
	    				
	    			}else {
	    				System.out.print(new1[a]+" ");
	    				count=1;
	    				  			}
	    		  }
	    			  
	    	  }
	    			if(count==1) {
	  				  size=size-1;
	  				  k=k-1;
	  			  }
	    	  }
	    	  }
	    	  if(temp==s1.length()) {
	    		  System.out.println("Congratulations you won the game");
	    		  System.out.println(s1);
	    	  }
	    	  else {
	    	  System.out.println("Game over because of chances completion or you identified word");
	    	  }
		    
		 }catch (IOException e) {
			  System.out.println(e);
			  e.printStackTrace();
	}
}
}