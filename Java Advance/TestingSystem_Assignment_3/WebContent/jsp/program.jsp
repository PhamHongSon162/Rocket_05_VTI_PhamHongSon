<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Group Management</title>

<!-- import JQuery -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- import bootstrap -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- import css -->
<style type="text/css">
	<jsp:include page="../css/program.css"/>
	<jsp:include page="../css/navbar.css"/>
</style>

</head>
<body>
	<!-- header -->
	<div class="header">
		<jsp:include page='header.jsp'></jsp:include>
	</div>


	<!-- main -->
	<div class="main">
		<jsp:include page='home.jsp'></jsp:include>
	</div>

	<!-- footer -->
	<div class="footer">
		<jsp:include page='footer.jsp'></jsp:include>
	</div>
</body>

<!-- import javascript -->
<script>
	<jsp:include page="../js/program.js"/>
</script>
</html>