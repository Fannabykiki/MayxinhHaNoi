package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Mây xinh</title>\n");
      out.write("        <link href=\"css-min/EditProfile.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"EditProfile\" method=\"POST\">\n");
      out.write("            <div id=\"sc-edprofile\">\n");
      out.write("                <h1>Chỉnh sửa thông tin cá nhân</h1>\n");
      out.write("                <div class=\"sc-container\">\n");
      out.write("                    <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"username\" hidden=\"\"/>\n");
      out.write("                    <label>Username:</label>\n");
      out.write("                    <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"username\" disabled/>\n");
      out.write("                    <label>Email</label>\n");
      out.write("                    <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"email\"/>\n");
      out.write("                    <label>Phone</label>\n");
      out.write("                    <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"phone\"/>\n");
      out.write("                    \n");
      out.write("                    <label>Your full name (Display name)</label>\n");
      out.write("                    <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"fname\"/>\n");
      out.write("                    <label>Address</label>\n");
      out.write("                    <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"address\"/>\n");
      out.write("                    <label style=\"color: red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                    <input type=\"submit\" value=\"Cập nhật\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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
