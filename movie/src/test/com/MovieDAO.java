package test.com;

import java.util.List;

public interface MovieDAO {
	


	public MovieVO selectOne (MovieVO vo);
	
	public List<MovieVO> selectAll();
	
	public List<MovieVO> searchList (String searchKey, String searchWord);



}


