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
String n1 = request.getParameter("name1");
//float b1 = Float.parseFloat(request.getParameter("bal1"));
float b2 = Float.parseFloat(request.getParameter("new"));
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection
		("jdbc:mysql://localhost:3306/cts","root","root");
PreparedStatement pst = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE name = ? ");


pst.setFloat(1, b2 );
pst.setString(2, n1);


int count = pst.executeUpdate();

if(count==1) {
	out.println("<b> Updated Successfull</b>");
	
}
else {
	out.println("<b> Cannot Update</b>");
}
%>

</body>
</html>