package test.com;

public class Test05dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while문의 조건이 거짓인 경우에도 최소 한번은 실행해주고나서 조건비교를 통해 계속 반복할지 말지를 구현해줄 수 있다. 
		
		System.out.println("start main....");
		

		boolean con = true;
		do {
			System.out.println("loop.....");
			System.out.println("종료시 x입력");
			String txt = "x";
			if( txt.compareTo("x")==0) break;
		} while (con);

	
		System.out.println("end main......");

	}//end main

}//end class
