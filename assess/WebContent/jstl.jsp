<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="String" value="JSTL Programming" />
<c:if test="${fn:contains(String, 'programming')}">
	<p>Found Programming String</p>
</c:if>
<b>After Contains Tag</b>

<c:if test="${fn:contains(String, 'programming')}">
	<p>Found Programming String</p>
</c:if>

<c:if test="${fn:containsIgnoreCase(String, 'programming')}">
	<p>Found Programming String</p>
</c:if>

<c:if test="${fn:endsWith(String, 'Programming')}">
	<p>String is ending with Programming</p>
</c:if>

<c:set var="string1" value="It is first String." />
<c:set var="string2" value="IT IS <xyz>Second String</xyz>" />

<p>Index-1 : ${fn:indexOf(string1, "first")}</p>
<p>Index-2 : ${fn:indexOf(string2, "second")}</p>

<c:set var="str1" value="Welcome to JSP     programming      "/>
<p>String-1 length is : ${fn:length(str1) }</p>

<c:set var="str2" value="${fn:trim(str1) }"/>
<p>String-2 length is : ${fn:length(str2) }</p>
<p> Final value of String is : ${str2 }</p>

<c:set var ="msg" value="The Example of JSTL fn:startsWith() Function"></c:set>
The string starts with "The": ${fn:startsWith(msg, 'The') }
<br>The string starts with "Example": ${fn:startsWith(msg, 'Example') }

<p> To Upper Case: ${fn:toUpperCase(string1) }</p>
<p> To Lower Case: ${fn:toLowerCase(string1) }</p>
</body>
</html>