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
	<hr>
	<jsp:include page="../menu.jsp"></jsp:include>
	<hr>
	
	<form action="insertOK.do" method="post">
		<input type="text" name="name" value="Lee"> <input
			type="number" name="age" value="44"> <input type="submit"
			value="OK">
	</form>

</body>
</html>