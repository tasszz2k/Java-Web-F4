package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Product;
import java.util.ArrayList;
import dal.ProductDAO;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Paging Demo</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style1.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>MEWWWWWWWW !!!</h1>\r\n");
      out.write("        <table>\r\n");
      out.write("            <th>ID</th>\r\n");
      out.write("            <th>Name</th>\r\n");
      out.write("            <th>Image</th>\r\n");
      out.write("            <th>Price</th>\r\n");
      out.write("            <th>Quantity</th>\r\n");
      out.write("            <th>Describe</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");

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
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(p.getId());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(p.getName());
      out.write("</td>\r\n");
      out.write("                <td><img src=\"");
      out.print(p.getImage());
      out.write("\"/></td>\r\n");
      out.write("                <td>");
      out.print(p.getPrice());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(p.getQuantity());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(p.getDescribe());
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        <div class=\"pages\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                ");

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
                
      out.write("\r\n");
      out.write("                <li class=\"pagination\">\r\n");
      out.write("                    <a class=\"active\" href=\"list.jsp?start=");
      out.print(a);
      out.write("&end=");
      out.print(b);
      out.write("&page=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                ");

                } else {
                
      out.write(" \r\n");
      out.write("                <li class=\"pagination\">\r\n");
      out.write("                    <a  href=\"list.jsp?start=");
      out.print(a);
      out.write("&end=");
      out.print(b);
      out.write("&page=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                ");

                        }
                    }
                
      out.write(" \r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
