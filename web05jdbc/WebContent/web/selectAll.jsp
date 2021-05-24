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
			<option value="name">name</option>
			<option value="age">age</option>
		</select>
		 <input type="text" name="searchWord" value="" > 
		 <input type="submit" value="search">
	</form>
	


	

	<table border="1">
		<c:forEach var="vo" items="${list}">
			<tr>
				<td><a href="selectOne.do?num=${vo.num}">${vo.num}</a></td>
				<td>${vo.name}</td>
				<td>${vo.age}</td>
				<td><a href="deleteOK.do?num=${vo.num}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
  
</body>
</html>