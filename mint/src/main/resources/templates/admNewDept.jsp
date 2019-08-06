<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">

<head>
<title>MINT - Administrator</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body style="background-color: #ededed;">
	<div style="background-color: #337ab7; height: 50px;"></div>
	<div class="container-fluid">
		<div id="mySidenav">
			<a href="newDept" class="btn btn-primary">Add Department</a> 
			<a href="#" class="btn btn-primary">Add Employee</a> 
			<a href="#" class="btn btn-primary">Employees</a> 
			<a href="#"	class="btn btn-primary">Search Employee</a> 
			<a href="#"	class="btn btn-primary">Logout</a> 
		</div>
		<div class="row col-lg-4 col-lg-offset-4"
			style="margin-top: 80px; background-color: #fff; padding: 20px; border: solid 1px #ddd;">
			<form th:action="@{/addDept}" method="POST" class="form-signin"
				th:object="${dept}">
				<h3 class="form-signin-heading" th:text="Add Department"></h3>
				<br /> <input type="text" id="deptName" name="deptName" th:field="*{deptName}"
					th:placeholder="DepartmentName" class="form-control" /> <br /> 
				<div align="center" th:if="${msg}">
					<p style="font-size: 20; color: #FF1C19;" th:text="${msg}"></p>
				</div>
				<button class="btn btn-lg btn-primary" name="Submit" value="Add"
					type="Submit" th:text="Add" style="margin-right: 10px;"></button>
			</form>	
		</div>
	</div>
</body>
</html>