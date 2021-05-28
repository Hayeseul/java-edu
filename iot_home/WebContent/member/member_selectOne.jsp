<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member_selectOne</title>
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
	<h2>회원</h2>

	<jsp:include page="../menu.jsp"></jsp:include>

	<table border="1">
		<tr>
			<td>NUM</td>
			<td>${vo2.member_num}</td>
		</tr>
		<tr>
			<td>NAME</td>
			<td>${vo2.member_name}</td>
		</tr>
		<tr>
			<td>ID</td>
			<td>${vo2.member_id}</td>
		</tr>
		<tr>
			<td>PW</td>
			<td>${vo2.member_pw}</td>
		</tr>
		<tr>
			<td>TEL</td>
			<td>${vo2.member_tel}</td>
		</tr>
		<tr>
			<td>EMAIL</td>
			<td>${vo2.member_email}</td>
		</tr>
		<tr>
			<td>BIRTH</td>
			<td>${vo2.member_birth}</td>
		</tr>
		<tr>
			<td></td>
			<td><a
				href="member_update.iot_home?member_num=${vo2.member_num}">수정</a></td>
		</tr>
	</table>

</body>
</html>