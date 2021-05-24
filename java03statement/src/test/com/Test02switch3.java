package test.com;

public class Test02switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//분기분 switch case break 
		// 논리 분기(boolean타입결과에 따른)가 아닌 맵핑_ (case by case )
		// key type : int, char, String
		
		//성적처리 학점부여 프로그램 
		//국영수점수의 임의의 값을 할당 
		//총점, 평균, 등급을 구하는 프로그램을 작성해 보세요. 
		//스위치문을 이용할 것 
		

	
		
		int kor =80;
		int math = 90; 
		int eng =100;
		int total = kor + math +eng;
		double average =  total/3.0;
		String grade ;
		
		System.out.println("3과목의 총점은 : " + total+"점");
		System.out.println("3과목의 평균은" + average+"점");		
		switch ( (int)average/10) {
		case  9 :
				System.out.println(" 등급은 : A");
		break;
		case 8 :
			System.out.println(" 등급은 : B");
			break;
		case 7:
			System.out.println(" 등급은 : C");
			break;
		case 6 :
			System.out.println(" 등급은 : D");
			break;		
		default :
			System.out.println("등급은 : F");
			break;
		}
		
		
	
		
			
			}// end main

}// end class 
