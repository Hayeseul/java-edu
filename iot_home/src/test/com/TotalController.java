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
 * Servlet implementation class MemberController
 */
@WebServlet({ "/index.iot_home", "/member_insertOK.iot_home", "/member_insert.iot_home", "/member_idCheck.iot_home",
		"/member_loginOK.iot_home", "/member_logout.iot_home", "/member_selectAll.iot_home",
		"/member_searchList.iot_home", "/member_selectOne.iot_home", "/member_update.iot_home",
		"/member_updateOK.iot_home", "/member_deleteOK.iot_home", "/member_idfind.iot_home",
		"/member_idfindOK.iot_home", "/member_idfound.iot_home", "/room_menu.iot_home", "/room_selectOne.iot_home",
		"/room_update.iot_home", "/room_updateOK.iot_home" })

public class TotalController extends HttpServlet {
	private static final long serialVersionUID = 1L;

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

		if (sPath.equals("/index.iot_home")) {
			System.out.println("index.jsp");

			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/member_insertOK.iot_home")) {

			System.out.println(request.getParameter("member_name"));
			System.out.println(request.getParameter("member_id"));
			System.out.println(request.getParameter("member_pw"));
			System.out.println(request.getParameter("member_tel"));
			System.out.println(request.getParameter("member_email"));
			System.out.println(request.getParameter("member_birth"));

			MemberVO vo = new MemberVO();
			vo.setMember_name(request.getParameter("member_name"));
			vo.setMember_id(request.getParameter("member_id"));
			vo.setMember_pw(request.getParameter("member_pw"));
			vo.setMember_tel(request.getParameter("member_tel"));
			vo.setMember_email(request.getParameter("member_email"));
			vo.setMember_birth(request.getParameter("member_birth"));

			MemberDAO dao = new MemberDAOimpl();
			int result = dao.member_insert(vo);
			System.out.println("member_insert result:" + result);

			if (result == 1) {
				response.sendRedirect("index.iot_home");
			} else {
				response.sendRedirect("member_insert.iot_home");
			}

		} else if (sPath.equals("/member_insert.iot_home")) {
			System.out.println("member/member_insert.jsp");
			// 寃쎈줈媛� insert.do濡� 媛�寃뚮릺硫�

			RequestDispatcher rd = request.getRequestDispatcher("member/member_insert.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/member_idCheck.iot_home")) {
			System.out.println(request.getParameter("member_id"));

			MemberVO vo = new MemberVO();
			vo.setMember_id(request.getParameter("member_id"));

			MemberDAO dao = new MemberDAOimpl();
			String result = dao.member_idCheck(vo);

			if (result != "NotOK") {
				response.sendRedirect("member_insert.iot_home?member_id=" + vo.getMember_id() + "&msg=" + result);
			} else {
				response.sendRedirect("member_insert.iot_home?member_id=" + " " + "&msg=" + result);
			}

		} else if (sPath.equals("/member_loginOK.iot_home")) {
			System.out.println(request.getParameter("member_id"));
			System.out.println(request.getParameter("member_pw"));

			MemberVO vo = new MemberVO();
			vo.setMember_id(request.getParameter("member_id"));
			vo.setMember_pw(request.getParameter("member_pw"));

			MemberDAO dao = new MemberDAOimpl();
			MemberVO vo2 = dao.member_loginOK(vo);

			System.out.println(vo2);
			if (vo2 != null) {
				request.getSession().setAttribute("login", "successed");
				request.getSession().setAttribute("userID", request.getParameter("member_id"));
				// request.getSession().setAttribute("userBirth",
				// request.getParameter("member_birth"));
				request.getSession().setAttribute("userBirth", vo2.getMember_birth());

				request.getSession().setMaxInactiveInterval(300);
				System.out.println(request.getSession().getMaxInactiveInterval());

			}

			response.sendRedirect("index.iot_home");

		} else if (sPath.equals("/member_logout.iot_home")) {

			request.getSession().invalidate(); // 모든 세션 제거
			response.sendRedirect("index.iot_home");
		} else if (sPath.equals("/member_selectAll.iot_home")) {

			System.out.println("member/member_selectAll.jsp");

			String loginSession = (String) request.getSession().getAttribute("login");
			String userBirth = (String) request.getSession().getAttribute("userBirth");

			System.out.println(loginSession);
			System.out.println(userBirth);

			if (loginSession == null || loginSession.equals("failed")) {
				response.sendRedirect("index.iot_home");

			} else {

				MemberDAO dao = new MemberDAOimpl();
				List<MemberVO> list = dao.member_selectAll();

				for (MemberVO x : list) {
					System.out.println(x);
				}

				request.setAttribute("list", list);

				RequestDispatcher rd = request.getRequestDispatcher("member/member_selectAll.jsp");
				rd.forward(request, response);
			}
		} else if (sPath.equals("/member_searchList.iot_home")) {
			System.out.println("member/member_selectAll.jsp");

			String loginSession = (String) request.getSession().getAttribute("login");
			String userBirth = (String) request.getSession().getAttribute("userBirth");

			System.out.println(loginSession);
			System.out.println(userBirth);

			if (loginSession == null || loginSession.equals("failed")) {
				response.sendRedirect("index.iot_home");
			} else {
				String searchKey = request.getParameter("searchKey");
				String searchWord = request.getParameter("searchWord");

				MemberDAO dao = new MemberDAOimpl();
				List<MemberVO> list = dao.member_searchList(searchKey, searchWord);

				for (MemberVO x : list) {
					System.out.println(x);
				}

				request.setAttribute("list", list);

				RequestDispatcher rd = request.getRequestDispatcher("member/member_selectAll.jsp");
				rd.forward(request, response);
			}
		} else if (sPath.equals("/member_selectOne.iot_home")) {
			System.out.println("member/member_selectOne.jsp");
			System.out.println("member_num:" + request.getParameter("member_num"));

			MemberVO vo = new MemberVO();
			vo.setMember_num(Integer.parseInt(request.getParameter("member_num")));

			MemberDAO dao = new MemberDAOimpl();
			MemberVO vo2 = dao.member_selectOne(vo);
			System.out.println(vo2);

			request.setAttribute("vo2", vo2);

			RequestDispatcher rd = request.getRequestDispatcher("member/member_selectOne.jsp");
			rd.forward(request, response);
		} else if (sPath.equals("/member_update.iot_home")) {
			System.out.println("member/member_update.jsp");
			System.out.println("member_num:" + request.getParameter("member_num"));

			MemberVO vo = new MemberVO();
			vo.setMember_num(Integer.parseInt(request.getParameter("member_num")));

			MemberDAO dao = new MemberDAOimpl();
			MemberVO vo2 = dao.member_selectOne(vo);
			System.out.println(vo2);

			request.setAttribute("vo2", vo2);

			RequestDispatcher rd = request.getRequestDispatcher("member/member_update.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/member_updateOK.iot_home")) {
			System.out.println("member_num:" + request.getParameter("member_num"));
			System.out.println("member_name:" + request.getParameter("member_name"));
			System.out.println("member_id:" + request.getParameter("member_id"));
			System.out.println("member_pw:" + request.getParameter("member_pw"));
			System.out.println("member_tel:" + request.getParameter("member_tel"));
			System.out.println("member_email:" + request.getParameter("member_email"));
			System.out.println("member_birth :" + request.getParameter("member_birth"));

			MemberVO vo = new MemberVO();
			vo.setMember_num(Integer.parseInt(request.getParameter("member_num")));
			vo.setMember_name(request.getParameter("member_name"));
			vo.setMember_id(request.getParameter("member_id"));
			vo.setMember_pw(request.getParameter("member_pw"));
			vo.setMember_tel(request.getParameter("member_tel"));
			vo.setMember_email(request.getParameter("member_email"));
			vo.setMember_birth(request.getParameter("member_birth"));

			MemberDAO dao = new MemberDAOimpl();
			int result = dao.member_update(vo);
			System.out.println("member_update result:" + result);

			if (result > 0) {
				System.out.println("member_delete successed..");
				response.sendRedirect("member_selectAll.iot_home");
			} else {
				System.out.println("member_delete failed..");
				response.sendRedirect("member_selectAll.iot_home");
			}


		} else if (sPath.equals("/member_deleteOK.iot_home")) {
			System.out.println("member_num:" + request.getParameter("member_num"));

			MemberVO vo = new MemberVO();
			vo.setMember_num(Integer.parseInt(request.getParameter("member_num")));

			MemberDAO dao = new MemberDAOimpl();
			int result = dao.member_delete(vo);
			System.out.println("member_delete result:" + result);

			if (result > 0) {
				System.out.println("member_delete successed..");
				response.sendRedirect("member_selectAll.iot_home");
			} else {
				System.out.println("member_delete failed..");
				response.sendRedirect("member_selectAll.iot_home");
			}

		} else if (sPath.equals("/member_idfind.iot_home")) {
			RequestDispatcher rd = request.getRequestDispatcher("member/member_idfind.jsp");
			rd.forward(request, response);
		} else if (sPath.equals("/member_idfindOK.iot_home")) {
			MemberVO vo = new MemberVO();
			MemberDAO dao = new MemberDAOimpl();

			vo.setMember_name(request.getParameter("member_name"));
			vo.setMember_email(request.getParameter("member_email"));

			MemberVO vo2 = dao.member_idFind(vo);

			if (vo2.getMember_id() == null) {
				response.sendRedirect("member_idfind.iot_home?msg=NotID");
			} else {
				String str = vo2.getMember_pw();
				int str_length = str.length();
				str = str.substring(0, 4);
				for (int i = 0; i < (str_length - 4); i++) {
					str = str.concat("*");
				}
				response.sendRedirect("member_idfound.iot_home?member_id=" + vo2.getMember_id() + "&member_pw=" + str);
				System.out.println(vo2.getMember_id());
				System.out.println(vo2.getMember_pw());
			}

		} else if (sPath.equals("/member_idfound.iot_home"))

		{
			RequestDispatcher rd = request.getRequestDispatcher("member/member_idfound.jsp");
			rd.forward(request, response);
		} else if (sPath.equals("/room_menu.iot_home")) {

			System.out.println("room/room_menu.jsp");

			RequestDispatcher rd = request.getRequestDispatcher("room/room_menu.jsp");
			rd.forward(request, response);
		}

		/////////////////////////////////////////////////////////////////////////////////////
		else if (sPath.equals("/room_selectOne.iot_home")) {
			System.out.println("room/room_selectOne.jsp");

			System.out.println("room_num:" + request.getParameter("room_num"));

			RoomVO vo = new RoomVO();
			vo.setRoom_num(Integer.parseInt(request.getParameter("room_num")));

			RoomDAO dao = new RoomDAOimpl();
			RoomVO vo2 = dao.room_selectOne(vo);
			System.out.println(vo2);

			request.setAttribute("vo2", vo2);

			RequestDispatcher rd = request.getRequestDispatcher("room/room_selectOne.jsp");
			rd.forward(request, response);
		} else if (sPath.equals("/room_update.iot_home")) {
			System.out.println("room/room_update.jsp");
			System.out.println("room_num:" + request.getParameter("room_num"));

			RoomVO vo = new RoomVO();
			vo.setRoom_num(Integer.parseInt(request.getParameter("room_num")));

			RoomDAO dao = new RoomDAOimpl();
			RoomVO vo2 = dao.room_selectOne(vo);
			System.out.println(vo2);

			request.setAttribute("vo2", vo2);

			RequestDispatcher rd = request.getRequestDispatcher("room/room_update.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/room_updateOK.iot_home")) {
			System.out.println("room_num:" + request.getParameter("room_num"));
			System.out.println("room_roomName:" + request.getParameter("room_roomName"));
			System.out.println("room_price:" + request.getParameter("room_price"));
			System.out.println("room_minPerson:" + request.getParameter("room_minPerson"));
			System.out.println("room_maxPerson:" + request.getParameter("room_maxPerson"));

			RoomVO vo = new RoomVO();
			vo.setRoom_num(Integer.parseInt(request.getParameter("room_num")));
			vo.setRoom_roomName(request.getParameter("room_roomName"));
			vo.setRoom_price(request.getParameter("room_price"));
			vo.setRoom_minPerson(request.getParameter("room_minPerson"));
			vo.setRoom_maxPerson(request.getParameter("room_maxPerson"));

			RoomDAO dao = new RoomDAOimpl();
			int result = dao.room_update(vo);
			System.out.println("update result:" + result);

			if (result > 0) {
				System.out.println("update successed..");
				response.sendRedirect("room_selectOne.iot_home?room_num=" + request.getParameter("room_num"));
			} else {
				System.out.println("update failed..");
				response.sendRedirect("room_update.iot_home?room_num=" + request.getParameter("room_num"));
			}

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
