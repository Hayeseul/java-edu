package test.com;

import java.util.List;

public interface Movie2DAO {
	
	public List<Movie2VO> selectAll();
	
	public List<Movie2VO> searchList (String searchKey, String searchWord);



}


