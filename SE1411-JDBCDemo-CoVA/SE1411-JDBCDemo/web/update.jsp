

<%@page import="model.Category"%>
<%@page import="dal.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
           if(request.getParameter("id")!=null){
               String id=request.getParameter("id");
               CategoryDAO cdb=new CategoryDAO();
               Category c=cdb.getCatByID(id);
               
        %>
        <h1>Update category of <%= id  %></h1>
        <form action="update" method="post">
            enter id: <input type="text" readonly name="id" value="<%= c.getId() %>"/><br/>
            enter name: <input type="text" name="name" value="<%= c.getName() %>"/><br/>
            enter describe: <input type="text" name="des" value="<%= c.getDescribe() %>"/><br/>
            <input type="submit" value="Update"/>
        </form>
        <%
              }        
        %>
    </body>
</html>
