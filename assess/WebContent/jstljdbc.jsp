<%@ page import="java.io.*,java.util.*,java.sql.* "  %>
<%@ page import="java.io.*,javax.servlet.http.*,javax.servlet.* "  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/cts" user="root" password="root"/>

<c:set var="stuid" value="<%= request.getParameter(\"id\") %>"/>
<c:set var="stuna" value="<%= request.getParameter(\"name\") %>"/>
<c:set var="stubr" value="<%= request.getParameter(\"bra\") %>"/>
<c:set var="stuco" value="<%= request.getParameter(\"col\") %>"/>
<sql:update dataSource="${db}" var="nr">
INSERT into students values(?,?,?,?);
<sql:param value="${stuid}"> </sql:param>
<sql:param value="${stuna}"> </sql:param>
<sql:param value="${stubr}"> </sql:param>
<sql:param value="${stuco}"> </sql:param>
</sql:update>



<sql:query dataSource="${db}" var="rs">
SELECT * from students;
</sql:query>

<table border="2" width="100%">
<tr>
<th>Hall Tkt</th>
<th>Name</th>
<th>Branch</th>
<th>Clg</th>
</tr>
<c:forEach var="table" items="${rs.rows}">
<tr>
<td><c:out value="${table.HTNO}"/></td>
<td><c:out value="${table.Name}"/></td>
<td><c:out value="${table.Branch}"/></td>
<td><c:out value="${table.College}"/></td>
</tr>
</c:forEach>

</table>			
</body>
</html>