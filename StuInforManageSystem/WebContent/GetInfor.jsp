<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.List, java.util.Map"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生信息</title>
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
	 <link rel="stylesheet" type="text/css" href="css/login.css"/>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>

	<%
		List<Map<String, Object>> list = (List<Map<String, Object>>) request.getAttribute("list");
	%>



	<table class="table table-hover">
		<tr>
			<th>用户Id</th>
			<th>姓名</th>
			<th>收入</th>
			<th>性别</th>
			<th>系</th>
			<th>专业</th>
			<th>生日</th>

		</tr>
		<%
			for (int i = 0; i < list.size(); i++) {
		%>
		<tr class="table-warning">
			<td><%=list.get(i).get("userId")%></td>
			<td><%=list.get(i).get("name")%></td>
			<td><%=list.get(i).get("salary")%></td>
			<td><%=list.get(i).get("sex")%></td>
			<td><%=list.get(i).get("sdept")%></td>
			<td><%=list.get(i).get("major")%></td>
			<td><%=list.get(i).get("birthday")%></td>
		</tr>

		<%
			}
		%>
	</table>
</body>
</html>