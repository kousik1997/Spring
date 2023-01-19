<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body class="" style="background: #e2e2e2;">

	<div class="container mt-4">


		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex Form</h3>
						<div class="alert alert-danger" role="alert">
						<form:errors path="student.*"/>
						</div>
						<form action="handelform" method="post">

							<div class="form-group">
								<label for="exampleInputEmail1">your name</label> <input
									name="name" type="text" class="form-control"
									id="exampleInputEmail1" placeholder="Enter Name"
									aria-describedby="emailHelp"> <small id="emailHelp"
									class="form-text text-muted">we'll never share your
									name with anyone else. </small>
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1">your id</label> <input name="id"
									type="text" class="form-control" id="exampleInputEmail1"
									placeholder="Enter ID" aria-describedby="emailHelp">
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1">your DOB</label> <input
									name="date" type="text" class="form-control"
									id="exampleInputEmail1" placeholder="dd/mm/yyyy"
									aria-describedby="emailHelp">
							</div>

							<div class="form-group">
								<label for="exampleFormControlSelect1">Select Courses</label> <select
									name="courses" class="form-control"
									id="exampleFormControlSelect1" multiple>
									<option>java</option>
									<option>paython</option>
									<option>c++</option>
								</select>
							</div>

							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio1" value="male"><label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>


								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female"><label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>
							</div>

							<div class="form-group">
								<label for="">Select Type</label> <select class="form-control"
									name="type">
									<option value="oldstudent">Old Student</option>
									<option value="normalstudent">Normal Student</option>
								</select>
							</div>

							<div class="card-body">
								<p>Your Address</p>

								<div class="form-group">
									<input name="address.state" type="text" class="form-control"
										placeholder="Enter street">
								</div>

								<div class="form-group">
									<input name="address.city" type="text" class="form-control"
										placeholder="Enter city">
								</div>
							</div>

							<div class="continer text-center">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>





						</form>
					</div>
				</div>
			</div>
		</div>



	</div>
</body>
</html>
