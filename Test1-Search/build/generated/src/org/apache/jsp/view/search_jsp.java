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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"view/style.css\">\n");
      out.write("        <title>Search</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Search</h1>\n");
      out.write("        <div>\n");
      out.write("            <form action=\"/Test1-Search/search\" method=\"get\">\n");
      out.write("                <label for=\"\">ID: </label>\n");
      out.write("                <input type=\"text\" name=\"id\" /><br /><br />\n");
      out.write("                <label for=\"\">Name: </label>\n");
      out.write("                <input type=\"text\" name=\"name\" /><br /><br />\n");
      out.write("                <label for=\"\">Gender: </label>\n");
      out.write("                <input type=\"radio\" id=\"male\" name=\"gender\" value=\"male\" />\n");
      out.write("                <label for=\"male\">Male</label>\n");
      out.write("                <input type=\"radio\" id=\"female\" name=\"gender\" value=\"female\" />\n");
      out.write("                <label for=\"female\">Female</label>\n");
      out.write("                <input type=\"radio\" id=\"both\" name=\"gender\" value=\"both\" />\n");
      out.write("                <label for=\"both\">Both</label>\n");
      out.write("                <br /><br />\n");
      out.write("                <label for=\"\">Department: </label>\n");
      out.write("                <select name=\"department\" id=\"department\">\n");
      out.write("                    <option value=\"all\">-----ALL-----</option>\n");
      out.write("                    <option value=\"is\">IS</option>\n");
      out.write("                    <option value=\"ia\">IA</option>\n");
      out.write("                </select><br><br>\n");
      out.write("                <label for=\"\">DOB From: </label>\n");
      out.write("                <input type=\"date\" name=\"dob-from\"></br></br>\n");
      out.write("                <label for=\"\">DOB To: </label>\n");
      out.write("                <input type=\"date\" name=\"dob-to\"></br></br>\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"Search\" /></br></br>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Gender</th>\n");
      out.write("                    <th>DOB</th>\n");
      out.write("                    <th>Department</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    DepartmentDAO ddb = new DepartmentDAO();
                    List<Department> ld = ddb.getDepartments();
                    List<Employee> le = null;
                    if (request.getAttribute("listEmployees") != null) {
                        le = (List<Employee>) request.getAttribute("listEmployees");

                        for (int i = 0; i < le.size(); i++) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th>");
      out.print( le.get(i).getId());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( le.get(i).getName());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( le.get(i).isGender());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( le.get(i).getDob());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( ddb.getNameById(ld, le.get(i).getDid()));
      out.write("</th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
}
                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
