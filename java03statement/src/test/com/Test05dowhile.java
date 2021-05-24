package test.com;

public class Test05dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while문의 조건이 거짓인 경우에도 최소 한번은 실행해주고나서 조건비교를 통해 계속 반복할지 말지를 구현해줄 수 있다. 
		
		System.out.println("start main....");
		
		int su = 10;
		do {
			System.out.println("loop.....");
			su =100;
		} while (su ==100);

	
		System.out.println("end main......");

	}//end main

}//end class
