package test.com;

import java.util.List;

import test.com.dept.DepartmentDAO;
import test.com.dept.DepartmentDAOimpl;
import test.com.dept.DepartmentVO;

public class HRmain {

   public static void main(String[] args) {
      System.out.println("HR...main");
      
      DepartmentDAO dao = new DepartmentDAOimpl();
      
      DepartmentVO vo = new DepartmentVO();
      vo.setDepartment_id(10);
      DepartmentVO vo2 = dao.selectOne(vo);
      System.out.println(vo2);
      
      
      System.out.println("===================");
      List<DepartmentVO> list = dao.selectAll();
      for (DepartmentVO x : list) {
         System.out.println(x);
      }
      
      System.out.println("===================");
      List<DepartmentVO> list2 = dao.searchList("department_name","Sh");
      for (DepartmentVO x : list2) {
         System.out.println(x);
      }
      System.out.println("===================");
      int dept_count = dao.getDeptCount();
      System.out.println("dept_count  : " + dept_count);
      
   }//end main

}//end class