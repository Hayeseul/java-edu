package test.com;

import java.util.Date;
public class Test02Board {
	//게시판 객체 : 게시글 하나의 정보를 꾸러미로하는 객체 
	//속성 : 글번호 num, 글제목 title, 글내용content, 작성자writer, 작성일자wdate...
//속성 : 전역변수, 멤버필드, 멤버변수 
	int num; 
	String content;
	String title;
	String writer;
	Date wdate;
	
	
	  public Test02Board() {
	      System.out.println("Test02Board()");
	      num = 1;
	      title = "title";
	      content = "content";
	      writer = "writer";
	      wdate = new Date();
	}
	  //ctrl +shift +f : 한줄정렬
	  //ctrl +f : 대체 
	  public Test02Board(int num, String title, String content, String writer, Date wdate)  {
			System.out.println("Test02Board(int num, String title, String content, String writer, Date wdate)");
			this.num = num;
			this.title =title;
			this.content = content;
			this.writer = writer;
			this.wdate = wdate;
		}
		
		



}
