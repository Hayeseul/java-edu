<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<h1>영화 세부사항</h1>

	<jsp:include page="../menu.jsp"></jsp:include>
	
	<table border="1">

		<tr>
			<td>NUM</td><td>${vo2.num}</td>
		</tr>
		<tr>
			<td>MOVIE</td><td>${vo2.movie}</td>
		</tr>
		<tr>
			<td>CONTENT</td><td>${vo2.content}</td>
		</tr>
		<tr>
			<td>RUNNINGTIME</td><td>${vo2.runningtime}</td>
		</tr>
			<tr>
			<td></td><td><a href="mv2_selectAll.do?num=${vo2.num}">상영시간표보기</a></td>
		</tr>

		<table>

</body>
</html>