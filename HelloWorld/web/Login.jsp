<%-- 
    Document   : Login
    Created on : May 21, 2020, 3:18:28 PM
    Author     : TASS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
        <h2>Current Date: <%= new Date()%>
        </h2> 
        <%
            for (int i = 0; i < 10; i++) {
        %>
        <h2 style="color:red">index: <%=i%></h2>

        <%
            }
        %>
        <%
            Date currentTime = new Date();
            int month = currentTime.getMonth() + 1;
            if (month % 2 == 0) {
        %>
        <h2><%= month%> is the even</h2>
        <%
        } else {
        %>
        <h2><%= month%> is the odd</h2>

        <%}%>

    </body>
</html>
