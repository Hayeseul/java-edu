<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	<h1>회원정보수정</h1>


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
				<td>${vo2.id}</td>
			</tr>
			<tr>
				<td>비밀번호:</td>
				<td><input type="text" name="pw" value="${vo2.pw}"></td>
			</tr>
			<tr>
				<td>번호:</td>
				<td><input type="text" name="tel" value="${vo2.tel}"></td>
			</tr>
			<tr>
				<td>이메일:</td>
				<td><input type="text" name="email" value="${vo2.email}"></td>
			</tr>
			<tr>
				<td>생일 :</td>
				<td><input type="text" name="birth_yy" maxlength="4"
					placeholder="년(4자)" size="6" value="${fn:substring(vo2.birth,0,4)}"> <select
					name="birth_mm" >
						<option value="">${fn:substring(vo2.birth,4,6)}</option>
						<option value="01">1</option>
						<option value="02">2</option>
						<option value="03">3</option>
						<option value="04">4</option>
						<option value="05">5</option>
						<option value="06">6</option>
						<option value="07">7</option>
						<option value="08">8</option>
						<option value="09">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
				</select> <input type="text" name="birth_dd" maxlength="2" placeholder="일"
					size="4" value="${fn:substring(vo2.birth,6,8)}"></td>
			</tr>
			<tr>
				<td>성별 :</td>
				<td>${vo2.gender}<input type="hidden" name="gender" value="${vo2.gender}"></td>
				
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="OK"></td>
			</tr>
		</table>
	</form>

</body>
</html>