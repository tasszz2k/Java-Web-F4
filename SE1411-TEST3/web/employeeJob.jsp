<%-- 
    Document   : employeeJob
    Created on : Jun 23, 2020, 11:02:59 PM
    Author     : TASS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Job</title>
    </head>
    <body>
        <h1>List of all employee are working as "${job.name}"</h1>
        <form action="${pageContext.request.contextPath}/arrange-job" method="get">
            <c:set var = "job" scope = "session" value = "${job}"/>
            <c:set var = "count" scope = "page" value = "0"/>
            <c:forEach items="${employees}" var="employee">
                <c:set var = "employeeId" scope = "request" value = "${employee.id}"/>
                <c:set var = "jobId" scope = "request" value = "${job.id}"/>
                <input type="checkbox" name="emloyee" value="" disabled="disabled" 
                       <c:if test = "${ejdb.checkEmployeeJob(employeeId,jobId)}">
                           checked
                           <c:set var = "count" scope = "page" value = "${count+1}"/>
                       </c:if>
                       > ${employee.fullName} </br></br>
            </c:forEach>

            <h2>This list has ${count} employee(s) are available for current job</h2>
            <input type="submit" value="Arrange Job">
        </form>
    </body>
</html>
