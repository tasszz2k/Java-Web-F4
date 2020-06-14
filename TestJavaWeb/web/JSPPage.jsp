<%-- 
    Document   : JSPPage
    Created on : May 28, 2020, 10:02:32 AM
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
        <h1>Hello World!</h1>
        <%= expression %>

        <%! String name = new String(“JSP World”); %>
        <%! public String getName() { return name; } %>

        <B><%= getName() %></B>

    </body>
</html>
