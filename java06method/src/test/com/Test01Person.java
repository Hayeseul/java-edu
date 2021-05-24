package test.com;

public class Test01Person {
	
	// 기능 : 잠자기 메소드 정의부
	// 정의 문법 : [ 접근제한자 ] 반환타입 or void method 명 ( 매개변수선언부) 
	void sleep() {
		// void가 아닌경우에눈 return 0
		
		// #유형 1 
		// void sleep () { 
		// 소스코드의 보통 끝에 위치ㅏ며, ㅈ[어문과 함께 중간에 올 수도 있다.
		//void 일때는 메소드 끝에 위치한 return문은 생ㄱ략가능. 
		// return;
		// 콜한 곳으로 데이터가 잇다면 들고서 메소드 함수를 빠져나가라 
		
		System.out.println(" **********ex**********");
		
		String name = null;
		name = "aaa";
		if (name ==null) return ;
		System.out.println("aaaaaaaaa");
	}
	// 생성자와 메소드는 오버로딩 규칙 ( 동일이름사용규정)ㅇ[ 적용된다. 
	void sleep (int x, String name) {
		// return;		
	}
	
	int sleep21() {
		// return 반환을 하려면 생성자의 이름이 중복되어서는 안된다. 
		return 100;
	}
	
	int sleep2 () {
		int x = 0;
		return 100 * x;
	}
	
	String sleep3() {
		return "kim";
	}
	
	String sleep ( String msg)  {
		return msg +"kim:";
	}
	String[] sleep4() {
		return new String[] {"kim", "kim", "kim"};
		}
	
	String[] sleep4 ( double avg) {
		return new String[] { "kim", "kim", "kim"};
	}
	
	
	Test04Member sleep5() {
		return new Test04Member();	
	}
	
	Test04Member sleep5 (int x) {
		return new Test04Member();
	}
	
	Test04Member[] sleep06() {
		return new Test04Member[] { new Test04Member(), new Test04Member()};
	}
	Test04Member[] sleep06(byte b, boolean x) {
		return new Test04Member[] { new Test04Member(), new Test04Member()};
	}
	Test04Member[] sleep06(Test04Member m) {
		return new Test04Member[] { new Test04Member(), new Test04Member()};
	}
	Test04Member[] sleep06(Test04Member[] m) {
		return new Test04Member[] { new Test04Member(), new Test04Member()};
	}
	
		void sleep7() {
		 System.out.println("sleep.....1");
		 System.out.println("sleep.....2");
		 System.out.println("sleep.....3");
		 System.out.println("sleep.....4");
		 System.out.println("sleep.....5");
		 System.out.println("sleep.....6");
		 System.out.println("sleep.....7");
		 
		 return ;
	 }
		

}
  