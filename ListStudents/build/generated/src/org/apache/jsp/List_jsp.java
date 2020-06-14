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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>List Student</title>\n");
      out.write("        <style>\n");
      out.write("            h1{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("                font-family: arial, sans-serif;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 80%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td, th {\n");
      out.write("                border: 1px solid #dddddd;\n");
      out.write("                text-align: left;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("/*            tr:nth-child(even) {\n");
      out.write("                background-color: #dddddd;\n");
      out.write("            }*/\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>List Student - num = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.num}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Code</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Gender</th>\n");
      out.write("                <th>City</th>\n");
      out.write("            </tr>\n");
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

            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( ls.get(i).getCode());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ls.get(i).getName());
      out.write("</td>\n");
      out.write("\n");
      out.write("                ");

                    if (ls.get(i).isGender()) {
                
      out.write(" \n");
      out.write("                <td><img src=\"male.png\" alt=\"male\"></td>\n");
      out.write("                    ");
 } else {
      out.write("\n");
      out.write("                <td><img src=\"female.png\" alt=\"female\"></td>\n");
      out.write("                    ");

                        }

                    
      out.write(" \n");
      out.write("                <td>");
      out.print( ls.get(i).getCity());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }

            
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("        </table>       \n");
      out.write("\n");
      out.write("        \n");
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
