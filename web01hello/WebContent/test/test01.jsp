<%@page import="test.com.TestVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href = "../css/test01.css">
<script src = "../js/test01.js">
</script>
</head>
<body>
	<h1>test01.jsp</h1>
	<%
	//test.com.TestVO vo = new test.com.TestVO();
	TestVO vo = new TestVO();
	System.out.println(vo);
	
	String name = "kim";
	System.out.println("name : " +name);
	out.println("<h1>");
	out.println("name : " + name );
	out.println("</h1>");
	
	
	
	vo.setName(name);
	System.out.println(vo);
	System.out.println("vo.getName() : " + vo.getName());
	out.println("vo.getName() : " + vo.getName());
	%>
	
		<h1>name : <%= name %></h1>
		<h1>vo.getName() : <%= vo.getName() %></h1>
		<img alt="google logo" src="../image/캡쳐.png">
		
		<p> jsp 선언부 &lt;%@ %&gt;</p>
		<p> jsp 코딩부 &lt;% %&gt; </p>
		<p> jsp 표현부 &lt;%= %&gt; </p>
		
		
	
</body>
</html>