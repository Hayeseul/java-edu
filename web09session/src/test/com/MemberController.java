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
@WebServlet({ "/index.do", "/insertOK.do", "/insert.do", "/selectOne.do", "/selectAll.do", "/update.do", "/updateOK.do",
		"/deleteOK.do", "/searchList.do", "/idCheck.do", "/loginOK.do", "/m_logout.do" })
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	private Object dao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberController() {
		super();
		System.out.println("MemberController()");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sPath = request.getServletPath();
		System.out.println("sPath:" + sPath);

		if (sPath.equals("/index.do")) {
			System.out.println("index.jsp");

			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/insertOK.do")) {

			System.out.println(request.getParameter("name"));
			System.out.println(request.getParameter("id"));
			System.out.println(request.getParameter("pw"));
			System.out.println(request.getParameter("tel"));

			MemberVO vo = new MemberVO();
			vo.setName(request.getParameter("name"));
			vo.setId(request.getParameter("id"));
			vo.setPw(request.getParameter("pw"));
			vo.setTel(request.getParameter("tel"));

			MemberDAO dao = new MemberDAOimpl();
			int result = dao.insert(vo);
			System.out.println("insert result:" + result);

			if (result == 1)
				response.sendRedirect("index.do");
			else
				response.sendRedirect("insert.do");

		} else if (sPath.equals("/insert.do")) {
			System.out.println("member/insert.jsp");

			RequestDispatcher rd = request.getRequestDispatcher("member/insert.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/selectOne.do")) {
			System.out.println("member/selectOne.jsp");
			System.out.println("num:" + request.getParameter("num"));

			MemberVO vo = new MemberVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));

			MemberDAO dao = new MemberDAOimpl();
			MemberVO vo2 = dao.selectOne(vo);
			System.out.println(vo2);

			request.setAttribute("vo2", vo2);

			RequestDispatcher rd = request.getRequestDispatcher("member/selectOne.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/selectAll.do")) {

	         System.out.println("member/selectAll.jsp");
	         
	         String loginSession = (String)request.getSession().getAttribute("login");
	         
	         System.out.println(loginSession);
	         
	         if(loginSession == null || loginSession.equals("failed")) {
	            response.sendRedirect("index.do");
	            
	         } else {
	            
	            MemberDAO dao = new MemberDAOimpl();
	            List<MemberVO> list = dao.selectAll();

	            for (MemberVO x : list) {
	               System.out.println(x);
	            }

	            request.setAttribute("list", list);

	            RequestDispatcher rd = request.getRequestDispatcher("member/selectAll.jsp");
	            rd.forward(request, response);
	         }

		} else if (sPath.equals("/searchList.do")) {
			System.out.println("member/selectAll.jsp");
			String searchKey = request.getParameter("searchKey");
			String searchWord = request.getParameter("searchWord");

			MemberDAO dao = new MemberDAOimpl();
			List<MemberVO> list = dao.searchList(searchKey, searchWord);

			for (MemberVO x : list) {
				System.out.println(x);
			}

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("member/selectAll.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/update.do")) {
			System.out.println("member/update.jsp");
			System.out.println("num:" + request.getParameter("num"));
			System.out.println("name:" + request.getParameter("name"));
			System.out.println("id:" + request.getParameter("id"));
			System.out.println("pw:" + request.getParameter("pw"));
			System.out.println("tel:" + request.getParameter("tel"));

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

			RequestDispatcher rd = request.getRequestDispatcher("member/update.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/updateOK.do")) {
			System.out.println("num:" + request.getParameter("num"));
			System.out.println("name:" + request.getParameter("name"));
			System.out.println("id:" + request.getParameter("id"));
			System.out.println("pw:" + request.getParameter("pw"));
			System.out.println("tel:" + request.getParameter("tel"));

			MemberVO vo = new MemberVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));
			vo.setName(request.getParameter("name"));
			vo.setId(request.getParameter("id"));
			vo.setPw(request.getParameter("pw"));
			vo.setTel(request.getParameter("tel"));

			MemberDAO dao = new MemberDAOimpl();
			int result = dao.update(vo);
			System.out.println("update result:" + result);

			if (result > 0) {
				System.out.println("update successed..");
				response.sendRedirect("selectAll.do");
			} else {
				System.out.println("update failed..");
				response.sendRedirect("update.do?num=" + request.getParameter("num"));
			}

		} else if (sPath.equals("/deleteOK.do")) {
			System.out.println("num:" + request.getParameter("num"));

			MemberVO vo = new MemberVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));

			MemberDAO dao = new MemberDAOimpl();
			int result = dao.delete(vo);
			System.out.println("delete result:" + result);

			if (result > 0) {
				System.out.println("delete successed..");
				response.sendRedirect("selectAll.do");
			} else {
				System.out.println("delete failed..");
				response.sendRedirect("selectAll.do");
			}

		} else if (sPath.equals("/idCheck.do")) {
			System.out.println(request.getParameter("id"));

			MemberVO vo = new MemberVO();
			vo.setId(request.getParameter("id"));

			MemberDAO dao = new MemberDAOimpl();
			String result = dao.idCheck(vo);

			response.sendRedirect("insert.do?id=" + vo.getId() + "&msg=" + result);

		} else if (sPath.equals("/loginOK.do")) {
			System.out.println(request.getParameter("id"));
			System.out.println(request.getParameter("pw"));

			MemberVO vo = new MemberVO();
			vo.setId(request.getParameter("id"));
			vo.setPw(request.getParameter("pw"));

			MemberDAO dao = new MemberDAOimpl();
			String result = dao.loginOK(vo);

			if (result.equals("successed")) {
				request.getSession().setAttribute("login", result);
				request.getSession().setAttribute("userID", request.getParameter("id") );
				request.getSession().setMaxInactiveInterval(300);
				System.out.println(request.getSession().getMaxInactiveInterval());
				
			}

			response.sendRedirect("index.do" );

		}

		else if (sPath.equals("/m_logout.do")) {

	        request.getSession().invalidate(); // 모든 세션 제거
	         response.sendRedirect("index.do");

			
			

		}

	}// end doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
