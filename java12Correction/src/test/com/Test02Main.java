package test.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Test02Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Test02BoardDAO dao = new Test02BoardDAOimpl();
      
      Test02BoardVO vo = new Test02BoardVO();
      vo.setNum(10);
      vo.setTitle("title");
      vo.setContent("content");
      vo.setWriter("writer");
      vo.setWdate(new Date());
      int result = dao.insert(vo);
      
      
      ArrayList<Test02BoardVO> list = dao.selectAll();
      System.out.println(list);
      System.out.println(list.size());
    
	return;
   

      
   }

}