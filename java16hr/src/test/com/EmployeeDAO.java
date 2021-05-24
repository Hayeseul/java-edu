package test.com;

import java.util.List;


public interface EmployeeDAO {
	
	public EmployeeVO selectOne(EmployeeVO vo);

	public List<EmployeeVO> selectAll();

	public List<EmployeeVO> searchList(String searchKey, String searchWord);

	public int getEmpCount();

}
