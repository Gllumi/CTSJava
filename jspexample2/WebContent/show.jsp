<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try {
		
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/cts","root","root");
	PreparedStatement pst = con.prepareStatement("select * from t1");
	
	ResultSet rs = pst.executeQuery();
	rs.next();
	//int count = pst.executeUpdate();
	
	
	
	out.println(rs.getString(1)+ "    " +rs.getString(2));
	rs.next();
	out.println(rs.getString(1)+ "    " +rs.getString(2));
	rs.next();
	out.println(rs.getString(1)+ "    " +rs.getString(2));
	rs.next();
	out.println(rs.getString(1)+ "    " +rs.getString(2));
	
	pst.close();
	con.close();
	
		
	
}
catch(Exception e) {
	
}
%>
</body>
</html>