<%-- 
    Document   : calculator
    Created on : Jun 11, 2020, 2:47:18 PM
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
        <form action="/SE1411-ELDemo/view/calculator.jsp" method="post">
            Number 1: <input type="number" name="num1" value="" /> <br><br>
            Number 2: <input type="number" name="num2" value="" /> <br><br>
            <select name="operator" id="">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">x</option>
                <option value="/">/</option>
            </select>
            <input type="submit" value="Calculate">
        </form>

        <%
//            if (request.getParameter("num1") != null && request.getParameter("num1") != null) {
//                int num1 = Integer.parseInt(request.getParameter("num1"));
//                int num2 = Integer.parseInt(request.getParameter("num2"));
//                char operator = request.getParameter("operator").charAt(0);
//                String rs = " ";
//                switch (operator) {
//                    case '+':
//                        rs = "Sum: " + (num1 + num2);
//                        break;
//                    case '-':
//                        rs = "Subtraction: " + (num1 - num2);
//                        break;
//                    case '*':
//                        rs = "Multiply: " + (num1 * num2);
//                        break;
//                    case '/':
//                        if (num2 != 0) {
//                            rs = "Divide " + ((float) num1 / num2);
//                        } else {
//                            rs = "ERROR!";
//                        }
//                        break;
//                }
//                request.setAttribute("result", rs);
//                out.print(rs);
//            }
//

        %>
        <jsp:useBean id="c" class="bean.Calculator" scope="request"/>
        <%--<jsp:setProperty name="c" property="*"/>--%>
        <jsp:setProperty name="c" property="num1" param="num1"/>
        <jsp:setProperty name="c" property="num2" param="num2"/>
        <jsp:setProperty name="c" property="operator" param="operator"/>
        <h2><jsp:getProperty name="c" property="result"/></h2>
        
        
    </body>
</html>
