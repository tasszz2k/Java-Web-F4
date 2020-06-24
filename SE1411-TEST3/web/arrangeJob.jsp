<%-- 
    Document   : arrangeJob
    Created on : Jun 24, 2020, 1:03:06 AM
    Author     : TASS
--%>

<%@page import="model.Job"%>
<%@page import="model.Employee"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arange Job</title>
    </head>
    <body>     
        <h1>Assign a job "${job.name}" to an employee</h1>
        <form action="${pageContext.request.contextPath}/arrange-job" method="post">
            <input type="hidden"  name="jobId" value="${job.id}">
            <label>Select an employee:</label>
            <select name="employee-id">
                <c:forEach items="${employees}" var="employee">
                    <option value="${employee.id.trim()}" >${employee.fullName}</option>
                </c:forEach>

            </select>
            <br><br>
            <input type="submit" value="Assign">
        </form>

    </body>
</html>
