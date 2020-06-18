package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Department;
import dal.DepartmentDAO;
import model.Employee;
import java.util.List;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"view/style.css\">\r\n");
      out.write("        <title>Search</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <h1>Search</h1>\r\n");
      out.write("        <div>\r\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/search\" method=\"get\">\r\n");
      out.write("                <label for=\"\">ID: </label>\r\n");
      out.write("                <input type=\"text\" name=\"id\" /><br /><br />\r\n");
      out.write("                <label for=\"\">Name: </label>\r\n");
      out.write("                <input type=\"text\" name=\"name\" /><br /><br />\r\n");
      out.write("                <label for=\"\">Gender: </label>\r\n");
      out.write("                <input type=\"radio\" id=\"male\" name=\"gender\" value=\"male\" />\r\n");
      out.write("                <label for=\"male\">Male</label>\r\n");
      out.write("                <input type=\"radio\" id=\"female\" name=\"gender\" value=\"female\" />\r\n");
      out.write("                <label for=\"female\">Female</label>\r\n");
      out.write("                <input type=\"radio\" id=\"both\" name=\"gender\" value=\"both\" />\r\n");
      out.write("                <label for=\"both\">Both</label>\r\n");
      out.write("                <br /><br />\r\n");
      out.write("                <label for=\"\">Department: </label>\r\n");
      out.write("                <select name=\"department\" id=\"department\">\r\n");
      out.write("                    <option value=\"all\">-----ALL-----</option>\r\n");
      out.write("                    <option value=\"is\">IS</option>\r\n");
      out.write("                    <option value=\"ia\">IA</option>\r\n");
      out.write("                </select><br><br>\r\n");
      out.write("                <label for=\"\">DOB From: </label>\r\n");
      out.write("                <input type=\"date\" name=\"dob-from\"></br></br>\r\n");
      out.write("                <label for=\"\">DOB To: </label>\r\n");
      out.write("                <input type=\"date\" name=\"dob-to\"></br></br>\r\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"Search\" /></br></br>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <hr>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <a href=\"/Test1-Search/view/insert.jsp\" class=\"button\">Add New</a><br><br><br>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>ID</th>\r\n");
      out.write("                    <th>Name</th>\r\n");
      out.write("                    <th>Gender</th>\r\n");
      out.write("                    <th>DOB</th>\r\n");
      out.write("                    <th>Department</th>\r\n");
      out.write("                    <th colspan=\"2\" id=\"action\">Action</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                    DepartmentDAO ddb = new DepartmentDAO();
                    List<Department> ld = ddb.getDepartments();
                    List<Employee> le = null;
                    if (request.getAttribute("listEmployees") != null) {
                        le = (List<Employee>) request.getAttribute("listEmployees");

                        for (int i = 0; i < le.size(); i++) {
                            int id = le.get(i).getId();
                
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>");
      out.print( le.get(i).getId());
      out.write("</th>\r\n");
      out.write("                    <th>");
      out.print( le.get(i).getName());
      out.write("</th>\r\n");
      out.write("                    <th>");
      out.print( le.get(i).isGender());
      out.write("</th>\r\n");
      out.write("                    <th>");
      out.print( le.get(i).getDob());
      out.write("</th>\r\n");
      out.write("                    <th>");
      out.print( ddb.getNameById(ld, le.get(i).getDid()));
      out.write("</th>\r\n");
      out.write("                    <td><a class=\"action remove-btn\" href=\"delete?id=");
      out.print( id);
      out.write("\">Remove</a></td>\r\n");
      out.write("                    <td><a class=\"action update-btn\" href=\"/Test1-Search/view/update.jsp?id=");
      out.print( id);
      out.write("\">Update</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
}
                    }
                
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
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
