<%-- Document : search Created on : Jun 6, 2020, 9:44:16 PM Author : TASS --%>
<%@page import="model.Department"%>
<%@page import="dal.DepartmentDAO"%>
<%@page import="model.Employee"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" href="view/style.css">
        <title>Search</title>
    </head>
    <body>

        <h1>Search</h1>
        <div>
            <form action="${pageContext.request.contextPath}/search" method="get">
                <label for="">ID: </label>
                <input type="text" name="id" /><br /><br />
                <label for="">Name: </label>
                <input type="text" name="name" /><br /><br />
                <label for="">Gender: </label>
                <input type="radio" id="male" name="gender" value="male" />
                <label for="male">Male</label>
                <input type="radio" id="female" name="gender" value="female" />
                <label for="female">Female</label>
                <input type="radio" id="both" name="gender" value="both" />
                <label for="both">Both</label>
                <br /><br />
                <label for="">Department: </label>
                <select name="department" id="department">
                    <option value="all">-----ALL-----</option>
                    <option value="is">IS</option>
                    <option value="ia">IA</option>
                </select><br><br>
                <label for="">DOB From: </label>
                <input type="date" name="dob-from"></br></br>
                <label for="">DOB To: </label>
                <input type="date" name="dob-to"></br></br>
                <input type="submit" name="submit" value="Search" /></br></br>
            </form>
        </div>

        <hr>
        <div class="container">
            <a href="/Test1-Search/view/insert.jsp" class="button">Add New</a><br><br><br>
        </div>


        <div>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>DOB</th>
                    <th>Department</th>
                    <th colspan="2" id="action">Action</th>
                </tr>
                <%
                    DepartmentDAO ddb = new DepartmentDAO();
                    List<Department> ld = ddb.getDepartments();
                    List<Employee> le = null;
                    if (request.getAttribute("listEmployees") != null) {
                        le = (List<Employee>) request.getAttribute("listEmployees");

                        for (int i = 0; i < le.size(); i++) {
                            int id = le.get(i).getId();
                %>
                <tr>
                    <th><%= le.get(i).getId()%></th>
                    <th><%= le.get(i).getName()%></th>
                    <th><%= le.get(i).isGender()%></th>
                    <th><%= le.get(i).getDob()%></th>
                    <th><%= ddb.getNameById(ld, le.get(i).getDid())%></th>
                    <td><a class="action remove-btn" href="/Test1-Search/delete?id=<%= id%>">Remove</a></td>
                    <td><a class="action update-btn" href="/Test1-Search/view/update.jsp?id=<%= id%>">Update</a></td>
                </tr>


                <%}
                    }
                %>
            </table>
        </div>


    </body>
</html>
