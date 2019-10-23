package library;


public class Library {
	String title;
    String author;
    String subject;

    public Library(String title, String author, String subject)
    {
        this.title = title;
        this.author = author;
        this.subject = subject;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
    	this.author = author;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String toString() {
    	String card= "{Author= '+author+', Title= '+title+', Subject='+subject+'}";
    	return card;
    }
}
