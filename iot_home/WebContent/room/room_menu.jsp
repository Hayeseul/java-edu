<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>room_menu</title>
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
	<h2>방 선택</h2>
	<jsp:include page="../menu.jsp"></jsp:include>

	<table border="1">

		<tr>
			<td><a href="room_selectOne.iot_home?room_num=1">room1</a></td>
			<td><a href="room_selectOne.iot_home?room_num=2">room2</a></td>
			<td><a href="room_selectOne.iot_home?room_num=3">room3</a></td>
		</tr>
	</table>

</body>
</html>