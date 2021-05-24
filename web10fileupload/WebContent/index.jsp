<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	<h1>index.jsp</h1>
	
	<jsp:include page="menu.jsp"></jsp:include>
	<img width="100" alt="" src="upload/${param.filename}">
	
	${param.filename}
	
	
</body>
</html>