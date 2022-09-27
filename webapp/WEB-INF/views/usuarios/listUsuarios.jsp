<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">	
	<meta name="description" content="">
	<meta name="author" content="">		
	<title>Listado de Usuarios</title>
	<spring:url value="/resources" var="urlPublic" />
	<spring:url value="/usuarios" var="urlUsuarios" />
	
	<link href="${urlPublic}/bootstrap/css/bootstrap.min.css" rel="stylesheet">	
	<link href="${urlPublic}/bootstrap/css/theme.css" rel="stylesheet">
	
	</head>
<body>
	<jsp:include page="../includes/menu.jsp"></jsp:include>
	
	<div class="container theme-showcase" role="main">
	
	<h1>Listado de Usuarios</h1>
	
	<div class="table-responsive">
	        <table class="table table-hover table-striped table-bordered">
	          <tr>
	          	<th>Cuenta</th>
	            <th>Activo</th>
	            <th>Email</th>
	            <th>Teléfono</th>
	          </tr>
	          
	          <c:forEach var="usuario" items="${usuarios}">
	          <tr>
						<td>${usuario.cuenta}</td>
						<td>${usuario.activo}</td>
						<td>${usuario.email}</td>
						<td>${usuario.telefono}</td>
			</tr>
			</c:forEach>
			</table>
		</div>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="${urlPublic}/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>