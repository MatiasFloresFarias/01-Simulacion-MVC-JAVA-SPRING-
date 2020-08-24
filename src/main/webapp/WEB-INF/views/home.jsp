<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Montos Por Ciudad</title>
<!-- Estilos de boostrap  -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
</head>

<body>
	<div class="container">
		<h1 class="display-4">Montos Por Ciudad</h1>
		<br>
		<table class="table">
			<thead class="thead_dark">
				<tr>
					<th>Ciudad</th>
					<th>Tipo de ayuda</th>
					<th>Monto</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${montosporciudad}" var="mpc">
					<tr>
						<td><c:out value="${mpc.getCiudad()}" /></td>
						<td><c:out value="${mpc.getMotivo()}" /></td>
						<td><c:out value="${mpc.getMonto()}" /></td>
					</tr>
				</c:forEach>
		</table>
	</div>
	<div class="container">
		<h1 class="display-4">Agregar Ayuda</h1>
		<hr>
		<form:form action="${pageContext.request.contextPath}/guardarAyudas"
			method="post">
			<div class="row">
				<div class="col-3">Beneficiario:</div>
				<div class="col-7">
					<select name="beneficiario.beneficiarioid" class="form-control form-control">
						<c:forEach items="${beneficiarios}" var="beneficiario">
							<option value="${beneficiario.getBeneficiarioid()}">${beneficiario.getNombre()}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<hr>
			<div class="row">
				<div class="col-3">Monto:</div>
				<div class="col-7">
					<input class="form-control" type="number" name="monto" required />
				</div>
			</div>
			<hr>
			<div class="row">
				<div class="col-3">Motivo:</div>
				<div class="col-7">
					<input class="form-control" type="text" name="motivo" required />
				</div>
			</div>
			<hr>
			<div class="row">
				<div class="col-1">
					<input class="btn btn-success" type="submit" value="Agregar">
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>
