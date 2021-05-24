<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>m_update</title>
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
	<h1>회원가입 수정</h1>


	<jsp:include page="../menu.jsp"></jsp:include>

	<form action="m_updateOK.do" method="post">
		<table border="1">

			<tr>
				<td>번호:</td>
				<td>${param.num}<input type="hidden" name="num"
					value="${param.num}"></td>
			</tr>
			<tr>
				<td>이름:</td>
				<td><input type="text" name="name" value="${vo2.name}"></td>
			</tr>
			<tr>
				<td>아이디:</td>
				<td><input type="text" name="id" value="${vo2.id}"></td>
			</tr>
			<tr>
				<td>비밀번호:</td>
				<td><input type="text" name="pw" value="${vo2.pw}"></td>
			</tr>
			<tr>
				<td>이름:</td>
				<td><input type="text" name="tel" value="${vo2.tel}"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="OK"></td>
			</tr>
		</table>
	</form>

</body>
</html>