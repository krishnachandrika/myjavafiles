package todolist;

import java.sql.Date;

public class Task {
	 String task_name;
	    String task_des;
	    java.util.Date dd;
	    Date ed;
	    String stat;
	    Date date;

	    public Task(String task_name, String task_des, Date dd,Date ed, String stat, Date date) {
	        this.task_name = task_name;
	        this.task_des = task_des;
	        this.dd = dd;
	        this.ed=ed;
	        this.stat = stat;
	        this.date = date;

	    }

	    public Task(String task_name2, String task_des2, java.util.Date dd2, java.util.Date ed2, String stat2,
				java.util.Date date2) {
			// TODO Auto-generated constructor stub
		}

		public Date getEd() {
	        return ed;
	    }

	    public void setSd(Date ed) {
	        this.ed = ed;
	    }

	    public String getTask_name() {
	        return task_name;
	    }

	    public void setTask_name(String task_name) {
	        this.task_name = task_name;
	    }

	    public String getTask_des() {
	        return task_des;
	    }

	    public void setTask_des(String task_des) {
	        this.task_des = task_des;
	    }

	    public Date getDd() {
	        return (Date) dd;
	    }

	    public void setDd(Date dd) {
	        this.dd = dd;
	    }

	    public String getStat() {
	        return stat;
	    }

	    public Date getDate() {
	        return date;
	    }

	    public void setDate(Date date) {
	        this.date = date;
	    }

	    public void setStat(String stat) {
	        this.stat = stat;
	    }
	    @Override
	    public String toString() {
	        return "Task{" +
	                "task name='" + task_name + '\'' +
	                ", task description='" + task_des + '\'' +
	                ", Due date='" + dd + '\'' +", end date='" + ed + '\'' +", Status='" + stat + '\'' +
	                ", Date='" + date + '\'' +
	                '}';
	    }
	
}
