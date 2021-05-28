<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

td, h1 {
	text-align: center;
}
</style>
</head>
<body>
	<h2>방 세부정보</h2>

	<jsp:include page="../menu.jsp"></jsp:include>

	<table border="1">
		<tr>
			<td>방이름</td>
			<td>${vo2.room_roomName}</td>
		</tr>
		<tr>
			<td>방가격</td>
			<td>${vo2.room_price}</td>
		</tr>
		<tr>
			<td>기준인원</td>
			<td>${vo2.room_minPerson}</td>
		</tr>
		<tr>
			<td>최대인원</td>
			<td>${vo2.room_maxPerson}</td>
		</tr>

		<c:if test='${sessionScope.userBirth == "111111-1111111"}'>
			<tr>
				<td></td>
				<td><a href="room_update.iot_home?room_num=${vo2.room_num}">수정</a></td>
			</tr>
		</c:if>



	</table>

</body>
</html>