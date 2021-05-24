<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
	<h1>update</h1>
	<hr>
	<jsp:include page="../menu.jsp"></jsp:include>
	<hr>

	<form action="updateOK.do" method="post">
	${param.num}<input type="hidden" name="num" value="${param.num}"}>
		<input type="text"name="name" value="${vo2.name"> 
		<input type="number" name="age"value="${vo2.age}"> 
		<input type="submit" value="OK">
	</form>


</body>
</html>