<%-- 
    Document   : listCategories
    Created on : Jun 4, 2020, 4:23:15 PM
    Author     : TASS
--%>

<%@page import="model.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The list of categories</title>
        <link rel="stylesheet" href="view/style.css">
    </head>
    <body>
        <h1>The list of categories</h1>
        <div class="container">
            <a href="AddNew.jsp" class="button">Add New</a><br><br><br>
        </div>
        <table>


            <%
                ArrayList<Category> lc = null;
                if (request.getAttribute("data") != null) {
                    lc = (ArrayList<Category>) request.getAttribute("data");
                }
            %>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Describe</th>
                <th colspan="2" id="action">Action</th>
            </tr>

            <%
                for (int i = 0; i < lc.size(); i++) {
                    String id = lc.get(i).getId();
            %>
            <tr>
                <td><%= lc.get(i).getId()%></td>
                <td><%= lc.get(i).getName()%></td>
                <td><%= lc.get(i).getDescribe()%></td>
                <td><a class="action remove-btn" href="delete?id=<%= id%>">Remove</a></td>
                <td><a class="action update-btn" href="Update.jsp?id=<%= id%>">Update</a></td>
            </tr>

            <%        }

            %>
        </table>
    </body>
</html>

