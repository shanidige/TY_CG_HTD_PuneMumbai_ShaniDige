<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session="false" %>
<%
	String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Portal</title>
</head>
<body>
	<% if(msg != null && !msg.isEmpty()){ %>
	
	<h3 style="color: red;"><%=msg%></h3>

	<% }%>
	<fieldset>
		<legend>Login Form</legend>
		<form action="./empLogin " method="post">
			<table>
				<tr>
					<td>Employee Id</td>
					<td>:</td>
					<td><input type="number" name="empId" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="text" name="password" required></td>
				</tr>
				<tr>
					<td colspan="3"><br> <input type="submit" value="Login">
					</td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>