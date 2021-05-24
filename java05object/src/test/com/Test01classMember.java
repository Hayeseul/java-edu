package test.com;

public class Test01classMember {

	public static void main(String[] args) {
		
		System.out.println("Object....");
		
		// 변수 : 원하는 데이터를 타입으로 정의해서 사용 
		// 배열 : 동일타입의 변수가여러개필요할때
		//int [] sus = new int [3]; 
		// 객체 : 서로다른 타입의 변수가 여러개를 한곳에 모아서 사용.
		String N = new String(); 
		//oop : 객체지향프로그래밍
		
		// 객체를 생성하려면클래스가 존재해야한다. 
		//클래스는 아래의 구성요소들로 이루어져ㅣ있다.
		//1. 속성 2. 기능 3. 생성자 4. 내부클래스 5. 어노테이션 선언, 초기화블럭, 상속여부
		
		
		String str = new String();
		str =new String("kim");
		str =new String(new char[ ] { '1', 'e', 'e'});
		System.out.println("===========================================================");
		//String[] info = new String[] {"kim", "44", "88.8"};
		
		System.out.println("===========================================================");
		//사용자 정의 객체타입
		Test01person p = new Test01person();
		
		
		
		System.out.println(p);
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.weight);
		
		
		
		p = new Test01person("kim");
		System.out.println(p);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.weight);
		
	    p = new Test01person(new char[] {'l','e','e'});
	    System.out.println(p);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.weight);
		
		p = new Test01person(100);
		System.out.println(p);
		
		p = new Test01person(100,200);
		System.out.println(p);

		p = new Test01person(new String[] {"kim", "lee", "han"});
		System.out.println(p);
		
		p = new Test01person(new int[] {11,22,33});
		System.out.println(p);
		
		
		String[] data = new String[] {"kim","44","55.55",};
		data[0] = "park";
		
		
		p= new Test01person("choi", 100, 54.5);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.weight);
		p.name = "han";
		p.age = 66;
		p.weight = 120;
		
		
		
		System.out.println("===========================================================");

		
		
		
		
		

	}//end main

}//end class
