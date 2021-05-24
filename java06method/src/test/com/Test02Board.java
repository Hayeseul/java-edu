package test.com;

import java.util.Date;

public class Test02Board {
   
   // 글쓰기, 글입력
   void insert(String title, String content, String writer){
      System.out.println("insert(String title, String content, String writer)");
      System.out.println("title : " + title);
      System.out.println("content : " + content);
      System.out.println("writer : " + writer);
   }
   
   void insert(int num, String title, String content, String writer){
      System.out.println("insert(String title, String content, String writer)");
      System.out.println("title : " + title);
      System.out.println("content : " + content);
      System.out.println("writer : " + writer);
   }
   
   void insert(String [] bs){
      System.out.println("insert(String [] bs)");
      System.out.println("title : " + bs[0]);
      System.out.println("content : " + bs[1]);
      System.out.println("writer : " + bs[2]);
      for (String x : bs) {
         System.out.println(x);
      }      
   }
   
   void insert(Test02BoardVO vo){
      System.out.println("insert(Test02BoardVO vo)");
      System.out.println("num : " + vo.num);
      System.out.println("title : " + vo.title);
      System.out.println("content : " + vo.content);
      System.out.println("writer : " + vo.writer);
      System.out.println("wdate : " + vo.wdate);   
   }
   
   void insert3(String ... bs){
      System.out.println("insert3(String ... bs)");
      //System.out.println("title : " + bs[0]);
      //System.out.println("content : " + bs[1]);
      //System.out.println("writer : " + bs[2]);
      for (String x : bs) {
         System.out.println(x);
      }
   }
   
   int insert2(String title, String content, String writer){
      System.out.println("insert2(String title, String content, String writer)");
      System.out.println("title : " + title);
      System.out.println("content : " + content);
      System.out.println("writer : " + writer);
      return 1;
   }
   
   void insert(){
      System.out.println("insert().........");
   }
   
   int insert2(){
      System.out.println("int insert2().........");
      return 1;
   }
   
   int[] insert3(){
      System.out.println("int[] insert3().........");
      return new int[5]; // 0, 0, 0, 0, 0
   }
   
   public Test02BoardVO select() {
      System.out.println("select()....");
      
      Test02BoardVO vo = new Test02BoardVO();
      vo.num = 2000;
      vo.title = "method";
      vo.content = "method...content";
      vo.writer = "method writer";
      vo.wdate = new Date();
      return vo;
   }

   public Test02BoardVO[] selectAll() {
      System.out.println("Test02BoardVO[] selectAll()");
      
      Test02BoardVO[] vos = new Test02BoardVO[2]; // null, null, null      
      Test02BoardVO vo = new Test02BoardVO();
      vo.num = 2000;
      vo.title = "method";
      vo.content = "method...content";
      vo.writer = "method writer";
      vo.wdate = new Date();      
      vos[0] = vo;
      
      //vo = new Test02BoardVO();
      vo.num = 1000;
      vo.title = "method";
      vo.content = "method...content";
      vo.writer = "method writer";
      vo.wdate = new Date();      
      vos[1] = vo;
                     
      return vos;
   }

   public Test02BoardVO[] selectAll(String key, String value) {
      System.out.println("selectAll (Stringkey, String value");
      System.out.println(" key :" + key);
      System.out.println(" value :" + value);
      
      Test02BoardVO[] vos = new Test02BoardVO[2];// null,null

      Test02BoardVO vo = new Test02BoardVO();
      vo.num = 2000;
      vo.title = "method....";
      vo.content = "method...content.";
      vo.writer = "method writer....";
      vo.wdate = new Date();

      vos[0] = vo;

      vo = new Test02BoardVO();
      vo.num = 33333;
      vo.title = "method....33";
      vo.content = "method...content.33";
      vo.writer = "method writer....33";
      vo.wdate = new Date();
      vos[1] = vo;
      return vos;
   }


   
}
