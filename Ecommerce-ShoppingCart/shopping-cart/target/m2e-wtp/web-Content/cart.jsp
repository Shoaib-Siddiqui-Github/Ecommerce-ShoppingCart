<%@page import="com.shoaib.connection.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%
	User auth=(User)request.getSession().getAttribute("auth");
	if(auth!=null){
		/* request.setAttribute("auth",auth); */
		response.sendRedirect("index.jsp");
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart Page</title>
<%@include file="includes/head.jsp"%>
</head>
<body>
<h1>Ashish gandu</h1>
<%@include file="includes/footer.jsp"%>
</body>
</html>