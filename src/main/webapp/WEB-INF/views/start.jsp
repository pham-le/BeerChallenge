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
<body onload="show();createArrays(${model.numPeople})">
	<div>
		<h2>Timer</h2>
		<span id="time"></span>
	</div>
	<input type="button" id="start" value="start"
		onclick="start();enable();">
	<input type="button" id="stop" value="stop"
		onclick="stop();disableAll(${numPeople})">

	<h2>Players</h2>

	<div id="round" style="color: green"></div>
	<table>
		<tr>
			<th>Player</th>
			<th>Rank</th>
			<th>State</th>
			<th>Scores</th>
		</tr>
		<c:set var="count" value="0" scope="page" />
		<c:forEach var="player" items="${model.players}">
			<tr>
				<!-- Player button -->
				<td><input type="button" class="players" id="player${count}"
					style="color: green; background: #E8E8E8" value="${player}"
					onclick="disable(${count});updateScore(${count})" disabled></td>

				<!-- Rank (out of whole team)-->
				<td><div id="rank${count}">0</div></td>

				<!-- State (---, PLAYING, GAME OVER, WINNER)-->
				<td><div id="state${count}">---</div></td>

				<!-- Score (last clicked) -->
				<td><div id="score${count}"
						style="width: 500px; font-size: 12px"></div></td>
			</tr>
			<c:set var="count" value="${count + 1}" scope="page" />
		</c:forEach>
	</table>

	<p>
		<a href="/scoreboard">Scoreboard</a>
	</p>


	<script type="text/javascript">
		var playerScores;
		var playerState;
		
		function createArrays(playerCount) {
			playerState = new Array(playerCount);
			playerScores = new Array(playerCount);
			for (var i = 0; i < playerCount; i++) {
				playerScores[i] = new Array(60);
			}
		}
	
		function disable(playerNum) {
			var p = document.getElementById("player" + playerNum);
			p.setAttribute("disabled", "disabled");
			p.style.color = "green";
			p.style.background = "#E8E8E8";
		
		}
		
		function disableAll(numPeople) {
			document.getElementById('start').disabled=true;
			
			for(var i = 0; i<numPeople; i++) {
				disable(i);
			}
		}
		
		function enable() {
			var buttons = document.getElementsByClassName('players');
			
			for (var i = 0; i < buttons.length; i++) {
				if (buttons[i].disabled === true) {
					buttons[i].disabled = false;
					buttons[i].style.color = "red";
					buttons[i].style.background = "white";
				}
				
				updateState(i, "PLAYING");
			}
		}
		
		function updateState(playerNum, state){
			var stateDiv = document.getElementById("state" + playerNum);
			
			switch (state) {
				case "PLAYING":
					stateDiv.style.color = "orange";
					break;
				case "GAMEOVER":
					stateDiv.style.color = "red";
					break;
				case "WINNER":
					stateDiv.style.color = "green";
					break;
			}
			
			stateDiv.innerHTML = state;
		}
		
		function updateScore(playerNum) {
			playerScores[playerNum][Math.floor(x.time()/60000)] = x.time();

			var scoreDiv = document.getElementById("score" + playerNum).innerHTML;
			scoreDiv = scoreDiv + formatTime(x.time()) + ", "
			document.getElementById("score" + playerNum).innerHTML = scoreDiv;
		}
		
		//TO DO
		function updateRank(playNum){
			//document.getElementById("rank" + playerNum).innerHTML = 1;
		}
	</script>

</body>

</html>