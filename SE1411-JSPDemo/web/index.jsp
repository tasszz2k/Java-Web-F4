<%-- 
    Document   : index
    Created on : May 26, 2020, 4:25:12 PM
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
        <%@include file="header.html" %>
        <%@include file="header.jsp" %>           
        <%@include file="text.txt" %>           
        <h1>Hello World!</h1>
        <jsp:forward page="header.html" ></jsp:forward>
        <%@include file="footer.html" %>
    </body>
</html>
