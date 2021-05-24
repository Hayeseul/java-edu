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
 * Servlet implementation class TestController
 */
@WebServlet({"/index.do", "/selectAll.do"})

public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *
	 */
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	String sPath = request.getServletPath();
		System.out.println("sPath:" + sPath);


	if (sPath.equals("/index.do")) {
		System.out.println("index.jsp");

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	else if (sPath.equals("/selectAll.do")) {
		System.out.println("web/selectAll.jsp");

		TestDAO dao = new TestDAOimpl();
		List<TestVO> list = dao.selectAll();  

		for (TestVO x : list) {
			System.out.println(x);
		}

		request.setAttribute("list", list);

		RequestDispatcher rd = request.getRequestDispatcher("web/selectAll.jsp");
		rd.forward(request, response);
		
	}
    }
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
