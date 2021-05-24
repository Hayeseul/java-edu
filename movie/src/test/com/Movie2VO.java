package test.com;

import java.sql.Date;

public class Movie2VO {

	private int num;
	private String day;
	private String time;
	

	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String toString() {
		return "MemberVO [num=" + num + ", day=" +day + ", time=" + time 
				+ ", getNum()=" + getNum() + ", getDay()=" + getDay() + ", getTime()=" + getTime()+
				 ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}


