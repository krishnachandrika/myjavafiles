package todolist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DailyTask {
    public static void main(String args[]) throws ParseException {

        Scanner in = new Scanner(System.in);
        TaskCatalog card = new TaskCatalog();

        while (true) {
            System.out.println("Enter your choice\n 1 for add task\n 2 remove task \n 3 Update task\n 4 Display incomplete or pending tasks\n 5 Dispaly particular date task\n 6 task based on name \n 7 Over due Tasks \n 8 Catalog \n 9.for exit");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Task name");
                    String task_name = in.next();
                    System.out.println("Enter task desc");
                    String task_des = in.next();
                    System.out.println("enter Due date");
                    String d1 = in.next();
                    Date dd = new SimpleDateFormat("dd/MM/yyyy").parse(d1);
                    System.out.println("enter end date");
                    String d3 = in.next();
                    Date ed = new SimpleDateFormat("dd/MM/yyyy").parse(d3);
                    System.out.println("Enter Status");
                    String stat = in.next();
                    System.out.println("Enter date");
                    String d2 = in.next();
                    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(d2);
                    Task t = new Task(task_name, task_des, dd,ed,stat, date);
                    card.atask(t);
                    break;
                case 2:
                    System.out.println("Enter task name to remove a task");
                    task_name=in.next();
                    card.removet(task_name);
                    break;
                case 3:
                    System.out.println("Enter task name to update a task");
                    task_name=in.next();
                    card.upt(task_name);
                    break;
                case 4:
                    System.out.println("Enter due date status");
                    stat=in.next();
                    card.dsPI(stat);
                    break;
                case 5:
                    System.out.println("Enter Particular date");
                    String da=in.next();
                    Date dat = new SimpleDateFormat("dd/MM/yyyy").parse(da);
                    card.date(dat);
                    break;
                case 6:
                    System.out.println("Enter task name for desc");
                    task_name=in.next();
                    card.tade(task_name);
                    break;
                case 7:
                    System.out.println("Enter date to check overdue");
                    String dar=in.next();
                    Date ddx = new SimpleDateFormat("dd/MM/yyyy").parse(dar);
                    card.odts(ddx);
                    break;
                case 8:
                    card.catalog();
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        }
    }
}