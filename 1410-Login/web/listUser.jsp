<%-- 
    Document   : listUser
    Created on : Jun 15, 2020, 7:58:38 AM
    Author     : TASS
--%>

<%@page import="dal.AdminDAO"%>
<%@page import="model.Admin"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">


        <title>List Acount</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            AdminDAO adb = new AdminDAO();
            ArrayList<Admin> list = adb.getListAccount();

        %>
        <table>
            <tr>
                <th>Username</th>
                <th>Password</th>
            </tr>

            <%  for (int i = 0; i < list.size(); i++) {
            %>
            <tr>
                <td><%= list.get(i).getUsername()%></td>
                <td><%= list.get(i).getPassword()%></td>

            </tr>

            <%        }

            %>
        </table>
    </body>
</html>
