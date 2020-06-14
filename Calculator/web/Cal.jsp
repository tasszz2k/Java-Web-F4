<%-- 
    Document   : Calculator
    Created on : May 21, 2020, 3:38:26 PM
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
        <form action="cal"method="post">
            Number 1st: <input type="number" name="n1"> <br/><br/>
            Number 2nd: <input type="number" name="n2"> <br/><br/>
            <input type="radio" name="operator" value="+"/>+<br/>
            <input type="radio" name="operator" value="-"/>-<br/>
            <input type="radio" name="operator" value="*"/>x<br/>
            <input type="radio" name="operator" value="/"/>/<br/>
            <br/>
            <input type="submit" value="Calculate" />
        </form>

        <%
            if (request.getAttribute("result") != null) {
        %>
        <h2><%= request.getAttribute("result")%></h2>
        <% }%>

        <h2>${requestScope.result}</h2>

    </body>
</html>
