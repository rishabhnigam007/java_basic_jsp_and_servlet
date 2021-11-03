<%-- 
    Document   : list-students
    Created on : 13-Oct-2021, 3:34:49 PM
    Author     : 55683
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@page import="com.icfnext.jdbc.web_student_tracker.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student list</title>
        <%
            // get the students from the request object (sent by servlet)
            List<Student> theStudents
                    = (List<Student>) request.getAttribute("STUDENT_LIST");
        %>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <h1 align="center">Student view page</h1>
        <hr>
        <div align="center">
            <input type="button" value="Add Student" onclick="window.location.href = 'add-student-form.jsp'; return false;" class="add-student-button" />
        </div>
        <hr>
        <div class="container">
            <div class="content">
                <table class="table table-dark table-striped" border="2">
                    <tr>
                        <th>ID</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Action</th>
                    </tr>
                    <%-- 
                    <% for (Student tempStudent : theStudents) {%>
                    
                    <tr>
                        <td> <%= tempStudent.getId()%> </td>
                        <td> <%= tempStudent.getFirstName()%> </td>
                        <td> <%= tempStudent.getLastName()%> </td>
                        <td> <%= tempStudent.getEmail()%> </td>
                        <td><a href="">Update</a> / <a href="">Delete</a></td>
                    </tr>

                    <% }%>
                    --%>
                    <c:forEach var="tempStudent" items="${STUDENT_LIST}" >



                        <tr>
                            <td>${tempStudent.id}</td>
                            <td>${tempStudent.firstName}</td>
                            <td>${tempStudent.lastName}</td>
                            <td>${tempStudent.email}</td>
                            <td><a href="">Update</a> / <a href="">Delete</a></td>
                        </tr>

                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>
