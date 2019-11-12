<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Jugadores</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body style="background-color: whitesmoke;">
<jsp:useBean id="nDao" class="com.mundial.model.JugadorDao"
		scope="request"></jsp:useBean>
<div class="container" style="padding: 0px;background-color: #F2F2F2;">
<%@include file="html/cabecera.html" %>
<%@include file="html/menu.html" %>


<table class="table mb-5 table-hover">
		<thead class='bg-light'>
			<tr class="table-info">
				<th scope='col' class='border-0 text-primary text-center text-uppercase'>Equipo</th>
				<th scope='col' class='border-0 text-primary text-center text-uppercase'>Numero</th>
				<th scope='col' class='border-0 text-primary text-center text-uppercase'>Nombre</th>
				<th scope='col' class='border-0 text-primary text-center text-uppercase'>Email</th>
				<th scope='col' class='border-0 text-primary text-center text-uppercase'>Posicion</th>
				<th scope='col' class='border-0 text-primary text-center text-uppercase'>Fecha Nacimiento</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="n" items="${nDao.list()}">
				<tr>
					<td class="text-center font-weight-light"><c:out value="${n.equipoBean.nombre}" /></td>
					<td class="text-center font-weight-light"><c:out value="${n.id.numero}" /></td>
					<td class="text-center font-weight-light"><c:out value="${n.nombre}" /></td>
					<td class="text-center font-weight-light"><c:out value="${n.email}" /></td>
					<td class="text-center font-weight-light"><c:out value="${n.posicion}" /></td>
					<td class="text-center font-weight-light"><c:out value="${n.fechanacimiento}" /></td>
				</tr>
			</c:forEach>
		</tbody>
		</table>
<%@include file="html/footer.html" %>
</div>

</body>
</html>