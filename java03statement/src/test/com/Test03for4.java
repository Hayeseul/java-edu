package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class Test03for4 {
		
		public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		
		// 반복문 : 자동 반복적으로 수행하고싶은 로직을 구현할때. 
		// 종류 : for, while, do ~while
		
		// for : count, length, size,,,, 
		// while : 무한 루프~특정상황, 상태, 신호, 입력값 등에 따라 종료하는 형식 
		
		//일반 for, foreach
		
		// break 와 continue를 이용해서 제어 가능하다. 
		
		//Test02switch3.java의 내용을 참고하여
		//3명의 학생을 성적처리하는 프로그램으로 업그레이드 하세요. 
		// 반번호 (num), 학생명(name)  변수 추가
		// a 학생의 국영수 성적을 입력하세요=> 총점 => 평균 => 등급 
		

				String studentInfo = "";
				for ( int num=1; num <=3; num++) {
					String name =  "kim" +(num);
					System.out.println(num + "번 학생의 이름을 입력하세요 :" +name);
					
					int kor = 80+num ;
					System.out.println(num + "번" + name + "의 국어점수를 입력하시오 :" + kor);
					
					int math = 70+num ;
					System.out.println(num + "번" + name + "의 수학점수를 입력하시오 :" + math);
					
					int eng=90+num;
					System.out.println(num + "번" + name + "의 영어점수를 입력하시오 :" + eng);
					
					System.out.println( num + "번" + name + "의 국어점수는 :" + kor +
				                                  "수학점수는 :" + math + "의 영어점수는 :" + eng) ;	
				
					int total = kor + math +eng;
					System.out.println("3과목의 총점은 : " + total+"점");
					double average =  total/3.0;
					System.out.println("3과목의 평균은" + average+"점");		
					String grade = "";
					
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
				}
		
		
	
	}//end main

}//end class
