<%-- 
    Document   : Login
    Created on : May 21, 2020, 4:37:23 PM
    Author     : TASS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>

        <form action="Login" method="post">
            <h2>${requestScope.error}</h2>
            <label for="username">Username: </label>
            <input type="text" id="username" name="username"><br><br>
            <label for="pwd">Password:</label>
            <input type="password" id="pwd" name="pwd" ><br><br>
            <input type="submit">
        </form>
    </body>
</html>

