package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class RoomDAOimpl implements RoomDAO {
	
	private final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://18.117.94.127:3306/kosta_db?" + "useUnicode=true&characterEncoding=utf8";
	private final String USER_NAME = "kosta";
	private final String PASSWORD = "hi123456";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	public RoomDAOimpl() {
		System.out.println("TestDAOimpl()...");
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("find successed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


	@Override
	public RoomVO room_selectOne(RoomVO vo) {
		System.out.println("room_selectOne()...");
		System.out.println(vo);

		RoomVO vo2 = new RoomVO();
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select * from room where room_num=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getRoom_num());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo2.setRoom_num(rs.getInt("room_num"));
				vo2.setRoom_roomName(rs.getString("room_roomName"));
				vo2.setRoom_price(rs.getString("room_price"));
				vo2.setRoom_minPerson(rs.getString("room_minPerson"));
				vo2.setRoom_maxPerson(rs.getString("room_maxPerson"));
				

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
	public int room_update(RoomVO vo) {
		System.out.println("room_update()...");
		System.out.println(vo);
		int flag = 0;
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "update room set room_roomName=?,room_price=?,room_minPerson=?,room_maxPerson=? where room_num=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getRoom_roomName());
			pstmt.setString(2, vo.getRoom_price());
			pstmt.setString(3, vo.getRoom_minPerson());
			pstmt.setString(4, vo.getRoom_maxPerson());
			pstmt.setInt(5, vo.getRoom_num());

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




	
	
	
}

	
	
	


