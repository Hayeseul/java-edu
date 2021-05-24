package test.com;

public class Test01array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 : array
		
		System.out.println("array");
		
		
		// 배열안에 데이터가 여러개 들어가면 1차원 배열
		// 배열안에 1차원 배열이 어러개 들어가면 2차원 배열. 
		// 배열안에 2차원 배열이 여러개 ㄷ르어가면 3차원 배열. 
		//배열안에 배열이 들어가면 다차원배열이다. 
	
		System.out.println();
		boolean[][] boolss = new boolean[4][];
		boolss[0] = new boolean[1];
		boolss[1] = new boolean[2];
		boolss[2] = new boolean[3];
		boolss[3] = new boolean[4];
		for ( boolean[] bs : boolss) {
			for ( boolean b: bs) {
				System.out.printf(b+ "  ");
			}
			System.out.println();
		}
		System.out.println("============================================");
		
		
		char [] cs = new char[3];
		cs[0] = 'k';
		cs[1] = 'i';
		cs[2] = 'm';
		
		//String name  = "kim";
		//String name = new String(cs);
		String name = new String(cs);
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		
		
		for (char c: cs ) {
			System.out.println(c+ " :"+ (int)c);
			
			System.out.println( "=====주의=====");
			System.out.println((int) ' ');
			System.out.println((int)'0');
			
		}
		System.out.println("============================================");
		//char [][] suss = new char [3][8];
		// int[][] suss = new int[2][]; //null, null,
		//int[][] suss = new int[2][3]; // {0,0,0,},{0,0,0}
		
		//String namess = new String[2][];// null,nulll
		//String namess = new String[2][3];
		
		
		//char [][] css = new char [2][]; // null, null
		char[][] css = new char[2][5]; // arr, arr
		System.out.println("css[0][0] : "+ css[0][0]);
		System.out.println("css[0][0] : "+ css[0][4]);
		css[0] = new char[] {'a' , 'b', 'c', 'd', 'e'}; 
		css[1] = new char[] {'f', 'h', 'i', 'j', 'k', 'l'};
		for ( char[] x :css) {
			for (char c:x) {
				System.out.print(c);
			}
			System.out.println();
		}
			
	}// end main

}// end class
