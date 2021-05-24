<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>
</head>
<body>
	<h1>insert</h1>
	<jsp:include page="../menu.jsp"></jsp:include>


	<%-- 	 <input type="text" name="title" value="${title}"> 
		<input type="text" name="content" value="${content}">
		 <input type="text" name="writer" value="${writer}"> 
		 <input type="submit"value="OK"> --%>
	<form action="insertOK.do" method="post">

		<table border="1">
			<tr>
				<td>제목 :</td>
				<td><input type="text" name="title" value="제목을 입력하세요"></td>
			</tr>
			<tr>
				<td>내용 :</td>
				<td><textarea name="content" rows="5" cols="20">content</textarea></td>

			</tr>
			<tr>
				<td>작성자 :</td>
				<td><input type="text" name="writer" value="홍길동"></td>
			<tr>
			<tr>
				<td></td>
				<td><input type="submit" value="OK"></td>
			</tr>

		</table>
	</form>
</body>
</html>