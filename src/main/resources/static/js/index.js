$(document).ready(function(){
	$("#fullpage").fullpage({
		
		navigation: true,
	})
});

$(document).ready(function(){

	$(".menu").mouseenter(function(){
		$(".smenu").hide();
		var a= $(this).attr("id");

	   $('#s'+a).show();
	});

	
});


