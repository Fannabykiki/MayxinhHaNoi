<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Responsive Bootstrap4 Shop Template, Created by Imran Hossain from https://imransdesign.com/">

        <!-- title -->
        <title>Giỏ Hàng</title>

        <!-- favicon -->
        <link rel="shortcut icon" type="image/png" href="assets/img/favicon.png">
        <!-- google font -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap" rel="stylesheet">
        <!-- fontawesome -->
        <link rel="stylesheet" href="assets/css/all.min.css">
        <!-- bootstrap -->
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <!-- owl carousel -->
        <link rel="stylesheet" href="assets/css/owl.carousel.css">
        <!-- magnific popup -->
        <link rel="stylesheet" href="assets/css/magnific-popup.css">
        <!-- animate css -->
        <link rel="stylesheet" href="assets/css/animate.css">
        <!-- mean menu css -->
        <link rel="stylesheet" href="assets/css/meanmenu.min.css">
        <!-- main style -->
        <link rel="stylesheet" href="assets/css/main.css">
        <!-- responsive -->
        <link rel="stylesheet" href="assets/css/responsive.css">

    </head>
    <body>

        <%@include file="/Components/Navbar.jsp" %>

        <!-- breadcrumb-section -->
        <div class="breadcrumb-section breadcrumb-bg">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 offset-lg-2 text-center">
                        <div class="breadcrumb-text">
                            <p>Cổ điển và phá cách</p>
                            <h1>Giỏ hàng</h1>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end breadcrumb section -->

        <!-- cart -->
        <c:choose>
            <c:when test="${sessionScope.carts==null|| sessionScope.carts.size() == 0}">
                <div style="text-align: center" class="container">
                    <div>
                        <h3 style="color: red">Giỏ hàng của bạn đang trống</h3>
                        <h4>Hãy mua sắm gì đó thuiiii UwU</h4>

                    </div>
                    <div class="cart-buttons">
                        <a href="shop" class="boxed-btn">Tiếp tục mua sắm</a>
                    </div>
                </div>

            </c:when>
            <c:otherwise>
                <div class="cart-section mt-150 mb-150">
                    <h2 style="text-align: center;padding-bottom:  30px">Danh sách thanh toán</h2 >
                    <div class="container">
                        <div class="row">

                            <div class="col-lg-8 col-md-12">
                                <div class="cart-table-wrap">

                                    <table class="cart-table">
                                        <thead class="cart-table-head">
                                            <tr class="table-head-row">
                                                <th class="product-id">ID</th>
                                                <th class="product-image">Ảnh sản phẩm</th>
                                                <th class="product-name">Tên</th>
                                                <th class="product-price">Giá</th>
                                                <th class="product-quantity">Số lượng</th>
                                                <th class="product-remove">Action</th>
                                            </tr>

                                        </thead>
                                        <tbody>
                                            <c:forEach items="${carts}" var="c">
                                            <form action="updatecart">
                                                <input type="hidden" name="productId" value="${c.value.product.id}"
                                                       <tr class="table-body-row">
                                                    <td class="product-id">${c.value.product.id}</td>
                                                    <td class="product-image"><img src="assets/img/products/${c.value.product.image}" alt=""></td>
                                                    <td class="product-name">${c.value.product.name}</td>
                                                    <td class="product-price">${c.value.product.price}</td>
                                                    <td class="product-quantity"><input onchange="this.form.submit()" name="quantity" type="number" value="${c.value.quantity}"</td>
                                                    <td class="product-remove" ><a href="delete-cart?productId=${c.value.product.id}" ><i class="fa fa-trash" aria-hidden="true"></i></a></td>
                                                </tr>
                                            </form>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>

                            <div class="col-lg-4">
                                <div class="total-section">
                                    <table class="total-table">
                                        <thead class="total-table-head">
                                            <tr class="table-total-row">
                                                <th>Total</th>
                                                <th>Price</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr class="total-data">
                                                <td><strong>Subtotal:</strong></td>
                                                <td>$${totalMoney} </td>
                                            </tr>
                                            <tr class="total-data">
                                                <td><strong>Shipping: </strong></td>
                                                <td>$0</td>
                                            </tr>
                                            <tr class="total-data">
                                                <td><strong>Total: </strong></td>
                                                <td>$${totalMoney}</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <div class="cart-buttons">
                                        <a href="cart" class="boxed-btn">Update Cart</a>
                                        <a href="checkout" class="boxed-btn black">Check Out</a>
                                    </div>
                                </div>

                                <div class="coupon-section">
                                    <h3>Apply Coupon</h3>
                                    <div class="coupon-form-wrap">
                                        <form action="index.html">
                                            <p><input type="text" placeholder="Coupon"></p>
                                            <p><input type="submit" value="Apply"></p>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </c:otherwise>
        </c:choose>

        <!-- end cart -->

        <!-- logo carousel -->
        <%@include file="/Components/logocompany.jsp" %>
        <!-- end logo carousel -->

        <%@include file="/Components/footer.jsp" %>   
        <!-- end copyright -->

        <!-- jquery -->
        <script src="assets/js/jquery-1.11.3.min.js"></script>
        <!-- bootstrap -->
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <!-- count down -->
        <script src="assets/js/jquery.countdown.js"></script>
        <!-- isotope -->
        <script src="assets/js/jquery.isotope-3.0.6.min.js"></script>
        <!-- waypoints -->
        <script src="assets/js/waypoints.js"></script>
        <!-- owl carousel -->
        <script src="assets/js/owl.carousel.min.js"></script>
        <!-- magnific popup -->
        <script src="assets/js/jquery.magnific-popup.min.js"></script>
        <!-- mean menu -->
        <script src="assets/js/jquery.meanmenu.min.js"></script>
        <!-- sticker js -->
        <script src="assets/js/sticker.js"></script>
        <!-- main js -->
        <script src="assets/js/main.js"></script>

    </body>
</html>