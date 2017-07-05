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
		<div class="form-group">
			<form:errors path="*" />
			<form:form method="post" modelAttribute="conspectus">
				<form:errors path="subject" />
				<h2 align="center">
				<form:textarea path="subject"  cssClass="subject" />
				</h2>
				<div class="objectives">
					
						<h3>Cele lekcji:
						<button class="btn addButton">Dodaj</span></button></h3>
					<p><b>Uczeń:</b></p>
					<ul>
						<c:forEach items="${conspectus.objectives}" var="objective">
							<li class="li1"><form:textarea path="objectives" value="${objective}" />
								<button class="btn delButton">Usuń</span></button></li>
						</c:forEach>
					</ul>
				</div>
				<div class="materials">
					<p>
						<h3>Materiały:
						<button class="btn addButton">Dodaj</button></h3>
					</p>
					<ul>
						<c:forEach items="${conspectus.materials}" var="material">
							<li class="li1"><form:textarea path="objectives" value="${material}" />
								<button class="btn delButton">Usuń</button></li>
						</c:forEach>
					</ul>
				</div>
				<div class="methods">
					<h3>
						Metody:
						<button class="btn addButton">Dodaj</button>
					</h3>
					<ul>
						<c:forEach items="${conspectus.methods}" var="methods">
							<li class="li1" ><form:textarea path="methods" value="${methods}" />
								<button class="btn delButton">Usuń</button></li>
						</c:forEach>
					</ul>
				</div>
				<h3>Przebieg lekcji:</h3>
				<ol>
					<div class="scenarioIntroduction">
						<li class="li2">
								<h4>Wstęp:
								<button class="btn addButton">Dodaj</button>
							</h4>
														<ul>
								<c:forEach items="${conspectus.scenarioIntroduction}"
									var="scenarioIntroduction">
									<li><form:textarea path="scenarioIntroduction"
											value="${scenarioIntroduction}" />
										<button class="btn delButton">Usuń</button></li>
								</c:forEach>
							</ul>
					</div>
					<div class="scenarioMain">
						</li>
						<li class="li2">
							<h4>
								Część właściwa:
								<button class="btn addButton">Dodaj</button>
							</h4>
							<ul>
								<c:forEach items="${conspectus.scenarioMain}" var="scenarioMain">
									<li><form:textarea path="scenarioMain"
											value="${scenarioMain}" />
										<button class="btn delButton">Usuń</button></li>
								</c:forEach>
							</ul>
					</div>
					<div class="scenarioSummary">
						</li>
						<li class="li2">
							<h4>
								Podsumowanie:
								<button class="btn addButton">Dodaj</button>
							</h4>
							<ul>
								<c:forEach items="${conspectus.scenarioSummary}"
									var="scenarioSummary">
									<li><form:textarea path="scenarioSummary"
											value="${scenarioSummary}" />
										<button class="btn delButton">Usuń</button></li>
								</c:forEach>
							</ul>
					</div>
					</li>
				</ol>
				<h3>Notatki:</h3>
				<form:textarea path="notes" />
				<br>
				 <button type="submit" class="btn btn-default">Zapisz</button>

			</form:form>
		</div>
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