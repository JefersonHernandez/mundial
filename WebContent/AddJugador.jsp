<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro Jugador</title>
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
	<jsp:useBean id="nDao" class="com.mundial.model.EquipoDao"
		scope="request"></jsp:useBean>
	<div class="container" style="padding: 0px; background-color: #F2F2F2;">
		<%@include file="html/cabecera.html"%>
		<%@include file="html/menu.html"%>

		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6 text-center">
				<form class="form-horizontal" method="POST"
					action="JugadorController">
					<fieldset>

						<div class="form-group">
							<div class="col">
								<select name="selectEquipo" class="col">
								<c:forEach var="obj" items="${nDao.list()}">
								<option value="${obj.id}">  ${obj.nombre}</option>
								</c:forEach>
									
								</select>
							</div>
						</div>
						<div class="form-group">
							<div class="col">
								<input name="nombre" type="text" placeholder="Nombre"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<div class="col">
								<input name="numero" type="text" placeholder="Numero"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<div class="col">
								<input name="posicion" type="text" placeholder="Posicion"
									class="form-control">
							</div>
						</div>

						<div class="form-group">

							<div class="col">
								<input name="email" type="text"
									placeholder="Direccion de Correo" class="form-control">
							</div>
						</div>
						<div class="form-group">

							<div class="col">
								<input name="fechanacimiento" type="date"
									placeholder="Fecha Nacimiento" class="form-control">
							</div>
						</div>



						<div class="form-group">
							<div class="col-md-12 text-center">
								<button type="submit" class="btn btn-primary btn-lg">Save</button>
							</div>
						</div>

					</fieldset>

				</form>
			</div>

		</div>

		<%@include file="html/footer.html"%>
	</div>

</body>
</html>