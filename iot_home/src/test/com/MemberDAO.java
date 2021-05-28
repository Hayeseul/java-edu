package test.com;

import java.util.List;

public interface MemberDAO {
	public int member_insert (MemberVO vo);
	
	public int member_update (MemberVO vo);
	
	public int member_delete (MemberVO vo);
	
	public List<MemberVO> member_selectAll();
	
	public List<MemberVO> member_searchList (String searchKey, String searchWord);
	
	public MemberVO member_selectOne (MemberVO vo);

	public MemberVO member_idFind (MemberVO vo);

	String member_idCheck(MemberVO vo);

	public MemberVO member_loginOK(MemberVO vo);
	
	


}
