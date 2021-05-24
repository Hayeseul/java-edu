package test.com;

public class Test04Member {

	
	//속성 : 전역변수, 멤버 필드.. 
	int num;
	String name;
	String id;
	String password;
	String phone;
	
	

	public Test04Member() { // 로컬에 변수가 없음. 
		System.out.println("Test04Member()");
		num = 1;
		name = "하예슬";
		id = "yeseul9074";
		password = "hyeseul9074";
		phone = "010-6343-9074";

	}

	public Test04Member(int num,String name,String id,String password,String phone) {
			//System.out.println("Test04Member(int num,String name,String id,String password,String phone)");
			this.num = num; // null
			this.name =name;// null
			this.id = id;// null
			this.password= password;// null
			this.phone= phone;// null
			
	}
			
	public Test04Member(String phone) {
		this(); // 내 클래스 내부의 생성자를 의미. 
		System.out.println("Test04Member(String phone)");
		
		this.phone = phone;
		
	}
}
