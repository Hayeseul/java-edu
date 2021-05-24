package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10SystemIN {
	
	public static void main(String[] args)throws IOException {
		// 값할당(변수 초기화)과 변수선언 
		System.out.println("varable3");
		
		//console 텍스트를 입력받는 기능을 구현해보자. 
		// java. io.~~~ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//#1
		
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
