<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
   <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>
   
    <link rel="stylesheet" type="text/css" href="css/animate.css"/>
</head>
<body>
<% session.setAttribute("condition", request.getParameter("condition"));
System.out.println(session.getAttribute("condition"));%>

 <%-- <div class="center-in-center">
       
<div class="container">
  <form class="form-horizontal" id="loginForm" action="DeleteInfor">

       
      

<div class="form-group">
 <div class="col-xs-offset-2 col-xs-4" id="a222">
      <input  type="text" class="form-control" value=<%=session.getAttribute("condition")%>>
    </div>
    </div>
       <div class="form-group">
    <div class="col-xs-offset-2 col-xs-4" id="a222">
        <button type="submit" class="btn btn-default" id="loginButton" >确认删除</button>
    </div>
    </div>
  

 
</form>
</div>
</div> --%>
 <div class="center-in-center">
       
<div class="container">

    <form class="form-horizontal" id="loginForm" action="DeleteInfor">

        <h3  class="animated infinite slideInDown">欢迎来到学生信息管理系统！！！</h3>
        <div class="form-group">
            <div class="col-xs-offset-2 col-xs-8">
                <input type="text" class="form-control" id="NameText" name="username" placeholder=<%=session.getAttribute("condition")%>>
            </div>
        </div>
       	
       

<div class="form-group">
    <div class="col-xs-offset-2 col-xs-4" id="a222">
        <button type="submit" class="btn btn-default" id="loginButton">确认删除</button>
    </div>
    <div class="col-xs-offset-1 col-xs-4" id="a111">
        <button type="reset" class="btn btn-default" id="registerButton" >重置</button>
    </div>
</div>
   
</form>
</div>
</div>
</div>
</body>
</html>