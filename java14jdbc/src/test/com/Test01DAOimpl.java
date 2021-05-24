package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test01DAOimpl implements Test01DAO {

   private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
   private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
   private final String USER_NAME = "java";
   private final String PASSWORD = "hi123456";

   private Connection conn;
   private PreparedStatement pstmt;
   private ResultSet rs;

   public Test01DAOimpl() {
      System.out.println("Test01DAOimpl()...");
      try {
         Class.forName(DRIVER_NAME);
         System.out.println("find successed");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
   }

   @Override
   public int insert(Test01VO vo) {
      System.out.println("insert()....");
      System.out.println(vo);
      int flag = 0;
      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

         System.out.println("conn successed...");
         String sql = "insert into test(num,name,age) values(seq_test.nextval,?,?)";
         pstmt = conn.prepareStatement(sql);
         //data mapping
         pstmt.setString(1, vo.getName());
         pstmt.setInt(2, vo.getAge());
         
         flag = pstmt.executeUpdate();
         
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
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

      return flag;
   }

   @Override
   public int update(Test01VO vo) {
      System.out.println("update()...");
      System.out.println(vo);
      int flag = 0;
      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed...");
         
         String sql = "update test set name=?,age=? where num=?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, vo.getName());
         pstmt.setInt(2, vo.getAge());
         pstmt.setInt(3, vo.getNum());
         
         flag = pstmt.executeUpdate();
         
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
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

      return flag;
   }

   @Override
   public int delete(Test01VO vo) {
      System.out.println("delete()...");
      System.out.println(vo);
      int flag = 0;
      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed...");
         
         String sql = "delete from test where num=?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, vo.getNum());
         
         flag = pstmt.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
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
      return flag;
   }

   @Override
   public Test01VO selectOne(Test01VO vo) {
      System.out.println("selectOne()...");
      System.out.println(vo);
      Test01VO vo2 = new Test01VO();
      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed...");
         
         String sql = "select * from test where num=?";
         
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, vo.getNum());
         
         rs = pstmt.executeQuery();
         
         while(rs.next()) {
            vo2.setNum(rs.getInt("num"));
            vo2.setName(rs.getString("name"));
            vo2.setAge(rs.getInt("age"));
         }
         
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         if (pstmt != null) {
            try {
               pstmt.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
         if (rs != null) {
             try {
                rs.close();
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
   public List<Test01VO> selectAll() {
      System.out.println("selectAll()....");

      List<Test01VO> list = new ArrayList<Test01VO>();
      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed...");
         String sql = "select * from test";
         pstmt = conn.prepareStatement(sql);
         
         rs = pstmt.executeQuery();
         
         while (rs.next()) {
            Test01VO vo2 = new Test01VO();
            vo2.setNum(rs.getInt("num"));
            vo2.setName(rs.getString("name"));
            vo2.setAge(rs.getInt("age"));
            list.add(vo2);
         }

      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         if (pstmt != null) {
            try {
               pstmt.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
         if (rs != null) {
             try {
                rs.close();
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
   public List<Test01VO> searchList(String searchKey, String searchWord) {
      System.out.println("searchList().....");
      System.out.println("searchKey:" + searchKey);
      System.out.println("searchWord:" + searchWord);
      List<Test01VO> list = new ArrayList<Test01VO>();
      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed...");

         String sql = "select * from test where "+searchKey+" like ?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, "%"+searchWord+"%");
         
         rs = pstmt.executeQuery();
         
         while (rs.next()) {
            Test01VO vo2 = new Test01VO();
            vo2.setNum(rs.getInt("num"));
            vo2.setName(rs.getString("name"));
            vo2.setAge(rs.getInt("age"));
            list.add(vo2);
         }

      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         if (pstmt != null) {
            try {
               pstmt.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
         if (rs != null) {
             try {
                rs.close();
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