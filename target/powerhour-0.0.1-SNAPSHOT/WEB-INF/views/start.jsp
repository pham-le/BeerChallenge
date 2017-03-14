<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>

	<script src="/resources/stopwatch.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Start</title>
    
</head>

<body>
	<body onload="show();">
	<div>Time: <span id="time"></span></div>
	<input type="button" value="start" onclick="start();">
	<input type="button" value="stop" onclick="stop();">
	<input type="button" value="reset" onclick="reset()">
	
	<input type="button" id="btn" value="test" onclick="myFunction2()">
	
	<script type="text/javascript">
	function myFunction() {
		  document.getElementById("btn").disabled=true;

		setTimeout('document.getElementById("btn").disabled=false;',3000);
		var min = 0;
		var	x = obj.time();
		
		if(x % 10000 != 0){
			alert("You button was pressed");
		}
	};
	
	function myFunction2() {
	    //var y = x.getMinute();
	  	alert("Hi. Your button was pressed: " + x.time());

	}
	

	</script>

	<p><a href="/scoreboard">Scoreboard</a></p>
</body>

</html>