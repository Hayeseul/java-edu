<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>selectOne</title>
</head>
<body>
	<h1>selectOne</h1>

	<jsp:include page="../menu.jsp"></jsp:include>
	
	<table border="1">
		<tr>
			<td>NUM</td><td>${vo2.num}</td>
		</tr>
		<tr>
			<td>NAME</td><td>${vo2.name}</td>
		</tr>
		<tr>
			<td>ID</td><td>${vo2.id}</td>
		</tr>
		<tr>
			<td>PW</td><td>${vo2.pw}</td>
		</tr>
		<tr>
			<td>TEL</td><td>${vo2.tel}</td>
		</tr>
		<tr>
			<td></td><td><a href="update.do?num=${vo2.num}">update</a></td>
		</tr>
	</table>

</body>
</html>