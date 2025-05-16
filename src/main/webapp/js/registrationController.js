"use strict"
var myApp = angular.module('myApp');
myApp.controller('registrationController', registrationController);

function registrationController($scope, $http, $window) {
  $scope.registerUser = function() {
    if (!$scope.regUsername || !$scope.regPassword  || !$scope.roleName) {
      alert("All fields are required.");
      return;
    }

    const registerRequest = {
      username: $scope.regUsername,
      password: $scope.regPassword,
      roleName: $scope.roleName
    };

    // Call the backend register API
    $http.post('http://localhost:8080/api/auth/register', registerRequest)
      .then(function(response) {
        alert(response.data.message);
        if (response.data.message === "Registration successful") {
          // Redirect to login page after successful registration
          $window.location.href = '/home';
        }
      })
      .catch(function(error) {
        alert("An error occurred during registration.");
        console.error(error);
      });
  };
}
