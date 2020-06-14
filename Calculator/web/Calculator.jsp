<%-- 
    Document   : Calculator
    Created on : May 21, 2020, 3:38:26 PM
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
        <form action="Calculator.jsp"method="">
            Number 1st: <input type="number" name="n1"> <br/><br/>
            Number 2nd: <input type="number" name="n2"> <br/><br/>
            +<input type="radio" name="operator" value="+"/>
            -<input type="radio" name="operator" value="-"/>
            x<input type="radio" name="operator" value="*"/>
            /<input type="radio" name="operator" value="/"/>
            <br/>
            <input type="submit" value="Calculate" />
        </form>
        <%
            String n1 = request.getParameter("n1");
            String n2 = request.getParameter("n2");

            if (n1 != null) {
                Double number1 = Double.parseDouble(n1);
                Double number2 = Double.parseDouble(n2);
                char operator = request.getParameter("operator").charAt(0);
                String result = "";
                switch (operator) {
                    case '+':
                        result = number1 + "+" + number2 + "=" + (number1 + number2);
                        break;
                    case '-':
                        result = number1 + "-" + number2 + "=" + (number1 - number2);
                        break;
                    case '*':
                        result = number1 + "*" + number2 + "=" + (number1 * number2);
                        break;
                    case '/':
                        if (number2 != 0) {
                            result = number1 + "/" + number2 + "=" + (number1 / number2);
                        } else {
                            result = "ERROR";
                        }
                        break;
                }
                out.println(result);
            }

        %>



    </body>
</html>
