<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
	<div class="container">
	<div class="test">

		
		<h2>${conspectus.subject}</h2>
		<h3>Cele lekcji:</h3>
		<ul>
			<c:forEach var="item" items="${conspectus.objectives }">
				<li class="li1" >${item}</li>
			</c:forEach>
		</ul>
		<h3>Materiały:</h3>
		<ul>
			<c:forEach var="item" items="${conspectus.materials}">
				<li class="li1">${item}</li>
			</c:forEach>
		</ul>

		<h3>Metody:</h3>
		<ul>
			<c:forEach var="item" items="${conspectus.methods}">
				<li class="li1">${item}</li>
			</c:forEach>
		</ul>

		<h3>Przebieg lekcji:</h3>

		<ol>
			<li >
				<h4>Wstęp:</h4>
				<ul>
					<c:forEach var="item" items="${conspectus.scenarioIntroduction}">
						<li class="li2">${item}</li>
					</c:forEach>
				</ul>
			</li>

			<li >
				<h4>Część właściwa:</h4>
				<ul>
					<c:forEach var="item" items="${conspectus.scenarioMain}">
						<li class="li2">${item}</li>
					</c:forEach>
				</ul>
			</li>
			<li>
				<h4>Podsumowanie:</h4>
				<ul>
					<c:forEach var="item" items="${conspectus.scenarioSummary}">
						<li class="li2">${item}</li>
					</c:forEach>
				</ul>
			</li>
		</ol>

		<h3>Notatki:</h3>
		<p>
		${conspectus.notes }
		</p>
		</div>


	</div>


</body>
<script
	src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/app.js" />"
	type="text/javascript"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>