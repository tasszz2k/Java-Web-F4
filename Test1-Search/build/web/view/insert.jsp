<%-- 
    Document   : insert
    Created on : Jun 18, 2020, 3:17:41 PM
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
        <div>
            <form action="/Test1-Search/insert" method="post">
                <label for="id">ID:</label><br />
                <input type="text" id="id" name="id" required="required"/><br />
                <label for="name">Name:</label><br />
                <input type="text" id="name" name="name" required="required"/><br />
                <label for="dob">Date of birth</label><br />
                <input type="date" id="dob" name="dob" required="required"/><br />
                <label for="">Gender: </label>
                <input type="radio" id="male" name="gender" value="male" />
                <label for="male">Male</label>
                <input type="radio" id="female" name="gender" value="female" />
                <label for="female">Female</label><br />
                <label for="">Department: </label>
                <select name="department" id="department" required="required">
                    <option value="is">IS</option>
                    <option value="ia">IA</option>
                </select><br><br>
                <br />
                <input type="submit" value="ADD NEW" />
            </form>
        </div>
    </body>
</html>
