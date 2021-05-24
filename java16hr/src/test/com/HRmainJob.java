package test.com;

import java.util.List;

import test.com.dept.DepartmentDAO;
import test.com.dept.DepartmentDAOimpl;
import test.com.dept.DepartmentVO;
import test.com.job.JobDAO;
import test.com.job.JobDAOimpl;
import test.com.job.JobVO;

public class HRmainJob {

   public static void main(String[] args) {
      System.out.println("HR...main");
      
      JobDAO dao = new JobDAOimpl();
      
      JobVO vo = new JobVO();
      JobVO vo2 = dao.selectOne(vo);
      System.out.println(vo2);
      
      
      System.out.println("===================");
      List<JobVO> list = dao.selectAll();
      for (JobVO x : list) {
         System.out.println(x);
      } 
      
      System.out.println("===================");
      List<JobVO> list2 = dao.searchList("Job_title","Ad");
      for (JobVO x : list2) {
         System.out.println(x);
      }
      
      
   }//end main

}//end class