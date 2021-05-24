package test.com;

import java.util.Date;

public class Test02Main {

   public static void main(String[] args) {
      System.out.println("main");
      
      Test02Board b = new Test02Board();
      
      b.insert("java", "객체와 메소드", "홍길동");
      System.out.println("================");
      b.insert(new String[] {"java2", "객체와 메소드2", "홍길동2"});
      System.out.println("================");
      b.insert3("java3", "객체와 메소드3", "홍길동3", 100+" ");
      System.out.println("================");
      
      Test02BoardVO vo = new Test02BoardVO();
      vo.num = 100;
      vo.title = "java";
      vo.content = "객체와 메소드";
      vo.writer = "홍길동";
      vo.wdate = new Date();
      b.insert(vo);
      System.out.println("================");
      
      int x = b.insert2();
      System.out.println("x : "+ x );
      System.out.println("================");

      int[] sus = b.insert3(); // int[] sus = new int[5];
      for (int su : sus) {
         System.out.println(su);
      }   
      System.out.println("================");
      
      Test02BoardVO vo2 = b.select();   // null
      System.out.println(vo2.num);
      System.out.println(vo2.title);
      System.out.println(vo2.content);
      System.out.println(vo2.writer);
      System.out.println(vo2.wdate);
      System.out.println("================");      
      
      Test02BoardVO[] vos = b.selectAll();

      for (int i = 0; i < vos.length; i++) {
         System.out.print(vos[i].num +" ");
         System.out.print(vos[i].title +" ");
         System.out.print(vos[i].content +" ");
         System.out.print(vos[i].writer +" ");
         System.out.println(vos[i].wdate);
                     
      }
      
      System.out.println("================");      
      Test02BoardVO[] vos2 = b.selectAll("java","method ");
      for (int i = 0; i < vos2.length; i++) {
      System.out.print(vos2[0].num +" ");
      System.out.print(vos2[0].title +" ");
      System.out.print(vos2[i].content +" ");
      System.out.print(vos2[i].writer +" ");
      System.out.println(vos2[i].wdate);
      }
               
   

      
   }// end main
 
}// end class
