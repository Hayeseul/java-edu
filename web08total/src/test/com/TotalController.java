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
@WebServlet({ "/index.do", "/m_insertOK.do", "/m_insert.do", "/m_selectOne.do", "/m_selectAll.do", "/m_update.do",
		"/m_updateOK.do", "/m_deleteOK.do", "/m_searchList.do", "/b_insertOK.do", "/b_insert.do", "/b_selectOne.do",
		"/b_selectAll.do", "/b_update.do", "/b_updateOK.do", "/b_deleteOK.do", "/b_searchList.do", "/idCheck.do",
		"/loginOK.do", "/m_logout.do" })
public class TotalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TotalController() {
		super();
		System.out.println("TotalController()");
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

		} else if (sPath.equals("/m_insertOK.do")) {

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
				response.sendRedirect("m_insert.do");

		} else if (sPath.equals("/m_insert.do")) {
			System.out.println("member/m_insert.jsp");

			RequestDispatcher rd = request.getRequestDispatcher("member/m_insert.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/m_selectOne.do")) {
			System.out.println("member/m_selectOne.jsp");
			System.out.println("num:" + request.getParameter("num"));

			MemberVO vo = new MemberVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));

			MemberDAO dao = new MemberDAOimpl();
			MemberVO vo2 = dao.selectOne(vo);
			System.out.println(vo2);

			request.setAttribute("vo2", vo2);

			RequestDispatcher rd = request.getRequestDispatcher("member/m_selectOne.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/m_selectAll.do")) {
			System.out.println("member/m_selectAll.jsp");

			String loginSession = (String) request.getSession().getAttribute("login");

			System.out.println(loginSession);

			if (loginSession == null || loginSession.equals("failed")) {
				response.sendRedirect("index.do");

			} else {

				MemberDAO dao = new MemberDAOimpl();
				List<MemberVO> list = dao.selectAll();

				for (MemberVO x : list) {
					System.out.println(x);
				}

				request.setAttribute("list", list);

				RequestDispatcher rd = request.getRequestDispatcher("member/m_selectAll.jsp");
				rd.forward(request, response);
			}

		} else if (sPath.equals("/m_searchList.do")) {
			System.out.println("member/m_selectAll.jsp");
			String searchKey = request.getParameter("searchKey");
			String searchWord = request.getParameter("searchWord");

			MemberDAO dao = new MemberDAOimpl();
			List<MemberVO> list = dao.searchList(searchKey, searchWord);

			for (MemberVO x : list) {
				System.out.println(x);
			}

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("member/m_selectAll.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/m_update.do")) {
			System.out.println("member/m_update.jsp");
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

			RequestDispatcher rd = request.getRequestDispatcher("member/m_update.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/m_updateOK.do")) {
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

		} else if (sPath.equals("/m_deleteOK.do")) {
			System.out.println("num:" + request.getParameter("num"));

			MemberVO vo = new MemberVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));

			MemberDAO dao = new MemberDAOimpl();
			int result = dao.delete(vo);
			System.out.println("delete result:" + result);

			if (result > 0) {
				System.out.println("delete successed..");
				response.sendRedirect("m_selectAll.do");
			} else {
				System.out.println("delete failed..");
				response.sendRedirect("m_selectAll.do");
			}

		} else if (sPath.equals("/b_insert.do")) {
			System.out.println("board/insert.jsp");

			String loginSession = (String) request.getSession().getAttribute("login");

			System.out.println(loginSession);
			

			if (loginSession == null || loginSession.equals("failed")) {
				response.sendRedirect("index.do");
			} else  {
				
				RequestDispatcher rd = request.getRequestDispatcher("board/b_insert.jsp");
				rd.forward(request, response);				
			}

		} else if (sPath.equals("/b_insertOK.do")) {

			System.out.println(request.getParameter("title"));
			System.out.println(request.getParameter("content"));
			System.out.println(request.getParameter("writer"));

			 String userID = (String) request.getSession().getAttribute("userID");
			 
			BoardVO vo = new BoardVO();
			vo.setTitle(request.getParameter("title"));
			vo.setContent(request.getParameter("content"));
			vo.setWriter(userID);

			BoardDAO dao = new BoardDAOimpl();
			int result = dao.insert(vo);
			System.out.println("insert result:" + result); 

			if (result == 1) {
				response.sendRedirect("index.do");
			} else {
				response.sendRedirect("b_insert.do");
			}

		} else if (sPath.equals("/b_selectOne.do")) {
			System.out.println("board/b_selectOne.jsp");
			System.out.println("num:" + request.getParameter("num"));

			BoardVO vo = new BoardVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));

			BoardDAO dao = new BoardDAOimpl();
			BoardVO vo2 = dao.selectOne(vo);
			System.out.println(vo2);

			request.setAttribute("vo2", vo2);

			RequestDispatcher rd = request.getRequestDispatcher("board/b_selectOne.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/b_selectAll.do")) {
			System.out.println("board/b_selectAll.jsp");

			String loginSession = (String) request.getSession().getAttribute("login");

			System.out.println(loginSession);

			if (loginSession == null || loginSession.equals("failed")) {
				response.sendRedirect("index.do");

			} else {
				BoardDAO dao = new BoardDAOimpl();
				List<BoardVO> list = dao.selectAll();

				for (BoardVO x : list) {
					System.out.println(x);
				}

				request.setAttribute("list", list);

				RequestDispatcher rd = request.getRequestDispatcher("board/b_selectAll.jsp");
				rd.forward(request, response);
			}

		} else if (sPath.equals("/b_searchList.do")) {
			System.out.println("board/b_selectAll.jsp");
			String searchKey = request.getParameter("searchKey");
			String searchWord = request.getParameter("searchWord");

			BoardDAO dao = new BoardDAOimpl();
			List<BoardVO> list = dao.searchList(searchKey, searchWord);

			for (BoardVO x : list) {
				System.out.println(x);
			}

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("board/b_selectAll.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/b_update.do")) {
			System.out.println("board/b_update.jsp");
			System.out.println("num:" + request.getParameter("num"));
			System.out.println("title:" + request.getParameter("title"));
			System.out.println("content:" + request.getParameter("content"));
			System.out.println("writer:" + request.getParameter("writer"));

			BoardVO vo = new BoardVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));
			vo.setTitle(request.getParameter("title"));
			vo.setContent(request.getParameter("content"));
			vo.setWriter(request.getParameter("writer"));

			BoardDAO dao = new BoardDAOimpl();
			BoardVO vo2 = dao.selectOne(vo);
			System.out.println(vo2);

			request.setAttribute("vo2", vo2);

			RequestDispatcher rd = request.getRequestDispatcher("board/b_update.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/b_updateOK.do")) {
			System.out.println("num:" + request.getParameter("num"));
			System.out.println("title:" + request.getParameter("title"));
			System.out.println("content:" + request.getParameter("content"));
			System.out.println("writer:" + request.getParameter("writer"));

			BoardVO vo = new BoardVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));
			vo.setTitle(request.getParameter("title"));
			vo.setContent(request.getParameter("content"));
			vo.setWriter(request.getParameter("writer"));

			BoardDAO dao = new BoardDAOimpl();
			int result = dao.update(vo);
			System.out.println("update result:" + result);

			if (result > 0) {
				System.out.println("update successed..");
				response.sendRedirect("b_selectAll.do");
			} else {
				System.out.println("update failed..");
				response.sendRedirect("update.do?num=" + request.getParameter("num"));
			}

		} else if (sPath.equals("/b_deleteOK.do")) {
			System.out.println("num:" + request.getParameter("num"));

			BoardVO vo = new BoardVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));

			BoardDAO dao = new BoardDAOimpl();
			int result = dao.delete(vo);
			System.out.println("delete result:" + result);

			if (result > 0) {
				System.out.println("delete successed..");
				response.sendRedirect("b_selectAll.do");
			} else {
				System.out.println("delete failed..");
				response.sendRedirect("b_selectAll.do");

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
				request.getSession().setAttribute("userID", request.getParameter("id"));
				request.getSession().setMaxInactiveInterval(300);
				System.out.println(request.getSession().getMaxInactiveInterval());

			}

			response.sendRedirect("index.do");

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
