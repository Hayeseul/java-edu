package test.com.join;

import java.util.List;

import test.com.EmployeeVO;

public interface EmpDeptJoinDAO {
	
	
	public EmpDeptJoinVO selectOne(EmpDeptJoinVO vo);

	public List<EmpDeptJoinVO> selectAll();

	public List<EmpDeptJoinVO> searchList(String searchKey, String searchWord);

	public int getEmpDeptJoinCount();

}
