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


	<form action="member_idCheck.iot_home" method="post">
		<table border="1">
			<tr>
				<td>아이디 중복확인</td>
				<td><input type="text" name="member_id"
					value="${param.member_id}"></td>
				<td><input type="submit" value="idCheck">${param.msg}</td>
			</tr>
		</table>
	</form>


	<form action="member_insertOK.iot_home" method="post">
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input type="text" name="member_name"
					value="${param.member_name}"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="member_id"
					value="${param.member_id}"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="member_pw"
					value="${param.member_pw}"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="member_tel"
					value="${param.member_tel}"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="member_email"
					value="${param.member_email}"></td>
			</tr>
			<tr>
				<td>주민번호</td>
				<td><input type="text" name="member_birth"
					value="${param.member_birth}"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="OK"></td>
			</tr>
		</table>
	</form>


</body>
</html>