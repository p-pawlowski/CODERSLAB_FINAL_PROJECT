<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@	taglib	prefix="form"
				uri="http://www.springframework.org/tags/form"	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:errors path="*"/>
	<form:form method="post" modelAttribute="lessonConspectus">
	<form:errors path="subject"/>
		Temat: <br>
		<form:textarea path="subject"/><br>
		Czas trwania scenariusza: <br>
		<form:input path="time"/><br>
		Cele: <br>
		<form:textarea path="objective"/><br>
		Materiały: <br>
		<form:textarea path="materials"/><br>
		Metody: <br>
		<form:textarea path="methods"/><br>
		Przebieg lekcji: <br>
		Wstęp: <br>
		<form:textarea path="scenarioIntroduction"/><br>
		Część właściwa: <br>
		<form:textarea path="scenatioMain"/><br>
		Podsumowanie: <br>
		<form:textarea path="scenarioSummary"/><br>
		Notatki: <br>
		<form:textarea path="scenarioSummary"/><br>
		
		
		
	</form:form>

</body>
</html>