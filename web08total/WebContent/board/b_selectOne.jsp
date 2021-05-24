<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>b_selectOne</title>
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
   <h1>게시판 검색</h1>

   <jsp:include page="../menu.jsp"></jsp:include>
   
   <table border="1">
      <tr>
         <td>NUM</td><td>${vo2.num}</td>
      </tr>
      <tr>
         <td>title</td><td>${vo2.title}</td>
      </tr>
      <tr>
         <td>content</td><td>${vo2.content}</td>
      </tr>
      <tr>
         <td>writer</td><td>${vo2.writer}</td>
      </tr>
      <tr>
         <td>str_wdate</td><td>${vo2.str_wdate}</td>
      </tr>
      <tr>
         <td></td><td><a href="b_update.do?num=${vo2.num}">update</a></td>
      </tr>
   </table>

</body>
</html>