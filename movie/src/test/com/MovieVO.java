package test.com;

import java.sql.Date;

public class MovieVO {


	private int num;
	private String movie;
	private String content;
	private String runningtime;
	private String time;
	
	
	
	
	
	public int getNum() {
		return num;
	}




	public void setNum(int num) {
		this.num = num;
	}




	public String getMovie() {
		return movie;
	}




	public void setMovie(String movie) {
		this.movie = movie;
	}




	public String getContent() {
		return content;
	}




	public void setContent(String content) {
		this.content = content;
	}




	public String getRunningtime() {
		return runningtime;
	}




	public void setRunningtime(String runningtime) {
		this.runningtime = runningtime;
	}


	


	public String getTime() {
		return time;
	}




	public void setTime(String time) {
		this.time = time;
	}




	public String toString() {
		return "MemberVO [num=" + num + ", movie=" + movie + ", content=" + content + ", runningtime=" + runningtime +", time=" + time +
			", getNum()="+ getNum() + ", getMovie()=" + getMovie() + ", getContent()=" + getContent() + ", getRunningtime()=" + getRunningtime() +
			 ", getTime()=" + getTime() +", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


}
