package book;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Menu {
	 public static void main(String args[]) throws ParseException {

	        Scanner in = new Scanner(System.in);
	        Book card = new Book();//creating an object
	        int arr[][]=new int [10][10];//array is a static method
	        for(int i=0;i<10;i++){
	            for(int j=0;j<10;j++){
	                arr[i][j]=0;
	                //System.out.print(arr[i][j]);
	            }
	            //System.out.println("\n");
	        }
	        while (true) {
	            System.out.println("Enter your choice\n0 Add list\n 1 View movies\n 2 view movies in location \n 3 search movie\n 4 rating \n 5 Availability of seats\n 6 timing \n 7 exit\n 8 select seats");
	            int choice = in.nextInt();
	            switch (choice) {
	                case 0:
	                    System.out.println("Enter Movie name");
	                    String movies = in.next();
	                    System.out.println("Enter Location");
	                    String task_des = in.next();
	                    System.out.println("enter date");
	                    String d1 = in.next();
	                    java.sql.Date dd = (java.sql.Date) new SimpleDateFormat("dd/MM/yyyy").parse(d1);
	                    System.out.println("Enter Seat availaability");
	                    int stat = in.nextInt();
	                    System.out.println("Enter rating");
	                    double r= in.nextDouble();
	                    System.out.println("Enter time");
	                    double tm = in.nextDouble();
	                    Bookmyshow t = new Bookmyshow(movies, task_des, dd,stat, r,tm);//creating an object
	                    card.abms(t);
	                    break;
	                    case 1:
	                        System.out.println("Movies are");
	                        card.movies();
	                        break;
	                case 2:
	                    System.out.println("Movies are");
	                    card.loc();
	                    break;
	                case 3:
	                    System.out.println("Enter movie to be searched");
	                    movies=in.next();
	                    card.sm(movies);
	                    break;
	                case 4:
	                    System.out.println("Enter movie to be searched by rating");
	                    r=in.nextDouble();
	                    card.rm(r);
	                    break;
	                case 5:
	                    System.out.println("Enter movie to check seat availability");
	                    movies=in.next();
	                    card.sa(movies);
	                    break;
	                case 6:
	                    System.out.println("Enter movie to be searched by timing");
	                    r=in.nextDouble();
	                    card.tm(r);
	                    break;
	                case 7:
	                    System.exit(0);
	                    break;
	                case 8:
	                    card.bs(arr);
	                    break;
	                default:
	                    System.out.println("Yiu have choosen wrong choice");
	            }
	        }
	    }

}
