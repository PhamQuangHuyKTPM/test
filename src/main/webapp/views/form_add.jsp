<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
	<form method="POST" action="crud?status=add">
	<input type="hidden" value="" name="id" />
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Ho ten
			</label> <input type="text" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp" name="hoten" value="">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Lop</label>
			<input type="text" class="form-control"
				id="exampleInputPassword1" name="lop" value="">
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>