package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calculator_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <form action=\"/SE1411-ELDemo/view/calculator.jsp\" method=\"post\">\n");
      out.write("            Number 1: <input type=\"number\" name=\"num1\" value=\"\" /> <br><br>\n");
      out.write("            Number 2: <input type=\"number\" name=\"num2\" value=\"\" /> <br><br>\n");
      out.write("            <select name=\"operator\" id=\"\">\n");
      out.write("                <option value=\"+\">+</option>\n");
      out.write("                <option value=\"-\">-</option>\n");
      out.write("                <option value=\"*\">x</option>\n");
      out.write("                <option value=\"/\">/</option>\n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\" value=\"Calculate\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

//            if (request.getParameter("num1") != null && request.getParameter("num1") != null) {
//                int num1 = Integer.parseInt(request.getParameter("num1"));
//                int num2 = Integer.parseInt(request.getParameter("num2"));
//                char operator = request.getParameter("operator").charAt(0);
//                String rs = " ";
//                switch (operator) {
//                    case '+':
//                        rs = "Sum: " + (num1 + num2);
//                        break;
//                    case '-':
//                        rs = "Subtraction: " + (num1 - num2);
//                        break;
//                    case '*':
//                        rs = "Multiply: " + (num1 * num2);
//                        break;
//                    case '/':
//                        if (num2 != 0) {
//                            rs = "Divide " + ((float) num1 / num2);
//                        } else {
//                            rs = "ERROR!";
//                        }
//                        break;
//                }
//                request.setAttribute("result", rs);
//                out.print(rs);
//            }
//

        
      out.write("\n");
      out.write("        ");
      bean.Calculator c = null;
      synchronized (request) {
        c = (bean.Calculator) _jspx_page_context.getAttribute("c", PageContext.REQUEST_SCOPE);
        if (c == null){
          c = new bean.Calculator();
          _jspx_page_context.setAttribute("c", c, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("c"), "num1", request.getParameter("num1"), request, "num1", false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("c"), "num2", request.getParameter("num2"), request, "num2", false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("c"), "operator", request.getParameter("operator"), request, "operator", false);
      out.write("\n");
      out.write("        <h2>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((bean.Calculator)_jspx_page_context.findAttribute("c")).getResult())));
      out.write("</h2>\n");
      out.write("        \n");
      out.write("        \n");
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
