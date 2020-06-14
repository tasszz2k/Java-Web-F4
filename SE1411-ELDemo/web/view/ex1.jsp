<%-- 
    Document   : ex1
    Created on : Jun 11, 2020, 4:37:34 PM
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
        <h1>Hello World!</h1>
        <h1>Calculating with EL</h1>
        <form method="post">
            Enter number 1: 
            <input type="text" name="num1" value="${param.num1}"/><br/>
            Enter number 2: 
            <input type="text" name="num2" value="${param.num2}"/><br/>
            <input type="submit" value="Calculate"/>
        </form>
        <h3 style="color: blue">Sum: ${param.num1 + param.num2}</h3>
        <h3 style="color: blue">Avg: ${(param["num1"] + param["num2"])/2}</h3>
        <h2>${initParam.operator}</h2>


    </body>
</html>
