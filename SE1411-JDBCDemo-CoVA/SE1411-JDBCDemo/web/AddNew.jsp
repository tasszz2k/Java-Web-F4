<%-- 
    Document   : AddNew
    Created on : May 28, 2020, 3:32:14 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add new a Catogory</h1>
        <% 
           if(request.getAttribute("error")!=null){
        %>
        <h2 style="color: red"><%= request.getAttribute("error") %></h2>
        <% } %>
        <form action="save" method="post">
            enter id: <input type="text" name="id"/><br/>
            enter name: <input type="text" name="name"/><br/>
            enter describe: <input type="text" name="des"/><br/>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>
