package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class Test03for5 {
		
		public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		
		// 반복문 : 자동 반복적으로 수행하고싶은 로직을 구현할때. 
		// 종류 : for, while, do ~while
		
		// for : count, length, size,,,, 
		// while : 무한 루프~특정상황, 상태, 신호, 입력값 등에 따라 종료하는 형식 
		
		//일반 for, foreach
		
		// break 와 continue를 이용해서 제어 가능하다. 
		
		//자판기 프로그램을 포문으로 음료수3번 뽑을 수 있도록 
		
		for ( int i =1; i<=3; i++) {
			System.out.println("금액을 투입하세요");			
		int  money = Integer.parseInt(br.readLine());
		System.out.println("투입금액 : "+money+"원");
		int balance; 
		//투입금액 관련 소스
		if (money>=1500) {
			System.out.println("선택가능한 음료 : 1번 콜라 500, 2번 쥬스 1000, 3번 식혜1500");
			System.out.println("메뉴를 선택하세요");
		}
			else if  (money >= 1000) {
				System.out.println("선택가능한 음료 : 1번 콜라 500, 2번 쥬스 1000");
				System.out.println("메뉴를 선택하세요");
			}
			else if (money >= 500) {
				System.out.println("선택가능한 음료 : 1번 콜라 500");
				System.out.println("메뉴를 선택하세요");
						}
			else if ( money < 500) {
				System.out.println("금액이 부족합니다.");
			}
		// 메뉴선택 관련 소스	
		int drinkNumber = Integer.parseInt(br.readLine());
		if (drinkNumber ==1) {
			System.out.println("콜라를 선택하셨습니다.");
			balance = money -500;
			System.out.println("잔액 :" + balance);
		} else if (drinkNumber ==2) {
			System.out.println("쥬스를 선택하셨습니다.");
			balance = money -1000;
			System.out.println("잔액 :" + balance);
		}else if(drinkNumber ==3) {
			System.out.println("식혜를 선택하셨습니다.");
			balance = money -1500;
			System.out.println("잔액 :" + balance);
		}		
		}
		
System.out.println("음료 서비스가 종료되었습니다.");		
	
	}//end main
	
	
}//end class
