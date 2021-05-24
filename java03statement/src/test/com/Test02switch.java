package test.com;

public class Test02switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//분기분 switch case break 
		// 논리 분기(boolean타입결과에 따른)가 아닌 맵핑_ (case by case )
		// key type : int, char, String
		
		char key = 'A';
		switch (key) {
		case 'A':
			System.out.println("A......"+(int)key);
			break;
		case 'B':
			System.out.println("B......"+(int)key);
			break;
			
		case 'C':
			System.out.println("V......"+(int)key);
			break;
			

		default:
			System.out.println("other..."+key +(int)key);
			break;
		}
	
	}// end main

}// end class 
