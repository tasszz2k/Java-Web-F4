<%-- 
    Document   : arrangeJob
    Created on : Jun 24, 2020, 1:03:06 AM
    Author     : TASS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arange Job</title>
    </head>
    <body>

        <h1>Assign a job "${job.name}" to an employee</h1>

        <form action="" method="">

            <label>Select an employee:</label>
            <select>
                <c:forEach items="${employees}" var="employee">
                    <option value="${employee.id}" >${employee.name}</option>
                    
                </c:forEach>
            </select>
                    
            <br><br>
            <input type="submit" value="Assign">
        </form>

    </body>
</html>
