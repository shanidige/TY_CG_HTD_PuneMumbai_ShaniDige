<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	String msg = (String) request.getAttribute("msg");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./createCookie">Click Here</a> to create Cookie..
	<a href="./readCookie">Click Here</a> to see Cookies..

	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<%=msg%>
	<%
		}
	%>


	%>
</body>
</html>