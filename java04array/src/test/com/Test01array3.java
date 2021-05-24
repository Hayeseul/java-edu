package test.com;

public class Test01array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 : array
		
		System.out.println("array");
		
		
		// 배열안에 데이터가 여러개 들어가면 1차원 배열
		// 배열안에 1차원 배열이 어러개 들어가면 2차원 배열. 
		// 배열안에 2차원 배열이 여러개 ㄷ르어가면 3차원 배열. 
		//배열안에 배열이 들어가면 다차원배열이다. 
		
		int [] sus1 = new int [3];
		int [] sus2= new int [4];
		int [] sus3 = new int [30];

		
		int[][] suss = new int [3][];//null null null 
		suss[0]  = new int [] {11,22,33,44,55,66};//suss[0][0
		
		
		suss[1]  = sus1;
		suss[2]  = new int[30];
		
		System.out.println("suss.length:" +suss.length);
		System.out.println("suss[0].length:" +suss[0].length);
		System.out.println("suss[1].length:" +suss[1].length);
		System.out.println("suss[2].length:" +suss[2].length);
		
		System.out.println(suss[0][0]);
		System.out.println(suss[1][0]);
		
		for (int x =0; x<suss.length; x++) {
			for ( int i =0; i<suss[0].length; i++) {
				System.out.print( suss[x][i]+" " );
			}	
		}
		
		
		System.out.println("=================================");
		
		for (int []x :suss ) {
			for (int[] is : suss ) {
				String item = null;
				System.out.println(item + " ");
				
			}
		}

		
		System.out.println("=================================");
		
		//2차원 배열에 아래와같이 데이터를 넣으세요. 
		// 홍길동, 김길동, 최길동 
		//양성호, 김성호, 한성호
		// 박광수, 강광수, 한광수, 이광수 광수생각 
		
		
		
		String [] names0 = new String[] {"홍길동", "김길동", "최길동"};
		String [] names1 = new String[] {"양성홍", "김성호", "한성호"};
		String [] names2 = new String[] {"박광수", "강광수", "한광수", "이광수",  "광수생각"};
		
		//방법1.String[][] namess = new String[][] {names0, names1, names2};  
		//방법2. String[][] namess = new String[][] {{"홍길동", "김길동", "최길동"}, {"양성홍", "김성호", "한성호"}, {"박광수", "강광수", "한광수", "이광수",  "광수생각"}};
		/*방법3.*/String[][] namess = new String[3][];
		namess[0] = names0;
		namess[1] = names1;
		namess[2] = names2;
		
		for (int x =0; x<namess.length; x++) {
			for (int i =0; i<namess[x].length; i++) {
				System.out.println(namess[x][i] + " ");
			}
			System.out.println();
			}
	
		
		
		System.out.println("=================================");

		
		
		
		
	}// end main

}// end class
