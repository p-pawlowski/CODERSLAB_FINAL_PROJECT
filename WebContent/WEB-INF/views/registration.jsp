<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@	taglib	prefix="form"
				uri="http://www.springframework.org/tags/form"	%>
<html>
<head>
	<title>Registration Form</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
		<form action="/KnowlegdeManagementSystem/login" method="get">
		<button class="btn btn-md btn-warning btn-block" type="Submit">Go To Login Page</button>
	</form>
	
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<form:form action="/KnowlegdeManagementSystem/registration" method="post" modelAttribute="user">
					<h2>Registration Form</h2>
					<div class="form-group">
						<div class="col-sm-9">
						<form:errors path="name"/>
						<form:input path="name" placeholder="Name"
								class="form-control" /> 
						</div>
					</div>

					<div class="form-group">
					<div class="col-sm-9">
						<form:errors path="lastName"/>
						<form:input path="lastName" placeholder="lastName"
								class="form-control" /> 
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-9">
						<form:errors path="email"/>
						<form:input path="email" placeholder="email"
								class="form-control" /> 
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-9">
						<form:errors path="password"/>
						<form:input path="password" placeholder="Password"
								class="form-control" /> 
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-9">
							<button type="submit" class="btn btn-primary btn-block">Register User</button>
						</div>
					</div>
					
					<!--  <span th:utext="${successMessage}"></span> -->
					
					
				</form:form>
			</div>
		</div>
	</div>

</body>
</html>