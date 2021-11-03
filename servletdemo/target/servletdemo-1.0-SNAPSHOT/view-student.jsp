<%-- 
    Document   : view-student
    Created on : 12-Oct-2021, 11:51:24 PM
    Author     : 55683
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Student Page</title>
    </head>
    <body>
        <h1>Student data view</h1>
        <hr>
        <table border="1">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
            </tr>
            <c:forEach var="tempStudent" items="${student_list}">
                <tr>
                    <td>${tempStudent.firstName}</td>
                    <td>${tempStudent.lastName}</td>
                    <td>${tempStudent.email}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>