package test.com;

import java.util.Date;
import java.util.List;

public class BoardMain {


	public static void main(String[] args) {
		System.out.println("게시판 프로그램");

		// 게시판 객체 : 게시글 하나의 정보를 꾸러미로하는 객체
		// 속성 : 글번호 num, 글제목 title, 글내용content, 작성자writer, 작성일자wdate...
		// Test02Board.java

		BoardDAO dao = new BoardDAOimpl();
		
		/*
		 * BoardVO vo = new BoardVO(); vo.setTitle("title"); vo.setContent("Contetnt");
		 * vo.setWriter("writer"); int result = dao.insert(vo);
		 * System.out.println(" insert result : " + result);
		 */	
		BoardVO vo = new BoardVO();
		vo.setNum(5);
		vo.setTitle("cccc");
		vo.setContent("aaaa");
		vo.setWriter("ddd");
		
		int result = dao.update(vo);
		System.out.println(" insert result : " + result);
		
		
		System.out.println("=======================================");
		List<BoardVO> list  = dao.selectAll();
		for ( BoardVO x : list) {
			System.out.println(x);
		}
		}
	
		

	

	}

