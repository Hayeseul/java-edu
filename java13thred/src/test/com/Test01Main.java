package test.com;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("병렬처리 : 스레드 객체와 런어블객체 활용");
		
		// ******Thread 클래스 상속 방법 1 ******
		//1. Thread 클래스를 상속받는 클래스를 구현 
		//2. Thread 클래스 안에 run메소드를 재정의해서  실행하고자하는 로직을 구현  
		//3.  Thread 클래스를 상속받는 클래스를 객체생성한 후 
		//4. start()메소드로 스레드 시작. 
		ThreadEx t = new ThreadEx();
		t.start();
		
		
		// ******Thread 클래스 상속 방법 2 ******
		//익명 내부 클래스 상속 방법 
		new Thread() {
			public void run() {
				for (int i =0 ; i <10; i ++) {
					System.out.println(i);
					
			}
			}
		}.start();
	
		
		// ******Thread 클래스 상속 방법 3 ******
		//Runnable인터페이스를 상속 
		//run메소드를 재정의해서 실행하고자하는 로직 구현 
		//start 메소드가 없어서 Thread객체를 생성해서 스타트 
		
		RunnableImpl ri = new RunnableImpl();
		Thread t2 = new Thread(ri);
		t2.start();
		
		
		// ******Thread 클래스 상속 방법 4 ******
		//Runnable 익명내부 클래스로 구현 
		Runnable r = new Runnable() {
			public void run() {
				for (int i =1000; i <1010; i ++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			
		}
		};
		
		Thread t3 = new Thread(r);
		t3.start();
		
		// ******Thread 클래스 상속 방법 5 ******
		//Runnable 익명내부 클래스로 구현 
		new Thread( new Runnable() {
			public void run() {
				for (int i =1000; i <1010; i ++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			
		}
		}).start();
		
		
		
		
		
		System.out.println("*******end main********");
	} //end main

}//end class
