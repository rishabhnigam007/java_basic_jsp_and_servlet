<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP demo page</title>
</head>
<body>
	<h3>hello world of java!</h3>

	The time on the server is
	<%=new Date()%>
	<br> converting a string to uppercase:
	<%=new String("Hello World").toUpperCase()%>
	<br> 25 multiplied by 4 equals:
	<%= 25*4 %>
	<br>

</body>
</html>