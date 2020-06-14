<%-- Document : AddNew Created on : May 28, 2020, 4:08:10 PM Author : TASS --%>
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
      <form action="save" method="post">
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
