<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Paises</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>#</th>
			<td>Nombre</td>
			<td>Id Región</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="c" items="${countriesList}">
			<tr>
				<td><c:out value="${c.getCountry_id()}"></c:out></td>
				<td><c:out value="${c.getCountry_name()}"></c:out></td>
				<td><c:out value="${c.getRegion_id()}"></c:out></td>
		</c:forEach>
	</tbody>
</table>
</body>
</html>