<%-- 
    Document   : List
    Created on : May 21, 2020, 5:06:45 PM
    Author     : TASS
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="controller.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            int num = (Integer) request.getAttribute("num");
            ArrayList<Student> ls = new ArrayList<Student>();
            for (int i = 0; i < num; i++) {
                Student s = new Student();
                s.generateStudent();
                ls.add(s);
            }
            //display
            for (int i = 0; i < ls.size(); i++) {

        %>
        <h2><%= ls.get(i).toString()%> </h2>

        <%
            }

        %>




    </body>
</html>
