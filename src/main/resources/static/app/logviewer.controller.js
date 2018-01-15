/**
 * 
 */

(function(){
	'use strict';
	
	angular.module('app').controller('ViewAppLogController',ViewAppLogController);
	
	ViewAppLogController.$inject=['$http'];
	
	function ViewAppLogController($http){
		var vm = this;
		
		vm.applicationDetails =[];
		vm.getInfo=getInfo;
		init();
		
		function init(){
			getInfo();
		}
		
		function getInfo(){
			var url = "/applications/appLogPaths";
			var appInfo = $http.get(url);
			appInfo.then(function(response){
				vm.applicationDetails = response.data;
			});
		}
	}
})();