package test.com;

public class MemberOuter {
   
   int kor;
   
   public void aaa() {}
   
   public class Inner{
      //모든자원은 static 이 올수없다
      //내부클래스를 만들어 쓰는 이유
      String name;
//      static String email;
      
      public void test() {
         System.out.println(kor);
         aaa();
      }
//      public static void test2() {}
   }

}