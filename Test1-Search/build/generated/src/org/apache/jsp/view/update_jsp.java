package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Employee;
import dal.EmployeeDAO;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Update</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Update</h1>\n");
      out.write("        ");
 if (request.getParameter("id") != null) {
                int id = Integer.parseInt(request.getParameter("id"));
                EmployeeDAO edb = new EmployeeDAO();
                Employee e = edb.getEmployeeById(id);
        
      out.write("\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <form action=\"/Test1-Search/update\" method=\"post\">\n");
      out.write("                <label for=\"id\">ID:</label><br />\n");
      out.write("                <input type=\"text\" id=\"id\" name=\"id\" value=\"");
      out.print( e.getId());
      out.write("\" readonly=\"\"/><br />\n");
      out.write("                <label for=\"name\">Name:</label><br />\n");
      out.write("                <input type=\"text\" id=\"name\" name=\"name\" value=\"");
      out.print( e.getName());
      out.write("\"/><br />\n");
      out.write("                <label for=\"dob\">Date of birth</label><br />\n");
      out.write("                <input type=\"date\" id=\"dob\" name=\"dob\" value=\"");
      out.print( e.getDob());
      out.write("\"/><br />\n");
      out.write("                <label for=\"gender\">Gender</label><br />\n");
      out.write("                <input type=\"text\" id=\"gender\" name=\"gender\" value=\"");
      out.print( e.isGender());
      out.write("\"/><br />\n");
      out.write("                <label for=\"did\">Department ID</label><br />\n");
      out.write("                <input type=\"text\" id=\"did\" name=\"did\" value=\"");
      out.print( e.getDid());
      out.write("\"/><br />\n");
      out.write("                <br />\n");
      out.write("                <input type=\"submit\" value=\"UPDATE\" />\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        <h1>ID = ");
      out.print( request.getParameter("id"));
      out.write(" is not exist!</h1>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
