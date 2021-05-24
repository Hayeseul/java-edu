package test.com.join;

import java.util.List;

import test.com.EmployeeDAO;
import test.com.EmployeeDAOimpl;
import test.com.EmployeeVO;
import test.com.dept.DepartmentDAO;
import test.com.dept.DepartmentDAOimpl;
import test.com.dept.DepartmentVO;

public class HRmainEmpDepJoin {

   public static void main(String[] args) {
      System.out.println("HR...main");
      
      // 사원 객체들   EmpDeptJoinDAO, EmpDeptJoinDAOimpl
      
      // 사원 1명의 정보 
		EmpDeptJoinDAO dao = new EmpDeptJoinDAOimpl();

		EmpDeptJoinVO vo = new EmpDeptJoinVO();
		vo.setEmployee_id(100);
		EmpDeptJoinVO vo2 = dao.selectOne(vo);
		System.out.println(vo2);

		// 모든사원의 정보
		System.out.println("===================");
		List<EmpDeptJoinVO> list = dao.selectAll();
		for (EmpDeptJoinVO x : list) {
			System.out.println(x);
		}

		// 검색 키 사원정보
		System.out.println("===================");
		List<EmpDeptJoinVO> list2 = dao.searchList("First_name", "St");
		for (EmpDeptJoinVO x : list2) {
			System.out.println(x);
		}

		// 모든 사원수 정보
		System.out.println("===================");
		int empCount = dao.getEmpDeptJoinCount();
		System.out.println("EmpCount:" + empCount);
      
       
      
      
      
      
   }//end main

}//end class