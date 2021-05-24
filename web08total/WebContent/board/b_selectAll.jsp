<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>b_selectAll</title>
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
	<h1>게시판 목록</h1>
	<jsp:include page="../menu.jsp"></jsp:include>

	<form action="b_searchList.do">
		<select name="searchKey">
			<option value="title">title</option>
			<option value="content">content</option>
			<option value="writer">writer</option>
		</select>
		 <input type="text" name="searchWord" value="" > 
		 <input type="submit" value="search">
	</form>
	



	<table border="1">
		<tr>
		<th>NUM</th>
		<th>TITLE</th>
		<th>CONTENT</th>
		<th>WRITER</th>
		<th>STR_WDATE</th>
		<th></th>
		</tr>
		<c:forEach var="vo" items="${list}">
			<tr>
				<td><a href="b_selectOne.do?num=${vo.num}">${vo.num}</a></td>
				<td>${vo.title}</td>
				<td>${vo.content}</td>
				<td>${vo.writer}</td>
				<td>${vo.str_wdate}</td>  
				<td><a href="b_deleteOK.do?num=${vo.num}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
  
</body>
</html>