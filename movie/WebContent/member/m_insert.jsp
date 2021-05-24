<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>

<style>
table, th, td {
	border: 1px solid #bcbcbc;

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
	<h1>회원가입</h1>

	<jsp:include page="../menu.jsp"></jsp:include>
	
	

		<form action="idCheck.do" method="post">
			<input type="text" name="id" value="admin"> 
			<input type="submit" value="idCheck">${param.msg}
		</form>

	<form action="m_insertOK.do" method="post" encType="multipart/form-data">
		<input	type="file" name="pusa"> 
		<table border="1">
			<tr>
				<td>이름 :</td>
				<td><input type="text" name="name" value="하예슬"></td>
			</tr>
			<tr>
				<td>아이디 :</td>
				<td><input type="text" name="id" value="${param.id}"></td>
			</tr>
			<tr>
				<td>비밀번호 :</td>
				<td><input type="text" name="pw" value="hi123456"></td>
			</tr>
			<tr>
				<td>전화번호 :</td>
				<td><input type="text" name="tel" value="010-6343-9074"></td>
			</tr>
			<tr>
				<td>이메일 :</td>
				<td><input type="text" name="email" value="hyeseul@naver.com"></td>
			</tr>
			<tr>
				<td>생일 :</td>
			<td>
                        <input type="text" name="birth_yy" maxlength="4" placeholder="년(4자)" size="6" value="1997">
                        <select name="birth_mm">
                            <option value="">월</option>
                            <option value="01"  selected="selected">1</option>
                            <option value="02" >2</option>
                            <option value="03" >3</option>
                            <option value="04" >4</option>
                            <option value="05" >5</option>
                            <option value="06" >6</option>
                            <option value="07" >7</option>
                            <option value="08" >8</option>
                            <option value="09" >9</option>
                            <option value="10" >10</option>
                            <option value="11" >11</option>
                            <option value="12" >12</option>
                        </select>
                        <input type="text" name="birth_dd" maxlength="2" placeholder="일" size="4" value="3">
                    </td>
			</tr>
			<tr>
				<td>성별 :</td>
				<td><input type="radio" name="gender" value="man"checked="checked">남<input type="radio" name="gender" value="women">여</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="OK"></td>
			</tr>
		</table>
	</form>

</body>
</html>