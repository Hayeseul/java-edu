package test.com.job;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.com.dept.DepartmentVO;

public class JobDAOimpl implements JobDAO {

	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "hr";
	private final String PASSWORD = "hi123456";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	

	public JobDAOimpl() {
		System.out.println("Job()...");
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("find successed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public JobVO selectOne(JobVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo);

		JobVO vo2 = new JobVO();

		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select * from jobs where job_id = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getJob_id());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo2.setJob_id(rs.getString("Job_id"));
				vo2.setJob_title(rs.getString("Job_title"));
				vo2.setMin_salary(rs.getInt("Min_salary"));
				vo2.setMax_salary(rs.getInt("Max_salary"));
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
	public List<JobVO> selectAll() {
		System.out.println("selectAll()...");
		List<JobVO> list = new ArrayList<JobVO>();
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select * from jobs where job_id is not null";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				JobVO vo2 = new JobVO();
				vo2.setJob_id(rs.getString("Job_id"));
				vo2.setJob_title(rs.getString("Job_title"));
				vo2.setMin_salary(rs.getInt("Min_salary"));
				vo2.setMax_salary(rs.getInt("Max_salary"));
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
	public List<JobVO> searchList(String searchKey, String searchWord) {
		  System.out.println("searchList()...");
	      System.out.println("searchKey:" + searchKey);
	      System.out.println("searchWord:" + searchWord);
	      List<JobVO> list = new ArrayList<JobVO>();

	      try {
	         conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	         System.out.println("conn successed...");

	         String sql = "select * from jobs where "+searchKey+" like ?";

	         pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, "%"+searchWord+"%");
	            
	         rs = pstmt.executeQuery();

	         while (rs.next()) {
	            JobVO vo2 = new JobVO();
				vo2.setJob_id(rs.getString("Job_id"));
				vo2.setJob_title(rs.getString("Job_title"));
				vo2.setMin_salary(rs.getInt("Min_salary"));
				vo2.setMax_salary(rs.getInt("Max_salary"));
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
