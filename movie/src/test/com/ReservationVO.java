package test.com;

import java.sql.Date;

public class ReservationVO {
	// num, id, pq, name, te1
	private int num;
	private String name;
	private String movie;
	private String day;
	private String time;
	private String card;
	
	
	
	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMovie() {
		return movie;
	}



	public void setMovie(String movie) {
		this.movie = movie;
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



	public String getCard() {
		return card;
	}



	public void setCard(String card) {
		this.card = card;
	}



	public String toString() {
		return "MemberVO [num=" + num + ", name=" + name + ",movie=" + movie+ ", day=" + day + ", time=" +time +",card=" + card +","
				+ " getNum()="+ getNum() + ", getName()=" + getName() + ", getMovie()=" + getMovie() + ", getDay()=" + getDay()
				+ ", getTime()=" + getTime() +  ", getCard()=" + getCard() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


}
