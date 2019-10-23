package todolist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class TaskCatalog {
    String task_name[];
    String task_des[];
    String stat[];
    Date date[];
    Date dd[];
    Date ed[];
    static int count = 0;
    Task ts[];

    TaskCatalog() {
        this.task_name = new String[20];
        this.task_des = new String[20];
        this.stat = new String[20];
        this.date = new Date[20];
        this.dd = new Date[20];
        this.ed=new Date[20];
        this.ts = new Task[20];
    }

    public void atask(Task t) {
        task_name[count] = t.task_name;
        task_des[count] = t.task_des;
        dd[count] = t.dd;
        ed[count]=t.ed;
        stat[count] = t.stat;
        date[count] = t.date;
        ts[count]=t;
        count++;
        System.out.println(count);

    }

    public void removet(String t) {
        for (int i = 0; i < count; i++) {
            if (ts[i].getTask_name().equals(t) || ts[i].equals(null)) {
                ts[i] = null;
                count = count - 1;
            } else
                System.out.println(ts[i]);
        }
    }

    public void upt(String t) throws ParseException {
        System.out.println("1 for task name\n 2 task desciption \n 3 Update due date\n 4 task status\n 5 Date\n");
        System.out.println("choose the field you want to update");
        Scanner s = new Scanner(System.in);
        int s1 = s.nextInt();
        switch (s1) {
            case 1:
                System.out.println("Enter new name");
                Scanner s2 = new Scanner(System.in);
                String s3 = s2.next();
                for (int i = 0; i < count; i++) {
                    if (ts[i].getTask_name().equals(task_name)) {
                        ts[i].task_name = s3;
                    }
                }
                break;
            case 2:
                System.out.println("Enter new des");
                Scanner s4 = new Scanner(System.in);
                String s5 = s4.next();
                for (int i = 0; i < count; i++) {
                    if (ts[i].getTask_des().equals(task_des)) {
                        ts[i].task_des = s5;
                    }
                }
                break;
            case 3:
                System.out.println("Enter new due date");
                Scanner s6 = new Scanner(System.in);
                String s7 = s6.next();
                Date dd = new SimpleDateFormat("dd/MM/yyyy").parse(s7);
                for (int i = 0; i < count; i++) {
                    if (ts[i].getDd().equals(dd)) {
                        ts[i].dd = dd;
                    }
                }
                break;
            case 4:
                System.out.println("Enter status to check");
                Scanner s9 = new Scanner(System.in);
                String s8 = s9.next();
                for (int i = 0; i < count; i++) {
                    if (ts[i].getStat().equals(stat)) {
                        ts[i].stat = s8;
                    }
                }
                break;
            case 5:
                System.out.println("Enter new date");
                Scanner s10 = new Scanner(System.in);
                String s11 = s10.next();
                Date d = new SimpleDateFormat("dd/MM/yyyy").parse(s11);
                for (int i = 0; i < count; i++) {
                    if (ts[i].getDd().equals(d)) {
                        ts[i].date = (java.sql.Date) d;
                    }
                }
                break;
            default:
                System.out.println("Choosen wrong option");
        }

    }

    public void dsPI(String stat) {
        for (int i = 0; i < count; i++) {
            if (ts[i].getStat().equals(stat)) {
                System.out.println(ts[i]);
            }
        }
    }
    public void date(Date dt){
        for (int i = 0; i < count; i++) {
            if (ts[i].getDate().equals(dt) ) {
                System.out.println(ts[i]);
            }
        }
    }
    public void tade(String name){
        for (int i = 0; i < count; i++) {
            if (ts[i].getTask_name().equals(name) ) {
                System.out.println(ts[i].task_des);
            }
        }
    }
    public void odts(Date ddx){
        for (int i = 0; i < count; i++) {
            if (!(ts[i].getEd().equals(ddx)) ) {
                System.out.println(ts[i]);
            }
        }
    }
    public void catalog(){
        for (int i = 0; i < count; i++) {
            if(!(ts[i].equals(null)))
                System.out.println(ts[i]);
        }
    }
}
