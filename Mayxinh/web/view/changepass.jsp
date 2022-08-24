<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <!--  This file has been downloaded from bootdey.com @bootdey on twitter -->
        <!--  All snippets are MIT license http://bootdey.com/license -->
        <title>small change password form - Bootdey.com</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container bootstrap snippets bootdey">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-6 col-md-offset-2">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title">
                                <span class="glyphicon glyphicon-th"></span>
                                Đổi mật khẩu   
                            </h3>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-xs-6 col-sm-6 col-md-6 separator social-login-box"> <br>
                                    <a  href="https://ibb.co/1M8HKBs"><img class="img-thumbnail" src="https://i.ibb.co/1M8HKBs/avt.png" alt="avt" border="0" /></a>

                                    <!--                                    <img alt="" class="img-thumbnail" src="https://bootdey.com/img/Content/avatar/avatar1.png">                        -->
                                </div>
                              
                                <div style="margin-top:80px;" class="col-xs-6 col-sm-6 col-md-6 login-box">
                                    
                                    <form action="changepass" method="POST">
                                        <div class="form-group">
                                            <div class="input-group">
                                                <div class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></div>
                                                <input class="form-control" type="text" name="username" value="${account.username}" readonly>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="input-group">
                                                <div class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></div>
                                                <input class="form-control" type="password" name="oldpass" placeholder="Mật khẩu cũ">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="input-group">
                                                <div class="input-group-addon"><span class="glyphicon glyphicon-log-in"></span></div>
                                                <input class="form-control" type="password" name="newpass" placeholder="Mật khẩu mới">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="input-group">
                                                <div class="input-group-addon"><span class="glyphicon glyphicon-log-in"></span></div>
                                                <input class="form-control" type="password" name="renewpass" placeholder="Nhập lại mật khẩu mới">
                                            </div>
                                        </div>

                                </div>

                            </div>
                        </div>
                        <div class="panel-footer">
                            <div class="row">
                                <div class="col-xs-6 col-sm-6 col-md-6"></div>

                                <div class="col-xs-6 col-sm-6 col-md-6">
                                    <button type="submit" class="proceed">Lưu<i class="fa fa-check" aria-hidden="true"></i></button>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <c:if test="${error != null && error !=''}">
                <p style="color: red">${error}</p>
            </c:if>
        </form>
    </div>

    <style type="text/css">
        body{
            background:#eee;
        }
        .separator {
            border-right: 1px solid #dfdfe0; 
        }
        .icon-btn-save {
            padding-top: 0;
            padding-bottom: 0;
        }
        .input-group {
            margin-bottom:10px; 
        }
        .btn-save-label {
            position: relative;
            left: -12px;
            display: inline-block;
            padding: 6px 12px;
            background: rgba(0,0,0,0.15);
            border-radius: 3px 0 0 3px;
        }
    </style>

    <script type="text/javascript">

    </script>
</body>
</html>