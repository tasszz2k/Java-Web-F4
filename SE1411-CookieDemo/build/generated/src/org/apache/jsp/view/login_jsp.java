package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\" />\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            href=\"vendor/bootstrap/css/bootstrap.min.css\"\n");
      out.write("            />\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\"\n");
      out.write("            />\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            href=\"fonts/iconic/css/material-design-iconic-font.min.css\"\n");
      out.write("            />\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\" />\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            href=\"vendor/css-hamburgers/hamburgers.min.css\"\n");
      out.write("            />\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            href=\"vendor/animsition/css/animsition.min.css\"\n");
      out.write("            />\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            href=\"vendor/select2/select2.min.css\"\n");
      out.write("            />\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            type=\"text/css\"\n");
      out.write("            href=\"vendor/daterangepicker/daterangepicker.css\"\n");
      out.write("            />\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\" />\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--======== Cookie =========== -->\n");
      out.write("        ");

            Cookie[] listCookie = request.getCookies();
            String username = "";
            String password = "";
            String remember = "";

            int i = 0;
            if (listCookie != null) {
                while (i < listCookie.length) {
        
      out.write("\n");
      out.write("        ");
      out.print( listCookie[i].getName());
      out.write("\n");
      out.write("        ");

                    if (listCookie[i].getName().equals("username")) {
                        username = listCookie[i].getValue();
                    }
                    if (listCookie[i].getName().equals("pass")) {
                        password = listCookie[i].getValue();
                    }
                    if (listCookie[i].getName().equals("remember")) {
                        remember = listCookie[i].getValue();
                    }
                    i++;
                }
            }

        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--======== Cookie =========== -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"limiter\">\n");
      out.write("            <div\n");
      out.write("                class=\"container-login100\"\n");
      out.write("                style=\"background-image: url('images/bg-01.jpg');\"\n");
      out.write("                >\n");
      out.write("                <div class=\"wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54\">\n");
      out.write("                    <form\n");
      out.write("                        class=\"login100-form validate-form\"\n");
      out.write("                        action=\"/SE1411-CookieDemo/login\"\n");
      out.write("                        method=\"post\"\n");
      out.write("                        >\n");
      out.write("                        <span class=\"login100-form-title p-b-49\">\n");
      out.write("                            Login\n");
      out.write("                        </span>\n");
      out.write("\n");
      out.write("                        <div\n");
      out.write("                            class=\"wrap-input100 validate-input m-b-23\"\n");
      out.write("                            data-validate=\"Username is reauired\"\n");
      out.write("                            >\n");
      out.write("                            <span class=\"label-input100\">Username</span>\n");
      out.write("                            <input\n");
      out.write("                                class=\"input100\"\n");
      out.write("                                type=\"text\"\n");
      out.write("                                name=\"username\"\n");
      out.write("                                placeholder=\"Type your username\"\n");
      out.write("                                value=\"");
      out.print( username);
      out.write("\"\n");
      out.write("                                />\n");
      out.write("                            <span class=\"focus-input100\" data-symbol=\"&#xf206;\"></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div\n");
      out.write("                            class=\"wrap-input100 validate-input\"\n");
      out.write("                            data-validate=\"Password is required\"\n");
      out.write("                            >\n");
      out.write("                            <span class=\"label-input100\">Password</span>\n");
      out.write("                            <input\n");
      out.write("                                class=\"input100\"\n");
      out.write("                                type=\"password\"\n");
      out.write("                                name=\"pass\"\n");
      out.write("                                placeholder=\"Type your password\"\n");
      out.write("                                value=\"");
      out.print( password);
      out.write("\"\n");
      out.write("                                />\n");
      out.write("                            <span class=\"focus-input100\" data-symbol=\"&#xf190;\"></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"text-left p-t-8 p-b-31\">\n");
      out.write("                            <input type=\"checkbox\" name=\"remember\" value=\"ON\" ");
      out.print( "ON".equals(remember) ? "checked='checked'" : "");
      out.write("/> remember me<br/>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"text-right p-t-8 p-b-31\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                Forgot password?\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"container-login100-form-btn\">\n");
      out.write("                            <div class=\"wrap-login100-form-btn\">\n");
      out.write("                                <div class=\"login100-form-bgbtn\"></div>\n");
      out.write("                                <button class=\"login100-form-btn\">\n");
      out.write("                                    Login\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"txt1 text-center p-t-54 p-b-20\">\n");
      out.write("                            <span>\n");
      out.write("                                Or Sign Up Using\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"flex-c-m\">\n");
      out.write("                            <a href=\"#\" class=\"login100-social-item bg1\">\n");
      out.write("                                <i class=\"fa fa-facebook\"></i>\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                            <a href=\"#\" class=\"login100-social-item bg2\">\n");
      out.write("                                <i class=\"fa fa-twitter\"></i>\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                            <a href=\"#\" class=\"login100-social-item bg3\">\n");
      out.write("                                <i class=\"fa fa-google\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"flex-col-c p-t-155\">\n");
      out.write("                            <span class=\"txt1 p-b-17\">\n");
      out.write("                                Or Sign Up Using\n");
      out.write("                            </span>\n");
      out.write("\n");
      out.write("                            <a href=\"#\" class=\"txt2\">\n");
      out.write("                                Sign Up\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"dropDownSelect1\"></div>\n");
      out.write("\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("        <script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
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
