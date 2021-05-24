package test.com.dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAOimpl implements DepartmentDAO {

   private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
   private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
   private final String USER_NAME = "hr";
   private final String PASSWORD = "hi123456";

   private Connection conn;
   private PreparedStatement pstmt;
   private ResultSet rs;

   public DepartmentDAOimpl() {
      System.out.println("DepartmentDAOimpl()...");
      try {
         Class.forName(DRIVER_NAME);
         System.out.println("find successed");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
   }

   @Override
   public DepartmentVO selectOne(DepartmentVO vo) {
      System.out.println("selectOne()...");
      System.out.println(vo);

      DepartmentVO vo2 = new DepartmentVO();

      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed...");

         String sql = "select * from departments where department_id=?";

         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, vo.getDepartment_id());

         rs = pstmt.executeQuery();

         while (rs.next()) {
            vo2.setDepartment_id(rs.getInt("department_id"));
            vo2.setDepartment_name(rs.getString("department_name"));
            vo2.setManager_id(rs.getInt("manager_id"));
            vo2.setLocation_id(rs.getInt("location_id"));
         }

      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         if (rs != null) {
            try {
               rs.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
         if (pstmt != null) {
            try {
               pstmt.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
         if (conn != null) {
            try {
               conn.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
      }

      return vo2;
   }

   @Override
   public int getDeptCount() {
	   System.out.println("getDeptCount...");
	   int dept_count =0;

	      List<DepartmentVO> list = new ArrayList<DepartmentVO>();
	      try {
	         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	         System.out.println("conn successed...");

	         String sql = "select count(*) dept_count from departments where manager_id is not null";

	         pstmt = conn.prepareStatement(sql);

	         rs = pstmt.executeQuery();

	         while (rs.next()) {
	           dept_count = rs.getInt("dept_count");
	         }

	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         if (rs != null) {
	            try {
	               rs.close();
	            } catch (SQLException e) {
	               e.printStackTrace();
	            }
	         }
	         if (pstmt != null) {
	            try {
	               pstmt.close();
	            } catch (SQLException e) {
	               e.printStackTrace();
	            }
	         }
	         if (conn != null) {
	            try {
	               conn.close();
	            } catch (SQLException e) {
	               e.printStackTrace();
	            }
	         }
	      }
	      return dept_count;
	   }

   @Override
   public List<DepartmentVO> selectAll() {
      System.out.println("selectAll()...");

      List<DepartmentVO> list = new ArrayList<DepartmentVO>();
      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed...");

         String sql = "select * from departments where manager_id is not null";

         pstmt = conn.prepareStatement(sql);

         rs = pstmt.executeQuery();

         while (rs.next()) {
            DepartmentVO vo2 = new DepartmentVO();
            vo2.setDepartment_id(rs.getInt("department_id"));
            vo2.setDepartment_name(rs.getString("department_name"));
            vo2.setManager_id(rs.getInt("manager_id"));
            vo2.setLocation_id(rs.getInt("location_id"));
            list.add(vo2);
         }

      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         if (rs != null) {
            try {
               rs.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
         if (pstmt != null) {
            try {
               pstmt.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
         if (conn != null) {
            try {
               conn.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
      }
      return list;
   }

   @Override
   public List<DepartmentVO> searchList(String searchKey, String searchWord) {
      System.out.println("searchList()...");
      System.out.println("searchKey:" + searchKey);
      System.out.println("searchWord:" + searchWord);
      List<DepartmentVO> list = new ArrayList<DepartmentVO>();

      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed...");

         String sql = "select * from departments where "+searchKey+" like ?";

         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, "%"+searchWord+"%");
            
         rs = pstmt.executeQuery();

         while (rs.next()) {
            DepartmentVO vo2 = new DepartmentVO();
            vo2.setDepartment_id(rs.getInt("department_id"));
            vo2.setDepartment_name(rs.getString("department_name"));
            vo2.setManager_id(rs.getInt("manager_id"));
            vo2.setLocation_id(rs.getInt("location_id"));
            list.add(vo2);
         }

      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         if (rs != null) {
            try {
               rs.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
         if (pstmt != null) {
            try {
               pstmt.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
         if (conn != null) {
            try {
               conn.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
      }
      return list;
   }

}