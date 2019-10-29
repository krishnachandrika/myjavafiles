package exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 1. int num, int denom  , demon= num/0
 2. private static BufferedReader buf = new BufferedReader(
    new InputStreamReader(System.in));
    int x = Integer.parseInt(buf.readLine());
 3. int c[] = { 1 };
    c[42] = 99;
 4. Declare a String and try to print without initialization
 5. Try to execute your program in the parent directory observe the output 
  	and explain the exception.
 6. Use ‘finally’ and try to print the message from it.
 7. Try to put 
    catch (Exception e) {
    System.out.println(e.getMessage()); 
 */

class a {
	void display() {
try {
	int num=5;
	int denom;
	denom= num/0;
	}catch(Exception e) {
		System.out.println("Number dicide by exception"+e);
	}
	finally{
		System.out.println("exception 1");
	
	}
}
}

class b{
	void display() {
try {
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		    int x = Integer.parseInt(buf.readLine());
}catch(Exception e){
	System.out.println(e);
}
finally{
	System.out.println("exception 2");
		
}
}
}

class c{
	void display() {
try {
	int c[] = { 1 };
    c[42] = 99;
}catch(Exception e) {
	System.out.println(e);
	
}
finally {
	System.out.println("exception 3");
}
	}
}

class d{
	void display() {
try {
	String s="chandu";
	System.out.println(s);
}catch(Exception e) {
	System.out.println(e);
	
}	
finally {
	System.out.println("exception 4");
}
}
}


public class Sample {
	public static void main(String args[]) {
		a A=new a();
		A.display();
		b B=new b();
		B.display();
		c C=new c();
		C.display();
		d D=new d();
		D.display();
		
		
	}

}
