package test.com;

public class Test04Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test04Main");
		
		//회원가입을 위한 회원정보를 담는객체 
		//회원번호 num, 회원명name, 아이디id, 비번password, 전화번호phone
		//Test04Member.java
		
		Test04Member gr = new Test04Member();
		System.out.println(gr.num);
		System.out.println(gr.name);
		System.out.println(gr.id);
		System.out.println(gr.password);
		System.out.println(gr.phone);
		
		
		System.out.println("=====================================");
		//board = new Test03Student( "1", "김철수", "88", "93", "99", "280","93.0", "9");
		gr.num = 2;
		gr.name = "하예슬";
		gr.id = "hyeseul9074";
		gr.password = "yeseul9074";
		gr.phone = "010-6343-9074";
		System.out.println(gr.num);
		System.out.println(gr.name);
		System.out.println(gr.id);
		System.out.println(gr.password);
		System.out.println(gr.phone);
		
		System.out.println("=====================================");
		gr = new Test04Member( 1, "하예슬", "yeseul9074", "hyeseul9074", "010-6343-9074");
		System.out.println(gr.num);
		System.out.println(gr.name);
		System.out.println(gr.id);
		System.out.println(gr.password);
		System.out.println(gr.phone);	
		
		System.out.println("=====================================");
		gr = new Test04Member("031");
		System.out.println(gr.num);
		System.out.println(gr.name);
		System.out.println(gr.id);
		System.out.println(gr.password);
		System.out.println(gr.phone);
		
		
		

	}

}
