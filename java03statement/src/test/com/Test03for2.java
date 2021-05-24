package test.com;

public class Test03for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 반복문 : 자동 반복적으로 수행하고싶은 로직을 구현할때. 
		// 종류 : for, while, do ~while
		
		// for : count, length, size,,,, 
		// while : 무한 루프~특정상황, 상태, 신호, 입력값 등에 따라 종료하는 형식 
		
		//일반 for, foreach
		
		// break 와 continue를 이용해서 제어 가능하다. 
		//  \tab : tab , \n :enter, \" : 문자로보기 		
		System.out.println("aaa\"bbb\nccc");
		//#multi for , 다중포문
		//ex) 
		//0123456789
		//0123456789
		//0123456789
		
		for ( int x = 0; x<3; x++) {
			for (int i = 0; i<10; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("=============================");

		// 다중포문을 이용해서 구구단 출력하기 
		for (int i = 2; i<=9; i++) {
			for (int y =1; y <=9; y++) {
				System.out.print( i +"*"+ y + "=" + i *y +", ");
		}
		System.out.println();
		}
		
		//printf 
		System.out.printf("%d\n", 100);
		System.out.printf("%d\n", 1000);
		System.out.printf("%f\n", 3.141592);// %f 소문자 
		System.out.printf("%.2f\n", 3.141592);//%.2f: 소숫점 둘ㅉㅐ자리
		System.out.printf("%s\n", "Ha");
	
		
	
	}//end main

}//end class
