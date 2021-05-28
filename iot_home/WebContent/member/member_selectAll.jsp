<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member_selectAll</title>
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

form {
	/* Just to center the form on the page */
	margin: 5px;
}

form div+div {
	margin-top: 1em;
}
</style>
</head>
<body>
	<h2>계정 목록</h2>

	<jsp:include page="../menu.jsp"></jsp:include>


	<form action="member_searchList.iot_home">

		<select name="searchKey">
			<option value="member_name">이름</option>
			<option value="member_id">id</option>
			<option value="member_tel">전화번호</option>
			<option value="member_email">email</option>
		</select> <input type="text" name="searchWord" value=""> <input
			type="submit" value="search">

	</form>


	<table border="1">
		<tr>
			<th>NUM</th>
			<th>NAME</th>
			<th>ID</th>
			<th>TEL</th>
			<th>EMAIL</th>
			<th></th>
		</tr>
		<c:forEach var="vo" items="${list}">
			<c:if test='${sessionScope.userBirth == "111111-1111111"}'>
				<tr>
					<td><a
						href="member_selectOne.iot_home?member_num=${vo.member_num}">${vo.member_num}</a></td>
					<td>${vo.member_name}</td>
					<td>${vo.member_id}</td>
					<td>${vo.member_tel}</td>
					
					
					
					<td>${vo.member_email}</td>
					<td><a
						href="member_deleteOK.iot_home?member_num=${vo.member_num}">delete</a></td>
				</tr>
			</c:if>
			<c:if
				test='${sessionScope.userBirth != "111111-1111111" and sessionScope.userBirth==vo.member_birth}'>
				<tr>
					<td><a
						href="member_selectOne.iot_home?member_num=${vo.member_num}">${vo.member_num}</a></td>
					<td>${vo.member_name}</td>
					<td>${vo.member_id}</td>
					<td>${vo.member_tel}</td>
					<td>${vo.member_email}</td>
					<td><a
						href="member_deleteOK.iot_home?member_num=${vo.member_num}">delete</a></td>
				</tr>

			</c:if>
		</c:forEach>
	</table>






</body>
</html>