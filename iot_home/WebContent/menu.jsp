<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>menu</title>
<style>
table, th, td {
	border: 1px solid #bcbcbc;
}

table {
	width: 700px;
	height: 100px;
	margin-left: auto;
	margin-right: auto;
}

td, h2 {
	text-align: center;
}
</style>


</head>
<body>

	<table border="1">

		<tr>
			<td><a href="member_insert.iot_home">회원가입</a></td>
			<td><a href="index.iot_home">로그인</a></td>
			<c:if test='${sessionScope.userBirth == "111111-1111111"}'>
				<td><a href="member_selectAll.iot_home">회원 목록</a></td>
			</c:if>
			<c:if test='${sessionScope.userBirth != "111111-1111111"}'>
				<td><a href="member_selectAll.iot_home">나의 계정 </a></td>
			</c:if>

			<td><a href="room_menu.iot_home">Room</a></td>




		</tr>

	</table>

	<hr>


</body>
</html>