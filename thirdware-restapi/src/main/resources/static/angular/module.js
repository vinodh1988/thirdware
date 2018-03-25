
var mod=angular.module("myapp",[]);

mod.controller('one',['$scope','SharedService',function($scope,SharedService){
	$scope.data="Data created by Angular ";
    $scope.things=['pencil','pen','paper'];
   
    $scope.handle=function(){
    	$scope.things.push($scope.current);
    }
    
    $scope.people=SharedService.getData();
    
}]);

mod.controller("two",['$scope','SharedService',function($scope,SharedService){
	$scope.info="data from controller two!!!!";
	
	$scope.addPerson= function(){
	   let temp={sno:$scope.x,name:$scope.y}
	   SharedService.dataStore.push(temp);
	}
}]);


mod.service("SharedService",function(){
	this.dataStore=[{sno:12,name:"Robin"},
		            {sno:13,name:"Kevin"}]
	this.getData=function(){
		return this.dataStore;
	}
});

mod.controller('rest',['$scope','dataService',function($scope,dataService){
	
            dataService.getPeople().then(
            		function(data){
            			$scope.personarray=data;
            			$scope.$digest();
            		},
            		function(error){
            			$scope.personarray=error;
            			$scope.$digest();
            		});
            
            $scope.store=function(){
            
            	let data={name:$scope.name,city:$scope.city};
            	dataService.addData(data).then(
            	  function(){
            		  alert('added');
            	  },
            	  function(){
            		  alert('error');
            	  }
            	)
            	
            	
            }
    }
]);

mod.service("dataService",['$http',function($http){
	
	this.getPeople=function(){ return new Promise(function(resolve,reject){
		$http.get("https://springboot-app.cfapps.io/restdata/repos/people").
			then(function(response){
				         
						resolve(response.data);
				},
				function(error){
					   
						reject([]);
				});
	});
	}
	
	this.addData=function(data){
		return new Promise(function(resolve,reject){
			$http.post("https://springboot-app.cfapps.io/restdata/repos/people",data).
			then(function(response){
		         
				resolve(response.data);
				},
		  function(error){
			   
				reject([]);
		   });
		});
	}
	
}]);