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
<nav>
<a href="home.html">HOME</a>
<a href="add.html">Add</a>
<a href="update.html">Update</a>
<a href="delete.html">Delete</a>
</nav>
<%
try {
	String nam = request.getParameter("name2");
	String no = request.getParameter("no");
	String name = request.getParameter("uname");
	String job = request.getParameter("job");
	String man = request.getParameter("mana");
	String dat = request.getParameter("date");
	System.out.println(nam);
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/cts2","root","root");
	PreparedStatement pst = con.prepareStatement("UPDATE emp SET empno= ?, uname = ?, job=?, manager =?, hireDate = ? WHERE uname = ? ");
	
	pst.setString(1, no);
	pst.setString(2, name);
	pst.setString(3, job);
	pst.setString(4, man);
	pst.setString(5, dat);
	pst.setString(6, nam);
	
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
	System.out.println(e);
}
%>
</body>
</html>