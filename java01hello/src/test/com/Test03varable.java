package test.com;

public class Test03varable {
	
	public static void main(String[] args) {
		// 값할당(변수 초기화)과 변수선언 
		System.out.println("varable");
		
		//변수를 만드는 이유 : 변화된 1값을 넣을 그릇이 필요하다. 
		// 변수 선언 : 타입 영문소문자 (명사형); 
		// 특수문자는 언더바 허용 a_name =>비권장 
		// 영문단어의 복수 연결시는 대문자로 구분 , aaBbb
		String msg; // 선언
		msg = " 안녕하세요 "; // 초기화, 값할당, 값대입, 
		System.out.println(msg);
		msg = " 헤이 ";  
		System.out.println(msg);
		
		String msg2 = "yangssem";
		System.out.println(msg2);
		msg2 = "kim";
		System.out.println(msg2);
		
		String msg3, msg4, msg5; 
		msg3 = "aaaa";
		msg4 = "bbbb";
		msg5 = "cccc";
		System.out.println(msg3+msg4+msg5);
	

		
		char  c; 
		c =  'a';
		System.out.println(c);
		c =  'z';
		System.out.println(c);
		c =  65;
		System.out.println(c);
		
		char c2, c3, c4;
		c2 = 'A';
		c3 = 'B';
		c4 = 'c';
		System.out.println(c2+c3+c4);
		
		//3. 숫자-정수(byte, short, int, long) , 실수 (float, double )
		
		byte b =0; //  1byte : 8bit  = 0000 0000 : 0 
		System.out.println(b);
//		1111 1111 : -128  1byte의 범위  -128~0, 127
		short s = 30000;
		System.out.println(s);
		
		int i = 210000000;
		System.out.println(i);
		
		long lng = 9000000000000000L;
		System.out.println(lng);
		
		float avg = 3.14f;
		System.out.println(avg);
		
		double avg2  = 3.14; // 기본 소숫점 명령어
		System.out.println(avg2);
		
		
		///3. 참거짓 표현 :블린타입
		
		boolean bool = false; 
		System.out.println(bool);
		bool = true;
		System.out.println(bool);
		
		//5. 메모리 주소가 없다라는표현 
		//null이라는 값을 할당하기 위해서는 주소를 발생시킬 수 있는 타입에만 가능. 
		//객체, 배열, type에만 할당 가능 
		// 첫글자가 대문자로 된 타입 >> 객체로 볼 수 있다. 
		//타입이나 변수에 []가 사용되면 배열이다. 
		String str = null;
		str = new String("kim");
		
		String[] strs = null;
		strs = new String[3];
		
		int[] sus = null;
		sus = new int [50];
		
		System.out.println("==============");
		// 숫자관련 객체 : 랩퍼클래스를 통해서 다양한 정보 또는 명령을 수행할 수 있다. 
		// ex ) 문자를 숫자로 변경, 최소값 및 최대밧 확인 , 
		System.out.println(Byte.MIN_VALUE + "~" + Byte .MAX_VALUE);
		System.out.println(Short.MIN_VALUE + "~" +Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + "~" +Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE + "~" +Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + "~" +Double.MAX_VALUE);
		System.out.println("==============");
		
	}

}
