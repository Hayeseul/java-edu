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
 * Servlet implementation class boardController
 */
@WebServlet({ "/index.do", "/insertOK.do", "/insert.do", "/selectOne.do", "/selectAll.do", "/update.do", "/updateOK.do",
		"/deleteOK.do", "/searchList.do" })
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BoardController() {
		super();
		System.out.println("boardController()");
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
		}

		else if (sPath.equals("/insert.do")) {
			System.out.println("board/insert.jsp");

			RequestDispatcher rd = request.getRequestDispatcher("board/insert.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/insertOK.do")) {

			System.out.println(request.getParameter("title"));
			System.out.println(request.getParameter("content"));
			System.out.println(request.getParameter("writer"));
			System.out.println(request.getParameter("date"));

			BoardVO vo = new BoardVO();
			vo.setTitle(request.getParameter("title"));
			vo.setContent(request.getParameter("content"));
			vo.setWriter(request.getParameter("writer"));
			vo.setWdate(request.getParameter("date"));

			BoardDAO dao = new BoardDAOimpl();
			int result = dao.insert(vo);
			System.out.println("insert result:" + result);

			if (result == 1)
				response.sendRedirect("index.do");
			else
				response.sendRedirect("insert.do");

		} else if (sPath.equals("/selectOne.do")) {
			System.out.println("board/selectOne.jsp");
			System.out.println("num:" + request.getParameter("num"));

			BoardVO vo = new BoardVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));

			BoardDAO dao = new BoardDAOimpl();
			BoardVO vo2 = dao.selectOne(vo);
			System.out.println(vo2);

			request.setAttribute("vo2", vo2);

			RequestDispatcher rd = request.getRequestDispatcher("board/selectOne.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/selectAll.do")) {
			System.out.println("board/selectAll.jsp");

			BoardDAO dao = new BoardDAOimpl();
			List<BoardVO> list = dao.selectAll();

			for (BoardVO x : list) {
				System.out.println(x);
			}

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("board/selectAll.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/searchList.do")) {
			System.out.println("board/selectAll.jsp");
			String searchKey = request.getParameter("searchKey");
			String searchWord = request.getParameter("searchWord");

			BoardDAO dao = new BoardDAOimpl();
			List<BoardVO> list = dao.searchList(searchKey, searchWord);

			for (BoardVO x : list) {
				System.out.println(x);
			}

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("board/selectAll.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/update.do")) {
			System.out.println("board/update.jsp");
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

			RequestDispatcher rd = request.getRequestDispatcher("board/update.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/updateOK.do")) {
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
				response.sendRedirect("selectAll.do");
			} else {
				System.out.println("update failed..");
				response.sendRedirect("update.do?num=" + request.getParameter("num"));
			}

		} else if (sPath.equals("/deleteOK.do")) {
			System.out.println("num:" + request.getParameter("num"));

			BoardVO vo = new BoardVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));

			BoardDAO dao = new BoardDAOimpl();
			int result = dao.delete(vo);
			System.out.println("delete result:" + result);

			if (result > 0) {
				System.out.println("delete successed..");
				response.sendRedirect("selectAll.do");
			} else {
				System.out.println("delete failed..");
				response.sendRedirect("selectAll.do");
			}

		}

		// sPath: /selectOne.do >> selectOne() >> override >>board/selectOne.jsp
		// sPath: /selectAll.do >> selectAll() >> override >>web/selectAll.jsp
		// sPath: /update.do >> web/update.jsp
		// sPath: /updateOK.do >> update() >> override
		// sPath: /deleteOK.do >> delete() >> override
		// sPath: /searchList.do >> searchList() >> override >>web/selectAll.jsp

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
