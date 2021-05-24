<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>m_selectOne</title>
<style>
table, th, td {
	border: 1px solid #bcbcbc;
}

table {
	width: 1000px;
	height: 200px;
}

td {
	text-align: center;
}
</style>
</head>
<body>
	<h1>회원가입 검색</h1>

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