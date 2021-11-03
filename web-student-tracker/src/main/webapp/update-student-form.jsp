<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student detail page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<h1 align="center">Update Student</h1>
	<hr>
	<div class="container">

		<div class="content">

			<form action="StudentControllerServlet" method="GET">

				<input type="hidden" name="command" value="UPDATE" /> <input
					type="hidden" name="studentId" value="${THE_STUDENT.id}" />

				<table class="table table-light table-striped" border="2">
						<tr>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Email</th>
                        </tr>
                        <tr>
                            <td><input type="text" name="firstName" value="${THE_STUDENT.firstName}" /></td>
                            <td><input type="text" name="lastName" value="${THE_STUDENT.lastName}" /></td>
                            <td><input type="text" name="email" value="${THE_STUDENT.email}" /></td>
                        </tr>
                        <tr>
                        	<td colspan="4">
                        	<input type="submit" value="Update" class="update" />
                        	</td>
                        </tr>
				</table>
			</form>
			<div style="clear: both;"></div>
			<p>
				<a href="StudentControllerServlet">back to list</a>
			</p>
		</div>
	</div>
</body>
</html>