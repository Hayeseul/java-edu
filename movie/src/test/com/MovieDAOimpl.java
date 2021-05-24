package test.com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

public class MovieDAOimpl implements MovieDAO {

	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "movie";
	private final String PASSWORD = "hi123456";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Object sessionScope;

	public MovieDAOimpl() {
		System.out.println("TestDAOimpl()...");
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("find successed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


	@Override
	public List<MovieVO> selectAll() {
		System.out.println("selectAll()....");
		
		List<MovieVO> list = new ArrayList<MovieVO>();
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");
			String sql = "select * from Movie";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				MovieVO vo2 = new MovieVO();
				vo2.setNum(rs.getInt("num"));
				vo2.setMovie(rs.getString("movie"));
				vo2.setContent(rs.getString("content"));
				vo2.setRunningtime(rs.getString("runningtime"));
				
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
	public MovieVO selectOne(MovieVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo);

		MovieVO vo2 = new MovieVO();
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select * from Movie where num=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getNum());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo2.setNum(rs.getInt("num"));
				vo2.setMovie(rs.getString("movie"));
				vo2.setContent(rs.getString("content"));
				vo2.setRunningtime(rs.getString("runningtime"));
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
	public List<MovieVO> searchList(String searchKey, String searchWord) {
		System.out.println("searchList().....");
		System.out.println("searchKey:" + searchKey);
		System.out.println("searchWord:" + searchWord);
		List<MovieVO> list = new ArrayList<MovieVO>();
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select * from Movie where " + searchKey + " like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + searchWord + "%");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				MovieVO vo2 = new MovieVO();
				vo2.setNum(rs.getInt("num"));
				vo2.setMovie(rs.getString("movie"));
				vo2.setContent(rs.getString("content"));
				vo2.setRunningtime(rs.getString("runningtime"));
			
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



















