<%-- 
    Document   : add-student-form
    Created on : 13-Oct-2021, 7:37:07 PM
    Author     : 55683
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Student</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <h1 align="center">Add Student</h1>
        <hr>
        <div class="container">
            <div class="content">
                <form action="StudentControllerServlet" method="GET" >
                    <input type="hidden" name="command" value="ADD"/>
                    <table class="table table-dark table-striped" border="2">
                        <tr>
                            <th>ID</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Email</th>
                        </tr>
                        <tr>
                            <td><input type="text" name="id"/></td>
                            <td><input type="text" name="firstName"/></td>
                            <td><input type="text" name="lastName"/></td>
                            <td><input type="text" name="email"/></td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <input type="submit" value="Save" class="save" />
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
