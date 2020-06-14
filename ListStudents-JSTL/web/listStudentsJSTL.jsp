<%-- 
    Document   : List
    Created on : May 21, 2020, 5:06:45 PM
    Author     : TASS
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Student</title>
        <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                /*background-color: #dddddd;*/
            }
            img{
                height: 50px;
                width:  50px;
            }
        </style>
    </head>
    <body>

        <h1>List Student || num = ${num}</h1>

        <table>
            <tr>
                <th>Code</th>
                <th>Name</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Address</th>
            </tr>
            <c:forEach items="${ls}" var="student">
                <tr>
                    <td>${student.code}</td>
                    <td>${student.name}</td>
                    <td>${student.age}</td>
                    <td>
                        <c:if test = "${student.gender}">
                            <img src="male.png" alt="male">
                        </c:if>
                        <c:if test = "${!student.gender}">
                            <img src="female.png" alt="female">
                        </c:if>
                    </td>
           
                    <td>
                        <c:choose>
                            <c:when test = "${student.address=='HN'}">
                                <img src="hanoi.jpg" alt="HN">
                            </c:when>
                            <c:when test = "${student.address=='HP'}">
                                <img src="haiphong.jpg" alt="HP">
                            </c:when>
                            <c:when test = "${student.address=='TB'}">
                                <img src="thaibinh.jpg" alt="TB">
                            </c:when>

                            
                        </c:choose>
                    </td>

                </tr>
            </c:forEach>



        </table>       





    </body>
</html>
