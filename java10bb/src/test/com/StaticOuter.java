package test.com;

public class StaticOuter {
	
	public static class Inner {
		// static 멤버가 포함되면 내부클래스도static이어야 한다. 
		static String name = "yangssem"; 
		String email = "aaa@aaa.com";
	
		public static void test() {
			System.out.println("statuc test () ,,,");
		}
	
		public void test2() {
			System.out.println("statuc test () ,,,");
		}

			
				
	}

}
