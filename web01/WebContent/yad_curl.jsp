<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    System.out.println(request.getParameter("name"));
    System.out.println(request.getParameter("tel"));
    response.sendRedirect("test2.txt");
    %>
