<%-- 
    Document   : Update
    Created on : May 28, 2020, 4:46:17 PM
    Author     : TASS
--%>

<%@page import="model.Category"%>
<%@page import="dal.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
    </head>
    <body>
        <h1>Add New Category</h1>
        <% if (request.getAttribute("id") != null) {
                String id = request.getParameter("id");
                CategoryDAO cdb = new CategoryDAO();
                Category c = cdb.getCategoryById(id);
        %>
        <h1>Update</h1>
        <div>
            <form action="update" method="post">
                <label for="id">ID:</label><br />
                <input type="text" id="id" name="id" value="<%= c.getId()%>" readonly=""/><br />
                <label for="name">Name:</label><br />
                <input type="text" id="name" name="name" value="<%= c.getName()%>"/><br />
                <label for="describe">Describe:</label><br />
                <input type="text" id="describe" name="describe" value="<%= c.getDescribe()%>"/><br />
                <br />
                <input type="submit" value="UPDATE" />
            </form>
        </div>
    </body>
</html>
