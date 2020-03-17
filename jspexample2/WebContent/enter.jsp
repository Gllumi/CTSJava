<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%		
try{
String name = request.getParameter("name");
String id = request.getParameter("id");
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection
		("jdbc:mysql://localhost:3306/cts","root","root");
PreparedStatement pst = con.prepareStatement("insert into t1 values(?,?)");
pst.setString(1, name);
pst.setString(2, id);
int count = pst.executeUpdate();

if(count==1) {
	out.println(" Registration Successfull");
	
}
else {
	out.println("Cannot Register");
}

pst.close();
con.close();
}
catch(Exception e){
	System.out.println(e);
}
%>
</body>
</html>