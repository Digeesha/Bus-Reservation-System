<html ng-app="myApp">

<head>
<link rel="stylesheet" href="css/stylesheet.css">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="js/singleBusRegistrationController.js"></script>
<script src="js/customerSeatBookingController.js"></script>
<script src="js/BusSearchController.js"></script>
<script src="js/HomeController.js"></script>
<script src="js/loginController.js"></script>
<script src="js/registrationController.js"></script>
</head>

<body>
	<div ng-controller=loginController>
		<div class="container"
			style="width: 400px; margin-top: 100px; padding: 20px; background-color: white; border-radius: 8px; box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);">
			<h3 class="text-center">Login</h3>
			<form ng-submit="loginUser()">
				<div class="form-group">
					<label for="username">Username:</label> <input type="text"
						class="form-control" id="username" placeholder="Enter username"
						ng-model="username" required>
				</div>
				<div class="form-group">
					<label for="password">Password:</label> <input type="password"
						class="form-control" id="password" placeholder="Enter password"
						ng-model="password" required>
				</div>
				<button type="submit" class="btn btn-primary btn-block">Login</button>
				<button type="reset" class="btn btn-secondary btn-block"
					style="margin-top: 10px;">Reset</button>
			</form>
			<br>
			<div class="text-center">
				<p>
					Don't have an account? <a type="text/css" href="registration" />Register here</a>
				</p>
			</div>
		</div>
	</div>
	
</body>

</html>