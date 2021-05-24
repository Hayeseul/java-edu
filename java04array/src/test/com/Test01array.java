package test.com;

public class Test01array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 : array
		
		System.out.println("array");
		
		//변수 >> 변수가 여러개>> 이름이중요하지않고 몇번째 만든 변수인지. 
		//동일타입의 ㄷ이터들을 하나의 변수에 닮을수 있도록 생성가능. 
		
		//1. 배열생성
		int num1 = 10;
		int num2 = 100;
		int num3 = 1000;
		//어러개 연산기호 [] : 배열표기 특수문자 
		int[] nums;
		nums = new int [10]; // 10개의 정수를 담을 수 있도록 생성
		//0 0 0 0  0 0 0 0 0 0
		
		// 배열의 길이 
		System.out.println("nums.length:" + nums.length);
		
		// 2. 배열값 변경
		nums[0] = 10;
		nums[1] = 100;
		nums[2] = 1000;
		
		//3. 배열값 출력
		System.out.println("nums[0]:" + nums[0]);
		System.out.println("nums[1]:" + nums[1]);
		System.out.println("nums[2]:" + nums[2]);
		//......
		System.out.println("nums[9]:" + nums[9]);
 		
		int[] sus = new int [3]; // 0  0 0
		// 배열의 길이 
		System.out.println("nums.length:" + sus.length);
System.out.println("===================================");		
		double[] ds=  new double [30]; // 0.0 0.0 0.0
		// 배열의 길이 
		System.out.println("ds.length:" + ds.length);
		//System.out.println(ds[0]);
		ds[0] = 3.14;
		ds[29] = 99.99;
		System.out.println(ds[0]);
		System.out.println(ds[29]);
		
		for (int i = 0; i<ds.length; i++) {
			System.out.println(ds[i]);
		}
		
		System.out.println("===================================");		
		String name1 =  "kim1";
		String name2 =  "kim2";
		String name3 =  "kim3";
		
		String[] names = new String[3]; //null null null 
		// 배열의 길이 
		System.out.println("names.length:" + names.length);
		
		for (int i =0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("===================================");		
		
		boolean[] bools = new boolean[5];
		System.out.println("bools.length: " + bools.length);
		bools[3] = true;
		
		for ( int i = 0; i<bools.length; i++) {
			System.out.println(bools[i]);
		}
		
		
		
	}// end main

}// end class
