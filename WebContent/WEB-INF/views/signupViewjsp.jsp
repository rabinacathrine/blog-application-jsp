<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	
	<div class="welcome-back">LEARN. CODE. REPEAT.</div>
	<div class="sub-text">CODEWALL is a collaborative learning platform for the tech enthuiasts. </div>
	<img class="login-illustration" src="./assets/illustration on sign up page.svg" alt="">
	<div  class="signup-form">
		<div class="title">SIGN UP</div>
		<form action="${pageContext.request.contextPath}/signup" method="post">
			<label class="label" for="email1">Email</label>
			<input type="text" name="email" id="email">
			<label class="label" for="password">Password</label>
			<input type="password" name="password" id="password">
			<div class="password-hint">Must consist of atleast 8 characters, a symbol, an upper and a lowercase letter.</div>
			<label class="label" for="password">Confirm Password</label>
			<input type="password" name="consfirmPassword" id="password">
			${message}
			<button class="button" type="submit">Sign In</button>
		</form>
	</div>
</body>
</html>
