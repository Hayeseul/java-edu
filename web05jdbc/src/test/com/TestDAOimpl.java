package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestDAOimpl implements TestDAO {
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "web";
	private final String PASSWORD = "hi123456";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public TestDAOimpl() {
		System.out.println("TestDAOimpl()...");
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("find successed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int insert(TestVO vo) {
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
	public TestVO selectOne(TestVO vo) {
		 System.out.println("selectOne()...");
	      System.out.println(vo);
	      TestVO vo2 = new TestVO();
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
	public List<TestVO> selectAll() {
		 System.out.println("selectAll()....");

	      List<TestVO> list = new ArrayList<TestVO>();
	      try {
	         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	         System.out.println("conn successed...");
	         String sql = "select * from test";
	         pstmt = conn.prepareStatement(sql);
	         
	         rs = pstmt.executeQuery();
	         
	         while (rs.next()) {
	            TestVO vo2 = new TestVO();
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
	public int update(TestVO vo) {
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
	public int delete(TestVO vo) {
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
	public List<TestVO> searchList(String searchKey, String searchWord) {
		 System.out.println("searchList().....");
	      System.out.println("searchKey:" + searchKey);
	      System.out.println("searchWord:" + searchWord);
	      List<TestVO> list = new ArrayList<TestVO>();
	      try {
	         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	         System.out.println("conn successed...");

	         String sql = "select * from test where "+searchKey+" like ?";
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, "%"+searchWord+"%");
	         
	         rs = pstmt.executeQuery();
	         
	         while (rs.next()) {
	            TestVO vo2 = new TestVO();
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
