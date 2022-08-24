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


        <title>Cửa hàng</title>
        <link rel="shortcut icon" type="image/png" style="border-radius: 10px" href="assets/img/smalllogo.png">
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
        <script src="https://kit.fontawesome.com/yourcode.js" crossorigin="anonymous"></script>


    </head>
    <body>

       <%@include file="/Components/Navbar.jsp" %>
        </div>
        <!-- end search arewa -->

        <!-- breadcrumb-section -->
        <div class="breadcrumb-section hero-bg">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 offset-lg-2 text-center">
                        <div class="breadcrumb-text">
                            <p style="font-size: 30px">Cổ điển và phá cách</p>
                            <h1>Cửa hàng</h1>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end breadcrumb section -->

        <!-- products -->
        <div class="product-section mt-150 mb-150">
            <div class="container">

               	<div class="row">
                <div class="col-md-12">
                    <div class="product-filters">
                        <ul>
                              <li  data-filter="*">Tất cả</li>
                            <c:forEach items="${listCategories}" var="c">
                            <li class="${c == categoryId? "active":""}"><a href="filter-category?categoryId=${c.cid}"> ${c.cname}
                                </a>
                            </li>
                            </c:forEach>                          
                        </ul>
                    </div>
                </div>
            </div>


                <div class="row product-lists ">

                    <c:forEach items="${listproduct}" var="p">
                        <div class="col-lg-4 col-md-4 text-center ">
                            <div class="single-product-item">
                                <div class="product-image">
                                    <a href="spro?Product_ID=${p.id}">
                                        <img style="height: 251px;width:189px" src="assets/img/products/${p.image}" alt="">
                                    </a>
                                </div>
                                <h3 style="font-size: 20px">${p.name}</h3>
                                <p style="font-size: 20px" class="product-price"><span>${p.description}</span> ${p.price} VNĐ </p>
                                <a href="add-to-cart?Product_ID=${p.id}" class="cart-btn"><i class="fas fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
                            </div>
                        </div>
                    </c:forEach>                  
                </div>



                <div class="row" >
                    <div class="col-lg-12 text-center">

                        <div class="pagination-wrap">
                            <c:choose>
                                <c:when test="${listproduct == null || listproduct.size() == 0}">
                                    Not found product
                                </c:when>
                                    
                                <c:otherwise>
                                    <ul>
                                        <li class="page-item"><a class="page-link" href="shop?page=${page-1}">Trước</a></li>
                                            <c:forEach begin="1" end="${num}" var="i">
                                            <li class="page-item ${i == page?"active":""}">
                                                <a class="page-link" href="shop?page=${i}">${i}</a>
                                            </li>
                                        </c:forEach>
                                        <li class="page-item">
                                            <a class="page-link" href="shop?page=${page+1}">Sau</a>
                                        </li>
                                    </ul>
                                </c:otherwise>
                            </c:choose>


                        </div>
                    </div>
                </div>
            </div>
        </div>

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
        <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>


    </body>
</html>