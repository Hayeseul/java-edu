package test.com;

public class Test01person {
	
	// 접근제한자  :public => 전부접근
	//default 명시생략 : 동일 패키지 
	//producted:상속관계
	//private : 해당클래스 내부 

	//1. 속성 
			String name; // null ( 어떠한 값으로도 초기화 되지 않은 것 => 초기화된 데이터는 내가 사용할 예정인 것 )
			// " " 빈 값은 이미 사용한 것, null은 사용하겠다고 예고하는 것 
			int age; // =0
			double weight ; // = 0.0
		

	public Test01person() { // 오버로딩 ( 생성자를 정의할 떄 매개변수의 순서, 타입, 갯수을 다르게 신경써야된다. )
		// 생성자를 만드는 (정의하는, 생성하는) 목적 : 객체를 생성할 때 속성값을 셋팅하기위해.  
		
		System.out.println("===========================================================");
		String name; // null ( 어떠한 값으로도 초기화 되지 않은 것 => 초기화된 데이터는 내가 사용할 예정인 것 )
		// " " 빈 값은 이미 사용한 것, null은 사용하겠다고 예고하는 것 
		int age; // =0
		double weight ; // = 0.0
	
		System.out.println("Test01person()....");
		
		name= "yangssem";
		age =33;
		weight = 82.5;
	}
	
	
		public Test01person(String name ) {
			System.out.println("Test01person(String name)...." + name);
			
			this.name= name;
			this.age =33;
			this.weight = 82.5;
		}
		
		public Test01person( char[] name ) {
			
			System.out.println("Test01person( char[] name)...." + name);
			System.out.println("Test01person( char[] name)...." + new String( name));
			
			this.name= new String( name);
			this.age =33;
			this.weight = 82.5;	
		}
		
		
			public Test01person(int i) {
				System.out.println("Test01person(int[] name)...." + i);
			
		}

		public Test01person(int i, int j) {
			System.out.println("Test01person(int[] name)...." + i +"," +j);
		}


		public Test01person(String[] strings) {
			System.out.println("Test01person(String[] name)...." );
			for  ( int i = 0; i <3; i++) {
				System.out.println(strings[i]);
			}
		}
		

		public Test01person(int[] is) {
			System.out.println("Test01person(int[] name)....");
			for ( int j =0; j<3; j++) {
				System.out.println(is[j]);
			}
			
		}


		public Test01person(String name, int age, double weight) {
			System.out.println("Test01person(String name, int age, double weight");
			this.name = name;
			this.age =age;
			this.weight = weight;
		}
		
		



}// end class
