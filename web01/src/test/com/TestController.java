package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestController
 */
@WebServlet({ "/index.do", "/color.do" })
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sPath = request.getServletPath();
		System.out.println("sPath:" + sPath);
		//response.getWriter().append("Served at : ").append(request.getContextPath));
		
		//if(response.getWriter().append("Served at : ").append(request.getContextPath()));
		if (sPath.equals("/index.do")) {
			String str="";
	         try{            
	               //파일 객체 생성
	               File file = new File("/home/pi/tomcat9/webapps/web01/login.txt");
	               //입력 스트림 생성
	               FileReader filereader = new FileReader(file);
	               //입력 버퍼 생성
	               BufferedReader bufReader = new BufferedReader(filereader);
	               String line = "";
	               while((line = bufReader.readLine()) != null){            
	                  str = line;
	               }    
	               System.out.println(str);
	               bufReader.close();
	           }catch (FileNotFoundException e) {
	               // TODO: handle exception
	           }catch(IOException e){
	               System.out.println(e);
	           }finally {
	              response.getWriter().append(str);
	           }

		}else if (sPath.equals("/color.do")) {
			System.out.println("color.jsp");
			
			String str = "[\"red\",\"green\",\"yellow\"]";
					response.getWriter().append(str);

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
