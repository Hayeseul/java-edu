package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("JDBC.....");

		// 오라클 데이터베이스로 SQL배울것이기 때문에 오라클연동
		// 1.jdbc 라이브러리 다운로드(디비마다 다르다)
		// 2.프로젝트에 jdbc라이브러리 경로설정
		// 3.드라이버객체 찾기(디비마다 다르다) oracle.jdbc.OracleDriver
		// 클래스객체 찾는 메소드 Class.forName()

//      try {
////         Class.forName("java.lang.String");
////         Class.forName("test.com.Test01Main");
//         Class.forName("oracle.jdbc.OracleDriver");
//         System.out.println("찾기성공");
//      } catch (ClassNotFoundException e) {
//         e.printStackTrace();
//      }
		// DAO의 생성자에서 구현
		// DAO객체생성
		Test01DAO dao = new Test01DAOimpl();

		// 4.DB Connection : url,userID,userPW
		Test01VO vo = new Test01VO();
		vo.setNum(4);
		vo.setName("kim2");
		vo.setAge(22);
		int result = dao.insert(vo);
		System.out.println("insert result:" + result);

		System.out.println("=============");
		vo = new Test01VO();
		vo.setNum(1);
		vo.setName("yangssem");
		vo.setAge(20);
		result = dao.update(vo);
		System.out.println("update result:" + result);

		System.out.println("=============");
		vo = new Test01VO();
		vo.setNum(29);
		// vo.setName("yangssem");
		// vo.setAge(20);
		result = dao.delete(vo);
		System.out.println("delete result:" + result);

		System.out.println("=============");
		vo = new Test01VO();
		vo.setNum(33);
		// vo.setName("kim33");
		// vo.setAge(33);
		Test01VO vo2 = dao.selectOne(vo);
		System.out.println(vo2);

		System.out.println("=============");
		List<Test01VO> list = dao.selectAll();
		for (Test01VO x : list) {
			System.out.println(x);
		}

		System.out.println("=============");
		list = dao.searchList("name", "k");
		// list = dao.searchList("age" , "2");
		for (Test01VO x : list) {
			System.out.println(x);
		}

//      Connection conn = null;
//      try {
//         conn = DriverManager.getConnection("", "", "");
//         System.out.println("conn successed...");
//      } catch (SQLException e) {
//         e.printStackTrace();
//      }finally {
//         if(conn!=null) {
//            try {
//               conn.close();
//            } catch (SQLException e) {
//               e.printStackTrace();
//            }
//         }
//      }

		// 5.SQL문 전달:insert,update,delete,select

		// 6.SQL문 처리결과에 대한 응답처리 및 디스플레이

	}

}