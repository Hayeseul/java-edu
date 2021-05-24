package test.com;

import java.util.List;

public interface ReservationDAO {
	
	int delete(ReservationVO vo);

	public int insert (ReservationVO vo);
	
	public List<ReservationVO> selectAll();
	
	public List<ReservationVO> searchList (String searchKey, String searchWord);





}


