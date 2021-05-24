package test.com;

public class Test02switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//분기분 switch case break 
		// 논리 분기(boolean타입결과에 따른)가 아닌 맵핑_ (case by case )
		// key type : int, char, String
		


		String name = "yangssem";
		switch (name) {
		case "yangssem":
			System.out.println("Hello");
			break;
		case "kim":
			System.out.println("Good");
			break;
		case "lee":
			System.out.println("vice");
			break;
			
			default:
				System.out.println("bye");
				break ;
				
	
			
		}

	}// end main

}// end class 
