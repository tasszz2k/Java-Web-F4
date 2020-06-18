<%-- 
    Document   : update
    Created on : Jun 18, 2020, 3:01:43 PM
    Author     : TASS
--%>

<%@page import="model.Employee"%>
<%@page import="dal.EmployeeDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <h1>Update</h1>
        <% if (request.getParameter("id") != null) {
                int id = Integer.parseInt(request.getParameter("id"));
                EmployeeDAO edb = new EmployeeDAO();
                Employee e = edb.getEmployeeById(id);
        %>

        <div>
            <form action="/Test1-Search/update" method="post">
                <label for="id">ID:</label><br />
                <input type="text" id="id" name="id" value="<%= e.getId()%>" readonly="readonly"/><br />
                <label for="name">Name:</label><br />
                <input type="text" id="name" name="name" required="required" value="<%= e.getName()%>"/><br />
                <label for="dob">Date of birth</label><br />
                <input type="date" id="dob" name="dob" required="required" value="<%= e.getDob()%>"/><br />
                <label for="">Gender: </label>
                <input type="radio" id="male" name="gender" value="male" checked="checked"/>
                <label for="male">Male</label>
                <input type="radio" id="female" name="gender" value="female" />
                <label for="female">Female</label><br />
                <label for="">Department: </label>
                <select name="department" id="department" required="required">
                    <option value="is">IS</option>
                    <option value="ia">IA</option>
                </select><br><br>
                <br />
                <input type="submit" value="UPDATE" />
            </form>
        </div>

        <%} else {%>
        <h1>ID = <%= request.getParameter("id")%> is not exist!</h1>
        <%}%>
    </body>
</html>

