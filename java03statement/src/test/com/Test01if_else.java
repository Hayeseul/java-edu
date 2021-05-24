package test.com;

public class Test01if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//소프트웨어의 핵심 : 반복과 분기제어 
		
		//#1. 분기문 : if , else if, else, switch 
		
		int su = 35%10;
		if(su ==5) { 
			System.out.println("aaa");
			System.out.println("aaa");
			System.out.println("aaa");
		
		}
		if (su!=5) {
			System.out.println("bbbb");
			System.out.println("bbbb");
			System.out.println("bbbb");
		}
		
		if(su ==5) { 
			System.out.println("yyy");
			System.out.println("yyy");
			System.out.println("yyy");
		}
		else  {
			System.out.println("nnn");
			System.out.println("nnn");
			System.out.println("nnn");
		}
		
		int score = 30;
		if ( score >=90) {
			System.out.println("A");
		}
		else if ( score >=80) {
			System.out.println("B");
		}
	
		else if ( score >=70) {
			System.out.println("C");
		}
		
		else if ( score >=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
			
		}
		
		int menu =2; 
		if ( menu ==1 ) {
			System.out.println("콜라를 선택하셨군요");
		}
			else if  (menu == 2) {
				System.out.println("쥬스를 선택하셨군요");
			}
			else if  (menu == 3) {
				System.out.println("식혜를 선택하셨군요");
			}
			else  {
				System.out.println("잘못 선택하셨군요");
			}
	
		
		String money = "1000";
		if (Integer.parseInt(money)>=2000) {
			System.out.println("선택가능한 음료 : 콜라 500, 쥬스 1000, 식혜1500");
		} else if (Integer.parseInt(money)>=1000) {
			System.out.println("선택가능한 음료 : 콜라 500, 쥬스 1000");
		} else if (Integer.parseInt(money)>=500) {
			System.out.println("선택가능한 음료 : 콜라 500");
		} else if (Integer.parseInt(money) < 500) {
			System.out.println("금액이 부족하네요");
		}

	}

}
