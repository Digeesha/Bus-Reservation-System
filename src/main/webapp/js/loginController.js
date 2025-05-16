"use strict"
var myApp = angular.module('myApp');
myApp.controller('loginController', loginController);

function loginController($scope, $http, $window) {
	console.log("Hello, world!"); 
  $scope.loginUser = function() {
    if (!$scope.username || !$scope.password) {
      alert("Both fields are required.");
      return;
    }

    const loginRequest = {
      username: $scope.username,
      password: $scope.password
    };

    // Call the backend login API
    $http.post('http://localhost:8080/api/auth/login', loginRequest)
      .then(function(response) {
        if (response.data.role) {
        // Redirect to home page
          // Store the role and redirect based on it
                localStorage.setItem('role', response.data.role);
                alert("Login successful!");

                // Redirect to a role-specific page or home
                switch (response.data.role.toLowerCase()) {
                    case "admin":
                        $window.location.href = "/adminLogin";
                        break;
                    case "user":
                        $window.location.href = "/userLogin";
                        break;
                    default:
                        $window.location.href = "/index";
                        break;
                }
        }
      })
      .catch(function(error) {
        alert("An error occurred during login.");
        console.error(error);
      });
  };
}
