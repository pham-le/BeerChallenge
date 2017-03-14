<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<script src="/resources/stopwatch.js"></script>
<style>
table {
	border-collapse: collapse;
}

td, th {
	border: 1px solid black;
	text-align: center;
}
</style>


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


	<table>
		<tr>
			<th>Player</th>
			<th>Rank</th>
			<th>Score</th>
		</tr>
		<c:set var="count" value="0" scope="page" />
		<c:forEach var="player" items="${model.players}">
			<tr>
				<!-- Player button -->
				<td><input type="button" class="players" id="player${count}"
					style="color: red" value="${player}"
					onclick="disable(${count});updateScore(${count})"></td>

				<!-- Rank (of whole team)-->
				<td><div id="rank${count}"></div></td>

				<!-- Score (last clicked) -->
				<td><div id="score${count}">Drank at time: 0 ms</div></td>
			</tr>
			<c:set var="count" value="${count + 1}" scope="page" />
		</c:forEach>
	</table>

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
			
			for (var i = 0; i < buttons.length; i++) {
				if (buttons[i].disabled === true) {
				buttons[i].disabled = false;
				buttons[i].style.color = "red";
				}
			}
		}	
		
		function updateScore(playerNum) {
			//var test = document.getElementById("score" + playerNum).innerHTML;
			document.getElementById("score" + playerNum).innerHTML = "Drank at time: " + x.time() + " ms";
		}
	</script>

</body>

</html>