<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IOT_HOME</title>
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
	<h2>로그인</h2>
	<jsp:include page="menu.jsp"></jsp:include>


	<c:if test='${sessionScope.login != "successed"}'>
		<form action="member_loginOK.iot_home" method="post">
			<table border="1">

				<tr>
					<td>아이디</td>
					<td><input type="text" name="member_id"
						value="${param.member_id}"></td>
					<td rowspan="3"><input type="submit" value="login"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="member_pw"
						value="${member_pw}"></td>
				</tr>
				<tr>
					<td></td>
					<td><a href="member_idfind.iot_home">ID&PW찾기</a></td>
				</tr>
			</table>
		</form>
	</c:if>

	<c:if test='${sessionScope.login == "successed"}'>
		<table border="1">
			<tr>
				<c:if test='${sessionScope.userBirth == "111111-1111111"}'>
					<td><h4>${sessionScope.login}</h4></td>
					<td><h3>관리자입니다.</h3></td>
					<td><a href="member_logout.iot_home">logout</a></td>
				</c:if>
				<c:if
					test='${sessionScope.userBirth != "111111-1111111" and sessionScope.login == "successed"}'>
					<td><h4>${sessionScope.login}</h4></td>
					<td><h3>회원입니다.</h3></td>
					<td><a href="member_logout.iot_home">logout</a></td>
				</c:if>
			</tr>
		</table>
	</c:if>

</body>
</html>