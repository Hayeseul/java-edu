<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name ="viewport" content="width =device = width, initial-scale=1">
<title>b_insert</title>
<link rel = "styleshhet" href ="css/bootstra.css">
<style>


table, th, td {
	border: 1px solid #bcbcbc;
}

table {
	width: 250px;
	height: 100px;
}

td {
	text-align: center;
}
</style>
</head>
<body>
	<h1>게시판 작성</h1>
	<jsp:include page="../menu.jsp"></jsp:include>

	<form action="b_insertOK.do" method="post">
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
				<td>${sessionScope.userID} </td>
			<tr>
			<tr>
				<td></td>
				<td><input type="submit" value="OK"></td>
			</tr>

		</table>
		
	</form>
</body>
</html>