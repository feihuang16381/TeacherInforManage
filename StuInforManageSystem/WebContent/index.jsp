<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Login</title>

    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>
   
    <link rel="stylesheet" type="text/css" href="css/animate.css"/>
</head>

<body>
        <div class="center-in-center">
       
<div class="container">

    <form class="form-horizontal" id="loginForm" action="Login">

        <h3  class="animated infinite slideInDown">欢迎来到学生信息管理系统！！！</h3>
        <div class="form-group">
            <div class="col-xs-offset-2 col-xs-8">
                <input type="text" class="form-control" id="NameText" name="username" placeholder="请输入用户名">
            </div>
        </div>
        <div class="form-group">
            <div class=" col-xs-offset-2 col-xs-8">
                <input type="password" class="form-control" id="inputPassword" name="password" placeholder="请输入密码">
            </div>
        </div>
        <div class="form-group">
            <div class="col-xs-offset-2 col-xs-4">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="rememberMe"> 记住密码
                    </label>
                </div>
            </div>
            <div class="col-xs-4">
                <label>
                    <div class="checkbox">
                        <input type="checkbox" name="autoLogin"> 自动登录
                </label>

            </div>
        </div>
</div>
<div class="form-group">
    <div class="col-xs-offset-2 col-xs-4" id="a222">
        <button type="submit" class="btn btn-default" id="loginButton">登录</button>
    </div>
    <div class="col-xs-offset-1 col-xs-4" id="a111">
        <button type="button" class="btn btn-default" id="registerButton" >注册</button>
    </div>
</div>
</div>   
</form>
</div>

</body>
</html>