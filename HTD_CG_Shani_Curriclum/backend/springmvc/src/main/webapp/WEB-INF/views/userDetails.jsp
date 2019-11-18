<%@page import="com.capgemini.springmvc.beans.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	/* String empId=(String)request.getAttribute("empId"); * of 1st way by servlet apporach/
	/* String password=(String)request.getAttribute("pwd"); */

	/* /* int empId=(int)request.getAttribute("empId");
	String password=(String)request.getAttribute("password"); * of 2nd
	way by  spring apporach by returning prefix & suffix/ */

	/* /* int empId=(int)request.getAttribute("empId");
	String password=(String)request.getAttribute("password"); *of 3nd way by 
	spring apporach by retmovie prefix & suffix/ */

	UserBean userBean = (UserBean) request.getAttribute("userBean");//4th way apporach
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- Entered Employee ID=<%=empId %><br>
Entered Employee Password=<%=password %> --%>
	Entered Employee ID=<%=userBean.getEmpId()%>
	Entered Employee Password=<%=userBean.getPassword()%>
	Entered DOB=<%=userBean.getDob()%>


</body>
</html>