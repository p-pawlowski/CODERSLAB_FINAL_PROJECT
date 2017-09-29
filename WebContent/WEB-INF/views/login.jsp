
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
	<title>Login Page</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	<form action="/KnowlegdeManagementSystem/registration" method="get">
		<button class="btn btn-md btn-warning btn-block" type="Submit">Go To Registration Page</button>
	</form>	
	
	<div class="container">

		<form  method="POST" name="form-login">
			<h3 class="form-signin-heading">Welcome</h3>
			<br/>
			 
			<input type="text" name="email" id="email"
				class="form-control" placeholder="email"/><br/> 
			<input type="password" id="password" placeholder="password"
				 name="password" class="form-control" /> <br /> 
			 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<button class="btn btn-lg btn-primary btn-block" name="Submit" value="Login" type="Submit">Login</button>
		</form>
		</div>
</body>
</html>