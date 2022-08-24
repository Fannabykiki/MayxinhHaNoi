<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>

        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <!--  This file has been downloaded from bootdey.com @bootdey on twitter -->
        <!--  All snippets are MIT license http://bootdey.com/license -->
        <title>Chỉnh sửa trang cá nhân</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <div class="container-xl px-4 mt-4">
            <!-- Account page navigation-->
            <nav class="nav nav-borders">
                <a class="nav-link active ms-0"  target="__blank">Trang cá nhân</a>
                 <a class="nav-link  ms-0" href="home"  target="__blank">Trang chủ</a>

            </nav>
            <hr class="mt-0 mb-4">
            <div class="row">
                <div class="col-xl-4">
                    <!-- Profile picture card-->
                    <div class="card mb-4 mb-xl-0">
                        <div class="card-header">Ảnh cá nhân</div>
                        <div class="card-body text-center">
                            <!-- Profile picture image-->
                            <a  href="https://ibb.co/1M8HKBs"><img class="img-account-profile rounded-circle mb-2" src="https://i.ibb.co/1M8HKBs/avt.png" alt="avt" border="0" /></a>

                            <!-- Profile picture help block-->
                            <div class="small font-italic text-muted mb-4">JPG hoặc PNG kích thước bé 5 MB</div>
                            <!-- Profile picture upload button-->
                            <button class="btn btn-primary" type="button">Tải lên ảnh mới của bạn</button>
                        </div>
                    </div>
                </div>
                <div class="col-xl-8">
                    <c:if test="${message != null}">                                   
                        <c:choose>                                    
                            <c:when test = "${message eq 'Cập nhật thành công'}">                          
                                <div class="error alert alert-success" role="alert">                                     
                                    <p class="mb-0">${message}</p>                                      
                                </div>                                
                            </c:when>                                  
                            <c:otherwise>                                        
                                <div class="error alert alert-danger" role="alert">                             
                                    <p class="mb-0">${message}</p>                                   
                                </div>                                    
                            </c:otherwise>                               
                        </c:choose>                                
                        <c:remove var="message" scope="session" />         
                    </c:if>
                    <form action="EditProfile" method="POST">
                        <!-- Account details card-->
                        <div class="card mb-4">
                            <div class="card-header">Chi tiết tài khoản</div>
                            <div class="card-body">

                                <!-- Form Group (username)-->
                                <div class="mb-3">
                                    <label class="small mb-1" for="inputUsername">Tên đăng nhập</label>
                                    <input class="form-control" id="inputUsername" type="text" value="${sessionScope.account.username}" name="username" readonly >
                                </div>
                                <!-- Form Row-->
                                <div class="row gx-3 mb-3">
                                
                                    <div class="col-md-6">
                                        <label class="small mb-1" for="inputFirstName">Họ và tên</label>
                                        <input class="form-control" id="inputFirstName" type="text" value="${sessionScope.account.fullname}" name="fname">
                                    </div>
                                   

                                </div>
                                <!-- Form Row        -->
                                <div class="row gx-3 mb-3">

                                    <div class="col-md-6">
                                        <label class="small mb-1" for="inputLocation">Địa chỉ</label>
                                        <input class="form-control" id="inputLocation" type="text" value="${sessionScope.account.email}" name="address">
                                    </div>
                                </div>

                                <div class="mb-3">
                                    <label class="small mb-1" for="inputEmailAddress">Email</label>
                                    <input class="form-control" id="inputEmailAddress" type="text" value="${sessionScope.account.address}" name="email">
                                </div>
                                <!-- Form Row-->
                                <div class="row gx-3 mb-3">
                                    <!-- Form Group (phone number)-->
                                    <div class="col-md-6">
                                        <label class="small mb-1" for="inputPhone">Số điện thoại</label>
                                        <input class="form-control" id="inputPhone" type="text" value="${sessionScope.account.phone}" name="phone">
                                    </div>


                                </div>
                                <!-- Save changes button-->
                            
                                <input type="submit" value="Cập nhật" />

                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <style type="text/css">
            body{margin-top:20px;
                 background-color:#f2f6fc;
                 color:#69707a;
            }
            .img-account-profile {
                height: 10rem;
            }
            .rounded-circle {
                border-radius: 50% !important;
            }
            .card {
                box-shadow: 0 0.15rem 1.75rem 0 rgb(33 40 50 / 15%);
            }
            .card .card-header {
                font-weight: 500;
            }
            .card-header:first-child {
                border-radius: 0.35rem 0.35rem 0 0;
            }
            .card-header {
                padding: 1rem 1.35rem;
                margin-bottom: 0;
                background-color: rgba(33, 40, 50, 0.03);
                border-bottom: 1px solid rgba(33, 40, 50, 0.125);
            }
            .form-control, .dataTable-input {
                display: block;
                width: 100%;
                padding: 0.875rem 1.125rem;
                font-size: 0.875rem;
                font-weight: 400;
                line-height: 1;
                color: #69707a;
                background-color: #fff;
                background-clip: padding-box;
                border: 1px solid #c5ccd6;
                -webkit-appearance: none;
                -moz-appearance: none;
                appearance: none;
                border-radius: 0.35rem;
                transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
            }

            .nav-borders .nav-link.active {
                color: #0061f2;
                border-bottom-color: #0061f2;
            }
            .nav-borders .nav-link {
                color: #69707a;
                border-bottom-width: 0.125rem;
                border-bottom-style: solid;
                border-bottom-color: transparent;
                padding-top: 0.5rem;
                padding-bottom: 0.5rem;
                padding-left: 0;
                padding-right: 0;
                margin-left: 1rem;
                margin-right: 1rem;
            }
        </style>

        <script type="text/javascript">

        </script>
    </body>
</html>