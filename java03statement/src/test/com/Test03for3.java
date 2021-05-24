package test.com;

public class Test03for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 반복문 : 자동 반복적으로 수행하고싶은 로직을 구현할때. 
		// 종류 : for, while, do ~while
		
		// for : count, length, size,,,, 
		// while : 무한 루프~특정상황, 상태, 신호, 입력값 등에 따라 종료하는 형식 
		
		//일반 for, foreach
		
		// break 와 continue를 이용해서 제어 가능하다. 
		
		// # 10번 반복하는 for문을 이용하여 : 0123456789 출력하기 
		for (int i = 0 ; i <10; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		// 10번 반복하는 for문을 이용하여 : 01234 출력하여기 
		for (int i = 0 ; i <10; i++) {
			System.out.print(i);
			if ( i==4) break; // 한줄만 있으면 블럭처리 안해도됨. 
		}
		System.out.println();
		
		// 10번반복하는 for 문을 이용하여 :0123456789출력하기
	
		for (int i = 0 ; i <10; i++) {
			if ( i==5) continue;
			System.out.print(i);
		}
		System.out.println();
		
	
	}//end main

}//end class
