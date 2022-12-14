<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Save Student</title>
</head>


<body>

	<div class="container">

		<h3>Student Directory</h3>
		
		<hr>
		<p class="h4 mb-4">Student</p>
		<form action="/StudentManagement/student/save" method="POST">
			<input type="hidden" name="id" value="${Student.id}" />


			<div class="form-inline">
				<input type="text" name="name" value="${Student.name}"
					class="form-control mb-4 col-4" placeholder="Name">
			</div>

			
			<div class="form-inline">
				<input type="text" name="dept" value="${Student.dept}"
					class="form-control mb-4 col-4" placeholder="Department">
			</div>
			
			
			<div class="form-inline">
				<input type="text" name="country" value="${Student.country}"
					class="form-control mb-4 col-4" placeholder="Country">
			</div>


			<button type="submit" class="btn btn-info col-2">Save</button>

		</form>

		<hr>
		<a href="/StudentManagement/student/list">Back to Students List</a>

	</div>
</body>

</html>