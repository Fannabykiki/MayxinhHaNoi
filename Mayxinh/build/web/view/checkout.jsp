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
        <title>Check Out</title>

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
        <div class="breadcrumb-section hero-bg">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 offset-lg-2 text-center">
                        <div class="breadcrumb-text">
                            <p>Cổ điển và phá cách</p>
                            <h1>Thanh toán</h1>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end breadcrumb section -->

        <!-- check out section -->
        <div class="checkout-section mt-150 mb-150">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="checkout-accordion-wrap">
                            <div class="accordion" id="accordionExample">
                                <div class="card single-accordion">
                                    <div class="card-header" id="headingOne">
                                        <h5 class="mb-0">
                                            <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                                Thông tin khách hàng
                                            </button>
                                        </h5>
                                    </div>

                                    <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
                                        <div class="card-body">
                                            <div class="billing-address-form">
                                                <form action="checkout" method="POST">
                                                    <div class="mb-3">
                                                        <label for="name" class="form-label">Tên</label>
                                                        <input type="text" class="form-control" id="name" name="name" aria-describedby="emailHelp">
                                                    </div>
                                                    <div class="mb-3">
                                                        <label for="phone" class="form-label">Số điện thoại</label>
                                                        <input type="text" class="form-control" id="phone" name="phone" aria-describedby="emailHelp">
                                                    </div>
                                                    <div class="mb-3">
                                                        <label for="address" class="form-label">Địa chỉ</label>
                                                        <input type="text" class="form-control" id="address" name="address" aria-describedby="emailHelp">
                                                    </div>
                                                    <div class="mb-3">
                                                        <label for="note" class="form-label">Lưu ý</label>
                                                        <textarea class="form-control" id="note" name="note" rows="3"></textarea>
                                                    </div >
                                                    <div class="cart-buttons">
                                                    <button type="submit" class="boxed-btn black">Xác nhận</button>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card single-accordion">						   						    
                                </div>						  
                            </div>
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">

                        <div class="col-lg-8 col-md-12">
                            <div class="cart-table-wrap">

                                <table class="cart-table">
                                    <thead class="cart-table-head">
                                        <tr class="table-head-row">

                                            <th class="product-image">Ảnh sản phẩm</th>
                                            <th class="product-name">Tên</th>
                                            <th class="product-price">Giá</th>
                                            <th class="product-quantity">Số lượng</th>


                                        </tr>

                                    </thead>
                                    <tbody>
                                        <c:forEach items="${carts}" var="c">
                                        <form action="updatecart">
                                            <tr class="table-body-row">
                                            <input type="hidden" name="productId" value="${c.value.product.id}"
                                                   <td class="product-id">${c.value.product.id}</td>
                                            <td class="product-image"><img src="assets/img/products/${c.value.product.image}" alt=""></td>
                                            <td class="product-name">${c.value.product.name}</td>
                                            <td class="product-price">${c.value.product.price}</td>
                                            <td class="product-quantity">${c.value.quantity}</td>

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

                            </div>
                            

                        </div>
                    </div>
                </div>
            </div>
            <!-- end check out section -->

            <!-- logo carousel -->
            <%@include file="/Components/logocompany.jsp" %> 
            <!-- end logo carousel -->

            <%@include file="/Components/footer.jsp" %>   

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