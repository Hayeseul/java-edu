package test.com;


public class Test03Main {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("mission....");
		// 학생정보객체
		// 번호num, 이름name, 국kore영eng수math 총점totla, 평균avg, 등급grade 
		// Test03Student.java
		// 인자없는 생성자, 인자있는 생성자, 
		
		Test03Student board = new Test03Student();
		System.out.println(board.num1);
		System.out.println(board.name1);
		System.out.println(board.kor);
		System.out.println(board.eng);
		System.out.println(board.math);
		System.out.println(board.total);
		System.out.println(board.avg);
		System.out.println(board.grade);
		
		System.out.println("=====================================");
		//board = new Test03Student( "1", "김철수", "88", "93", "99", "280","93.0", "9");
		board.num1 = 2;
		board.name1 = "하예슬";
		board.kor = 89;
		board.eng = 95;
		board.math = 83;
		board.total = board.kor+board.eng+board.math;
		board.avg = board.total/3;
		board.grade = (long) (board.avg /10);
		System.out.println(board.num1);
		System.out.println(board.name1);
		System.out.println(board.kor);
		System.out.println(board.eng);
		System.out.println(board.math);
		System.out.println(board.total);
		System.out.println(board.avg);
		System.out.println(board.grade);
		
		
		

	}

}
