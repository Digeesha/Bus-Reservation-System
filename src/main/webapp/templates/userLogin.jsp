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
</head>

<body>
  <div data-ng-controller="HomeController">
	<div class="container-fluid mt-3 bg-info">
	   <div class="btn-group-lg">
	   
	    <button type="button" class="btn btn-info" data-target="#customerseatbooking" data-toggle="pill">Customer Seat Booking</button>
	       <button type="button" class="btn btn-danger logout-btn" ng-click="logout()">Logout</button>
	   </div>
    </div>
      <div class="d-flex justify-content-center mt-3 bus-images">
        <img src="images/bus.jpg" alt="Bus Image 1" class="bus-image">
        
    </div>
  <br>
  
  <div class="container-fluid mt-3">
  	
		<div class="tab-content">
				<div id="customerseatbooking" class="tab-pane fade">
			<jsp:include page="customerseatbooking.jsp" />
		</div>
		
    </div>
    </div>
  </div>
 <button type="button" data-toggle="modal" data-target="#myModal" id="id1" ng-show="false">Alert</button>
 <div class="modal fade" id="myModal" role="dialog" data-backdrop="static" data-keyboard="true">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <div class="modal-header">
          <h4 class="modal-title d-flex justify-content-center">{{alertmessage}}</h4>
        </div>
        <div class="modal-footer d-flex justify-content-center">
          <button type="button" class="btn btn-default" data-dismiss="modal">Successfully booked</button>

        </div>
      </div>
    </div>
  </div>
</div>    
</body>

</html>