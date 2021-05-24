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

	<jsp:include page="../menu.jsp"></jsp:include>

	<form action="updateOK.do" method="post">
		<input type="number" name="num" value="${vo2.num}"> 
		<input type="text" name="name" value="${vo2.name}"> 
		<input type="text" name="id"	value="${vo2.id}"> 
		<input type="text" name="pw"value="${vo2.pw}"> 
		<input type="text" name="tel"value="${vo2.tel}"> 
		<input type="submit" value="OK">
	</form>

</body>
</html>