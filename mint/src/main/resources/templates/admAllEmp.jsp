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
			<br/><br/>
    <table border="1" cellpadding="10">
        <thead>
            <tr>
                <th>Employee Code</th>
                <th>Employee Name</th>
                <th>Designation</th>
                <th>Salary</th>
                <th>Mobile</th>
                <th>email</th>
                <th>Department Id</th>
                <th>User Id</th>
                <th>Create Time</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="emp : ${emps}">
                <td th:text="${emp.empCode}">Employee ID</td>
                <td th:text="${emp.empName}">Name</td>
                <td th:text="${emp.empDesignation}">Designation</td>
                <td th:text="${emp.empSalary}">Salary</td>
                <td th:text="${emp.mobile}">Mobile</td>
                <td th:text="${emp.email}">Email</td>
                <td th:text="${emp.deptId}">Department Id</td>
                <td th:text="${emp.userId}">User Id</td>
                <td th:text="${emp.createTime }">Create Date</td>
                <td>
                    <a th:href="@{'/edit/' + ${emp.empCode}}">Edit</a>
                    <a th:href="@{'/delete/' + ${emp.empCode}}">Delete</a>
                </td>
            </tr>
        </tbody>
    </table>
		</div>
	</div>
</body>
</html>