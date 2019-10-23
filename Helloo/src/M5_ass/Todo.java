package M5_ass;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Todo {
	String name[];
	String description[];
	Date date[];
    todolist todolists[];
	int count=0;
	
	Todo(){
		this.name=new String[20];
		this.description=new String[20];
		this.date=new Date[20];
		this.todolists=new todolist[20];
		
	}
	
	
	
	public void add(todolist task) {
		name[count]=task.name;
		description[count]=task.description;
		date[count]=task.date;
		todolists[count]=task;
		count=count+1;
		System.out.println(count);
		
	}
	
	public void delete(String task) {
		for(int i=0;i<count;i++) {
			if(todolists[i].getName().equals(task) || todolists[i].equals(null)) {
				todolists[i]=null;
				count=count-1;
				
			}else 
			{
				System.out.println(todolists[i]);
			}
			
		}
		
	}
	
	public void update(String task) throws ParseException {
		System.out.println("1 for task name\n 2 task desciption \n 3 Update due date\n 4 task status\n 5 Date\n");
        System.out.println("choose the field you want to update");
        Scanner s=new Scanner(System.in);
        int s1=s.nextInt();
        switch(s1) {
        case 1:
            System.out.println("Enter new name");
            Scanner s2 = new Scanner(System.in);
            String s3 = s2.next();
            for (int i = 0; i < count; i++) {
                if (todolists[i].getName().equals(name)) {
                    todolists[i].name = s3;
                }
            }
            break;
        case 2:
            System.out.println("Enter new description");
            Scanner s4 = new Scanner(System.in);
            String s5 = s4.next();
            for (int i = 0; i < count; i++) {
                if (todolists[i].getDescription().equals(description)) {
                    todolists[i].description = s5;
                }
            }
            break;
        case 3:
            System.out.println("Enter new due date");
            Scanner s6 = new Scanner(System.in);
            String s7 = s6.next();
            Date date=new SimpleDateFormat("dd/MM/yyyy").parse(s7);
            for (int i = 0; i < count; i++) {
                if (todolists[i].getDate().equals(date)) {
                    todolists[i].date= date;
                }
            }
            break;
        default:
            System.out.println("Choosen wrong option");
        
        }
	}
	

}
