<%-- 
    Document   : welcome
    Created on : Jun 4, 2020, 3:44:14 PM
    Author     : TASS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>Welcome!</h1>
        <h1>Hello ${sessionScope.account.username}</h1>
        <a href="${pageContext.request.contextPath}/logout">Logout</a>
    </body>
</html>
