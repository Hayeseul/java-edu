package test.com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test04while {

   public static void main(String[] args) throws IOException{
      // while : 무한루프 기반,상황,상태,입력값에 의한 종료처리...
      System.out.println("start main...");
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      
      boolean bool = true;
      
      while (bool) {
         System.out.println("while.....");
         
         bool = !bool;
      }
      System.out.println("===============");
      
      int count = 0;
      while(count<3) {
         System.out.println(count);
         count++;
      }
      
      
      System.out.println("===============");
      boolean con = true;
      while(con) {
         System.out.println("Hello,종료시x입력:");
         String txt = br.readLine();
         if(txt.equals("x")) break;
      }
      
      
      System.out.println("end main...");

   }//end main

}//end class