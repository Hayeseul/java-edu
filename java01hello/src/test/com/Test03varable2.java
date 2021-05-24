package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03varable2 {
	
	public static void main(String[] args) {
		// 값할당(변수 초기화)과 변수선언 
		System.out.println("varable3");
		
		

		
		//1.
		//변수를 만드는 이유 : 변화된 1값을 넣을 그릇이 필요하다. 
		// 변수 선언 : 타입 영문소문자 (명사형); 
		// 특수문자는 언더바 허용 a_name =>비권장 
		// 영문단어의 복수 연결시는 대문자로 구분 , aaBbb
		
		
		//2. 무엇을 변수로 만들것인지? 특정대상의 속성을 표현하는 명사들 
		// 게시판 프로그램을 짜고싶다. 
		// 제목, 내용, 작성자, 작성일자... <<<변수 
		// 1)게시판 글쓰기 로직 
		System.out.println("제목을 입력하세요");
		String title = "자바수업";
		System.out.println(" 제목 :"+title);
		System.out.println("내용을 입력하세요.");
		String content = "열심히 듣고있다";
		System.out.println(" 내용 :"+content);
		System.out.println("작성자를 입력하세요.");
		String writer = "하예슬";
		System.out.println(" 작성자 :"+writer);
		
		System.out.println(" ========================");
		
		
		//2) 사람이 대상 : 사람정보를 다루는 프로그램 
		//이름, 나이, 휴대폰 번호
		System.out.println("이름을 입력하세요 ");
		String name = "하예슬";
		System.out.println(" 이름 :" + name);
		System.out.println("나이를 입력하세요");
		int old = 25;
		System.out.println("나이 :"+old);
		System.out.println("휴대폰 번호를 입력하세요");
		String number = " 010-6343-9074";
		System.out.println(" 휴대폰 : "+ number);
		
		System.out.println(" ========================");
		
	
		//3) 노트북 정보를 다루는 프로그램 
		//모델명, 가격, 무게..
		System.out.println("모델명을 입력하세요");
		String model =  "X2021";
		System.out.println(" 모델명 : "+ model);
		System.out.println("가격을 입력하세요");
		int price= 2100000; 
		System.out.println(" 가격 : "+ price *1.1 );
		// string은 +는 가능하지만 *는 할 수 없음. 
		System.out.println("무게를 입력하세요");
		double weight =  1.6;
		System.out.println(" 무게 : " + weight);
		
		System.out.println(" ========================");
	
		
		//4) 회원가입 
		// 아이디, 비번, 이름, 폰번 
		System.out.println("아이디를 입력하세요");
		String id =  "yeseul9074";
		System.out.println(" 아이디 : "+id);
		System.out.println("비밀번호를 입력하세요. ");
		String password = "yeseul2@9074";
		System.out.println(" 비밀번호 :" +password);
		System.out.println("이름을 입력하세요");
		String name1 =  "하예슬";
		System.out.println(" 이름 : "+ name1);
		System.out.println("휴대폰 번호를 입력하세요. ");
		String phone =  "010-6343-9074";
		System.out.println( " 휴대폰 번호 : "+ phone);
		

		
	}

}
