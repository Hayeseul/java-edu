package test.com;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class MemberController
 */
@WebServlet({ "/index.do", "/m_insertOK.do", "/m_insert.do", "/m_selectOne.do", "/m_selectAll.do", "/m_update.do",
		"/m_updateOK.do", "/m_deleteOK.do", "/m_searchList.do", "/idCheck.do", "/loginOK.do", "/m_logout.do",
		"/mv_selectOne.do", "/mv_selectAll.do", "/mv_searchList.do", "/mv2_selectAll.do", "/mv2_searchList.do",
		"/rs_deleteOK.do", "/rs_insertOK.do", "/rs_insert.do", "/rs_searchList.do", "/rs_selectAll.do" })
public class TotalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	private Object dao;
	private ServletResponse response;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TotalController() {
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

		} else if (sPath.equals("/m_insertOK.do")) {

			String uploadPath = request.getServletContext().getRealPath("upload");
			System.out.println("uploadPath:" + uploadPath);

			int size = 10 * 1024 * 1024;

			try {
				MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "UTF-8",
						new DefaultFileRenamePolicy());

				Enumeration files = multi.getFileNames();

				String pusa1 = (String) files.nextElement();
				System.out.println("pusa1:" + pusa1);
				String filename = multi.getFilesystemName(pusa1);
				System.out.println("filename:" + filename);

				System.out.println(multi.getParameter("name"));
				System.out.println(multi.getParameter("id"));
				System.out.println(multi.getParameter("pw"));
				System.out.println(multi.getParameter("tel"));
				System.out.println(multi.getParameter("email"));
				System.out.println(multi.getParameter("birth_yy"));
				System.out.println(multi.getParameter("birth_mm"));
				System.out.println(multi.getParameter("birth_dd"));
				System.out.println(multi.getParameter("gender"));
				System.out.println(filename);

				MemberVO vo = new MemberVO();
				vo.setName(multi.getParameter("name"));
				vo.setId(multi.getParameter("id"));
				vo.setPw(multi.getParameter("pw"));
				vo.setTel(multi.getParameter("tel"));
				vo.setEmail(multi.getParameter("email"));
				vo.setBirth(multi.getParameter("birth_yy") + multi.getParameter("birth_mm")
						+ multi.getParameter("birth_dd"));
				vo.setGender(multi.getParameter("gender"));
				vo.setImage(filename);

				MemberDAO dao = new MemberDAOimpl();
				int result = dao.insert(vo);
				System.out.println("insert result:" + result);

				if (result == 1) {
					response.sendRedirect("index.do");
					System.out.println("가입 성공");
				}

				else {
					response.sendRedirect("m_insert.do");
					System.out.println("가입 실패!!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

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

			MemberVO vo = new MemberVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));

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
			System.out.println("email:" + request.getParameter("email"));
			System.out.println("birth_yy" + request.getParameter("birth_yy"));
			System.out.println("birth_mm" + request.getParameter("birth_mm"));
			System.out.println("birth_dd" + request.getParameter("birth_dd"));
			System.out.println("gender:" + request.getParameter("gender"));

			MemberVO vo = new MemberVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));
			vo.setName(request.getParameter("name"));
			vo.setId(request.getParameter("id"));
			vo.setPw(request.getParameter("pw"));
			vo.setTel(request.getParameter("tel"));
			vo.setEmail(request.getParameter("email"));
			vo.setBirth(request.getParameter("birth_yy") + request.getParameter("birth_mm")
					+ request.getParameter("birth_dd"));
			vo.setGender(request.getParameter("gender"));

			MemberDAO dao = new MemberDAOimpl();
			int result = dao.update(vo);
			System.out.println("update result:" + result);

			if (result > 0) {
				System.out.println("update successed..");
				response.sendRedirect("m_selectAll.do");
			} else {
				System.out.println("update failed..");
				response.sendRedirect("m_update.do?num=" + request.getParameter("num"));
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

		} else if (sPath.equals("/idCheck.do")) {
			System.out.println(request.getParameter("id"));

			MemberVO vo = new MemberVO();
			vo.setId(request.getParameter("id"));

			MemberDAO dao = new MemberDAOimpl();
			String result = dao.idCheck(vo);

			response.sendRedirect("m_insert.do?id=" + vo.getId() + "&msg=" + result);

		} else if (sPath.equals("/loginOK.do")) {
			System.out.println(request.getParameter("id"));
			System.out.println(request.getParameter("pw"));

			MemberVO vo = new MemberVO();
			vo.setId(request.getParameter("id"));
			vo.setPw(request.getParameter("pw"));

			MemberDAO dao = new MemberDAOimpl();
			MemberVO vo2 = dao.loginOK(vo);
			System.out.println(vo2);
			if (vo2 != null) {
				request.getSession().setAttribute("login", "successed");
				request.getSession().setAttribute("userID", request.getParameter("id"));
				request.getSession().setAttribute("filename", vo2.getImage());
				request.getSession().setMaxInactiveInterval(300);
				System.out.println(request.getSession().getMaxInactiveInterval());

			}

			response.sendRedirect("index.do");

		}

		else if (sPath.equals("/m_logout.do")) {

			request.getSession().invalidate(); // 모든 세션 제거
			response.sendRedirect("index.do");

		} else if (sPath.equals("/mv_selectOne.do")) {
			System.out.println("/mv_selectOne.jsp");
			System.out.println("num:" + request.getParameter("num"));

			MovieVO vo = new MovieVO();
			vo.setNum(Integer.parseInt(request.getParameter("num")));

			MovieDAO dao = new MovieDAOimpl();
			MovieVO vo2 = dao.selectOne(vo);
			System.out.println(vo2);

			request.setAttribute("vo2", vo2);

			RequestDispatcher rd = request.getRequestDispatcher("movie/mv_selectOne.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/mv_selectAll.do")) {

			System.out.println("movie/mv_selectAll.jsp");

			String loginSession = (String) request.getSession().getAttribute("login");

			System.out.println(loginSession);

			if (loginSession == null || loginSession.equals("failed")) {
				response.sendRedirect("index.do");

			} else {

				MovieDAO dao = new MovieDAOimpl();
				List<MovieVO> list = dao.selectAll();

				for (MovieVO x : list) {
					System.out.println(x);
				}

				request.setAttribute("list", list);

				RequestDispatcher rd = request.getRequestDispatcher("movie/mv_selectAll.jsp");
				rd.forward(request, response);
			}

		} else if (sPath.equals("/mv_searchList.do")) {
			System.out.println("movie/mv_selectAll.jsp");
			String searchKey = request.getParameter("searchKey");
			String searchWord = request.getParameter("searchWord");

			MovieDAO dao = new MovieDAOimpl();
			List<MovieVO> list = dao.searchList(searchKey, searchWord);

			for (MovieVO x : list) {
				System.out.println(x);
			}

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("movie/mv_selectAll.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/mv2_selectAll.do")) {

			System.out.println("movie/mv2_selectAll.jsp");

			Movie2DAO dao = new Movie2DAOimpl();
			List<Movie2VO> list = dao.selectAll();

			for (Movie2VO x : list) {
				System.out.println(x);
			}

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("movie/mv2_selectAll.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/mv2_searchList.do")) {
			System.out.println("movie/mv2_selectAll.jsp");
			String searchKey = request.getParameter("searchKey");
			String searchWord = request.getParameter("searchWord");

			Movie2DAO dao = new Movie2DAOimpl();
			List<Movie2VO> list = dao.searchList(searchKey, searchWord);

			for (Movie2VO x : list) {
				System.out.println(x);
			}

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("movie/mv2_selectAll.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/rs_insertOK.do")) {

			System.out.println(request.getParameter("name"));
			System.out.println(request.getParameter("movie"));
			System.out.println(request.getParameter("day"));
			System.out.println(request.getParameter("time"));
			System.out.println(request.getParameter("card"));

			ReservationVO vo = new ReservationVO();
			vo.setName(request.getParameter("name"));
			vo.setMovie(request.getParameter("movie"));
			vo.setDay(request.getParameter("day"));
			vo.setTime(request.getParameter("time"));
			vo.setCard(request.getParameter("card"));

			ReservationDAO dao = new ReservationDAOimpl();
			int result = dao.insert(vo);
			System.out.println("insert result:" + result);

			if (result == 1) {
				response.sendRedirect("rs_selectAll.do");
				System.out.println("예약 성공");
			}

			else {
				response.sendRedirect("rs_insert.do");
				System.out.println("예약 실패!!");
			}

		} else if (sPath.equals("/rs_insert.do")) {
			System.out.println("reserve/rs_insert.jsp");

			RequestDispatcher rd = request.getRequestDispatcher("reserve/rs_insert.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/rs_selectAll.do")) {

			System.out.println("reserve/rs_selectAll.jsp");

			Movie2DAO dao = new Movie2DAOimpl();
			List<Movie2VO> list = dao.selectAll();

			for (Movie2VO x : list) {
				System.out.println(x);
			}

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("reserve/rs_selectAll.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/rs_searchList.do")) {
			System.out.println("reserve/rs_selectAll.jsp");
			String searchKey = request.getParameter("searchKey");
			String searchWord = request.getParameter("searchWord");

			ReservationDAO dao = new ReservationDAOimpl();
			List<ReservationVO> list = dao.searchList(searchKey, searchWord);

			for (ReservationVO x : list) {
				System.out.println(x);
			}

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("reserve/rs_selectAll.jsp");
			rd.forward(request, response);
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
