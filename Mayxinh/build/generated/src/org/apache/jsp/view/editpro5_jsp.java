package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editpro5_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("    <!--  This file has been downloaded from bootdey.com @bootdey on twitter -->\n");
      out.write("    <!--  All snippets are MIT license http://bootdey.com/license -->\n");
      out.write("    <title>Chỉnh sửa trang cá nhân</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container-xl px-4 mt-4\">\n");
      out.write("    <!-- Account page navigation-->\n");
      out.write("    <nav class=\"nav nav-borders\">\n");
      out.write("        <a class=\"nav-link active ms-0\"  target=\"__blank\">Trang cá nhân</a>\n");
      out.write("       \n");
      out.write("    </nav>\n");
      out.write("    <hr class=\"mt-0 mb-4\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-xl-4\">\n");
      out.write("            <!-- Profile picture card-->\n");
      out.write("            <div class=\"card mb-4 mb-xl-0\">\n");
      out.write("                <div class=\"card-header\">Ảnh cá nhân</div>\n");
      out.write("                <div class=\"card-body text-center\">\n");
      out.write("                    <!-- Profile picture image-->\n");
      out.write("                    <a  href=\"https://ibb.co/1M8HKBs\"><img class=\"img-account-profile rounded-circle mb-2\" src=\"https://i.ibb.co/1M8HKBs/avt.png\" alt=\"avt\" border=\"0\" /></a>\n");
      out.write("                    \n");
      out.write("                    <!-- Profile picture help block-->\n");
      out.write("                    <div class=\"small font-italic text-muted mb-4\">JPG hoặc PNG kích thước bé 5 MB</div>\n");
      out.write("                    <!-- Profile picture upload button-->\n");
      out.write("                    <button class=\"btn btn-primary\" type=\"button\">Tải lên ảnh mới của bạn</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-xl-8\">\n");
      out.write("            <!-- Account details card-->\n");
      out.write("            <div class=\"card mb-4\">\n");
      out.write("                <div class=\"card-header\">Chi tiết tài khoản</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"EditProfile\" method=\"POST\">\n");
      out.write("                        <!-- Form Group (username)-->\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label class=\"small mb-1\" for=\"inputUsername\">Tên đăng nhập</label>\n");
      out.write("                            <input class=\"form-control\" id=\"inputUsername\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"username\" disabled>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Form Row-->\n");
      out.write("                        <div class=\"row gx-3 mb-3\">\n");
      out.write("                            <!-- Form Group (first name)-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label class=\"small mb-1\" for=\"inputFirstName\">Họ và tên</label>\n");
      out.write("                                <input class=\"form-control\" id=\"inputFirstName\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"fname\">\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Form Group (last name)-->\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                        <!-- Form Row        -->\n");
      out.write("                        <div class=\"row gx-3 mb-3\">\n");
      out.write("                            <!-- Form Group (organization name)-->\n");
      out.write("                            \n");
      out.write("                            <!-- Form Group (location)-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label class=\"small mb-1\" for=\"inputLocation\">Địa chỉ</label>\n");
      out.write("                                <input class=\"form-control\" id=\"inputLocation\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"address\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label class=\"small mb-1\" for=\"inputEmailAddress\">Email</label>\n");
      out.write("                            <input class=\"form-control\" id=\"inputEmailAddress\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"email\">\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Form Row-->\n");
      out.write("                        <div class=\"row gx-3 mb-3\">\n");
      out.write("                            <!-- Form Group (phone number)-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label class=\"small mb-1\" for=\"inputPhone\">Số điện thoại</label>\n");
      out.write("                                <input class=\"form-control\" id=\"inputPhone\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"phone\">\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Form Group (birthday)-->\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <!-- Save changes button-->\n");
      out.write("                         <label style=\"color: red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                    <input type=\"submit\" value=\"Cập nhật\" />\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body{margin-top:20px;\n");
      out.write("background-color:#f2f6fc;\n");
      out.write("color:#69707a;\n");
      out.write("}\n");
      out.write(".img-account-profile {\n");
      out.write("    height: 10rem;\n");
      out.write("}\n");
      out.write(".rounded-circle {\n");
      out.write("    border-radius: 50% !important;\n");
      out.write("}\n");
      out.write(".card {\n");
      out.write("    box-shadow: 0 0.15rem 1.75rem 0 rgb(33 40 50 / 15%);\n");
      out.write("}\n");
      out.write(".card .card-header {\n");
      out.write("    font-weight: 500;\n");
      out.write("}\n");
      out.write(".card-header:first-child {\n");
      out.write("    border-radius: 0.35rem 0.35rem 0 0;\n");
      out.write("}\n");
      out.write(".card-header {\n");
      out.write("    padding: 1rem 1.35rem;\n");
      out.write("    margin-bottom: 0;\n");
      out.write("    background-color: rgba(33, 40, 50, 0.03);\n");
      out.write("    border-bottom: 1px solid rgba(33, 40, 50, 0.125);\n");
      out.write("}\n");
      out.write(".form-control, .dataTable-input {\n");
      out.write("    display: block;\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 0.875rem 1.125rem;\n");
      out.write("    font-size: 0.875rem;\n");
      out.write("    font-weight: 400;\n");
      out.write("    line-height: 1;\n");
      out.write("    color: #69707a;\n");
      out.write("    background-color: #fff;\n");
      out.write("    background-clip: padding-box;\n");
      out.write("    border: 1px solid #c5ccd6;\n");
      out.write("    -webkit-appearance: none;\n");
      out.write("    -moz-appearance: none;\n");
      out.write("    appearance: none;\n");
      out.write("    border-radius: 0.35rem;\n");
      out.write("    transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav-borders .nav-link.active {\n");
      out.write("    color: #0061f2;\n");
      out.write("    border-bottom-color: #0061f2;\n");
      out.write("}\n");
      out.write(".nav-borders .nav-link {\n");
      out.write("    color: #69707a;\n");
      out.write("    border-bottom-width: 0.125rem;\n");
      out.write("    border-bottom-style: solid;\n");
      out.write("    border-bottom-color: transparent;\n");
      out.write("    padding-top: 0.5rem;\n");
      out.write("    padding-bottom: 0.5rem;\n");
      out.write("    padding-left: 0;\n");
      out.write("    padding-right: 0;\n");
      out.write("    margin-left: 1rem;\n");
      out.write("    margin-right: 1rem;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
