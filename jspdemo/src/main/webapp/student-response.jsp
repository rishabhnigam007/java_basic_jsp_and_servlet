<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Response</title>
</head>
<body>

	<!-- REQUEST GETTING AND SEND RESPONSE -->

	<h1>This is valid student : ${param.firstName} ${param.lastName}</h1>
	<h2>This student come from : ${param.country}</h2>
	<h3>Favourite Language : ${param.language}</h3>
	<ul>
		<%
			String list[] = request.getParameterValues("hobbies");

			for (String hobbies : list) {
				out.println("<li>" + hobbies + "</li>");
			}
			%>
	</ul>
</body>
</html>