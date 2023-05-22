<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<title>CRUD</title>
</head>
<body>
	<div class="container mt-3">
		<h2>CRUD jsp servler hibernate</h2>
		<a href="crud?status=add"><button type="button" class="btn btn-success mt-5">Thêm</button></a>
		<table class="table mt-2">
		
			<thead>
				<tr>
					<th>ID</th>
					<th>Ho ten</th>
					<th>Lop</th>
					<th>Options</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="list" items="${list }">
				<tr>
					<td>${list.id }</td>
					<td>${list.hoten }</td>
					<td>${list.lop }</td>
					<td>
						<a href="crud?status=update&id=${list.id }"><button type="button" class="btn btn-success">Sua</button></a>
						<a href="crud?status=delete&id=${list.id }"><button type="button" class="btn btn-danger">Xoa</button></a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>