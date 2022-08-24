package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class card_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("        <title>Project PRJ</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat%7COpen+Sans:700,400%7CRaleway:400,800,900\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"icon\" href=\"favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <link href=\"css/library/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"dev-assets/preloader-default.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- <link href=\"dev-assets/demo-switcher.css\" rel=\"stylesheet\" type=\"text/css\" /> -->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--BREADCRUMBS BEGIN-->\n");
      out.write("        <section class=\"image-header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"info\">\n");
      out.write("                            <div class=\"wrap\">\n");
      out.write("                                <ul class=\"breadcrumbs\">\n");
      out.write("                                    <li><a href=\"Home\">Main</a>/</li>\n");
      out.write("                                    <li>Carts</li>\n");
      out.write("                                </ul>\n");
      out.write("                                <h1>CheckOut</h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\t\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!--BREADCRUMBS END-->\n");
      out.write("        <!--CHECKOUT WRAP BEGIN-->\n");
      out.write("        <section class=\"checkout-wrap\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"alert team-alert fade in\" role=\"alert\"> \n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span class=\"fa fa-close\" aria-hidden=\"true\"></span></button> \n");
      out.write("                            Follow us on facebook? <a href=\"https://www.facebook.com/egamorft/\" target=\"_blank\">Click here to follow us </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-7\">\n");
      out.write("                        <h4>Billing Details</h4>\n");
      out.write("                        <form action=\"checkout\" method=\"POST\">\n");
      out.write("                            <div class=\"customer-info\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"item\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <span>Full Name <i>*</i></span>\n");
      out.write("                                                <input type=\"text\" name=\"name\" placeholder=\"Full name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled=\"\">\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"item\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <span>Date of birth<i>*</i></span>\n");
      out.write("                                                <input type=\"date\" name=\"dob\">\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"item\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <span>Email<i>*</i></span>\n");
      out.write("                                                <input type=\"text\" name=\"email\" placeholder=\"Email\">\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"item\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <span>Phone <i>*</i></span>\n");
      out.write("                                                <input type=\"text\" name=\"phone\" placeholder=\"Phone\">\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"item\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <span>Address <i>*</i></span>\n");
      out.write("                                                <input type=\"text\" name=\"address\" placeholder=\"Address\">\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"item\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <span>Order notes</span>\n");
      out.write("                                                <textarea name=\"note\" placeholder=\"Notes about your order, e.g. special notes for delivery\"></textarea>\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"cart-total\">\n");
      out.write("\n");
      out.write("                                    <div class=\"delivery-list\">\n");
      out.write("                                        <button type=\"submit\" class=\"proceed\">Place order<i class=\"fa fa-check\" aria-hidden=\"true\"></i></button>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <h4>Your order</h4>\n");
      out.write("                        <table class=\"cart-table\">\n");
      out.write("                            <tbody><tr>\n");
      out.write("                                    <th class=\"product\">Product</th>\n");
      out.write("                                    <th class=\"total\">Total</th>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Subtotal<br>Shipping</td>\n");
      out.write("                                    <td class=\"total\">£ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoney}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>£ 4</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><strong>Total</strong></td>\n");
      out.write("                                    <td class=\"total\">£ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoney + 4}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                        <div class=\"cart-total\">\n");
      out.write("                            <div class=\"delivery-list\">\n");
      out.write("                                <label class=\"item\">\n");
      out.write("                                    <input name=\"del-check\" type=\"radio\" checked=\"checked\">\n");
      out.write("                                    <span class=\"name\">Cash on Delivery</span>\t\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!--CHECKOUT WRAP END-->\n");
      out.write("   \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${carts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("cart");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td><img width=\"30%\" class=\"product-image\" src=\"images/product/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.value.product.imageUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"cart-product\"><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.value.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" # ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.value.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong></td>\n");
          out.write("                                        <td class=\"total\">£ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.value.product.price * cart.value.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    </tr>\n");
          out.write("                                ");
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
}
