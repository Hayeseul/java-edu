<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>
<html>
<head>
<title>Member List</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body>
   MEMBMER Table Contents
   <table class="table">
      <thead>
         <tr>
            <td>NUM</td>
            <td>ID</td>
            <td>AGE</td>
         </tr>
      </thead>
      <tbody>
         <%
         // MySQL JDBC Driver Loading
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn = null;
         Statement stmt = null;
         ResultSet rs = null;
         try {
            String jdbcDriver = "jdbc:mysql://18.117.94.127:3306/kosta_db?" + "useUnicode=true&characterEncoding=utf8";
            String dbUser = "kosta";
            String dbPass = "hi123456";
            String query = "select * from test"; // Create DB Connection 
            conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass); // Create Statement 
            stmt = conn.createStatement(); // Run Qeury 
            rs = stmt.executeQuery(query); // Print Result (Run by Query) 
            while (rs.next()) {
         %>
         <tr>
            <td><%=rs.getString("num")%></td>
            <td><%=rs.getString("id")%></td>
            <td><%=rs.getString("age")%></td>
         </tr>
      
      <%
      }
      } catch (SQLException ex) {
      out.println(ex.getMessage());
      ex.printStackTrace();
      } finally { // Close Statement
      if (rs != null)
      try {
         rs.close();
      } catch (SQLException ex) {
      }
      if (stmt != null)
      try {
         stmt.close();
      } catch (SQLException ex) {
      } // Close Connection 

      if (conn != null)
      try {
         conn.close();
      } catch (SQLException ex) {
      }
      }
      %>
      </tbody>
   </table>
</body>
</html>