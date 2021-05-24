package test.com;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestController
 */
@WebServlet({ "/index.do", "/insertOK.do", "/insert.do", "/selectOne.do", "/selectAll.do", "/update.do", "/updateOK.do",
		"/deleteOK.do", "/searchList.do" })
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestController() {
		super();
		System.out.println("TestController()");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String sPath = request.getServletPath();
		System.out.println("sPath:" + sPath);

		if (sPath.equals("/index.do")) {
			System.out.println("index.jsp");

			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/insertOK.do")) {

			System.out.println(request.getParameter("name"));
			System.out.println(request.getParameter("age"));

			TestVO vo = new TestVO();
			vo.setName(request.getParameter("name"));
			vo.setAge(Integer.parseInt(request.getParameter("age")));

			TestDAO dao = new TestDAOimpl();
			int result = dao.insert(vo);
			System.out.println("insert result:" + result);

			if (result == 1)
				response.sendRedirect("index.do");
			else
				response.sendRedirect("insert.do");

		} else if (sPath.equals("/insert.do")) {
			System.out.println("web/insert.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("web/insert.jsp");
			rd.forward(request, response);
			
			
			
			
		} else if (sPath.equals("/selectOne.do")) {
			System.out.println("web/selectOne.jsp");
			System.out.println("num : " + request.getParameter("num"));

			TestVO vo = new TestVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));

			TestDAO dao = new TestDAOimpl();
			TestVO vo2 = dao.selectOne(vo);
			System.out.println(vo2);

			request.setAttribute("vo2", vo2);

			RequestDispatcher rd = request.getRequestDispatcher("web/selectOne.jsp");
			rd.forward(request, response);
			
			

		} else if (sPath.equals("/selectAll.do")) {
			System.out.println("web/selectAll.jsp");

			TestDAO dao = new TestDAOimpl();
			List<TestVO> list = dao.selectAll();

			for (TestVO x : list) {
				System.out.println(x);
			}

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("web/selectAll.jsp");
			rd.forward(request, response);
		} else if (sPath.equals("/searchList.do")) {
			System.out.println("web/selectAll.jsp");
			String searchKey = request.getParameter("searchKey");
			String searchWord = request.getParameter("searchWord");

			TestDAO dao = new TestDAOimpl();
			List<TestVO> list = dao.searchList(searchKey, searchWord);

			for (TestVO x : list) {
				System.out.println(x);
			}

			RequestDispatcher rd = request.getRequestDispatcher("web/selectAll.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/update.do")) {
			System.out.println("web/update.jsp");
			System.out.println("num:" + request.getParameter("num"));

			TestVO vo = new TestVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));

			TestDAO dao = new TestDAOimpl();
			TestVO vo2 = dao.selectOne(vo);
			System.out.println(vo2);

			request.setAttribute("vo2", vo2);

			RequestDispatcher rd = request.getRequestDispatcher("web/selectOne.jsp");
			rd.forward(request, response);
			
			

		} else if (sPath.equals("/updateOK.do")) {
			System.out.println("num:" + request.getParameter("num"));
			System.out.println("name:" + request.getParameter("name"));
			System.out.println("age:" + request.getParameter("age"));

			TestVO vo = new TestVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));
			vo.setName(request.getParameter("name"));
			vo.setAge(Integer.parseInt(request.getParameter("age")));

			TestDAO dao = new TestDAOimpl();
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

			TestVO vo = new TestVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));

			TestDAO dao = new TestDAOimpl();
			int result = dao.delete(vo);
			System.out.println("delete result:" + result);

			if (result > 0) {
				System.out.println("delete successed..");
				response.sendRedirect("selectAll.do");
			} else {
				System.out.println("delete failed..");
				response.sendRedirect(".do");
			}

		}

		// sPath: /selectOne.do >> selectOne() >> override >>web/selectOne.jsp
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