<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<script src="/resources/stopwatch.js"></script>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Start</title>

</head>

<body>
<body onload="show();">
	<div>
		<h2>Timer</h2>
		<span id="time"></span>
	</div>
	<input type="button" value="start" onclick="start();">
	<input type="button" value="stop" onclick="stop();">
	<input type="button" value="reset" onclick="reset()">
	<input type="button" value="TESTTTT!!!" onclick="enable()">

	<h2>Players:</h2>

	<c:set var="count" value="0" scope="page" />

	<c:forEach var="player" items="${model.players}">
		<input type="button" class="players" id="player${count}"
			style="color: red; background-color: white" value="${player}"
			onclick="disable(${count})">
		<c:set var="count" value="${count + 1}" scope="page" />
		<br />
	</c:forEach>

	<p>
		<a href="/scoreboard">Scoreboard</a>
	</p>


	<script type="text/javascript">
		function disable(i) {
			var p = document.getElementById("player" + i);
			p.setAttribute("disabled", "disabled");
			p.style.color = "green";
		
		}
		
		function enable() {
			var buttons = document.getElementsByClassName('players');
			//alert(buttons.length);
			
			for (var i = 0; i < buttons.length; i++) {
				if (buttons[i].disabled === true) {
				buttons[i].disabled = false;
				buttons[i].style.color = "red";
				}
			}
		}		
	</script>

</body>

</html>