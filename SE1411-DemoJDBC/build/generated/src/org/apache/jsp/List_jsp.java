package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Category;
import java.util.ArrayList;

public final class List_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>The list of categories</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>The list of categories</h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a href=\"AddNew.jsp\" class=\"button\">Add New</a><br><br><br>\n");
      out.write("        </div>\n");
      out.write("        <table>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                ArrayList<Category> lc = null;
                if (request.getAttribute("data") != null) {
                    lc = (ArrayList<Category>) request.getAttribute("data");
                }
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Describe</th>\n");
      out.write("                <th colspan=\"2\" id=\"action\">Action</th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");

                for (int i = 0; i < lc.size(); i++) {
                    String id = lc.get(i).getId();
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( lc.get(i).getId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( lc.get(i).getName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( lc.get(i).getDescribe());
      out.write("</td>\n");
      out.write("                <td><a class=\"action remove-btn\" href=\"delete?id=");
      out.print( id);
      out.write("\">Remove</a></td>\n");
      out.write("                <td><a class=\"action update-btn\" href=\"Update.jsp?id=");
      out.print( id);
      out.write("\">Update</a></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
        }

            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
