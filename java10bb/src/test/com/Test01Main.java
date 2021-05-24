package test.com;

import test.com.MemberOuter.Inner;

public class Test01Main {

   public static void main(String[] args) {
      System.out.println("inner class");
      
      //1.default inner>> memberInner clsss
      MemberOuter outer = new MemberOuter();
      Inner in = outer.new Inner();
      in.test();
      
      //2.static inner
      System.out.println(test.com.StaticOuter.Inner.name);
      test.com.StaticOuter.Inner.test();
      StaticOuter outer2 = new StaticOuter();
      test.com.StaticOuter.Inner in2 = new test.com.StaticOuter.Inner();
      System.out.println(in2.email);
      in2.test2();
      
      //3. local inner
      class Inner {
    	int age;
    	public int sum() {
    		return age +100;
    		
    	}
      }
      Inner in3 = new Inner(); //객체생성 리터럴
      System.out.println(in3.sum());
      
   // 4.무명 내부클래스Anonymous inner
      TestAbs ab = new TestAbs() { //리터럴
         int x;
         public void aaa() {
            System.out.println("aaa()...");
         }
         public void bbb() {
            System.out.println("bbb()...");
         }
      };
      // **익명 내부클래스의 활용 
      int x = 100;
      
      test1(x);
      
      
      
   }//end main

   public static void test2(TestAbs ab) {
	      System.out.println("test2()..."+ab);
	      ab.bbb ();
	   }
   
   public static void test1(int x) {
	   System.out.println("test1()...." + x);
   }
   
}//end class