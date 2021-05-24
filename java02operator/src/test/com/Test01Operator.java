package test.com;

public class Test01Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연산자 ~~
		
		System.out.println("Operator");
		System.out.println("=======================");
		
		//#1.산술연산 ( +,-,*,/,%) 
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3); //정수끼리는 몫만나옴
		System.out.println(10 / 3.0);// 실수가 있을때는 소숫점 나옴.
		System.out.println(10 % 3);//나머지
		System.out.println("=======================");
		
		
		//#2. 대입, 할당연산 ( +=, -=, *=, /=, %=, &=, |=, ^=, >>) 
		// => 두가지 이상의연산자가 들어가서 순서가 중요함. 
		int x = 10;
		x = x+ 11;
		System.out.println(x);
		x += 11; // x에 11을 먼저 더하고 출력값을 다시 x로 정의하여... 
		System.out.println(x);
		x -= 11;
		System.out.println(x);
		x *=11;
		System.out.println(x);
		x /=11; 
		System.out.println(x);
		x%=11;
		System.out.println(x);
		System.out.println("=======================");
		
		//#3. 비교연산 ==, !=(다르다), >=, =<. >, < : 결과는 반드시 true, flase 
		System.out.println(5==5);
		System.out.println(5!=5);
		System.out.println(5>=5);
		System.out.println(5<=5);
		System.out.println(5>5);
		System.out.println(5<5);
		
		//string 문자열 비교 
		System.out.println("======string 비교 ======");
		String name = "Ha";
		System.out.println(name.equals("Ha"));
		System.out.println(!name.equals("Ha"));
		System.out.println(name.equals("HA")); // 대 소문자 비교 가능 
		System.out.println(name.equalsIgnoreCase("HA")); // 대 소문자 비교 없도록 IgnoreCase 추가  
		System.out.println(name.compareTo("Ha"));// 해시코드의 차이가 '0' 인 경우 true, 다른경우 false 
		System.out.println(name.compareTo("Ha")==0);// 해시코드의 차이가 '0' 인 경우 true, 다른경우 false 
		System.out.println(name.compareTo("Ha")!=0);// 해시코드의 차이가 '0' 인 경우 true, 다른경우 false 
		
	
		
		System.out.println("=======================");
		//#4.  .(참조연산자 : 촤측것안에 우측것이 있다. ), ,(콤마: 연결연산 ), new (주소생성 연산자), !변수 ( 부정연산 !true)
		//      1씩증가 또는 감소 연산 (++, --)
		// => 단독임으로 순서가 중요하지않음. 
		int su = 10;
		System.out.println(su);
		++su;  // su+1;
		System.out.println(su);
		--su;  // su-=1;
		System.out.println(su);
	
		System.out.println("=======================");
	
		int a = 10;
		System.out.println(a);
		int b = ++a;
		int c = a++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		

		//#5. 비트연산 정수를 비트단위로 비교  :&(and), |(or), ^(nand) , ~
		// ex) 8&e = 1000 &0011 =>1000 and 0011 => 0000
		System.out.println(" 8 + 3 = " + ( 8&3 ));
		System.out.println(" 8 | 3 = " + ( 8|3 ));
		System.out.println(" 8 ^ 3 = " + ( 8^3 )); 
		System.out.println(" ~3 = " + ( ~3 ));// bit를 반전시킴.. 알고만있기 설명하면 200시간걸림 
		
		System.out.println("=======================");
		
		
		//#6. 논리연산 ( &, |, &&, || ) 
		
		System.out.println(true & true);
		 System.out.println(true & false);
		 System.out.println(true |true);
		 System.out.println(false | false);
		
		 System.out.println(true && true);// 앞쪽에 있는 것만 보고 판단. 
		 System.out.println(true && false);
		 System.out.println(false && true);
		 System.out.println(false && false);// 앞에 false가 있으면결과값이반드시 false 
		 
		 int su2 = 111; 
		 System.out.println(su2<2 && su2<33);
		 
		 System.out.println(true ||true);
		 System.out.println(false ||false);
		 System.out.println(su2<2 ||  su2<33);
		 
		 
		 //#6. 쉬프트연산 (비트이동연산 ) 비트의 좌측이동 <<<. 우측이동>>
		 // 0000 0001<<1 : 2 << 1:4 배수
		 System.out.println(1<<1);
		 System.out.println(2<<1);
		 
		 // 0001 0000 >>1 : 8 (1/2배수) 
		 System.out.println(16>>1);
		 System.out.println(8>>1);
		 
		 //1000 000 >>>1 : 양수 
		 System.out.println(-128>>1);
		 
		 
		System.out.println("=======================");

		 
		//#7. 조건연산(삼항연산) 결과가 boolead ? 참값: 거짓값 
		System.out.println(true ? "Ha" : "lee");
		String result = true ? "kim":"lee";
		
		
		String txt = "yangssem";
		System.out.println(txt.equals("yangssem")? 100 : 90);
		System.out.println(!txt.equals("yangssem")? 100 : 90);
		
		int  result2 = txt.equals("yangssem")? 100:90;
		System.out.println(false ? "Ha" : "lee");
		
		int score = 89;
		System.out.println(score >=90 ? "A": score >=80 ?"B" : score >=70 ?"C" : "D");
		
		System.out.println("=======================");
		
		//#8. 캐스팅 연산 (type) _ up 캐스팅, down캐스팅
		System.out.println(128);
		byte bb = (byte)128; 
		System.out.println(bb);
		
		int i = (int)220000000L;
		System.out.println(i );
		
		//#9. ...열거연산 (,,,,하나로 표현연산)
		 
	}
	

}// end class 
