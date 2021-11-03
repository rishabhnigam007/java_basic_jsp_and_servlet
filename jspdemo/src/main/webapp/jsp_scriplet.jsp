<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Scriplet</title>
</head>
<body>
	<h1>Table printed</h1>
	<%
	for (int i = 1; i <= 10; i++) {
		out.println("<br> " + i * 2);
	}
	%>
</body>
</html>