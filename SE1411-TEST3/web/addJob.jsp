<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Job</title>
    </head>
    <body>
        <h1>Enter the information of Job</h1>
        <form action="${pageContext.request.contextPath}/add-job" method="post">
            Job Name:
            <input type="text" name="job-name" required/></br></br>
            Job Salary:
            <input type="text" name="job-salary" required/></br></br>
            Date Created:
            <input type="date" name="date-created" required/>(MM/dd/yyyy)</br></br>
            Activated:
            <input type="radio" name="activated" value="yes" checked>Yes
            <input type="radio" name="activated" value="no">No</br></br>
            <input type="submit" value="Save"/>
            <button><a href="${pageContext.request.contextPath}/list-job">All Job(s)</a></button>
        </form>
        
    </body>
</html>