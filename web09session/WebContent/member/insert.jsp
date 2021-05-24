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
	

	

		<form action="idCheck.do" method="post">
			<input type="text" name="id" value="admin"> 
			<input type="submit" value="idCheck">${param.msg}
		</form>

	<form action="insertOK.do" method="post">
		<table border="1">
			<tr>
				<td>이름 :</td>
				<td><input type="text" name="name" value="${name}"></td>
			</tr>
			<tr>
				<td>아이디 :</td>
				<td><input type="text" name="id" value="${param.id}"></td>
			</tr>
			<tr>
				<td>비밀번호 :</td>
				<td><input type="text" name="pw" value="${pw}"></td>
			</tr>
			<tr>
				<td>전화번호 :</td>
				<td><input type="text" name="tel" value="${tel}"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="OK"></td>
			</tr>
		</table>
	</form>

</body>
</html>