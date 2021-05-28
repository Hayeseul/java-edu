<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="EUC-KR">
<title>member_insert</title>
<style>
table, th, td {
	border: 1px solid #bcbcbc;
}

table {
	width: 1000px;
	height: 200px;
	margin-left: auto;
	margin-right: auto;
}

td, h2 {
	text-align: center;
}
</style>
</head>
<body>
	<h2>회원가입</h2>

	<jsp:include page="../menu.jsp"></jsp:include>





	<form action="index.iot_home" method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td>${param.member_id}</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>${param.member_pw}</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="OK"></td>
			</tr>
		</table>
	</form>


</body>
</html>