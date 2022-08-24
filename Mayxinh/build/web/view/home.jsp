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
        <title>Mây Xinh - Nội Thất Ghế Mây</title>
        <!-- favicon -->
        <link rel="shortcut icon" type="image/png" style="height: 180x;width: 180px;" href="assets/img/smalllogo.png">
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

        <!-- hero area -->
        <div class="hero-area hero-bg">
            <div class="container">
                <div class="row">
                    <div class="col-lg-9 offset-lg-2 text-center">
                        <div class="hero-text">
                            <div class="hero-text-tablecell">
                                <p class="subtitle">Cổ điển & Phá cách</p>
                                <h1>Gần gũi với thiên nhiên</h1>
                                <div class="hero-btns">
                                    <a href="shop" class="boxed-btn">Bộ sưu tập nội thất</a>
                                    <a href="https://www.facebook.com/mayxinhvn" class="bordered-btn">Liên hệ</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end hero area -->

        <!-- features list section -->
        <div class="list-section pt-80 pb-80">
            <div class="container">

                <div class="row">
                    <div class="col-lg-4 col-md-6 mb-4 mb-lg-0">
                        <div class="list-box d-flex align-items-center">
                            <div class="list-icon">
                                <i class="fas fa-shipping-fast"></i>
                            </div>
                            <div class="content">
                                <h3>Miễn phí vận chuyển</h3>
                                <p>Đơn hàng trong phạm vi <5km</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 mb-4 mb-lg-0">
                        <div class="list-box d-flex align-items-center">
                            <div class="list-icon">
                                <i class="fas fa-phone-volume"></i>
                            </div>
                            <div class="content">
                                <h3>Hỗ trợ 24/7</h3>
                                <p>Hỗ trợ bất cứ khi nào bạn cần</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="list-box d-flex justify-content-start align-items-center">
                            <div class="list-icon">
                                <i class="fas fa-sync"></i>
                            </div>
                            <div class="content">
                                <h3>Bảo hành</h3>
                                <p>Bảo hành lên tới 18 tháng</p>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <!-- end features list section -->

        <!-- product section -->
        <div class="product-section mt-150 mb-150">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 offset-lg-2 text-center">
                        <div class="section-title">	
                            <h3><span class="orange-text">Sản phẩm</span> Nổi bật</h3>
                            <p>Trang trí nhà bằng nội thất mây tre đan đang là xu hướng trong
                                sự lựa chọn của nhiều gia chủ yêu thích hiện đại mà không kém 
                                phần thân thiện với môi trường.</p>
                        </div>
                    </div>
                </div>

                <div class="row">      
                    <c:forEach items="${listproduct}" var="c">
                        <div class="col-lg-4 col-md-6 text-center">                      
                            <div class="single-product-item">                           
                                <div class="product-image">
                                    <a href="spro?Product_ID=${c.id}"><img  style="width: 100%;height: 100%" src="assets/img/products/${c.image}" alt="ảnh sp 1"></a>
                                </div>
                                <h3>${c.name}</h3>
                                <p style="font-size: 25px" class="product-price"><span>/Bộ</span> ${c.price} </p>
                                <a href="add-to-cart?Product_ID=${c.id}" class="cart-btn"><i class="fas fa-shopping-cart"></i> Thêm vào giỏ hàng</a>


                            </div>
                        </div>
                    </c:forEach>

                </div>
            </div>
        </div>
        <!-- end product section -->

        <!-- cart banner section -->
        <section class="cart-banner pt-100 pb-100">
            <div class="container">
                <div class="row clearfix">
                    <!--Image Column-->
                    <div class="image-column col-lg-6">
                        <div class="image">
                            <!--                    	<div class="price-box">-->
                            <!--                        	<div class="inner-price">
                                                            <span class="price">
                                                                <strong>Tới 50%</strong> <br> /1 sản phẩm
                                                            </span>
                                                        </div>-->
                            <!--                        </div>-->
                            <img src="assets/img/a.jpg" alt="">
                        </div>
                    </div>
                    <!--Content Column-->
                    <div class="content-column col-lg-6">
                        <h3 style="font-size: 35px"><span class="orange-text">Giảm giá</span> đặc biệt trong tháng</h3>
                        <h4>Ghế Papasan</h4>
                        <div class="text">SIÊU SALE ĐỘC QUYỀN GHẾ PAPASAN ĐƯỜNG KÍNH 105, 115 CM CỰC RỘNG 
                            Nhanh tay sở hữu ngay ghế Papasan đường kính ghế 105, 115cm trong bộ sưu tập Papasan
                            2021 được yêu thích nhất. Họa tiết decor cực đẹp từ nhiều nhà thiết kế trên thế giới. 
                            Giảm giá ngay 20% đối với 40 màu sắc nệm có sẵn tại nhà máy Mây Xinh miền Nam và miền Bắc. </div>
                        <!--Countdown Timer-->
                        <div class="time-counter"><div class="time-countdown clearfix" data-countdown="2022/11/25"><div class="counter-column">
                                    <div class="inner"><span class="count">00</span>Days</div></div> <div class="counter-column"><div class="inner">
                                        <span class="count">00</span>Hours</div></div>  <div class="counter-column"><div class="inner">
                                        <span class="count">00</span>Mins</div></div>  <div class="counter-column"><div class="inner">
                                        <span class="count">00</span>Secs</div></div></div></div>

                    </div>
                </div>
            </div>
        </section>
        <!-- end cart banner section -->

        <!-- testimonail-section -->
        <div class="testimonail-section mt-150 mb-150">
            <div class="container">
                <div class="row">
                    <div class="col-lg-10 offset-lg-1 text-center">
                        <div class="testimonial-sliders">
                            <div class="single-testimonial-slider">
                                <div class="client-avater">
                                    <img src="assets/img/avaters/avt1.png" alt="Avt1">
                                </div>
                                <div class="client-meta">
                                    <h3>Phan Huy Tào <span>Giám đốc chi nhánh Miền Bắc</span></h3>
                                    <p class="testimonial-body">
                                        “Mỹ nhân trong thiên hạ đều tầm thường
                                        với ta, duy nhất chỉ có vợ của kẻ thù làm ta thích thú”.
                                    <div class="last-icon">
                                        <i class="fas fa-quote-right"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="single-testimonial-slider">
                                <div class="client-avater">
                                    <img src="assets/img/avaters/avatar2.png" alt="Avt2">
                                </div>
                                <div class="client-meta">
                                    <h3>Phan Xuân Thông <span>Giám đốc công ty</span></h3>
                                    <p class="testimonial-body">
                                        "Những thằng khác ngại tán em - tại ngán anh"
                                    </p>
                                    <div class="last-icon">
                                        <i class="fas fa-quote-right"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="single-testimonial-slider">
                                <div class="client-avater">
                                    <img src="assets/img/avaters/avt3.png" alt="Avt3">
                                </div>
                                <div class="client-meta">
                                    <h3>Phan Doãn Wân <span>CEO</span></h3>
                                    <p class="testimonial-body">
                                        "Những người không cùng dòng máu thì không là gì cả.
                                        Mày có mẹ mày, chị gái, con trai mày và tao.
                                        Tất cả những người khác đều sẵn sàng đâm sau lưng mày".
                                    </p>
                                    <div class="last-icon">
                                        <i class="fas fa-quote-right"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end testimonail-section -->

        <!-- advertisement section -->
        <div class="abt-section mb-150">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-12">
                        <div class="abt-bg">
                            <a href="https://www.youtube.com/watch?v=aKHXSatqDbA" 
                               class="video-play-btn popup-youtube"><i class="fas fa-play"></i></a>
                        </div>
                    </div>

                    <div class="col-lg-6 col-md-12">
                        <div class="abt-text">
                            <p class="top-sub">Từ năm 2010</p>
                            <h2>Nội thất <span class="orange-text">Mây tự nhiên</span></h2>
                            <p>Bàn ghế mây cổ điển, Sản phẩm nội thất mây tre đã xuất hiện trên thị trường  từ nhứng năm 1960 cho đến hiện tại các sản phẩm mây
                                tre đan được tạo ra nhờ những đôi bàn tay khéo của những người nghệ nhân
                                Việt Nam dầy dặn kinh nghiệm, các sản phẩm nội thất bàn ghế mây đến nay vẫn còn  được nhiều người ưa chuộng và sử dụng.</p>
                            <p>Mây Xinh  vẫn duy trì các sản phẩm nội thất mây với thiết kế cổ điển song song đó là những thiết
                                kế mới mẻ độc đáo mang phong cách hiện đại… hy vọng các sản phẩm
                                Mây Xinh phục vụ được mọi nhu cầu của khách hàng.</p>
                            <a href="about" class="boxed-btn mt-4">Xem thêm</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="latest-news pt-150 pb-150">
            <div class="container">

                <div class="row">
                    <div class="col-lg-8 offset-lg-2 text-center">
                        <div class="section-title">	
                            <h3><span class="orange-text">Thông tin </span> chi tiết</h3>
                            <p style="font-size: 20px">Mây Xinh - Nội Thất Mây Được Yêu Thích Nhất</p>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-news">
                            <a href="single-news.html"><div class="latest-news-bg news-bg-1"></div></a>
                            <div class="news-text-box">
                                <h3><a href="single-news.html">Ghế Papasan mây và những câu hỏi thường gặp</a></h3>
                                <p class="blog-meta">
                                    <span class="author"><i class="fas fa-user"></i> Fannaby</span>
                                    <span class="date"><i class="fas fa-calendar"></i> 23 Feb, 2022</span>
                                </p>
                                <p class="excerpt">Ghế papasan mây là kiểu ghế thư giãn cực kỳ phổ biến,
                                    thịnh hành ở những năm 70. Chiếc ghế thư giãn papasan được thiết kế cực kỳ độc đáo, chất liệu...</p>
                                <a href="single-news.html" class="read-more-btn">read more <i class="fas fa-angle-right"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="single-latest-news">
                            <a href="single-news.html"><div class="latest-news-bg news-bg-2"></div></a>
                            <div class="news-text-box">
                                <h3><a href="single-news.html">Những lưu ý khi bài trí bàn ghế mây cafe.</a></h3>
                                <p class="blog-meta">
                                    <span class="author"><i class="fas fa-user"></i> Fannaby</span>
                                    <span class="date"><i class="fas fa-calendar"></i> 23 Feb, 2022</span>
                                </p>
                                <p class="excerpt">Những bộ bàn ghế mây cafe đẹp và được sắp xếp theo một cách hợp lý sẽ khiến cho khách hàng 
                                    cảm thấy cực kỳ thoải mái khi ngồi thưởng thức cafe. Hãy cùng....</p>
                                <a href="single-news.html" class="read-more-btn">read more <i class="fas fa-angle-right"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 offset-md-3 offset-lg-0">
                        <div class="single-latest-news">
                            <a href="single-news.html"><div class="latest-news-bg news-bg-3"></div></a>
                            <div class="news-text-box">
                                <h3><a href="single-news.html">Bố trí ghế sofa mây chuẩn phong thủy thu hút tài lộc.</a></h3>
                                <p class="blog-meta">
                                    <span class="author"><i class="fas fa-user"></i> Fannaby</span>
                                    <span class="date"><i class="fas fa-calendar"></i> 23 Feb, 2022</span>
                                </p>
                                <p class="excerpt">Bố trí bộ bàn ghế sofa mây không phải là một điều đơn giản bởi lẽ ngoài
                                    lựa chọn ghế sofa đẹp , hợp với concep căn nhà bạn , kích thước chuẩn chỉnh,...</p>
                                <a href="single-news.html" class="read-more-btn">read more <i class="fas fa-angle-right"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <a href="news.html" class="boxed-btn">Xem thêm</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- end latest news -->

        <!-- logo carousel -->
        <div class="logo-carousel-section">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="logo-carousel-inner">
                            <div class="single-logo-item">
                                <img style="padding-top: 40px" src="assets/img/company-logos/lg1.png" alt="">
                            </div>
                            <div class="single-logo-item">
                                <img style="padding-top: 25px" src="assets/img/company-logos/logo2.png" alt="">
                            </div>
                            <div class="single-logo-item">
                                <img src="assets/img/company-logos/lg3.png" alt="">
                            </div>
                            <div class="single-logo-item">
                                <img src="assets/img/company-logos/lg4.png" alt="">
                            </div>
                            <div class="single-logo-item">
                                <img src="assets/img/company-logos/logo5.png" alt="">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end logo carousel -->

        <!-- footer -->
        <div class="footer-area">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-6" style="font-size: 10pt">
                        <div class="footer-box about-widget" >
                            <h2 class="widget-title">Nhà máy sản xuất nội thất Mây Xinh</h2>
                            <strong>
                                <span>
                                    <span class="fa fa-industry" style="font-size:15px;color:red"> Nhà Máy Miền Nam:</span>
                                    <span>A2- KCN Định Quán tỉnh Đồng Nai</span>

                                </span>
                                <span>
                                    <span class="fa fa-industry" style="font-size:15px;color:red"> Nhà Máy Miền Bắc:</span>
                                    <span>Vân Du– Thạch Thành tỉnh Thanh Hóa</span>

                                </span>
                            </strong>
                            <hr>
                            <p>Với hơn 100 công nhân viên, hoạt động sản 
                                xuất trong ngành nội thất mây, chúng tôi luôn nỗ lực và phấn đấu để cho
                                ra đời những sản phẩm đẹp nhất, chất lượng nhất.
                            </p>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-box get-in-touch">
                            <h2 class="widget-title">Liên hệ</h2>
                            <ul>



                                <li>
                                    <a style="color: #ff0000;font-size: 17px" href="mailto:order@mayxinh.com" class="fa fa-envelope">   order@mayxinh.com 
                                    </a>
                                </li> 
                                <li>
                                    <a style="color: #ff0000;font-size: 17px" class="fa fa fa-phone" > +0345 292 929
                                    </a>
                                </li>
                            </ul>
                            <hr>
                            <ul class="list-unstyled">
                                <li><i class="fa fa-map-marker"></i><a href="https://mayxinh.com/thong-tin-lien-he-ha-noi/"> Hà Nội: Số 7 Ngõ 73 Hoàng Ngân, P.Nhân Chính, Thanh Xuân, Hà Nội</a>&#8211;<a href="tel:0385162929">0385162929</a></li>
                                <li><i class="fa fa-map-marker"></i><a href="https://mayxinh.com/thong-tin-lien-he/"> TP.HCM: 488/4 Cộng Hòa P.13 quận Tân Bình</a>&#8211;<a href="tel:0932181068">0932181068</a></li>
                            </ul>
                            </li>
                            </ul>
                            <ul>
                                <li><i class="fa fa-map-marker"></i><a href="https://mayxinh.com/thong-tin-lien-he-da-nang/"> Đà Nẵng: 114 Trần Thủ Độ, Khuê Trung, Cẩm Lệ, Đà Nẵng</a>&#8211;<a href="tel:0343642299">0343 642 299</a></li>
                                <li><i class="fa fa-map-marker"></i><a href="https://mayxinh.com/thong-tin-lien-he-can-tho/"> Cần Thơ: 164D Trần Ngọc Quế Cần Thơ</a>&#8211;<a href="tel:0379508899">0379 508 899</a></li>
                                <li><i class="fa fa-envelope-o"></i><span style="font-size: 12pt; color: #ff0000;">
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-box pages">
                            <h2 class="widget-title">Pages</h2>
                            <ul>
                                <li><a href="index.html">Trang chủ</a></li>
                                <li><a href="about.html">Về chúng tôi</a></li>
                                <li><a href="services.html">Cửa hàng</a></li>
                                <li><a href="news.html">Blog</a></li>
                                <li><a href="contact.html">Liên hệ</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-box subscribe">
                            <h2 class="widget-title">Đăng kí</h2>
                            <p>Đăng kí để nhận thông tin về sản phẩm mới nhất được cập nhật</p>
                            <form action="index.html">
                                <input type="email" placeholder="Email">
                                <button type="submit"><i class="fas fa-paper-plane"></i></button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end footer -->

        <!-- copyright -->
        <div class="copyright">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-12">
                        <p>Copyrights &copy; 2019 - <a href="https://www.facebook.com/profile.php?id=100007008198341">Fannaby</a>,  All Rights Reserved.</p>
                    </div>
                    <div class="col-lg-6 text-right col-md-12">
                        <div class="social-icons">
                            <ul>
                                <li><a href="https://www.facebook.com/mayxinhvn" target="_blank"><i class="fab fa-facebook-f"></i></a></li>
                                <li><a href="https://twitter.com/?lang=en" target="_blank"><i class="fab fa-twitter"></i></a></li>
                                <li><a href="https://www.instagram.com/" target="_blank"><i class="fab fa-instagram"></i></a></li>
                                <li><a href="https://www.youtube.com/watch?v=0GeQVtZ6Rd4" target="_blank"><i class="fab fa-youtube"></i></a></li>

                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
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