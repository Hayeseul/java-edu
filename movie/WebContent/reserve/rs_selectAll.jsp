<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>m_selectAll</title>
<style>
table, th, td {
	border: 1px solid #bcbcbc;
}

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
	<h1>예약목록</h1>
	<jsp:include page="../menu.jsp"></jsp:include>

	<form action="rs_searchList.do">
		<select name="searchKey">
			<option value="movie">영화</option>

		</select>
		 <input type="text" name="searchWord" value="" > 
		 <input type="submit" value="search">
	</form>
	


	<table border="1">
		<tr>
		<th>NUM</th>
		<th>NAME</th>
		<th>DAY</th>
		<th>TIME</th>
		<th>CARD</th>
		<th></th>
		</tr>
		<c:forEach var="vo" items="${list}">
			<tr>
				<td><a href="./rs_selectOne.do?num=${vo.num}">${vo.num}</a></td>
				<td>${vo.name}</td>
				<td>${param.movie}</td>
				<td>${vo.day}</td>
				<td>${vo.time}</td>
				<td>${vo.card}</td>
				<td><a href="rs_deleteOK.do?num=${vo.num}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
  
</body>
</html>