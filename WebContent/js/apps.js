/**
 * 
 */
 
 var app = angular.module('HelloApp',[]);
 
 app.controller('HomeController', ['$scope', function ($scope) {
   $scope.title = 'Hello world!';
}]);
 /*var app = angular.module('app', [
   'ngRoute',
   'controllers'
]);


app.config(['$routeProvider',
            function ($routeProvider) {
               $routeProvider
                     .when('/', {
                              templateUrl: 'partials/home.html',
                              controller: 'HomeController'
                           })
                     .otherwise({
                                   redirectTo: '/'
                                });
            }]); */