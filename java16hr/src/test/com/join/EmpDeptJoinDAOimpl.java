package test.com.join;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.com.EmployeeVO;
import test.com.dept.DepartmentVO;

public class EmpDeptJoinDAOimpl implements EmpDeptJoinDAO {

	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "hr";
	private final String PASSWORD = "hi123456";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public EmpDeptJoinDAOimpl() {
		System.out.println("EmpDeptJoinDAOimpl()...");
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("find successed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public EmpDeptJoinVO selectOne(EmpDeptJoinVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo);

		EmpDeptJoinVO vo2 = new EmpDeptJoinVO();

		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select * from emp_dept_view where employee_id = ? ";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmployee_id());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo2.setEmployee_id(rs.getInt("Employee_id"));
				vo2.setFirst_name(rs.getString("First_name"));
				vo2.setDepartment_id(rs.getInt("Department_id"));
				vo2.setDepartment_name(rs.getString("Department_name"));
				vo2.setManager_id(rs.getInt("Manager_id"));
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
	public List<EmpDeptJoinVO> selectAll() {
			System.out.println("selectAll()...");

			List<EmpDeptJoinVO> list = new ArrayList<EmpDeptJoinVO>();
			try {
				conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				System.out.println("conn successed...");

				String sql = "select * from emp_dept_view order by employee_id asc";

				pstmt = conn.prepareStatement(sql);

				rs = pstmt.executeQuery();

				while (rs.next()) {
					EmpDeptJoinVO vo2 = new EmpDeptJoinVO();
					vo2.setEmployee_id(rs.getInt("Employee_id"));
					vo2.setFirst_name(rs.getString("First_name"));
					vo2.setDepartment_id(rs.getInt("Department_id"));
					vo2.setDepartment_name(rs.getString("Department_name"));
					vo2.setManager_id(rs.getInt("Manager_id"));
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
	public List<EmpDeptJoinVO> searchList(String searchKey, String searchWord) {
		System.out.println("searchList()...");
		System.out.println("searchKey:" + searchKey);
		System.out.println("searchWord:" + searchWord);
		List<EmpDeptJoinVO> list = new ArrayList<EmpDeptJoinVO>();

		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select * from emp_dept_view where " + searchKey + " like ? order by employee_id asc ";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + searchWord + "%");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				EmpDeptJoinVO vo2 = new EmpDeptJoinVO();
				vo2.setEmployee_id(rs.getInt("Employee_id"));
				vo2.setFirst_name(rs.getString("First_name"));
				vo2.setDepartment_id(rs.getInt("Department_id"));
				vo2.setDepartment_name(rs.getString("Department_name"));
				vo2.setManager_id(rs.getInt("Manager_id"));
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
	public int getEmpDeptJoinCount() {
		System.out.println("getEmpDeptCount...");
		int count = 0;

		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("conn successed...");

			String sql = "select count(*) emp_dept_count from emp_dept_view";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				count = rs.getInt("emp_dept_count");
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
