package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.com.dept.DepartmentVO;

public class EmployeeDAOimpl implements EmployeeDAO {

	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "hr";
	private final String PASSWORD = "hi123456";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public EmployeeDAOimpl() {
		System.out.println("EmployeeDAOimpl()...");
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("find successed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public EmployeeVO selectOne(EmployeeVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo);

		EmployeeVO vo2 = new EmployeeVO();

		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select * from employees where employee_id = ? ";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmployee_id());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo2.setEmployee_id(rs.getInt("Employee_id"));
				vo2.setFirst_name(rs.getString("First_name"));
				vo2.setLast_name(rs.getString("Last_name"));
				vo2.setEmail(rs.getString("Email"));
				vo2.setPhone_numbe(rs.getString("Phone_numbe"));
				vo2.setHire_date(rs.getDate("Hire_date"));
				vo2.setJob_id(rs.getString("Job_id"));
				vo2.setSalary(rs.getInt("Salary"));
				vo2.setCommission_pct(rs.getInt("Commission_pct"));
				vo2.setManager_id(rs.getInt("Manager_id"));
				vo2.setDepartment_id(rs.getInt("Department_id"));
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
	public List<EmployeeVO> selectAll() {
		System.out.println("selectAll()...");

		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select * from employees order by hire_date desc";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				EmployeeVO vo2 = new EmployeeVO();
				vo2.setEmployee_id(rs.getInt("Employee_id"));
				vo2.setFirst_name(rs.getString("First_name"));
				vo2.setLast_name(rs.getString("Last_name"));
				vo2.setEmail(rs.getString("Email"));
				vo2.setPhone_numbe(rs.getString("Phone_numbe"));
				vo2.setHire_date(rs.getDate("Hire_date"));
				vo2.setJob_id(rs.getString("Job_id"));
				vo2.setSalary(rs.getInt("Salary"));
				vo2.setCommission_pct(rs.getInt("Commission_pct"));
				vo2.setManager_id(rs.getInt("Manager_id"));
				vo2.setDepartment_id(rs.getInt("Department_id"));
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
	public List<EmployeeVO> searchList(String searchKey, String searchWord) {
		System.out.println("searchList()...");
		System.out.println("searchKey:" + searchKey);
		System.out.println("searchWord:" + searchWord);
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();

		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select * from employees where " + searchKey + " like ? order by hire_date desc";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + searchWord + "%");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				EmployeeVO vo2 = new EmployeeVO();
				vo2.setEmployee_id(rs.getInt("Employee_id"));
				vo2.setFirst_name(rs.getString("First_name"));
				vo2.setLast_name(rs.getString("Last_name"));
				vo2.setEmail(rs.getString("Email"));
				vo2.setPhone_numbe(rs.getString("Phone_numbe"));
				vo2.setHire_date(rs.getDate("Hire_date"));
				vo2.setJob_id(rs.getString("Job_id"));
				vo2.setSalary(rs.getInt("Salary"));
				vo2.setCommission_pct(rs.getInt("Commission_pct"));
				vo2.setManager_id(rs.getInt("Manager_id"));
				vo2.setDepartment_id(rs.getInt("Department_id"));
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
	public int getEmpCount() {
		System.out.println("getEmpCount...");
		int count = 0;

		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select count(*) emp_count from employees";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				count = rs.getInt("emp_count");
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
		return count;
	}

}
