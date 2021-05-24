package test.com;

public interface Navi extends Screen, TouchPad {
	
	// 전역변수 : 묵시적 퍼블릭 스테틱 상수이다. 
	/*public static final*/ String NAME = "아이나비"; 
	public static final int PRICE = 1000000;
	
	//메소드 : 디폴트, 스테틱, 추상 모두가능 
	public default void findLoad() {
		System.out.println("default findLoad()....");
	}
	public static void findStor() {
		System.out.println("static findStroe()....");
	}
	public /*abstract*/ Car findRendCar();
	public static void findStore() {
		// TODO Auto-generated method stub
		
	}

}
