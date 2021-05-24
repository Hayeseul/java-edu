package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {

   private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
   private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
   private final String USER_NAME = "java";
   private final String PASSWORD = "hi123456";

   private Connection conn;
   private PreparedStatement pstmt;
   private ResultSet rs;
   
   public MemberDAOimpl() {
      System.out.println("MemberDAOimpl()...");
      try {
         Class.forName(DRIVER_NAME);
         System.out.println("find successed");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
   }


   
   @Override
   public int insert(MemberVO vo) {
      System.out.println("insert()...");
      System.out.println(vo);
      int flag = 0;
      
      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed....");
         String sql = "insert into member(num,id,pw,name,tel) values(seq_member.nextval,?,?,?,?)";
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, vo.getId());
         pstmt.setString(2, vo.getPw());
         pstmt.setString(3, vo.getName());
         pstmt.setString(4, vo.getTel());
         
         flag = pstmt.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
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
      

      return flag;
   }

   @Override
   public int update(MemberVO vo) {
      System.out.println("update()...");
      System.out.println(vo);
      int flag = 0;
      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed....");
         
         String sql = "update member set id=?,pw=?,name=?,tel=? where num=?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, vo.getId());
         pstmt.setString(2, vo.getPw());
         pstmt.setString(3, vo.getName());
         pstmt.setString(4, vo.getTel());
         pstmt.setInt(5, vo.getNum());
         
         flag = pstmt.executeUpdate();
         
         
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
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
      return flag;
   }

   @Override
   public int delete(MemberVO vo) {
      System.out.println("delete()...");
      System.out.println(vo);
      int flag = 0;
      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed....");
         
         String sql = "delete from member where num=?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, vo.getNum());
         
         flag = pstmt.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
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
      return flag;
   }

   @Override
   public MemberVO selectOne(MemberVO vo) {
      System.out.println("selectOne()...");
      System.out.println(vo);
      
      
      MemberVO vo2 = new MemberVO();
      
      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed....");
         
         String sql = "select * from member where num=?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, vo.getNum());
         
         rs = pstmt.executeQuery();
         while(rs.next()) {
            vo2.setNum(rs.getInt("num"));
            vo2.setId(rs.getString("id"));
            vo2.setPw(rs.getString("pw"));
            vo2.setName(rs.getString("name"));
            vo2.setTel(rs.getString("tel"));
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
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
   public List<MemberVO> selectAll() {
      System.out.println("selectAll()...");
      List<MemberVO> list = new ArrayList<MemberVO>();
      
      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed....");
         
         String sql = "select * from member  order by num asc";
         pstmt = conn.prepareStatement(sql);
         
         rs = pstmt.executeQuery();
         while(rs.next()) {
            MemberVO vo2 = new MemberVO();
            vo2.setNum(rs.getInt("num"));
            vo2.setId(rs.getString("id"));
            vo2.setPw(rs.getString("pw"));
            vo2.setName(rs.getString("name"));
            vo2.setTel(rs.getString("tel"));
            list.add(vo2);
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
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
   public List<MemberVO> searchList(String searchKey, String searchWord) {
      System.out.println("searchList()...");
      System.out.println("searchKey:" + searchKey);
      System.out.println("searchWord:" + searchWord);
      List<MemberVO> list = new ArrayList<MemberVO>();

   
      try {
         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
         System.out.println("conn successed....");
         
         String sql = "select * from member where "+searchKey+" like ? order by num asc";
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, "%"+searchWord+"%");
         
         rs = pstmt.executeQuery();
         while(rs.next()) {
            MemberVO vo2 = new MemberVO();
            vo2.setNum(rs.getInt("num"));
            vo2.setId(rs.getString("id"));
            vo2.setPw(rs.getString("pw"));
            vo2.setName(rs.getString("name"));
            vo2.setTel(rs.getString("tel"));
            list.add(vo2);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
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