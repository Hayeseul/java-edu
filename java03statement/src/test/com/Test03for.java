package test.com;

public class Test03for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 반복문 : 자동 반복적으로 수행하고싶은 로직을 구현할때. 
		// 종류 : for, while, do ~while
		
		// for : count, length, size,,,, 
		// while : 무한 루프~특정상황, 상태, 신호, 입력값 등에 따라 종료하는 형식 
		
		//일반 for, foreach
		
		for(int i = 0; i <100; i++) {
			System.out.println("Hello"+i);
		}
		System.out.println("===============================");
		
		
		// 짝수만 출력 
		for (int i = 0; i <10; i++) {
			System.out.println("Hello"+i);
			if ( i%2 ==0) {
				System.out.println("Hello"+i);
			}
		}
		System.out.println("===============================");
		
		// 홀수만출력
		for (int i = 0; i <10; i++) {
			System.out.println("Hello"+i);
			if ( i%2 ==1) {
				System.out.println("Hello"+i);
			}
		}
		System.out.println("===============================");
		// i 이용해서 2씩 증가 
		for (int i = 0; i <10; i+=2) {
			System.out.println("Hello"+i);
		}
		System.out.println("===============================");
		
		
		for (int i = 'a'; i <='z'; i++) {
			System.out.println("Hello"+i);
		}
		
		System.out.println("===============================");
		for (char i = 'a'; i <='z'; i++) {
			System.out.println("Hello"+i);
		}
		int len = 10;
		System.out.println("===============================");
		for ( int i = 0 ; i <len; i++) {
			System.out.print(i);
		}
	
		System.out.println();

	}//end main

}//end class
