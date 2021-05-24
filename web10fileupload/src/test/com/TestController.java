package test.com;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class TestController
 */
@WebServlet({ "/index.do", "/insert.do", "/insertOK.do" })
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		String sPath = request.getServletPath();
		if (sPath.equals("/index.do")) {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/insert.do")) {

			RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");
			rd.forward(request, response);

		} else if (sPath.equals("/insertOK.do")) {

			String uploadPath = request.getServletContext().getRealPath("upload");
			System.out.println("uploadPath:"+uploadPath);
			
			int size = 10 * 1024 * 1024;

			try {
				MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "UTF-8",
						new DefaultFileRenamePolicy());

				String name = multi.getParameter("name");
				String age = multi.getParameter("age");

				Enumeration files = multi.getFileNames();

				String pusa1 = (String) files.nextElement();
				System.out.println("pusa1:"+pusa1);
				String filename = multi.getFilesystemName(pusa1);
				System.out.println("filename:"+filename);
				response.sendRedirect("index.do?filename="+filename);
//				String pusa2 = (String) files.nextElement();
//				String filename2 = multi.getFilesystemName(pusa2);
//				System.out.println("filename2:"+filename2);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

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
