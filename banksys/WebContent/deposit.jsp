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
<title>Insert title here</title>
</head>
<body>
<%

String n = request.getParameter("name");
float b = Float.parseFloat(request.getParameter("bal"));

%>
<input type="text" name="name1" value="<%out.print(n); %>" />
<input type="text" name="bal1" value="<%out.print(b);%>" />
<form action="http://localhost:8080/banksys/deposited.jsp">
Amount To Deposit: <input type="text" name="new" /><br>
<input type="submit" value="DEPOSIT" />
</form>

</body>
</html>