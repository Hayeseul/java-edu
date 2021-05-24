package test.com.dept;

import java.util.List;

public interface DepartmentDAO {
   
	public DepartmentVO selectOne(DepartmentVO vo);

	public List<DepartmentVO> selectAll();

	public List<DepartmentVO> searchList(String searchKey, String searchWord);

	public int getDeptCount();
   
   

}