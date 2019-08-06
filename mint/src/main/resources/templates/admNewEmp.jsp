<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">

<head>
<title>MINT - Administrator : Add Employee</title>

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
			<a href="newEmp" class="btn btn-primary">Add Employee</a> 
			<a href="allEmp" class="btn btn-primary">Employees</a> 
			<a href="searchEmp"	class="btn btn-primary">Search Employee</a> 
			<a href="logout"	class="btn btn-primary">Logout</a> 
		</div>
		<div class="row col-lg-4 col-lg-offset-4"
			style="margin-top: 80px; background-color: #fff; padding: 20px; border: solid 1px #ddd;">
			<form th:action="@{/addEmp}" method="POST" class="form-signin"
				th:object="${emp}">
				<h3 class="form-signin-heading" th:text="AddEmployee"></h3>
				<br /> <input type="text" id="empName" name="empName" th:field="*{empName}"
					th:placeholder="EmployeeName" class="form-control" /> <br />
				<input type="text" id="empDesignation" name="empDesignation" th:field="*{empDesignation}"
					th:placeholder="Designation" class="form-control" /> <br />
				Salary : <input type="text" id="empSalary" name="empSalary" th:field="*{empSalary}"
					th:placeholder="Salary" class="form-control" /> <br />
				Mobile : <input type="number" id="mobile" name="mobile" th:field="*{mobile}"
					th:placeholder="Mobile" class="form-control" /> <br />
				<input type="email" id="email" name="email" th:field="*{email}"
					th:placeholder="email" class="form-control" /> <br />
				Department : <select id="deptId" name="deptId" th:field="*{deptId}">
					<option th:each="dept : ${depts}" th:value="${dept.deptId}" th:text="${dept.deptName}">one</option>
				</select>
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