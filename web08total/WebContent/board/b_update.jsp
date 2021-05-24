<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>b_update</title>
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
	<h1>게시판 수정</h1>
	<jsp:include page="../menu.jsp"></jsp:include>


	<form action="b_updateOK.do" method="post">
		<table border="1">
			<tr>
				<td>글번호:</td>
				<td>${param.num}<input type="hidden" name="num" value="${param.num}"></td>
			</tr>
			<tr>
				<td>제목:</td>
				<td><input type="text" name="title" value="${vo2.title}"></td>
			</tr>
			<tr>
				<td>내용:</td>
				<td><textarea name="content" rows="5" cols="20">${vo2.content}</textarea></td>
			</tr>
			<tr>
				<td>작성자:</td>
				<td><input type="text" name="writer" value="${vo2.writer}"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="OK"></td>
			</tr>
		</table>	
	</form>
</body>
</html>