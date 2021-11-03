<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Built-In Objects</title>
</head>
<body>
	<h1>JSP BUilt-In Objects</h1>
	Request user agent:
	<%=request.getHeader("User-Agent")%>
	<br>
	<br> Request language:
	<%=request.getLocale()%>
	<br>
</body>
</html>