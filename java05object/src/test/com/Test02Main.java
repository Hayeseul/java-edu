package test.com;

import java.util.Date;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("Board main.....");
		
		//게시판 객체 : 게시글 하나의 정보를 꾸러미로하는 객체 
		//속성 : 글번호 num, 글제목 title, 글내용content, 작성자writer, 작성일자wdate...
		// Test02Board.java
		
		Test02Board board = new Test02Board();
		System.out.println(board.num);
		System.out.println(board.title);
		System.out.println(board.content);
		System.out.println(board.writer);
		System.out.println(board.wdate);
		
		board.num = 2;
		board.title = "즐거운 객체시간";
		board.content = "점심 너무 먹어서 졸립네";
		board.writer = "김샘";
		board.wdate = new Date();
		System.out.println(board.num);
		System.out.println(board.title);
		System.out.println(board.content);
		System.out.println(board.writer);
		System.out.println(board.wdate);
		
		System.out.println("==============================================================");
		//객체를 생성할때 임의의 3번글 정보를 전달해서 객체생성 및 출력 
		Test02Board board2= new Test02Board();
		System.out.println(board2.num);
		System.out.println(board2.title);
		System.out.println(board2.content);
		System.out.println(board2.writer);
		System.out.println(board2.wdate);
		
	}

}
