<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#btn1").click(function(){
		$.get("./select?id=o",function(data){
			alert(data);
			$("#result1").html(data);
		});
	});
	$("#btn2").click(function(){
		$.get("./selectJson?id=o",function(data){
			$(data).each(function(){				
			alert(this.name);
			});
			$("#result1").html(data);
		});
	});
	
});
</script>
</head>
<body>
<h1>ajax view</h1>
<button id="btn1">Select_1</button>
<button id="btn2">Use_JSON</button>
<div id="result1"></div>
</body>
</html>