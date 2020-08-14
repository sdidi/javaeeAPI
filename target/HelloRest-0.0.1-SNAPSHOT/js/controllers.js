/**
 * 
 */
 var controllers = angular.module("HelloApp", []);

controllers.controller('HomeController', ['$scope', function ($scope) {
   $scope.title = 'Hello world!';
}]);