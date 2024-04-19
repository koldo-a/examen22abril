<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>
<main class="container">
	<form action="login" method="post">
		<div class="row mb-3">
			<label for="email" class="col-sm-2 col-form-label">Email</label>
			<div class="col-sm">
				<input type="email" class="form-control" id="email" name="email">
			</div>
		</div>
		<div class="row mb-3">
			<label for="password" class="col-sm-2 col-form-label">Contraseña</label>
			<div class="col-sm">
				<input type="password" class="form-control" id="password" name="password">
			</div>
		</div>

		<div class="row mb-3">
			<div class="offset-sm-2 col-sm">
				<button class="btn btn-primary">Login</button>
			</div>
		</div>

	</form>
</main>
<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>