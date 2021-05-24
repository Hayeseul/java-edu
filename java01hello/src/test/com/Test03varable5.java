package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03varable5 {
	
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

		
	
		//3) 노트북 정보를 다루는 프로그램 
		//모델명, 가격, 무게..
		System.out.println("모델명을 입력하세요");
		String model =  br.readLine();
		System.out.println(" 모델명 : "+ model);
		System.out.println("가격을 입력하세요");
		int price= Integer.parseInt(br.readLine());
//		가격에 10%를 올려라 
		System.out.println(" 가격 : "+ price *1.1 );
		// string은 +는 가능하지만 *는 할 수 없음. 
		System.out.println("무게를 입력하세요");
		double weight =  Double.parseDouble(br.readLine());
		// 무게를 200% 높여라 
		weight = weight *2;
		System.out.println(" 무게 : " + weight);
		
		System.out.println(" ========================");
	
		
		//4) 회원가입 
		// 아이디, 비번, 이름, 폰번 
		System.out.println("아이디를 입력하세요");
		String id =  br.readLine();
		System.out.println(" 아이디 : "+id);
		System.out.println("비밀번호를 입력하세요. ");
		String password =  br.readLine();
		System.out.println(" 비밀번호 :" +password);
		System.out.println("이름을 입력하세요");
		String name1 =  br.readLine();
		System.out.println(" 이름 : "+ name1);
		System.out.println("휴대폰 번호를 입력하세요. ");
		String phone =  br.readLine();
		System.out.println( " 휴대폰 번호 : "+ phone);
		

		
	}

}
