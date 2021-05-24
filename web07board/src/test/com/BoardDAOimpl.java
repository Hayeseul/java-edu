package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOimpl implements BoardDAO {
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "web";
	private final String PASSWORD = "hi123456";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private char[] vo;

	public BoardDAOimpl() {
		System.out.println("BoardDAOimpl()...");
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("find successed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int insert(BoardVO vo) {
		System.out.println("insert()...");
		System.out.println(vo);
		int flag = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed....");
			String sql = "insert into board(num,title,content,writer) values(seq_board.nextval,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());
			
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
	public int update(BoardVO vo) {
		System.out.println("update()...");
		System.out.println(vo);
		int flag = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed....");
			String sql = "update board set title=?,content=?,writer=? where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());
			pstmt.setInt(4, vo.getNum());
			
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
	public int delete(BoardVO vo) {
		  System.out.println("delete()...");
	      System.out.println(vo);
	      int flag = 0;
	      try {
	         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	         System.out.println("conn successed...");
	         
	         String sql = "delete from board where num=?";
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
	public BoardVO selectOne(BoardVO vo) {
		 System.out.println("selectOne()...");
	      System.out.println(vo);
	      
	      BoardVO vo2 = new BoardVO();
	      try {
	         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	         System.out.println("conn successed...");
	         
	         String sql = "select * from board where num=?";
	         
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setInt(1, vo.getNum());
	         
	         rs = pstmt.executeQuery();
	         
	         while(rs.next()) {
	            vo2.setNum(rs.getInt("num"));
	            vo2.setTitle(rs.getString("title"));
	            vo2.setContent(rs.getString("content"));
	            vo2.setWriter(rs.getString("writer"));
	            vo2.setStr_wdate(rs.getString("wdate"));
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
	public List<BoardVO> selectAll() {
		System.out.println("selectAll()...");
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed....");
			
			String sql = "select * from board  order by num asc";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO vo2 = new BoardVO();
				vo2.setNum(rs.getInt("num"));
				vo2.setTitle(rs.getString("title"));
				vo2.setContent(rs.getString("content"));
				vo2.setWriter(rs.getString("writer"));
				vo2.setWdate(rs.getDate("wdate"));
				vo2.setStr_wdate(rs.getString("wdate"));
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
	public List<BoardVO> searchList(String searchKey, String searchWord) {
		 System.out.println("searchList().....");
	      System.out.println("searchKey:" + searchKey);
	      System.out.println("searchWord:" + searchWord);
	      List<BoardVO> list = new ArrayList<BoardVO>();
	      try {
	         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	         System.out.println("conn successed...");

	         String sql = "select * from board where "+searchKey+" like ?";
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, "%"+searchWord+"%");
	         
	         rs = pstmt.executeQuery();
	         
	         while (rs.next()) {
	        	 BoardVO vo2 = new BoardVO();
	            vo2.setTitle(rs.getString("title"));
	            vo2.setContent(rs.getString("content"));
	            vo2.setWriter(rs.getString("writer"));
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
