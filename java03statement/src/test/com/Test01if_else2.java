package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01if_else2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//음료수 자판기 프로그램을 만들어보자 
		//투입금액 (money), 음료수 (콜라, 쥬스, 식혜)
		//잔액 (balance) 
		//음료수 선택(drinkNumber) ) 1번이면 콜라 , 2번이면쥬스, 3번이면 식혜
		//1. 금액을 투입하세요. 
		//2. 메뉴를 선택하세요. 

		System.out.println("금액을 투입하세요.");
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
			else if ( money >500) {
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
		
		/*
		//교수님. ver
		System.out.println("금액을 투입하세요.");
		int money1 = Integer.parseInt(br.readLine()); 
		System.out.println("투입금액 : "+money1+"원");
		// 자주 쓰일 소스임으로 기억해두기 
		
		
		int balance1 = 0;
		String drinkNumber1 = "";
		if (money1 >=1500) {
			System.out.println(" 음료수 (1. 콜라 500, 2.쥬스1000, 3.식혜1500)");
			drinkNumber1 = br.readLine(); //1,2,3
					}
		else if ( money1 >= 1000) {
			System.out.println(" 음료수 (1. 콜라 500, 2.쥬스1000)");
			drinkNumber1 = br.readLine(); //1,2
			}
		else if (money1 >=500) {
		System.out.println(" 음료수 (1. 콜라 500)");
		drinkNumber1 = br.readLine(); //1
		}
		else if (money1 >500) {
		System.out.println(" 금액이 부족합니다. ");
		}
		
	
		if (drinkNumber1.equals("3")) {
			balance1 = money1-1500;
			System.out.println("3. 식혜를 선택하셨습니다. ");
		}
		else if (drinkNumber1.equals("2")) {
			balance1 = money1-1000;
			System.out.println("2.쥬스를 선택하셨습니다. ");
		}	
		else if (drinkNumber1.equals("3")) {
			balance1 = money1-500;
			System.out.println("3. 콜라를 선택하셨습니다. ");
			}
		else {
			balance1 = money1 -0;
			System.out.println(" 선택을 안하셨습니다. ");
		}
		System.out.println("잔액 : "+balance1+"원");
		*/
			}

	}


