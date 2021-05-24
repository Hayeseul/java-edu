package test.com;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberController
 */
@WebServlet({ "/index.do", "/insertOK.do", "/insert.do",
	"/selectOne.do","/selectAll.do",
	"/update.do","/updateOK.do","/deleteOK.do" ,"/searchList.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
        System.out.println("MemberController()");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sPath = request.getServletPath();
		System.out.println("sPath:"+sPath);
		
		// 현재 페이지 주소 가져오기 
	
		if(sPath.equals("/index.do")) {
			System.out.println("index.jsp");
			
			
			RequestDispatcher rd = 
					request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			
			// 주소가 맞으면 index소스를 보유한 index페이지로 이동해라. 
			
			
			
		
	}else if(sPath.equals("/insertOK.do")) {
		
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("pw"));
		System.out.println(request.getParameter("tel"));
		
		// 만일 주소가 insert와 같다면 insert소스에서 사용자가 표시한 data를 불러오자. 
		// getPrameter => 사용자가 입력한 데이터를 읽어오기 
		
		MemberVO vo = new MemberVO();
		//받아온 데이터로 vo객체를 생성한다
		vo.setName(request.getParameter("name"));
		vo.setId(request.getParameter("id"));
		vo.setPw(request.getParameter("pw"));
		vo.setTel(request.getParameter("tel"));
		//VO에서 set을 설정하였고,  사용자가 지정한 data를 불러오자. 
		
		MemberDAO dao = new MemberDAOimpl();
		int result = dao.insert(vo);  //성공하면 inser 를 반환한다. 
		System.out.println("insert result:"+result);
		//insert 결과를 알 수있음. 
		
		if(result==1) {
			response.sendRedirect("index.do");
		}else {
			response.sendRedirect("insert.do");
		}
		//결과가 1(successed)이면 index로 가고 결과가 0이면(fail) insert로 가라. 
		
		
		
	}else if(sPath.equals("/insert.do")) {
		System.out.println("member/insert.jsp");
		//경로가 insert.do로 가게되면 
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("member/insert.jsp");
		rd.forward(request, response);
		
		//insert소스 페이지를 출력하라 
		
		
		
		
	}else if(sPath.equals("/selectOne.do")) {
		System.out.println("member/selectOne.jsp");
		// 경로가 selectOne.do라면 아래문구를 출력해라 
		
		System.out.println("num:"+request.getParameter("num"));
		//사용자가 설정한 num data를 불러오기 
		
		MemberVO vo = new MemberVO();
		vo.setNum(Integer.parseInt(request.getParameter("num")));
		//vo에 num을 저장하고 
		//interger(int)형식으로 바꾼 후 parseint값을 정수로 잘라내는 메소드 
		//parameter num가 (selectone.jsp의 num값을 불러온다. 
		
		MemberDAO dao = new MemberDAOimpl();
		MemberVO vo2 = dao.selectOne(vo);
		System.out.println(vo2);
		
		request.setAttribute("vo2", vo2);
		
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("member/selectOne.jsp");
		rd.forward(request, response);
		
		//selectone페이지를 출력하라 
		
		
		
		
	}else if(sPath.equals("/selectAll.do")) {
		System.out.println("member/selectAll.jsp");
		
		
		MemberDAO dao = new MemberDAOimpl();
		List<MemberVO> list = dao.selectAll();
		
		for (MemberVO x : list) {
			System.out.println(x);
		}
		
		request.setAttribute("list", list);
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("member/selectAll.jsp");
		rd.forward(request, response);
		
		
		
		
	}else if(sPath.equals("/searchList.do")) {
		System.out.println("member/selectAll.jsp");
		String searchKey = request.getParameter("searchKey");
		String searchWord = request.getParameter("searchWord");			
		
		MemberDAO dao = new MemberDAOimpl();
		List<MemberVO> list = dao.searchList(searchKey,searchWord);
		
		for (MemberVO x : list) {
			System.out.println(x);
		}
		
		request.setAttribute("list", list);
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("member/selectAll.jsp");
		rd.forward(request, response);
		
		
		
	}else if(sPath.equals("/update.do")) {
		System.out.println("member/update.jsp");
		System.out.println("num:"+request.getParameter("num"));
		System.out.println("name:"+request.getParameter("name"));
		System.out.println("id:"+request.getParameter("id"));
		System.out.println("pw:"+request.getParameter("pw"));
		System.out.println("tel:"+request.getParameter("tel"));
		
		MemberVO vo = new MemberVO();
		vo.setNum(Integer.parseInt(request.getParameter("num")));
		vo.setName(request.getParameter("name"));
		vo.setId(request.getParameter("id"));
		vo.setPw(request.getParameter("pw"));
		vo.setTel(request.getParameter("tel"));
		
		MemberDAO dao = new MemberDAOimpl();
		MemberVO vo2 = dao.selectOne(vo);
		System.out.println(vo2);
		
		request.setAttribute("vo2", vo2);
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("member/update.jsp");
		rd.forward(request, response);
		
		
		
	}else if(sPath.equals("/updateOK.do")) {
		System.out.println("num:"+request.getParameter("num"));
		System.out.println("name:"+request.getParameter("name"));
		System.out.println("id:"+request.getParameter("id"));
		System.out.println("pw:"+request.getParameter("pw"));
		System.out.println("tel:"+request.getParameter("tel"));
		
		MemberVO vo = new MemberVO();
		vo.setNum(Integer.parseInt(request.getParameter("num")));
		vo.setName(request.getParameter("name"));
		vo.setId(request.getParameter("id"));
		vo.setPw(request.getParameter("pw"));
		vo.setTel(request.getParameter("tel"));
		
		MemberDAO dao = new MemberDAOimpl();
		int result = dao.update(vo);
		System.out.println("update result:"+result);
				
		if(result>0) {
			System.out.println("update successed..");
			response.sendRedirect("selectAll.do");
		}else {
			System.out.println("update failed..");
			response.sendRedirect("update.do?num="+request.getParameter("num"));
		}
		
		
		
	}else if(sPath.equals("/deleteOK.do")) {
		System.out.println("num:"+request.getParameter("num"));
		
		MemberVO vo = new MemberVO();
		vo.setNum(Integer.parseInt(request.getParameter("num")));
		
		MemberDAO dao = new MemberDAOimpl();
		int result = dao.delete(vo);
		System.out.println("delete result:"+result);
				
		if(result>0) {
			System.out.println("delete successed..");
			response.sendRedirect("selectAll.do");
		}else {
			System.out.println("delete failed..");
			response.sendRedirect("selectAll.do");
		}
		
	}

	
	//  sPath:  /selectOne.do >> selectOne() >> override >>member/selectOne.jsp
	//  sPath:  /selectAll.do >> selectAll() >> override >>web/selectAll.jsp
	//  sPath:  /update.do >> web/update.jsp
	//  sPath:  /updateOK.do >> update() >> override 
	//  sPath:  /deleteOK.do >> delete() >> override 
	//  sPath:  /searchList.do >> searchList() >> override  >>web/selectAll.jsp

}//end doGet

/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	doGet(request, response);
}

}

