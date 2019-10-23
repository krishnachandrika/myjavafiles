package Ass2;

public class Player {
	String pname;
	int page;
	String gametype;
	
	public Player(String pname, int page, String gametype) {
		this.pname=pname;
		this.page=page;
		this.gametype=gametype;
		
	}
	public String getPname() {
        return pname;
    }
	public void setPname(String pname) {
	    this.pname = pname;
	}
	public int getPage() {
	    return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getGametype() {
        return gametype;
    }
	public void setGametype(String gametype) {
	        this.gametype = gametype;
	}

	

}
