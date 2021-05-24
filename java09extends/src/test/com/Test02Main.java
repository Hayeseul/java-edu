package test.com;

public class Test02Main {

	public static void main ( String[] args) {
		System.out.println("추상클래스 : abstract class");
		
		//추상클래스는 상속관계의 다형성으로만 객체생성 가능.
		//1. 명시적 관계 
		Test02Abs ta = new Test02AbsEx() ;
		ta.aaa() ; 
		Test02Abs.bbb();
		ta.ccc();
		
	System.out.println("==============================");
	//2.묵시적 관계 
	Test02Abs ta2 = new Test02Abs() {
		
		@Override
		public void ccc() {
			// TODO Auto-generated method stub
	System.out.println("inner class ccc()...");		
		}
	};
	
	ta2.aaa(); 
	ta2.ccc();
	
		
		
		
		
	
	}
}
