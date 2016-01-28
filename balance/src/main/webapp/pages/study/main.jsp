<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
<style type="text/css">
#main {
	border: 1px solid #ccc;
	width: 300px;
	min-height: 500px;
}

a {
	text-decoration: none;
}
</style>
</head>
<body>
	<div id="main">
		<ul>
			<li><a hefr="/greeting?name=balance">MVC</a></li>
			<li>MyBatis</li>
			<li>Bootstrap</li>
			<li>Scheduler</li>
		</ul>
	</div>
</body>
</html>