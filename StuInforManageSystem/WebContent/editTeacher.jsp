<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>AddTeacher title here</title>
 <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>
   
    <link rel="stylesheet" type="text/css" href="css/animate.css"/>
</head>
<body>
<%System.out.print(request.getParameter("condition"));
  session.setAttribute("condition", request.getParameter("condition")); 
  %>
<form class="form-horizontal" id="loginForm" action="editTeacher">

		<h3 class="animated infinite slideInDown">欢迎来到editTeacher页面！！！</h3>

		<div class="form-group">
			<div class=" col-xs-offset-2 col-xs-8">
				<input type="text" class="form-control" id="inputPassword"
					name="userId" placeholder="userId" >
			</div>
		</div>
		<div class="form-group">
			<div class=" col-xs-offset-2 col-xs-8">
				<input type="text" class="form-control" id="inputPassword"
					name="name" placeholder="姓名">
			</div>
		</div>
		<div class="form-group">
			<div class=" col-xs-offset-2 col-xs-8">
				<input type="text" class="form-control" id="inputPassword"
					name="salary" placeholder="收入">
			</div>
		</div>
		<div class="form-group">
			<div class=" col-xs-offset-2 col-xs-8">
				<input type="text" class="form-control" id="inputPassword"
					name="sex" placeholder="性别">
			</div>
		</div>
		<div class="form-group">
			<div class=" col-xs-offset-2 col-xs-8">
				<input type="text" class="form-control" id="inputPassword"
					name="sdept" placeholder="所在系">
			</div>
		</div>
		<div class="form-group">
			<div class=" col-xs-offset-2 col-xs-8">
				<input type="text" class="form-control" id="inputPassword"
					name="major" placeholder="专业">
			</div>
		</div>
		<div class="form-group">
			<div class=" col-xs-offset-2 col-xs-8">
				<input type="text" class="form-control" id="inputPassword"
					name="birthday" placeholder="教师生日">
			</div>
		</div>

		</div>
		<div class="form-group">
			<div class="col-xs-offset-2 col-xs-4" id="a222">
				<button type="submit" class="btn btn-default" id="loginButton">修改</button>
			</div>
			<div class="col-xs-offset-1 col-xs-4" id="a111">
				<button type="reset" class="btn btn-default" id="registerButton">重置</button>
			</div>
		</div>
		</div>
	</form>
</body>
</html>