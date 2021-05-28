<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member_update</title>
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
	<h2>정보수정</h2>


	<jsp:include page="../menu.jsp"></jsp:include>

	<form action="member_updateOK.iot_home?member_num=${vo2.member_num}"
		method="post">
		<table border="1">

			<tr>
				<td>번호</td>
				<td>${param.member_num}<input type="hidden" name="member_num"
					value="${param.member_num}"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="member_name"
					value="${vo2.member_name}"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>${vo2.member_id}</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="member_pw"
					value="${vo2.member_pw}"></td>
			</tr>
			<tr>
				<td>휴대폰번호</td>
				<td><input type="text" name="member_tel"
					value="${vo2.member_tel}"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="member_email"
					value="${vo2.member_email}"></td>
			</tr>
			<tr>
				<td>생일</td>
				<td>${vo2.member_birth}</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="OK"></td>
			</tr>
		</table>
	</form>

</body>
</html>