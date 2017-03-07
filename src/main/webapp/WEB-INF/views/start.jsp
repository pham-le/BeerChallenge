<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
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
	<!-- <input type="button" value="reset" onclick="reset()"> -->

</body>

</html>