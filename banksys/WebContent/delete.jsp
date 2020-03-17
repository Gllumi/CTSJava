<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert </title>
</head>
<body>
<%
String b = request.getParameter("no");
String a = request.getParameter("name");


Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection
		("jdbc:mysql://localhost:3306/cts2","root","root");

PreparedStatement pst = con.prepareStatement("delete from emp Where uname=? AND empno=?");
pst.setString(1,a);
pst.setString(2,b);


pst.execute();
System.out.println("Data Deleted");

%>
<nav>
<a href="home.html">HOME</a>
<a href="add.html">Add</a>
<a href="update.html">Update</a>
<a href="delete.html">Delete</a>
</nav>
<h4>Employee Removed</h4>
</body>
</html>