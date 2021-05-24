<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>

<style>
table, th, td {
	border: 1px solid #bcbcbc;

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
	<h1>회원가입</h1>

	<jsp:include page="../menu.jsp"></jsp:include>
	
	
	<form action="rs_insertOK.do" method="post">
		<table border="1">
			<tr>
				<td>이름 :</td>
				<td><input type="text" name="name" value="하예슬"></td>
			</tr>
			<tr>
				<td>영화 :</td>
				<td><input type="text" name="movie" value="${param.movie}"></td>
			</tr>
			<tr>
				<td>요일 :</td>
				<td><input type="text" name="day" value="${param.day}"></td>
			</tr>
			<tr>
				<td>시간 :</td>
				<td><input type="text" name="time" value="${param.time}"></td>
			</tr>
			<tr>
				<td>카드번호 :</td>
				<td><input type="text" name="card" value="${param.card}"></td>
			</tr>
			<tr>
			<td></td>
				<td><input type="submit" value="OK"></td>
			</tr>
		</table>
	</form>

</body>
</html>