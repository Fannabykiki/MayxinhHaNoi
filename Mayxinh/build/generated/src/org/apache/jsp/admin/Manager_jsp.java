package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Manager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\" />\n");
      out.write("        <!-- https://fonts.google.com/specimen/Roboto -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontawesome.min.css\" />\n");
      out.write("        <!-- https://fontawesome.com/ -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("        <!-- https://getbootstrap.com/ -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo-style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"reportsPage\">\n");
      out.write("     \n");
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"row tm-content-row\">\n");
      out.write("                <div class=\"col-sm-12 col-md-12 col-lg-8 col-xl-8 tm-block-col\">\n");
      out.write("                    <div class=\"tm-bg-primary-dark tm-block tm-block-products\">\n");
      out.write("                        <div class=\"tm-product-table-container\">\n");
      out.write("                            <table class=\"table table-hover tm-table-small tm-product-table\" id=\"grid\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"col\">&nbsp;</th>\n");
      out.write("                                        <th scope=\"col\">ID</th>\n");
      out.write("                                        <th scope=\"col\">CODE</th>\n");
      out.write("                                        <th scope=\"col\" data-type=\"string\">PRODUCT NAME</th>\n");
      out.write("                                        <th scope=\"col\" data-type=\"number\">PRICE SOLD</th>\n");
      out.write("                                        <th scope=\"col\">IN STOCK</th>\n");
      out.write("                                        <th scope=\"col\">&nbsp;</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- table container -->\n");
      out.write("                        <a href=\"add-product\" class=\"btn btn-primary btn-block text-uppercase mb-3\">Add new product</a>\n");
      out.write("                        <button class=\"btn btn-primary btn-block text-uppercase\">\n");
      out.write("                            Delete selected products\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-12 col-md-12 col-lg-4 col-xl-4 tm-block-col\">\n");
      out.write("                    <div class=\"tm-bg-primary-dark tm-block tm-block-product-categories\">\n");
      out.write("                        <h2 class=\"tm-block-title\">Product Categories</h2>\n");
      out.write("                        <div class=\"tm-product-table-container\">\n");
      out.write("                            <table class=\"table tm-table-small tm-product-table\">\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- table container -->\n");
      out.write("                        <button class=\"btn btn-primary btn-block text-uppercase mb-3\">\n");
      out.write("                            Add new category\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <!-- https://jquery.com/download/ -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- https://getbootstrap.com/ -->\n");
      out.write("        <script>\n");
      out.write("                                                grid.onclick = function (e) {\n");
      out.write("                                                    if (e.target.tagName != 'TH')\n");
      out.write("                                                        return;\n");
      out.write("\n");
      out.write("                                                    let th = e.target;\n");
      out.write("                                                    // if TH, then sort\n");
      out.write("                                                    // cellIndex is the number of th:\n");
      out.write("                                                    //   0 for the first column\n");
      out.write("                                                    //   1 for the second column, etc\n");
      out.write("                                                    sortGrid(th.cellIndex, th.dataset.type);\n");
      out.write("                                                };\n");
      out.write("\n");
      out.write("                                                function sortGrid(colNum, type) {\n");
      out.write("                                                    let tbody = grid.querySelector('tbody');\n");
      out.write("\n");
      out.write("                                                    let rowsArray = Array.from(tbody.rows);\n");
      out.write("\n");
      out.write("                                                    // compare(a, b) compares two rows, need for sorting\n");
      out.write("                                                    let compare;\n");
      out.write("\n");
      out.write("                                                    switch (type) {\n");
      out.write("                                                        case 'number':\n");
      out.write("                                                            compare = function (rowA, rowB) {\n");
      out.write("                                                                return rowA.cells[colNum].innerHTML - rowB.cells[colNum].innerHTML;\n");
      out.write("                                                            };\n");
      out.write("                                                            break;\n");
      out.write("                                                        case 'string':\n");
      out.write("                                                            compare = function (rowA, rowB) {\n");
      out.write("                                                                return rowA.cells[colNum].innerHTML > rowB.cells[colNum].innerHTML ? 1 : -1;\n");
      out.write("                                                            };\n");
      out.write("                                                            break;\n");
      out.write("                                                    }\n");
      out.write("\n");
      out.write("                                                    // sort\n");
      out.write("                                                    rowsArray.sort(compare);\n");
      out.write("                                                    tbody.append(...rowsArray);\n");
      out.write("                                                }\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProducts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("product");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                                        <tr >\n");
          out.write("                                            <th scope=\"row\"><input type=\"checkbox\" /></th>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td class=\"tm-product-name\" onclick=\"document.location = 'edit-product?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>\n");
          out.write("                                                <a href=\"delete?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"tm-product-delete-link\">\n");
          out.write("                                                    <i class=\"far fa-trash-alt tm-product-delete-icon\"></i>\n");
          out.write("                                                </a>\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCategories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("category");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td class=\"tm-product-name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td class=\"text-center\">\n");
          out.write("                                                <a href=\"#\" class=\"tm-product-delete-link\">\n");
          out.write("                                                    <i class=\"far fa-trash-alt tm-product-delete-icon\"></i>\n");
          out.write("                                                </a>\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
