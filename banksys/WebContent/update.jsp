<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.PrintWriter"%>
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
<form action="http://localhost:8082/banksys/updated.jsp">
<%
try {
	String name = request.getParameter("name");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/cts2","root","root");
	PreparedStatement pst = con.prepareStatement("select * from emp where uname = ?");
	pst.setString(1, name);
	ResultSet rs = pst.executeQuery();
	rs.next();

	
	%>
	 <input type="hidden" id="name2" name="name2" value="<%out.print(rs.getString(2)); %>">
	
	EmpNo: <input type="text" value="<%out.print(rs.getString(1)); %>" name="no" /><br>
	EmpName:<input type="text" value="<%out.print(rs.getString(2)); %>" name="uname" /><br>
	Job:<input type="text" value="<%out.print(rs.getString(3)); %>" name="job"/><br>
	Manager:<input type="text" value="<%out.print(rs.getString(4)); %>" name="mana" /><br>
	HireDate:<input type="text" value="<%out.print(rs.getString(5)); %>" name="date"/><br>
	
	<%
	//out.println(rs.getString(1)+ "    " +rs.getString(2)+ "    " +rs.getString(3)+ "   " +rs.getString(4));
	
	

		
	
}
catch(Exception e) {
	
}

%>
<input type="submit" value="UPDATE" />
</form>
</body>
</html>