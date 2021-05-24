package test.com;

import java.util.List;

import test.com.dept.DepartmentDAO;
import test.com.dept.DepartmentDAOimpl;
import test.com.dept.DepartmentVO;

public class HRmainenpd {

   public static void main(String[] args) {
      System.out.println("HR...main");
      
      // 사원 객체들   EmployeeVP, EmployeeDAO, EmployeeDAOimpl
      
      // 사원 1명의 정보 
      EmployeeDAO dao = new EmployeeDAOimpl();
      
      EmployeeVO vo = new EmployeeVO();
      vo.setEmployee_id(100);
      EmployeeVO vo2 = dao.selectOne(vo);
      System.out.println(vo2);
      
      
      //모든사원의 정보 
      System.out.println("===================");
      List<EmployeeVO> list = dao.selectAll();
      for (EmployeeVO x : list) {
         System.out.println(x);
      }
      
      // 검색 키 사원정보 
      System.out.println("===================");
      List<EmployeeVO> list2 = dao.searchList("First_name","St");
      for (EmployeeVO x : list2) {
         System.out.println(x);
      }
      
      // 모든 사원수 정보  
      System.out.println("===================");
      int empCount = dao.getEmpCount();
      System.out.println("EmpCount:" + empCount);
      
       
      
      
      
      
   }//end main

}//end class