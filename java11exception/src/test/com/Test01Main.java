package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exception...");
		
//		testNullPointer();
		
//		testArrayIndex();
//byZero();
		
	//numberFormat();
		//testReadLine();
		multiExceptin();
	

	}//end main

	private static void multiExceptin() {
		// 에러발생 유무에 관계없이 무조건 출력하는 함수 
		try {
			try {				
			} catch (Exception e) {
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Exception....");
		} catch (NullPointerException e) {
			System.out.println("Exception....");
		} catch (Exception e) {
			System.out.println("Exception....");
		}finally {
			//dimiss, diconnect, close,,,,
			
		}
		
	}

	private static void testReadLine() {
		InputStream is = null;
		is = System.in;
		
		InputStreamReader isr = null;
		isr = new InputStreamReader(null);
		
		BufferedReader br = null; 
		br = new BufferedReader(isr);
		
		try {
			br.readLine();
			br.close();
			isr.close();
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (br != null) {
				
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
			if (isr != null) {
				
			try {
				isr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
			if (is!=null) {
				
			try {
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		}
	}

	private static void numberFormat() {
		try {
			System.out.println("1......");
			System.out.println(Integer.parseInt("zero"));
			System.out.println("2......");
		} catch (NumberFormatException e) {
			System.out.println("3......");
			e.printStackTrace();
		}
		
	}

	private static void byZero()   {
		try {
			System.out.println(10/0);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}

	//컴파일 단계의 오류 
	private static void testArrayIndex() {
		int[]sus = new int[10];
		
		try {
			System.out.println("sus[10]" + sus[10]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("end main....");
		
		
	}

	private static void testNullPointer() {
		//실행단계의 오류 
		String x = null; 
		x =	"yangssem";
		
		try {			
			System.out.println("try..."+x.length());
		} catch (NullPointerException e) {
			System.out.println("catch...");
			x ="";
			System.out.println("catch..." + x.length());
		}
		
		
		System.out.println("end main....");
		
	}

}//end class
