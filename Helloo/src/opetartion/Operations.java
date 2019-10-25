package opetartion;


interface Operator{
	int performOperation(int num1, int num2);	
}
class Add implements Operator {

	 private String opString;
     public Add() {
          opString = "+";
     }
 public int performOperation(int num1, int num2) {
     return num1 + num2;
 }
 public String getOperation() {
	 return opString;
 }
}

class Subtract implements Operator {

	private String opString;
    public Subtract() {
         opString = "-";
    }
public int performOperation(int num1, int num2) {
    return num1 - num2;
}
public String getOperation() {
	 return opString;
}
}

class Multiply implements Operator {

   private String opString;
   public Multiply() {
        opString = "*";
   }
public int performOperation(int num1, int num2) {
   return num1 * num2;
}
public String getOperation() {
	 return opString;
}
}

class Divide implements Operator {

	   private String opString;
	   public Divide() {
	        opString = "*";
	   }
	public int performOperation(int num1, int num2) {
	   return num1 * num2;
	}
	public String getOperation() {
		 return opString;
	}
	}

public class Operations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Add a=new Add();
System.out.println(a.performOperation(5,10));
Subtract s=new Subtract();
System.out.println(s.performOperation(10,2));
Multiply m=new Multiply();
System.out.println(m.performOperation(20,3));
Divide d=new Divide();
System.out.println(d.performOperation(10,4));
}

}
