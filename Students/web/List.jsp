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
        <title>List Student</title>
        <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dddddd;
            }
        </style>
    </head>
    <body>
        <h1>List Student</h1>
        <table>
            <tr>
                <th>Code</th>
                <th>Name</th>
                <th>Age</th>
            </tr>
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
            <tr>
                <td><%= ls.get(i).getCode()%></td>
                <td><%= ls.get(i).getName()%></td>
                <td><%= ls.get(i).getAge()%></td>
            </tr>
            <%
                }

            %> 


        </table>       





    </body>
</html>
