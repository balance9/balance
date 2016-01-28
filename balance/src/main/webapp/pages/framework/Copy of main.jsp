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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
<style type="text/css">
#nav {
	border: 1px solid #ccc;
	width: 20%;
	min-height: 500px;
	float: left;
}

#main {
	border: 1px solid #ccc;
	width: 76%;
	min-height: 480px;
	float: left;
	margin-left: 20px;
	padding-left: 20px;
	padding-top: 20px;
}

a {
	text-decoration: none;
}

ul {
	padding: 0px;
}

ul li {
	list-style: none;
	border-bottom: 1px solid #ccc;
	padding-left: 15px;
	height: 30px;
	line-height: 30px;
	margin-top: 0px;
}

ul li {
	display: block;
	background: #FFF;
}

ul li:hover {
	background: #CCCCFF;
}
</style>
<!-- 引入 Bootstrap -->
<link href="<%=path%>/resources/common/css/bootstrap.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="<%=path%>/resources/common/jquery-2.2.0.js"></script>
<script type="text/javascript"
	src="<%=path%>/resources/common/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#mvcjson").click(function() {
			$.ajax({  
			    url : '<%=path%>/getUserData',
								type : "POST",
								data : JSON.stringify({
									userId : "1"
								}),
								dataType : 'json',
								contentType : 'application/json;charset=UTF-8',
								success : function(result) {
									$("#main").html(
											"nickname:" + result['nickname']
													+ "<br>" + "sex:"
													+ result['sex'] + "<br>"
													+ "age:" + result['age']
													+ "<br>"+ "userId:" + result['userId']
											+ "<br>");
								}
							});
						});
			});
</script>
</head>
<body>
	<div id="banner"
		style="clear:both;float:left;border:1px solid #ccc;height:100px;width:100%;margin-bottom:10px;"></div>
	<div id="nav">
		<ul>
			<a href="#" id="mvcjson"><li>测试获取json数据</li></a>
			<a href="<%=path%>/greeting?name=balance"><li>MyBatis</li></a>
			<a href="<%=path%>/greeting?name=balance"><li>Bootstrap</li></a>
			<a href="<%=path%>/greeting?name=balance"><li>Scheduler</li></a>
		</ul>
	</div>
	<div id="main"></div>
</body>
</html>