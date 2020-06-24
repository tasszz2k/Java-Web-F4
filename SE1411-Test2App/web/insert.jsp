<%-- 
    Document   : insert
    Created on : Jun 18, 2020, 5:20:50 PM
    Author     : TASS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="insert" method="post">
            Enter Employee ID: 
            <input type="number" name="id" value="${param.id}" />
            <br><br>
            Enter Employee name:
            <input type="text" name="name" value ="${param.name}" />
        </form>


    </body>
</html>
