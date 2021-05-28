package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {
	
	private final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://18.117.94.127:3306/kosta_db?" + "useUnicode=true&characterEncoding=utf8";
	private final String USER_NAME = "kosta";
	private final String PASSWORD = "hi123456";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	public MemberDAOimpl() {
		System.out.println("TestDAOimpl()...");
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("find successed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


	@Override
	public int member_insert(MemberVO vo) {
		System.out.println("insert()...");
		System.out.println(vo);
		int flag=0; 
		try {
			conn = DriverManager.getConnection(URL,USER_NAME, PASSWORD);
			
			System.out.println("conn successed..");
			String sql = "insert into member(member_name,member_id,member_pw,member_tel,member_email,member_birth) values(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			//data mapping
			pstmt.setString(1, vo.getMember_name());
			pstmt.setString(2, vo.getMember_id());
			pstmt.setString(3, vo.getMember_pw());
			pstmt.setString(4, vo.getMember_tel());
			pstmt.setString(5, vo.getMember_email());
			pstmt.setString(6, vo.getMember_birth());
			
			flag = pstmt.executeUpdate();
		}catch (SQLException e) {
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
	public String member_idCheck(MemberVO vo) {
		System.out.println("idCheck()....");
		System.out.println(vo);
		String result = "OK";
		
		if (vo.getMember_id().trim().length() == 0)
			return "NotOK";
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed....");

			String sql = "select * from member where member_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getMember_id());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				result = "NotOK";
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

		return result;
	}

	@Override
	public MemberVO member_loginOK(MemberVO vo) {
		System.out.println("loginOK()....");
		System.out.println(vo);

		MemberVO vo2 = null;
		if (vo.getMember_id().trim().length() == 0 || vo.getMember_pw().trim().length() == 0)
			return vo2;

		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed....");

			String sql = "select * from member where member_id =? and member_pw=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getMember_id());
			pstmt.setString(2, vo.getMember_pw());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo2 = new MemberVO();
				vo2.setMember_birth(rs.getString("member_birth"));
				
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
	public List<MemberVO> member_selectAll() {
		 System.out.println("selectAll()...");
	      
	      List<MemberVO> list = new ArrayList<MemberVO>();
	      
	      try {
	         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	         System.out.println("conn successed....");
	         
	         String sql = "select * from member";
	         pstmt = conn.prepareStatement(sql);
	         
	        
	         
	         rs = pstmt.executeQuery();
	         while(rs.next()) {
	        	MemberVO vo2 = new MemberVO();
	        	vo2.setMember_num(rs.getInt("member_num"));
	        	vo2.setMember_name(rs.getString("member_name"));
	            vo2.setMember_id(rs.getString("member_id"));
	            vo2.setMember_pw(rs.getString("member_pw"));
	            vo2.setMember_tel(rs.getString("member_tel"));
	            vo2.setMember_email(rs.getString("member_email"));
	            vo2.setMember_birth(rs.getString("member_birth"));

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
	public List<MemberVO> member_searchList(String searchKey, String searchWord) {
		System.out.println("searchList().....");
		System.out.println("searchKey:" + searchKey);
		System.out.println("searchWord:" + searchWord);
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select * from member where " + searchKey + " like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + searchWord + "%");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				MemberVO vo2 = new MemberVO();
				vo2.setMember_num(rs.getInt("member_num"));
				vo2.setMember_name(rs.getString("member_name"));
				vo2.setMember_id(rs.getString("member_id"));
				vo2.setMember_pw(rs.getString("member_pw"));
				vo2.setMember_tel(rs.getString("member_tel"));
				vo2.setMember_email(rs.getString("member_email"));
				vo2.setMember_birth(rs.getString("member_birth"));
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
	public MemberVO member_selectOne(MemberVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo);

		MemberVO vo2 = new MemberVO();
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select * from member where member_num=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getMember_num());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo2.setMember_num(rs.getInt("member_num"));
				vo2.setMember_name(rs.getString("member_name"));
				vo2.setMember_id(rs.getString("member_id"));
				vo2.setMember_pw(rs.getString("member_pw"));
				vo2.setMember_tel(rs.getString("member_tel"));
				vo2.setMember_email(rs.getString("member_email"));
				vo2.setMember_birth(rs.getString("member_birth"));

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
	public int member_update(MemberVO vo) {
		System.out.println("member_update()...");
		System.out.println(vo);
		int flag = 0;
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "update member set member_name=?,member_pw=?,member_tel=?,member_email=?where member_num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getMember_name());
			pstmt.setString(2, vo.getMember_pw());
			pstmt.setString(3, vo.getMember_tel());
			pstmt.setString(4, vo.getMember_email());
			pstmt.setInt(5, vo.getMember_num());

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
	public int member_delete(MemberVO vo) {
		System.out.println("delete()...");
		System.out.println(vo);
		int flag = 0;
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "delete from member where member_num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getMember_num());

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
	public MemberVO member_idFind(MemberVO vo) {
		 System.out.println("idFind()...");
	      System.out.println(vo);

	      MemberVO vo2 = new MemberVO();
	      
	      try {
	         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	         System.out.println("conn successed....");
	         
	         String sql = "select * from member where member_name=? and member_email=?";
	         pstmt = conn.prepareStatement(sql);
	         
	         pstmt.setString(1, vo.getMember_name());
	         pstmt.setString(2, vo.getMember_email());
	         
	         rs = pstmt.executeQuery();
	         while(rs.next()) {
	            vo2.setMember_id(rs.getString("member_id"));
	            vo2.setMember_pw(rs.getString("member_pw"));
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
	
}

	
	
	


