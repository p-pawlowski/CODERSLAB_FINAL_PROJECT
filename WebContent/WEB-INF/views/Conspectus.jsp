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

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>



	<%@include file="../header.jspf"%>
	<%@include file="../TopNavBar.jspf"%>
	<div class="container">
		<div class="row">


			<div class="col-lg-11 col-md-10 col-sm-9 col-xs-8">


				<h2>Temat: ${conspectus.subject}</h2>
				<h3>Cele lekcji:</h3>
				<p>
					<b>Uczeń:</b>
				</p>
				<ul>
					<c:forEach var="item" items="${conspectus.objectives }">
						<li class="li1">${item}</li>
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
					<li>
						<h4>Wstęp:</h4>
						<ul>
							<c:forEach var="item" items="${conspectus.scenarioIntroduction}">
								<li class="li2">${item}</li>
							</c:forEach>
						</ul>
					</li>

					<li>
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

			</div>
			<div class="col-lg-1 col-md-2 col-sm-3 col-xs-4">
				<div class="icon-bar">
					<br> <br>
					<p>
						<a class="active a1" href="#"><i
							class="fa fa-2x fa-file-pdf-o"></i>PDF</a>
					</p>
					<p>

						<a class="a1" href="../conspectus/edit/${conspectus.getId()}"><i
							class="fa fa-2x fa-pencil-square-o"></i>Edit</a>
					</p>
					<p>
						<a class="a1" data-toggle="modal" data-target="#myModal" href="#"><i
							class="fa fa-2x fa-trash"></i>Delete</a>
					</p>

					<!-- Modal -->
					<div class="modal fade" id="myModal" role="dialog">
						<div class="modal-dialog">

							<!-- Modal content-->
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">&times;</button>
									<h4 class="modal-title text-center">Czy potwierdzasz
										usunięcie scenariusza?</h4>
									<br>
									<div class="text-center">
										<form class="inline" action="../conspectus/delete/${conspectus.getId()}">
											<button class="btn">TAK</button>
											<button class="btn" data-dismiss="modal">NIE</button>
										</form>
									</div>

								</div>

							</div>

						</div>
					</div>

				</div>


			</div>
		</div>
	</div>



	<div class="space1"></div>

	<%@include file="../footer.jspf"%>
</body>
<script
	src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/appConspectus.js" />"
	type="text/javascript"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>