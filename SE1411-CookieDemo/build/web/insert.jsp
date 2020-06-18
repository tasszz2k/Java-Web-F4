<%-- 
    Document   : insert
    Created on : Jun 4, 2020, 4:39:27 PM
    Author     : TASS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Add New</title>
    <link rel="stylesheet" href="style.css" />
  </head>
  <body>
    <h1>Add New Category</h1>
    <% if (request.getAttribute("error") != null) {%>
    <h2 class="error"><%=request.getAttribute("error")%></h2>
    <% }%>
    <div>
      <form action="/SE1411-CookieDemo/list" method="get">
        <label for="id">ID:</label><br />
        <input type="text" id="id" name="id" /><br />
        <label for="name">Name:</label><br />
        <input type="text" id="name" name="name" /><br />
        <label for="describe">Describe:</label><br />
        <input type="text" id="describe" name="describe" /><br />
        <br />
        <input type="submit" value="ADD" />
      </form>
    </div>
  </body>
</html>
