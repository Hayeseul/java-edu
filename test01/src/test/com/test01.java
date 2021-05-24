package test.com;

public class test01 {
	
	public static void main(String[] args) {
		
		System.out.println("Array Test");
		
		System.out.println("배열 생성");
		int num1 =10;
		int num2 = 100;
		int num3 = 100;
		
		int[] num_arr;
		num_arr = new int [10];
		
		System.out.println("배열의 길이");
		System.out.println("num_arr.length : " +num_arr.length);
		
		System.out.println("배열의 변경");
		num_arr[0] = 10;
		num_arr[1] = 100;
		num_arr[2] = 1000;
		
		System.out.println("배열값의 출력");
		System.out.println("num_arr[0] : " + num_arr[0]);
		System.out.println("num_arr[1] : " + num_arr[1]);
		System.out.println("num_arr[2] : " + num_arr[2]);
		System.out.println("num_arr[9] : " + num_arr[9]);
		
		System.out.println("====================");
		int[] sus = new int[3];
		System.out.println("배열의 길이");
		double[] ds = new double[30];
		System.out.println("ds.length : "+ds.length);
		ds[0] = 3.14;
		ds[29] =99.99; 
		System.out.println("ds[0] : " + ds[0]);
		System.out.println("ds[29] : " + ds[29]);
		
		for (int i =0;i<ds.length;i++)
		{
			System.out.println(ds[i]);
		}
		
		System.out.println("====================");
		String name1 = "kim1";
		String name2 = "kim2";
		String name3 = "kim3";
		
		String[] name_arr = new String[3];
		System.out.println("name_arr.length : " + name_arr.length);
		
		for (int i=0; i<name_arr.length;i++) {
			System.out.println(name_arr[i]);
		}
		
		System.out.println("====================");
		boolean[] bools = new boolean[5];
		System.out.println("bools.length : " + bools.length);
		bools[3] = true;
		
		for (int i =0; i<bools.length; i++) {
			System.out.println(bools[i]);
		}

		

	}
	
	

	
}
