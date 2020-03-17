<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
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
try {
	String nam = request.getParameter("name2");
	String name = request.getParameter("name1");
	String dept = request.getParameter("dept1");
	String desg = request.getParameter("desg1");
	String comp = request.getParameter("comp1");
	String mob = request.getParameter("mobile1");
	String email = request.getParameter("email1");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/cts","root","root");
	PreparedStatement pst = con.prepareStatement("UPDATE form SET Name= ?, dept = ?, designation=?, company =?, mobile = ?,email = ? WHERE Name = ? ");
	
	pst.setString(1, name);
	pst.setString(2, dept);
	pst.setString(3, desg);
	pst.setString(4, comp);
	pst.setString(5, mob);
	pst.setString(6, email);
	pst.setString(7, nam);
	int count = pst.executeUpdate();
	
	
	
	if(count==1) {
		out.println("<b> Updated Successfull</b>");
		
	}
	else {
		out.println("<b> Cannot Update</b>");
	}
	
	
	pst.close();
	con.close();
	out.close();
		
	
}
catch(Exception e) {
	
}
%>
</body>
</html>