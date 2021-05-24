package test.com;

public class Test02Type {
	
//	실행하려면 main 메소드가 반드시 필요하다. 
	public static void main(String[] args) { 
//		main + ctrl+space 자동완성 
		
		//1. 문자열  스트링 String 타입
		System.out.println("java type");
		System.out.println("쌍따옴표처리는 문자열");
//		0글자 이상인 여러 글 
		System.out.println("aaaaa");
		System.out.println(" ");
		System.out.print(""); //print로 하는경우 값을 한가지 이상 꼭 넣어줘야됨
		
		//2.문자, 문자형 : 캐릭터 char ( 2byte, 0과 양수 ) 
		System.out.println('a');
//		홑따옴표 ''은 정확히 한글자만 표현 
		System.out.println("==========");
		
		
		//3. 숫자-정수(byte, short, int, long) , 실수 (float, double )  
		 System.out.println(1234);
		 System.out.println(1234.1234);
		 
		 //4. 참거짓 표현  ; 블린타입  boolean
		 System.out.println(true);
		 System.out.println(false);
		 
		 //5. 메모리 주소가 없다.라는 표현 : 널타입  >>  반대표현 : 주소가 있다. ( new 연산 빌셍 ) 
		 System.out.println("주소가 없다 : " +null );
		
		
		
		
	}
	

}
