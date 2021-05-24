package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03varable3 {
	
	public static void main(String[] args)throws IOException {
		// 값할당(변수 초기화)과 변수선언 
		System.out.println("varable3");
		
		//console 텍스트를 입력받는 기능을 구현해보자. 
		// java. io.~~~ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
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
		String title = br.readLine();
		System.out.println(" 제목 :"+title);
		System.out.println("내용을 입력하세요.");
		String content =  br.readLine();
		System.out.println(" 내용 :"+content);
		System.out.println("작성자를 입력하세요.");
		String writer = br.readLine();
		System.out.println(" 작성자 :"+writer);
		
		System.out.println(" ========================");
		
	
	}

}
