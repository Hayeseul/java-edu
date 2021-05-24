package test.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TestDAOimpl implements TestDAO {
	
	 private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	   private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	   private final String USER_NAME = "java";
	   private final String PASSWORD = "hi123456";

	   private Connection conn;
	   private PreparedStatement pstmt;
	   private ResultSet rs;

	   public TestDAOimpl() {
	      System.out.println("Test01DAOimpl()...");
	      try {
	         Class.forName(DRIVER_NAME);
	         System.out.println("find successed");
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }
	   }


   @Override
   public int insert(TestVO vo) {
      System.out.println("insert()...");
      System.out.println(vo);

      int flag = 0;

      flag = 1;

      return flag;
   }

   @Override
   public TestVO selectOne(TestVO vo) {
      System.out.println("selectOne()...");
      System.out.println(vo);

      TestVO vo2 = new TestVO();
      vo2.setNum(11);
      vo2.setName("kim11");
      vo2.setAge(66);
      return vo2;
   }

   @Override
   public List<TestVO> selectAll() {
      System.out.println("selectAll()...");

      List<TestVO> list = new ArrayList<TestVO>();

      for (int i = 0; i < 4; i++) {

         TestVO vo2 = new TestVO();
         vo2.setNum(11 + i);
         vo2.setName("kim11" + i);
         vo2.setAge(66 + i);

         list.add(vo2);

      }

      return list;
   }

   @Override
   public int update(TestVO vo) {
      System.out.println("update()...");
      System.out.println(vo);

      int flag = 0;

     flag = 1;

      return flag;
   }

   @Override
   public int delete(TestVO vo) {
      System.out.println("delete()...");
      System.out.println(vo);

      int flag = 0;

      flag = 1;

      return flag;
   }

   @Override
   public List<TestVO> searchList(String searchKey, String searchWord) {
      System.out.println("searchList()...");
      System.out.println("searchKey..."+searchKey);
      System.out.println("searchWord..."+searchWord);

      List<TestVO> list = new ArrayList<TestVO>();

      for (int i = 0; i < 4; i++) {

         TestVO vo2 = new TestVO();
         vo2.setNum(22 + i);
         vo2.setName("kim22" + i);
         vo2.setAge(222 + i);

         list.add(vo2);

      }

      return list;
   }

}