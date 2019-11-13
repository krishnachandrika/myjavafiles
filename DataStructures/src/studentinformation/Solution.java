package studentinformation;

import java.io.File;
import java.util.Scanner;

class Student implements Comparable<Student>{
	String name;
	String dob;
	int sub1;
	int sub2;
	int sub3;
	int marks;
	String category;
	boolean flag;
	Student(String name, String dob, int sub1, int sub2, int sub3, int marks, String category){
		//your code goes here.
		super();
		this.name = name;
		this.dob = dob;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.marks = marks;
		this.category = category;
		this.flag=flag;
		
	}
	
	public String toString() {
		return "students[name="+ name +", dob="+ dob +", sub1="+ sub1+", sub2="+ sub2+", sub3="+ sub3+", marks="+ marks +", category="+category+",flag="+ flag+"]";
	}
	
	public int compareTo(Student stu) {
		//your code goes here.
		if(sub1==stu.sub1) {
			if(sub2==stu.sub2) {
				if(sub3==stu.sub3) {
					if(marks==stu.marks) {
						return 0;
							
					}else if(marks<stu.marks) {
						return 1;
					}else {
						return -1;
					}
					
					
				}else if(sub3<stu.sub3) {
					return 1;
				}else {
					return -1;
				}
				
			}else if(sub2<stu.sub2) {
				return 1;
			}else {
				return -1;
			}
		}else if(sub1<stu.sub1) {
			return 1;
		}else {
			return -1;
		}
		
     	
        
    }
    
}

class Selection{
	Student[] list;
	int vacancies;
	int open;
	int bcReserved;
	int scReserved;
	int stReserved;
	Selection(int no_of_Students, int no_of_positions,int open, int bcReserved, int scReserved, int stReserved) {
		list = new Student[no_of_Students];
		vacancies = no_of_positions;
		this.open = open;
		this.bcReserved = bcReserved;
		this.scReserved = scReserved;
		this.stReserved = stReserved;
	}

	public Student[] getSelectedList(){
		//your code goes here.
		return null;
	}
}


public class Solution {
	public static void main(String[] args) throws Exception {
		int no_of_testcases = 6;
		int i = 0;
		while(i < no_of_testcases){
			String inputFile = "testcases/input00"+i+".txt";
			String outputFile = "testcases/output00"+i+".txt";
			ReadInput(inputFile,outputFile);
			i++;
		}	
	}
	public static void ReadInput(String inputFile, String outputFile) throws Exception{
		Scanner sc = new Scanner(new File(inputFile));
		int no_of_Students = Integer.parseInt(sc.nextLine());
		int no_of_positions = Integer.parseInt(sc.nextLine());
		int open = Integer.parseInt(sc.nextLine());
		int BC_count = Integer.parseInt(sc.nextLine());
		int SC_count = Integer.parseInt(sc.nextLine());
		int ST_count = Integer.parseInt(sc.nextLine());

		Selection sel_obj = new Selection(no_of_Students, no_of_positions, open, BC_count,SC_count,ST_count);
		for(int i = 0; i < no_of_Students; i++){
			String[] Student_info = sc.nextLine().split(",");
			Student stu_obj = new Student(Student_info[0],Student_info[1], Integer.parseInt(Student_info[2]),Integer.parseInt(Student_info[3]),Integer.parseInt(Student_info[4]),Integer.parseInt(Student_info[5]), Student_info[6]);
			sel_obj.list[i] = stu_obj;
		}
		Student[] finallist = sel_obj.getSelectedList();
		checkOutput(finallist, no_of_positions,outputFile);

	}
	public static void checkOutput(Student[] arr, int no_of_positions, String outputFile) throws Exception{
		Scanner sc = new Scanner(new File(outputFile));
		for(int i = 0; i < no_of_positions; i++){
			if(!sc.nextLine().equals(arr[i].name)){
				System.out.println("Your output is not matching with output in file "+ outputFile);
				return;
			}
		}
		System.out.println("your output with file "+ outputFile+" Matched. This Test case passed");

	}
}


