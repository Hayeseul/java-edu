package test.com;

import java.util.ArrayList;
import java.util.Date;

public class Test02BoardDAOimpl implements Test02BoardDAO {

   @Override
   public int insert(Test02BoardVO vo) {
      System.out.println("insert()");
      System.out.println(vo);
      return 0;
   }

   @Override
   public ArrayList<Test02BoardVO> selectAll() {
      ArrayList<Test02BoardVO> list = new ArrayList<Test02BoardVO>();
      Test02BoardVO vo = new Test02BoardVO();
      vo.setNum(10);
      vo.setTitle("title111");
      vo.setContent("content");
      vo.setWriter("writer");
      vo.setWdate(new Date());
      list.add(vo);
      
      vo = new Test02BoardVO();
      vo.setNum(10);
      vo.setTitle("title22222");
      vo.setContent("content");
      vo.setWriter("writer");
      vo.setWdate(new Date());
      list.add(vo);
      
      vo = new Test02BoardVO();
      vo.setNum(10);
      vo.setTitle("title333");
      vo.setContent("content");
      vo.setWriter("writer");
      vo.setWdate(new Date());
      list.add(vo);
      
      vo = new Test02BoardVO();
      vo.setNum(10);
      vo.setTitle("title444");
      vo.setContent("content");
      vo.setWriter("writer");
      vo.setWdate(new Date());
      list.add(vo);
      
      
      return list;
   }

}
