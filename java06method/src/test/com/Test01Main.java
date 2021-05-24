package test.com;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( "*********method*********");
		
		System.out.println("=====================================");
		System.out.println("*****ex*****");
		//method 예시 
		//아래처럼 설계될 시 재사용시 수정이 어려움.  따라서 객체, method를 활용하여 수정에 편리하도록 만들어줌. 
		System.out.println( "sleep...");
		System.out.println( "sleep...");
		System.out.println( "sleep...");

		System.out.println( 100+200);
		System.out.println( 100+200);
		System.out.println( 100+200);
		
		System.out.println( "sleep...");
		System.out.println( "sleep...");
		System.out.println( "sleep...");
		
		System.out.println( 100+200);
		System.out.println( 100+200);
		System.out.println( 100+200);
		
		
		
		System.out.println("=====================================");
		
		Test01Person p = new Test01Person();
		p.sleep7(); // 메소드 승인 
		System.out.println("====");

		p.sleep7(); // 메소드 승인 
		System.out.println("====");
		
		p.sleep7(); // 메소드 승인 
		System.out.println("====");

		p.sleep(1000,"lee");
		int x = p.sleep2();
		System.out.println(x);
		
	}

}
