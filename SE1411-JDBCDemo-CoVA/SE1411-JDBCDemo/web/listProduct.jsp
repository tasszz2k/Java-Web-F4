

<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page import="dal.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table,td,th{
                border: solid chocolate 1px;
                border-collapse: collapse;
                    
            }
            .pagination {
                display: inline-block;
            }

            .pagination a {
                background-color: chartreuse;
                color: white;
                float: left;
                padding: 8px 16px;
                text-decoration: none;
            }
            .pagination a.active {
                background-color: #4CAF50;
                color: white;
            }
            .pagination a:hover:not(.active) {
                background-color: chocolate;
            }
            
        </style>
    </head>
    <body>
        
        <h1>The full of Love</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Iamge</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Describe</th>
            </tr>
        <%
                ProductDAO pdb=new ProductDAO();
                List<Product> arr=pdb.getAll();
                int start=0,end=4;
                if(arr.size()<4){
                    end=arr.size();
                }
                if(request.getParameter("start")!=null){
                    start=Integer.parseInt(request.getParameter("start"));
                }
                if(request.getParameter("end")!=null){
                    end=Integer.parseInt(request.getParameter("end"));
                }
                List<Product> list=pdb.getListByPage(arr, start, end);
                for(Product p:list){
            %>
            <tr>
                <td><%=p.getId()%></td>
                <td><%=p.getName()%></td>
                <td><img src="<%=p.getImage()%>" width="100px" height="100px"/></td>
                <td><%=p.getPrice()%></td>
                <td><%=p.getQuantity()%></td>
                <td><%=p.getDescribe()%></td>
            </tr>
            <%
                }
            %>
        
            </table>
        <ul>
            <%
                
                int a,b,currPage;
                int numPage=arr.size()/4;
                if(request.getParameter("page")==null)
                   currPage=1;
                else
                    currPage=Integer.parseInt(request.getParameter("page"));
                if((numPage*4)<arr.size()){
                    numPage +=1;
                }
                for(int i=1;i<=numPage;i++){
                    
                    a=(i-1)*4;
                    b=i*4;
                    if(b>arr.size()){
                        b=arr.size();
                    }
                    
            %>
            <li class="pagination">
                <%
                    if(i==currPage){
                %>
                <a  class="active"href="list.jsp?start=<%=a%>&end=<%=b%>&page=<%= i %>"><%=i%></a>
                <%
                    }else{
                %>            
                            
                       <a  href="list.jsp?start=<%=a%>&end=<%=b%>&page=<%= i %>"><%=i%></a>     
                <%            }
                %>
            </li>
            <%
                }
            %> 
        </ul>
    
    </body>
</html>
