package emp;
public class Employee {
		String name;
		String surName;
		String address;
		double basicSalary;

		public Employee(String name, String surName, String address, double basicSalary) {
			super();
			this.name = name;
			this.surName = surName;
			this.address = address;
			this.basicSalary = basicSalary;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getSurName() {
			return surName;
		}


		public void setSurName(String surName) {
			this.surName = surName;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public double getBasicSalary() {
			return basicSalary;
		}


		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}
		public static void main(String[] args) {
			
		
			TemporaryEmployee te=new TemporaryEmployee("Lakshmireddy", "Gujjala", "Guntur", 10500, 15);
			TemporaryEmployee te1=new TemporaryEmployee("Chandrika", "Sreeramula", "Cotton Hills", 14500, 39);
			TemporaryEmployee te2=new TemporaryEmployee("Krishna", "Sreeramula", "Cotton", 10990, 18);
			TemporaryEmployee te3=new TemporaryEmployee("LR", "Gujjala", "Guntur", 24500, 31);
			
			System.out.println("The Name of the Temporary Employee is:"+te.getName());
			System.out.println("The Surname of the temporary Employee is:"+te.getSurName());
			System.out.println("The Addree of the Temporary Employee is:"+te.getAddress());
			System.out.println("The Basic salary of TemporaryEmployee is:"+te.getBasicSalary());
			System.out.println("The Number of days worked in a month is :"+te.getNo_of_days_worked());
			System.out.println("The Net Salary of the Temporary Employee in a month is :"+te.netSalary());
			
			
			
			
		
			System.out.println("The Surname of the temporary Employee is:"+te1.getSurName());
			System.out.println("The Addree of the Temporary Employee is:"+te1.getAddress());
			System.out.println("The Basic salary of TemporaryEmployee is:"+te1.getBasicSalary());
			System.out.println("The Number of days worked in a month is :"+te1.getNo_of_days_worked());
			System.out.println("The Net Salary of the Temporary Employee in a month is :"+te1.netSalary());
			
			
			
			System.out.println("The Surname of the temporary Employee is:"+te2.getSurName());
			System.out.println("The Addree of the Temporary Employee is:"+te2.getAddress());
			System.out.println("The Basic salary of TemporaryEmployee is:"+te2.getBasicSalary());
			System.out.println("The Number of days worked in a month is :"+te2.getNo_of_days_worked());
			System.out.println("The Net Salary of the Temporary Employee in a month is :"+te2.netSalary());
			
			
			
			System.out.println("The Surname of the temporary Employee is:"+te3.getSurName());
			System.out.println("The Addree of the Temporary Employee is:"+te3.getAddress());
			System.out.println("The Basic salary of TemporaryEmployee is:"+te3.getBasicSalary());
			System.out.println("The Number of days worked in a month is :"+te3.getNo_of_days_worked());
			System.out.println("The Net Salary of the Temporary Employee in a month is :"+te3.netSalary());
			
			//Full Time Employee Objects:
			
			fullTimeEmployee fte=new fullTimeEmployee("Lakshmireddy", "Gujjala", "Guntur", 10000,10);
			fullTimeEmployee fte1=new fullTimeEmployee("Lakshmireddy", "Gujjala", "Guntur", 15000,12);
			fullTimeEmployee fte2=new fullTimeEmployee("Lakshmireddy", "Gujjala", "Guntur", 18000,16);
			
			//object1 of full time employee details
			//object1
			System.out.println(fte.getName());
			System.out.println(fte.getSurName());
			System.out.println(fte.getAddress());
			System.out.println(fte.getBasicSalary());
			System.out.println(fte.getProvidentFund());
			System.out.println(fte.netSalary());
			
			//object2
			System.out.println(fte1.getName());
			System.out.println(fte1.getSurName());
			System.out.println(fte1.getAddress());
			System.out.println(fte1.getBasicSalary());
			System.out.println(fte1.getProvidentFund());
			System.out.println(fte1.netSalary());
			//object3
			
			System.out.println(fte2.getName());
			System.out.println(fte2.getSurName());
			System.out.println(fte2.getAddress());
			System.out.println(fte2.getBasicSalary());
			System.out.println(fte2.getProvidentFund());
			System.out.println(fte2.netSalary());
			
					
		}
	}


	class TemporaryEmployee extends Employee{
		public TemporaryEmployee(String name, String surName, String address, double basicSalary,int no_of_days_worked) {
			super(name, surName, address, basicSalary);

			this.no_of_days_worked=no_of_days_worked;
		}
		int no_of_days_worked;
		

		public int getNo_of_days_worked() {
			return no_of_days_worked;
		}

		public void setNo_of_days_worked(int no_of_days_worked) {
			this.no_of_days_worked = no_of_days_worked;
		}
		public double netSalary()
		{
			double no_of_days_ina_month=31;
			double result=basicSalary*no_of_days_worked/no_of_days_ina_month;
			return result;
		}
		
		
	}
	class fullTimeEmployee extends Employee{
		
		 float providentFund;

		public fullTimeEmployee(String name, String surName, String address, double basicSalary, float providentFund) {
			super(name, surName, address, basicSalary);
			this.providentFund = providentFund;
		}
		
		public float getProvidentFund() {
			return providentFund;
		}




		public void setProvidentFund(float providentFund) {
			this.providentFund = providentFund;
		}




		public double netSalary()
		{
			double result=basicSalary+(basicSalary*providentFund/100);
			
			return result;
			
		}
		

}
