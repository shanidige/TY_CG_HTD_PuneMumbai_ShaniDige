<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend> Login Credentials</legend>
		<!-- <form action="./login" , method="post"> -->
		<!-- <form action="./login2" , method="post"> -->
		<!-- <form action="./login3" , method="post"> -->
		<form action="./login4" , method="post">
			<table>
				<tr>
					<td>Employee Id</td>
					<td>:</td>
					<td><input type="text" name="empId"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
				<td>DoB</td>
					<td>:</td>
					<td><input type="date" name="dob"></td>
				</tr>
				<tr>
					<td colspan="3" align="center"></td>
					<br>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>