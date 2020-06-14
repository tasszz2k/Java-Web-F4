<%-- 
    Document   : list
    Created on : May 28, 2020, 3:13:37 PM
    Author     : ADMIN
--%>

<%@page import="java.util.List"%>
<%@page import="model.Category"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            *{
                margin: 0 auto;
            }
            th{
                border: solid black 1px;
                border-collapse: collapse;
                color: chocolate;
                font-size: 18px;
            }
            
            table,td{
                border: solid blue 1px;
                border-collapse: collapse;
                font-size: 16px;
                color: blue;
            }
        </style>
    </head>
    <body>
        <h1 ><center>The list of categories</center></h1>
        <h3 style="margin-left: 600px;margin-bottom: 10px"><a href="AddNew.jsp">AddNew</a></h3>
        <%
            if(request.getAttribute("data")!=null){
                List<Category> list=(List<Category>)request.getAttribute("data");
        %>
        <table width="40%">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Describe</th>
                <th colspan="2">Action</th>
                
            </tr>
            <% 
               for (int i = 0; i < list.size(); i++) {
                       Category c=list.get(i);
                       String id=c.getId();
            %>
            <tr>
                <td><%= id %></td>
                <td><%= c.getName() %></td>
                <td><%= c.getDescribe()%> </td>
                <td><a href="delete?id=<%= id %>">Remove</a></td>
                <td><a href="update.jsp?id=<%= id %>">Update</a></td>
            </tr>
            <%
                   }
            %>
        </table>
        <%        
            }
        %>
    </body>
</html>
