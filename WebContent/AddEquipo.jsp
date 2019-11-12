<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregar Equipo</title>
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

<div class="container" style="padding: 0px;background-color: #F2F2F2;">
<%@include file="html/cabecera.html" %>
<%@include file="html/menu.html" %>
<div class="row mb-5">
		<div class="col-md-3"></div>
			<div class="col-md-6 text-center" style="border-radius: 10px;padding:5px;">
				<form class="form-horizontal" method="POST"
					action="EquipoController">
					<fieldset>
						<div class="form-group">
							<div class="col">
								<input name="nombre" type="text" placeholder="Nombre"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<div class="col">
								<input name="presidente" type="text" placeholder="Presidente"
									class="form-control">
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
<%@include file="html/footer.html" %>

</div>

</body>
</html>