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
	margin-left:auto;
    margin-right:auto;
}

td ,h2{
	text-align: center;
}
</style>
</head>
<body>
	<h2>방 정보수정</h2>


	<jsp:include page="../menu.jsp"></jsp:include>

	<form action="room_updateOK.iot_home?room_num=${vo2.room_num}"
		method="post">
		<table border="1">

			<tr>
				<td>방번호</td>
				<td>${vo2.room_num}</td>
			</tr>
			<tr>
				<td>방이름</td>
				<td><input type="text" name="room_roomName"
					value="${vo2.room_roomName}"></td>
			</tr>
			<tr>
				<td>방가격</td>
				<td><input type="text" name="room_price"
					value="${vo2.room_price}"></td>
			</tr>
			<tr>
				<td>기준인원</td>
				<td><input type="text" name="room_minPerson"
					value="${vo2.room_minPerson}"></td>
			</tr>
			<tr>
				<td>최대인원</td>
				<td><input type="text" name="room_maxPerson"
					value="${vo2.room_maxPerson}"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="OK"></td>
			</tr>
		</table>
	</form>

</body>
</html>