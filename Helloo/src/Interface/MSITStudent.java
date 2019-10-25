package Interface;

import java.util.Random;
import java.util.Scanner;

interface MSITStudents{
	void getGPCA();
}
interface MSITMentor{
	void getSalary();
}

public  class MSITStudent implements MSITStudents, MSITMentor{
	String tudentName;
	int StudentNumber;
	int whichMiniSem;
	
	 public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			// write your code here
			System.out.println("Enter name");
			String s=sc.next();
			System.out.println("Enter Number");
			int si=sc.nextInt();
			System.out.println("Enter MinSem");
			int ms=sc.nextInt();
			MSITStudent stu=new MSITStudent();
			
			
			
			boolean e=stu.isEligibility1();
			if(e==true) {
				stu.getGPCA();
				System.out.println("Name is" +s+ "Number is" +si+ "Mini Sem"+ms);
			}
			else {
				System.out.println("Student is not eligible");
				System.out.println("Do you want insert salary for Mentor Y?N");
				String c=sc.next();
				if(c.equals("Y")) {	
					stu.getSalary();
				}
			}
		}	
	static boolean isEligibility1()
	{
             boolean isEligible;
		Random rand=new Random();
		isEligible=rand.nextBoolean();
		return isEligible;
			
			

		}
	
	

	public static boolean isEligibility()
	{
             boolean isEligible;
		Random rand=new Random();
		isEligible=rand.nextBoolean();
		return isEligible;
	}

    

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("Enter Salary ");
 		Scanner s= new Scanner(System.in);
 		long l=s.nextLong();
 		System.out.println("Salary is"+l);
		
	}

	@Override
	public void getGPCA() {
		// TODO Auto-generated method stub
		System.out.println("Enter GPCA");
 		Scanner s= new Scanner(System.in);
 		String st=s.next();
 		System.out.println("GPCA is"+st);
		
	}
}
