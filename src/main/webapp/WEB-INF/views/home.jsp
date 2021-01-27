<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Lista de Productos</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Lista de Productos</h1>

		<table class="table">
			<thead class="table-dark">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Nombre</th>
					<th scope="col">Descripción</th>
					<th scope="col">Costo</th>
					<th scope="col">Precio</th>
					<th scope="col">Categoría</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${lista}">
					<tr>
						<td><c:out value="${p.getId()}"></c:out></td>
						<td><c:out value="${p.getNombre()}"></c:out></td>
						<td><c:out value="${p.getDescripcion()}"></c:out></td>
						<td><c:out value="${p.getCosto()}"></c:out></td>
						<td><c:out value="${p.getPrecio()}"></c:out></td>
						<td><c:out value="${p.getCategoria().getNombre()}"></c:out></td>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>
</body>
</html>
