 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<meta charset="UTF-8">
<!--PreLoader-->
<div class="loader">
    <div class="loader-inner">
        <div class="circle"></div>
    </div>
</div>
<!--PreLoader Ends-->

<!-- header -->
<div class="top-header-area" id="sticker">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 col-sm-12 text-center">
                <div class="main-menu-wrap">
                    <!-- logo -->
                    <div class="site-logo">
                        <a href="home">
                            <img src="assets/img/logo.png" alt="">
                        </a>
                    </div>
                    <!-- logo -->

                    <!-- menu start -->
                    <nav class="main-menu">
                        <ul>
                            <li class="current-list-item"><a href="home">Trang chủ</a>

                            </li>
                            <li><a href="about">Về chúng tôi</a></li>

                            <li><a href="news">Thông tin chi tiết</a>

                            </li>
                            <li><a href="contact">Liên hệ</a></li>
                            <li><a href="shop">Cửa hàng</a>
                                <ul class="sub-menu">
                                    <li><a href="shop">Cửa hàng</a></li>
                                    <li><a href="checkout">Thanh toán</a></li>

                                    <li><a href="cart">Giỏ hàng</a></li>
                                </ul>
                            </li>
                            <li>
                                <div class="header-icons">


                                    <a class="shopping-cart" href="cart" >
                                        <i class="fas fa-shopping-cart"></i>

                                        <span id="cart_number"class="badge bg-dark text-white ms-1 rounded-pill">${sessionScope.carts.size()}</span>
                                    </a>

                                    <a class="mobile-hide search-bar-icon" href="#"><i class="fas fa-search"></i></a>
                                    <a class="user" href="signin"><i class="fas fa-user-ninja">

                                        </i>
                                        <c:choose>
                                            <c:when test="${sessionScope.account==null}">
                                                <a href="signin"> Đăng nhập</a>
                                            </c:when>
                                            <c:otherwise>
                                                <a href="EditProfile">Chào ${sessionScope.account.fullname}</a>
                                                <ul class="sub-menu">
                                                    <li><a href="EditProfile"><span>Thông tin tài khoản</span></a></li>
                                                    <li><a href="changepass"><span>Đổi mật khẩu</span></a></li>
                                                    <c:if test="${sessionScope.account.roleId == 0}">
                                                    <li><a href="admin/manager"><span>Quản lí</span></a></li>
                                                        </c:if> 
                                                    <li><a href="logout"><span>Đăng xuất</span></a></li>
                                                </ul>
                                            </c:otherwise>
                                        </c:choose>
                                    </a>


                                </div>
                            </li>
                        </ul>
                    </nav>
                    <a class="mobile-show search-bar-icon" href="#"><i class="fas fa-search"></i></a>
                    <div class="mobile-menu"></div>
                    <!-- menu end -->
                </div>
            </div>
        </div>
    </div>
</div>
<div class="search-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <span class="close-btn"><i class="fas fa-window-close"></i></span>
                <form action="search"
                      <div class="search-bar">
                        <div class="search-bar-tablecell">
                            <h3>Tìm Kiếm:</h3>
                            <input style="font-size: 30px" name="keyword" type="text" placeholder="Nhập sản phẩm cần tìm kiếm...">
                            <button type="submit">Tìm kiếm <i class="fas fa-search"></i></button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>