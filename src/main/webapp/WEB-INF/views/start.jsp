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
<body onload="show();createArray(${model.numPeople})">
	<div>
		<h2>Timer</h2>
		<span id="time"></span>
	</div>
	<input type="button" value="start" onclick="start();enable();">
	<input type="button" value="stop" onclick="stop();">

	<h2>Players:</h2>


	<table>
		<tr>
			<th>Player</th>
			<th>Rank</th>
			<th>Scores</th>
		</tr>
		<c:set var="count" value="0" scope="page" />
		<c:forEach var="player" items="${model.players}">
			<tr>
				<!-- Player button -->
				<td><input type="button" class="players" id="player${count}"
					style="color: green; background: #E8E8E8" value="${player}"
					onclick="disable(${count});updateScore(${count})" disabled></td>

				<!-- Rank (of whole team)-->
				<td><div id="rank${count}"></div></td>

				<!-- Score (last clicked) -->
				<td><div id="score${count}" style="width: 500px; font-size:12px"></div></td>
			</tr>
			<c:set var="count" value="${count + 1}" scope="page" />
		</c:forEach>
	</table>

	<p>
		<a href="/scoreboard">Scoreboard</a>
	</p>


	<script type="text/javascript">
		var playerScores;
		
		function createArray(playerCount) {
			playerScores = new Array(playerCount);
			for (var i = 0; i < playerCount; i++) {
				playerScores[i] = new Array(60);
			}
		}
	
		function disable(i) {
			var p = document.getElementById("player" + i);
			p.setAttribute("disabled", "disabled");
			p.style.color = "green";
			p.style.background = "#E8E8E8";
		
		}
		
		function enable() {
			var buttons = document.getElementsByClassName('players');
			
			for (var i = 0; i < buttons.length; i++) {
				if (buttons[i].disabled === true) {
					buttons[i].disabled = false;
					buttons[i].style.color = "red";
					buttons[i].style.background = "white";
				}
			}
		}	
		
		function updateScore(playerNum) {
			playerScores[playerNum][Math.floor(x.time()/60000)] = x.time();

			var test = document.getElementById("score" + playerNum).innerHTML;
			test = test + formatTime(x.time()) + ", "
			document.getElementById("score" + playerNum).innerHTML = test;
		}
	</script>

</body>

</html>