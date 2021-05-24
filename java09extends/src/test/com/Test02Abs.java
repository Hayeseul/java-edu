package test.com;

public abstract class Test02Abs {
	
	// 객체 생성시 생성자는 상속받은 클래스의 생성자로만 호출가능
	// 즉, 다형성을 이용한 객체생성방법으로만 호출가능 
	public Test02Abs (){
		System.out.println("Test02Abs()...");
	}
	
	// 추상클래스 : 추상메소드를 포함할 수 있는 클래스 
	//default method
	
	public void aaa( ) {
		System.out.println( "Test02Abs aaa().....");
	}
	// static method 
	
	public static void bbb() {
		System.out.println("Test02Abs static bbb()");
		
	}
	
	public abstract void ccc() ;// 실행문이 아니라서 바디를 가질 수 없음. 
	// abstrcat  를 빼면 바디를 반드시 가져야 됨. 
	// 바디가 있는 애들이 불러들일 수 있다. 
	//따라서 오버라이딩이 전제 되어야하고, 다형성이 전제가 되어야함. 
		
	}//end class

