<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href=" <%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>开发平台</title>
<link href="resources/login/style/main_login.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="resources/login/js/login.js"></script>
<script type="text/javascript">
	window.onload = function() {
		login.onBlurText('username');
		login.onBlurText('password');
	}
</script>
</head>
<body>
	<div id="main">
		<div id="wrapper">
			<form action="<%=path%>/login/submit" method="Post" id="form1">
				<div id="sys_name">开发平台</div>
				<ul id="cont">
					<li><label class="lb" for="uname">用户名</label> <input
						name="username" id="username" type="text" class="ip"
						value="请输入用户名" maxlength="18" /></li>
					<li><label class="lb" for="pwd">密码</label> <input
						name="password" id="password" type="password" class="ip"
						value="haoqing" maxlength="10" /></li>
					<li><span> <input type="image"
							src="resources/login/images/ente.png" title="登录系统" />
					</span></li>
					<li><span style="color:RED">
					${msg}</span></li>
				</ul>
				<p id="copy">
					Version 1.0 Copyright &copy; 2016 <a href="http://www.baidu.com"
						target="_blank">balance</a>
				</p>
			</form>
		</div>
	</div>
</body>
</html>