package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Components/Navbar.jsp");
    _jspx_dependants.add("/Components/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
    _jspx_tagPool_c_when_test.release();
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"Responsive Bootstrap4 Shop Template, Created by Imran Hossain from https://imransdesign.com/\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Cửa hàng</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" style=\"border-radius: 10px\" href=\"assets/img/smalllogo.png\">\n");
      out.write("        <!-- google font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <!-- fontawesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/all.min.css\">\n");
      out.write("        <!-- bootstrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!-- owl carousel -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.css\">\n");
      out.write("        <!-- magnific popup -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\">\n");
      out.write("        <!-- animate css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\n");
      out.write("        <!-- mean menu css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/meanmenu.min.css\">\n");
      out.write("        <!-- main style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\">\n");
      out.write("        <!-- responsive -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/yourcode.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("       ");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<!--PreLoader-->\n");
      out.write("<div class=\"loader\">\n");
      out.write("    <div class=\"loader-inner\">\n");
      out.write("        <div class=\"circle\"></div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!--PreLoader Ends-->\n");
      out.write("\n");
      out.write("<!-- header -->\n");
      out.write("<div class=\"top-header-area\" id=\"sticker\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 col-sm-12 text-center\">\n");
      out.write("                <div class=\"main-menu-wrap\">\n");
      out.write("                    <!-- logo -->\n");
      out.write("                    <div class=\"site-logo\">\n");
      out.write("                        <a href=\"home\">\n");
      out.write("                            <img src=\"assets/img/logo.png\" alt=\"\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- logo -->\n");
      out.write("\n");
      out.write("                    <!-- menu start -->\n");
      out.write("                    <nav class=\"main-menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"current-list-item\"><a href=\"home\">Trang chủ</a>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"about\">Về chúng tôi</a></li>\n");
      out.write("\n");
      out.write("                            <li><a href=\"news\">Thông tin chi tiết</a>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"contact\">Liên hệ</a></li>\n");
      out.write("                            <li><a href=\"shop\">Cửa hàng</a>\n");
      out.write("                                <ul class=\"sub-menu\">\n");
      out.write("                                    <li><a href=\"shop\">Cửa hàng</a></li>\n");
      out.write("                                    <li><a href=\"checkout\">Thanh toán</a></li>\n");
      out.write("\n");
      out.write("                                    <li><a href=\"cart\">Giỏ hàng</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"header-icons\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <a class=\"shopping-cart\" href=\"cart\" >\n");
      out.write("                                        <i class=\"fas fa-shopping-cart\"></i>\n");
      out.write("\n");
      out.write("                                        <span id=\"cart_number\"class=\"badge bg-dark text-white ms-1 rounded-pill\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                    </a>\n");
      out.write("\n");
      out.write("                                    <a class=\"mobile-hide search-bar-icon\" href=\"#\"><i class=\"fas fa-search\"></i></a>\n");
      out.write("                                    <a class=\"user\" href=\"signin\"><i class=\"fas fa-user-ninja\">\n");
      out.write("\n");
      out.write("                                        </i>\n");
      out.write("                                        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                    <a class=\"mobile-show search-bar-icon\" href=\"#\"><i class=\"fas fa-search\"></i></a>\n");
      out.write("                    <div class=\"mobile-menu\"></div>\n");
      out.write("                    <!-- menu end -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"search-area\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <span class=\"close-btn\"><i class=\"fas fa-window-close\"></i></span>\n");
      out.write("                <form action=\"search\"\n");
      out.write("                      <div class=\"search-bar\">\n");
      out.write("                        <div class=\"search-bar-tablecell\">\n");
      out.write("                            <h3>Tìm Kiếm:</h3>\n");
      out.write("                            <input style=\"font-size: 30px\" name=\"keyword\" type=\"text\" placeholder=\"Nhập sản phẩm cần tìm kiếm...\">\n");
      out.write("                            <button type=\"submit\">Tìm kiếm <i class=\"fas fa-search\"></i></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- end search arewa -->\n");
      out.write("\n");
      out.write("        <!-- breadcrumb-section -->\n");
      out.write("        <div class=\"breadcrumb-section hero-bg\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 offset-lg-2 text-center\">\n");
      out.write("                        <div class=\"breadcrumb-text\">\n");
      out.write("                            <p style=\"font-size: 30px\">Cổ điển và phá cách</p>\n");
      out.write("                            <h1>Cửa hàng</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end breadcrumb section -->\n");
      out.write("\n");
      out.write("        <!-- products -->\n");
      out.write("        <div class=\"product-section mt-150 mb-150\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("               \t<div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"product-filters\">\n");
      out.write("                        <ul>\n");
      out.write("                              <li class=\"active\" data-filter=\"*\">All</li>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("                          \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row product-lists \">\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\" >\n");
      out.write("                    <div class=\"col-lg-12 text-center\">\n");
      out.write("\n");
      out.write("                        <div class=\"pagination-wrap\">\n");
      out.write("                            ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write(" \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("  <!-- footer -->\n");
      out.write("        <div class=\"footer-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\" style=\"font-size: 10pt\">\n");
      out.write("                        <div class=\"footer-box about-widget\" >\n");
      out.write("                            <h2 class=\"widget-title\">Nhà máy sản xuất nội thất Mây Xinh</h2>\n");
      out.write("                            <strong>\n");
      out.write("                                <span>\n");
      out.write("                                    <span class=\"fa fa-industry\" style=\"font-size:15px;color:red\"> Nhà Máy Miền Nam:</span>\n");
      out.write("                                    <span>A2- KCN Định Quán tỉnh Đồng Nai</span>\n");
      out.write("\n");
      out.write("                                </span>\n");
      out.write("                                <span>\n");
      out.write("                                    <span class=\"fa fa-industry\" style=\"font-size:15px;color:red\"> Nhà Máy Miền Bắc:</span>\n");
      out.write("                                    <span>Vân Du– Thạch Thành tỉnh Thanh Hóa</span>\n");
      out.write("\n");
      out.write("                                </span>\n");
      out.write("                            </strong>\n");
      out.write("                            <hr>\n");
      out.write("                            <p>Với hơn 100 công nhân viên, hoạt động sản \n");
      out.write("                                xuất trong ngành nội thất mây, chúng tôi luôn nỗ lực và phấn đấu để cho\n");
      out.write("                                ra đời những sản phẩm đẹp nhất, chất lượng nhất.\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"footer-box get-in-touch\">\n");
      out.write("                            <h2 class=\"widget-title\">Liên hệ</h2>\n");
      out.write("                            <ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a style=\"color: #ff0000;font-size: 17px\" href=\"mailto:order@mayxinh.com\" class=\"fa fa-envelope\">   order@mayxinh.com \n");
      out.write("                                    </a>\n");
      out.write("                                </li> \n");
      out.write("                                <li>\n");
      out.write("                                    <a style=\"color: #ff0000;font-size: 17px\" class=\"fa fa fa-phone\" > +0345 292 929\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <hr>\n");
      out.write("                            <ul class=\"list-unstyled\">\n");
      out.write("                                <li><i class=\"fa fa-map-marker\"></i><a href=\"https://mayxinh.com/thong-tin-lien-he-ha-noi/\"> Hà Nội: Số 7 Ngõ 73 Hoàng Ngân, P.Nhân Chính, Thanh Xuân, Hà Nội</a>&#8211;<a href=\"tel:0385162929\">0385162929</a></li>\n");
      out.write("                                <li><i class=\"fa fa-map-marker\"></i><a href=\"https://mayxinh.com/thong-tin-lien-he/\"> TP.HCM: 488/4 Cộng Hòa P.13 quận Tân Bình</a>&#8211;<a href=\"tel:0932181068\">0932181068</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><i class=\"fa fa-map-marker\"></i><a href=\"https://mayxinh.com/thong-tin-lien-he-da-nang/\"> Đà Nẵng: 114 Trần Thủ Độ, Khuê Trung, Cẩm Lệ, Đà Nẵng</a>&#8211;<a href=\"tel:0343642299\">0343 642 299</a></li>\n");
      out.write("                                <li><i class=\"fa fa-map-marker\"></i><a href=\"https://mayxinh.com/thong-tin-lien-he-can-tho/\"> Cần Thơ: 164D Trần Ngọc Quế Cần Thơ</a>&#8211;<a href=\"tel:0379508899\">0379 508 899</a></li>\n");
      out.write("                                <li><i class=\"fa fa-envelope-o\"></i><span style=\"font-size: 12pt; color: #ff0000;\">\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"footer-box pages\">\n");
      out.write("                            <h2 class=\"widget-title\">Pages</h2>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"home\">Trang chủ</a></li>\n");
      out.write("                                <li><a href=\"about\">Về chúng tôi</a></li>\n");
      out.write("                                <li><a href=\"shop\">Cửa hàng</a></li>\n");
      out.write("                                <li><a href=\"news\">Blog</a></li>\n");
      out.write("                                <li><a href=\"contact\">Liên hệ</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"footer-box subscribe\">\n");
      out.write("                            <h2 class=\"widget-title\">Đăng kí</h2>\n");
      out.write("                            <p>Đăng kí để nhận thông tin về sản phẩm mới nhất được cập nhật</p>\n");
      out.write("                            <form action=\"index.html\">\n");
      out.write("                                <input type=\"email\" placeholder=\"Email\">\n");
      out.write("                                <button type=\"submit\"><i class=\"fas fa-paper-plane\"></i></button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end footer -->\n");
      out.write("\n");
      out.write("        <!-- copyright -->\n");
      out.write("        <div class=\"copyright\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-12\">\n");
      out.write("                        <p>Copyrights &copy; 2022 - <a href=\"https://www.facebook.com/profile.php?id=100007008198341\">Fannaby</a>,  All Rights Reserved.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 text-right col-md-12\">\n");
      out.write("                        <div class=\"social-icons\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"https://www.facebook.com/mayxinhvn\" target=\"_blank\"><i class=\"fab fa-facebook-f\"></i></a></li>\n");
      out.write("                                <li><a href=\"https://twitter.com/?lang=en\" target=\"_blank\"><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("                                <li><a href=\"https://www.instagram.com/\" target=\"_blank\"><i class=\"fab fa-instagram\"></i></a></li>\n");
      out.write("                                <li><a href=\"https://www.youtube.com/watch?v=0GeQVtZ6Rd4\" target=\"_blank\"><i class=\"fab fa-youtube\"></i></a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>");
      out.write("   \n");
      out.write("        <!-- end copyright -->\n");
      out.write("\n");
      out.write("        <!-- jquery -->\n");
      out.write("        <script src=\"assets/js/jquery-1.11.3.min.js\"></script>\n");
      out.write("        <!-- bootstrap -->\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- count down -->\n");
      out.write("        <script src=\"assets/js/jquery.countdown.js\"></script>\n");
      out.write("        <!-- isotope -->\n");
      out.write("        <script src=\"assets/js/jquery.isotope-3.0.6.min.js\"></script>\n");
      out.write("        <!-- waypoints -->\n");
      out.write("        <script src=\"assets/js/waypoints.js\"></script>\n");
      out.write("        <!-- owl carousel -->\n");
      out.write("        <script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("        <!-- magnific popup -->\n");
      out.write("        <script src=\"assets/js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <!-- mean menu -->\n");
      out.write("        <script src=\"assets/js/jquery.meanmenu.min.js\"></script>\n");
      out.write("        <!-- sticker js -->\n");
      out.write("        <script src=\"assets/js/sticker.js\"></script>\n");
      out.write("        <!-- main js -->\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <a href=\"signin\"> Đăng nhập</a>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <a href=\"#\">Chào ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                                <ul class=\"sub-menu\">\n");
        out.write("                                                    <li><a href=\"EditProfile\"><span>Thông tin tài khoản</span></a></li>\n");
        out.write("                                                    <li><a href=\"changepass\"><span>Đổi mật khẩu</span></a></li>\n");
        out.write("                                                    <li><a href=\"logout\"><span>Đăng xuất</span></a></li>\n");
        out.write("                                                </ul>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCategories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <li ><a href=\"filter-category?categoryId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </a>\n");
          out.write("                            </li>\n");
          out.write("                            ");
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
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listproduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("p");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"col-lg-4 col-md-4 text-center \">\n");
          out.write("                            <div class=\"single-product-item\">\n");
          out.write("                                <div class=\"product-image\">\n");
          out.write("                                    <a href=\"spro?Product_ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                        <img style=\"height: 251px;width:189px\" src=\"assets/img/products/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                    </a>\n");
          out.write("                                </div>\n");
          out.write("                                <h3 style=\"font-size: 20px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                                <p style=\"font-size: 20px\" class=\"product-price\"><span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNĐ </p>\n");
          out.write("                                <a href=\"add-to-cart?Product_ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"cart-btn\"><i class=\"fas fa-shopping-cart\"></i>Thêm vào giỏ hàng</a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    ");
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

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    \n");
        out.write("                                ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listproduct == null || listproduct.size() == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    Not found product\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <ul>\n");
        out.write("                                        <li class=\"page-item\"><a class=\"page-link\" href=\"shop?page=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Trước</a></li>\n");
        out.write("                                            ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        <li class=\"page-item\">\n");
        out.write("                                            <a class=\"page-link\" href=\"shop?page=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Sau</a>\n");
        out.write("                                        </li>\n");
        out.write("                                    </ul>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_c_forEach_2.setBegin(1);
    _jspx_th_c_forEach_2.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${num}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_2.setVar("i");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <li class=\"page-item ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i == page?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                <a class=\"page-link\" href=\"shop?page=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                            </li>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
