package test.com.job;

import java.util.List;

public interface JobDAO {

	JobVO selectOne(JobVO vo);

	List<JobVO> selectAll();

	List<JobVO> searchList(String string, String string2);

}
