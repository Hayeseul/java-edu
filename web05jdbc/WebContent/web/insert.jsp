<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>
</head>
<body>
	<h1>insert</h1>
	<jsp:include page="../menu.jsp"></jsp:include>


	<form action="insertOK.do" method="post">
		<input type="text" name="name" value="${name}">
		 <input type="number" name="age" value="${age}"> 
		 <input type="submit"value="OK">
	</form>
</body>
</html>