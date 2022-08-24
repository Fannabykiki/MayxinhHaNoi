package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changepass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("        <!--  This file has been downloaded from bootdey.com @bootdey on twitter -->\n");
      out.write("        <!--  All snippets are MIT license http://bootdey.com/license -->\n");
      out.write("        <title>small change password form - Bootdey.com</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <link href=\"https://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container bootstrap snippets bootdey\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-sm-12 col-md-6 col-md-offset-2\">\n");
      out.write("                    <div class=\"panel panel-info\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h3 class=\"panel-title\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-th\"></span>\n");
      out.write("                                Đổi mật khẩu   \n");
      out.write("                            </h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-6 col-sm-6 col-md-6 separator social-login-box\"> <br>\n");
      out.write("                                    <a  href=\"https://ibb.co/1M8HKBs\"><img class=\"img-thumbnail\" src=\"https://i.ibb.co/1M8HKBs/avt.png\" alt=\"avt\" border=\"0\" /></a>\n");
      out.write("\n");
      out.write("<!--                                    <img alt=\"\" class=\"img-thumbnail\" src=\"https://bootdey.com/img/Content/avatar/avatar1.png\">                        -->\n");
      out.write("                                </div>\n");
      out.write("                                <div style=\"margin-top:80px;\" class=\"col-xs-6 col-sm-6 col-md-6 login-box\">\n");
      out.write("                                    <form action=\"changepass\" method=\"POST\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <div class=\"input-group-addon\"><span class=\"glyphicon glyphicon-lock\"></span></div>\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                     <div class=\"form-group\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <div class=\"input-group-addon\"><span class=\"glyphicon glyphicon-lock\"></span></div>\n");
      out.write("                                            <input class=\"form-control\" type=\"password\" name=\"oldpass\" placeholder=\"Mật khẩu cũ\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <div class=\"input-group-addon\"><span class=\"glyphicon glyphicon-log-in\"></span></div>\n");
      out.write("                                            <input class=\"form-control\" type=\"password\" name=\"newpass\" placeholder=\"Mật khẩu mới\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <div class=\"input-group-addon\"><span class=\"glyphicon glyphicon-log-in\"></span></div>\n");
      out.write("                                            <input class=\"form-control\" type=\"password\" name=\"renewpass\" placeholder=\"Nhập lại mật khẩu mới\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-footer\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-6 col-sm-6 col-md-6\"></div>\n");
      out.write("                                <div class=\"col-xs-6 col-sm-6 col-md-6\">\n");
      out.write("                                    <button class=\"btn icon-btn-save btn-success\" type=\"submit\">\n");
      out.write("                                        <span class=\"btn-save-label\"><i class=\"glyphicon glyphicon-floppy-disk\"></i></span>Cập nhật</button>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                background:#eee;\n");
      out.write("            }\n");
      out.write("            .separator {\n");
      out.write("                border-right: 1px solid #dfdfe0; \n");
      out.write("            }\n");
      out.write("            .icon-btn-save {\n");
      out.write("                padding-top: 0;\n");
      out.write("                padding-bottom: 0;\n");
      out.write("            }\n");
      out.write("            .input-group {\n");
      out.write("                margin-bottom:10px; \n");
      out.write("            }\n");
      out.write("            .btn-save-label {\n");
      out.write("                position: relative;\n");
      out.write("                left: -12px;\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 6px 12px;\n");
      out.write("                background: rgba(0,0,0,0.15);\n");
      out.write("                border-radius: 3px 0 0 3px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
