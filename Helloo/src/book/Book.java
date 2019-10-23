package book;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Book {
	String place[];
    String movies[];
    Date dd[];
    int seat_avail[];
    String search[];
    double tm[];
    double rating[];
    int count=0;
    Bookmyshow b[];//creating bookmyshow array class object
	private Scanner s;

    public Book() {//constructor
        this.place = new String[20];
        this.movies = new String[20];
        this.dd = new Date[20];
        this.seat_avail = new int[20];
        this.tm = new double[20];
        this.rating=new double[20];
        this.b = new Bookmyshow[20];
    }
    public void abms(Bookmyshow t){//methods called
        movies[count] = t.movies;
        place[count] = t.place;
        dd[count] = t.dd;
        seat_avail[count] =t.seat_avail;
        tm[count] = t.tm;
        rating[count]=t.rating;
        b[count]=t;//placing the data into that class
        count++;
    }
public void movies(){//methods called for movies
        for(int i=0;i<count;i++){
            System.out.println(b[i].place);
        }
}
    public void loc(){//methods called for location
        for(int i=0;i<count;i++){
            System.out.println(b[i].movies);
        }
    }
    public void sm(String movie){//methods called searching movie
        for(int i=0;i<count;i++){
            if(b[i].getPlace().equals(movie))
                System.out.println(b[i]);
        }
    }
    public void rm(double movie){//methods called rating movie
        for(int i=0;i<count;i++){
            if(b[i].getRating()==movie)
                System.out.println(b[i]);
        }
    }
    public void sa(String movie){//methods called for seat availability
        for(int i=0;i<count;i++){
            if(b[i].getPlace().equals(movie))
                System.out.println(b[i]);
        }
    }
    public void tm(double movie){//methods called timing
        for(int i=0;i<count;i++){
            if(b[i].getTm()==movie)
                System.out.println(b[i]);
        }
    }
    public int[][] bs(int[][] arr) {//methods called for seats
        System.out.println("Enter row you want to book seats");
        s = new Scanner(System.in);
        int t = s.nextInt();
        System.out.println("Enter Number of tickets you want to book");
        int l = s.nextInt();
        System.out.println("The seats with 1 are booked and 0 are empty");
        boolean c2 = extracted(t);
		boolean c = c2;
		while (c) {
            for (int i = 0; i < l; i++){
                arr[t][i]=1;
            }
            break;
        }
        System.out.println(Arrays.deepToString(arr));
        return arr;
    }
	private boolean extracted(int t) {
		boolean c2 = t==t;
		boolean c = c2;
		return c;
	}
	

}
