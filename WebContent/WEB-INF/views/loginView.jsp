<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Code Wall</title>
<link type="text/css" rel="stylesheet" href="./css/style.css"></link>
</head>
<body>
	<nav>
		<img alt="logo" src="./assets/logo.svg">
		<ul>
			<li><a href="${pageContext.request.contextPath}/login">Login</a></li>
			<li><a href="${pageContext.request.contextPath}/signup">Sign up</a></li>
		</ul>
	</nav>
	
	<div class="welcome-back">WELCOME BACK</div>
	<div class="sub-text">Share something new that you have learn today.</div>
	
	<div class="login-form">
		<div class="title">Login</div>
		<form action="${pageContext.request.contextPath}/login" method="post">
			<label class="label" for="email1">Email</label>
			<input type="text" name="email" id="email">
			<label class="label" for="password">Password</label>
			<input type="text" name="password" id="password">
			<button class="button" type="submit">Login</button>
			<a class="forgot-password" href="">Forgot Password?</a>
		</form>
	</div>
</body>
</html>