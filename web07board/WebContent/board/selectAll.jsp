<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>selectAll</title>
</head>
<body>
	<h1>selectAll</h1>
	<jsp:include page="../menu.jsp"></jsp:include>

	<form action="searchList.do">
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
				<td><a href="selectOne.do?num=${vo.num}">${vo.num}</a></td>
				<td>${vo.title}</td>
				<td>${vo.content}</td>
				<td>${vo.writer}</td>
				<td>${vo.str_wdate}</td>  
				<td><a href="deleteOK.do?num=${vo.num}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
  
</body>
</html>