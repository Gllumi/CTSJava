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
<form action="http://localhost:8080/jspexample3/updated.jsp">
<%
try {
	String name = request.getParameter("name");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/cts","root","root");
	PreparedStatement pst = con.prepareStatement("select * from form where name = ?");
	pst.setString(1, name);
	ResultSet rs = pst.executeQuery();
	rs.next();

	
	%>
	<input type="text" value="<%out.print(rs.getString(1)); %>" name="name2" /><br>
	Name: <input type="text" value="<%out.print(rs.getString(1)); %>" name="name1" /><br>
	Department:<input type="text" value="<%out.print(rs.getString(2)); %>" name="dept1" /><br>
	Designation:<input type="text" value="<%out.print(rs.getString(3)); %>" name="desg1"/><br>
	Company:<input type="text" value="<%out.print(rs.getString(4)); %>" name="comp1" /><br>
	Mobile:<input type="text" value="<%out.print(rs.getString(5)); %>" name="mobile1"/><br>
	Email:<input type="text" value="<%out.print(rs.getString(6)); %>" name="email1"/><br>
	
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