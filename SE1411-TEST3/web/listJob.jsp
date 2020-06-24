<%-- 
    Document   : listJob
    Created on : Jun 23, 2020, 4:43:23 PM
    Author     : TASS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>List Job</title>
    </head>
    <body>
        <h1>Information of all job(s)</h1>
        <table>
            <tr>
                <th>Job ID</th>
                <th>Job Name</th>
                <th>Job Salary</th>
                <th>Hire Date</th>
                <th>Activated(Yes/No)</th>
            </tr>

            <c:forEach items="${lj}" var="job">
                <tr>
                    <td><a href="employee-job?jobId=${job.id}">${job.id}</a></td>
                    <td><a href="employee-job?jobId=${job.id}">${job.name}</a></td>
                    <td>${job.salary}</td>
                    <td>${job.dateCreated}</td>
                    <td>
                        <c:if test = "${job.activated}">
                            Yes
                        </c:if>
                        <c:if test = "${!job.activated}">
                            No
                        </c:if>
                    </td>
                    
                </tr>
            </c:forEach>

        </table>

    </body>
</html>
