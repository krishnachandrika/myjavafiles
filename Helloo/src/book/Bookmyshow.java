package book;

import java.sql.Date;

public class Bookmyshow {
	 String place;
	    String movies;
	    Date dd;
	    int seat_avail;
	    String search;
	    double tm;
	    double rating;

	    public Bookmyshow(String place, String movies, Date dd, int seat_avail,double rating,  double tm) {//creating constructor
	        this.place = place;
	        this.movies = movies;
	        this.dd = dd;
	        this.seat_avail = seat_avail;
	        this.tm = tm;
	        this.rating=rating;
	    }

	    public String getPlace() {
	        return place;
	    }//get method to get data

	    public void setPlace(String place) {
	        this.place = place;
	    }//setting data

	    public String getMovies() {
	        return movies;
	    }//get method to get data

	    public void setMovies(String movies) {
	        this.movies = movies;
	    }//setting data

	    public Date getDd() {
	        return dd;
	    }//get method to get data

	    public void setDd(Date dd) {
	        this.dd = dd;
	    }//setting data

	    public int getSeat_avail() {
	        return seat_avail;
	    }//get method to get data

	    public void setSeat_avail(int seat_avail) {
	        this.seat_avail = seat_avail;
	    }//setting data

	    public double getTm() {
	        return tm;
	    }//get method to get data

	    public void setTm(double tm) {
	        this.tm = tm;
	    }//setting data
	    public double getRating() {
	        return rating;
	    }//get method to get data

	    public void setRating(int rating) {
	        this.rating = rating;
	    }//setting data


	    @Override
	    public String toString() {
	        return "Task{" +
	                "movie name='" + movies + '\'' +
	                ", place='" + place + '\'' +
	                ", date='" + dd + '\'' +", seat availability='" + seat_avail + '\'' +", rating='" + rating + '\'' +
	                ", timing='" + tm + '\'' +
	                '}';
	    }

}
