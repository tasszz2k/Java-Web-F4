package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import controller.Student;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>List Student</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            table {\r\n");
      out.write("                font-family: arial, sans-serif;\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            td, th {\r\n");
      out.write("                border: 1px solid #dddddd;\r\n");
      out.write("                text-align: left;\r\n");
      out.write("                padding: 8px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            tr:nth-child(even) {\r\n");
      out.write("                background-color: #dddddd;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>List Student - num = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.num}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Code</th>\r\n");
      out.write("                <th>Name</th>\r\n");
      out.write("                <th>Age</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                int num = (Integer) request.getAttribute("num");
                ArrayList<Student> ls = new ArrayList<Student>();
                for (int i = 0; i < num; i++) {
                    Student s = new Student();
                    s.generateStudent();
                    ls.add(s);
                }
                //display
                for (int i = 0; i < ls.size(); i++) {

            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print( ls.get(i).getCode());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( ls.get(i).getName());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( ls.get(i).getAge());
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                }

            
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </table>       \r\n");
      out.write("\r\n");
      out.write("\r\n");
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
