<html>

<head>

	<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>

<body>

<h3>Spring CRM REST Demo</h3>

<hr>

<a href="${pageContext.request.contextPath}/api/employees">Get All Employees</a>

<hr>

<a href="${pageContext.request.contextPath}/api/departments">Get All Departments</a>

<hr>

<a href="${pageContext.request.contextPath}/api/locations">Get All Locations</a>

<hr>


<div class="dropdown">
  		<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Employees by Department
  			<span class="caret"></span></button>
  				<ul class="dropdown-menu">
					<li><a href="${pageContext.request.contextPath}/api/employees/listByDep/1"> Department 1 </a></li>
					<li><a href="${pageContext.request.contextPath}/api/employees/listByDep/2"> Department 2 </a></li>
					 <li><a href="${pageContext.request.contextPath}/api/employees/listByDep/3"> Department 3 </a></li>
  				</ul>
</div>

<hr>

<div class="dropdown">
  		<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Departments by Location
  			<span class="caret"></span></button>
  				<ul class="dropdown-menu">
					<li><a href="${pageContext.request.contextPath}/api/departments/listByLoc/1"> Location 1 </a></li>
					<li><a href="${pageContext.request.contextPath}/api/departments/listByLoc/2"> Location 2 </a></li>
					 <li><a href="${pageContext.request.contextPath}/api/departments/listByLoc/3"> Location 3 </a></li>
					 <li><a href="${pageContext.request.contextPath}/api/departments/listByLoc/4"> Location 4 </a></li>
					 <li><a href="${pageContext.request.contextPath}/api/departments/listByLoc/5"> Location 5 </a></li>
  				</ul>
</div>

</body>
</html>