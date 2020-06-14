<%-- 
    Document   : list
    Created on : Jun 2, 2020, 4:55:03 PM
    Author     : TASS
--%>

<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dal.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Paging Demo</title>
        <link rel="stylesheet" href="style1.css">
    </head>
    <body>
        <h1>MEWWWWWWWW !!!</h1>
        <table>
            <th>ID</th>
            <th>Name</th>
            <th>Image</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Describe</th>


            <%
                ProductDAO pdb = new ProductDAO();
                ArrayList<Product> arr = pdb.getProducts();
                int start = 0, end = 4;
                if (arr.size() < 4) {
                    end = arr.size();
                }
                if (request.getParameter("start") != null) {
                    start = Integer.parseInt(request.getParameter("start"));
                }
                if (request.getParameter("end") != null) {
                    end = Integer.parseInt(request.getParameter("end"));
                }
                ArrayList<Product> list = pdb.getProductsByPage(arr, start, end);
                for (Product p : list) {
            %>
            <tr>
                <td><%=p.getId()%></td>
                <td><%=p.getName()%></td>
                <td><img src="<%=p.getImage()%>"/></td>
                <td><%=p.getPrice()%></td>
                <td><%=p.getQuantity()%></td>
                <td><%=p.getDescribe()%></td>
            </tr>
            <%
                }
            %>
        </table>
        <div class="pages">
            <ul>
                <%
                    int currPage;
                    if (request.getParameter("page") == null) {
                        currPage = 1;
                    } else {
                        currPage = Integer.parseInt(request.getParameter("page"));
                    }
                    int a, b;
                    int numPage = arr.size() / 4;
                    if ((numPage * 4) < arr.size()) {
                        numPage += 1;
                    }
                    for (int i = 1; i <= numPage; i++) {
                        a = (i - 1) * 4;
                        b = i * 4;
                        if (b > arr.size()) {
                            b = arr.size();
                        }
                        if (i == currPage) {
                %>
                <li class="pagination">
                    <a class="active" href="list.jsp?start=<%=a%>&end=<%=b%>&page=<%=i%>"><%=i%></a>
                </li>
                <%
                } else {
                %> 
                <li class="pagination">
                    <a  href="list.jsp?start=<%=a%>&end=<%=b%>&page=<%=i%>"><%=i%></a>
                </li>
                <%
                        }
                    }
                %> 
            </ul>
        </div>



    </body>
</html>
