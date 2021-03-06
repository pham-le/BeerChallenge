<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<script src="/resources/stopwatch.js"></script>
	<link rel="stylesheet" href="/resources/layout.css">
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
		onclick="start();enableAll(${numPeople});">
	<input type="button" id="stop" value="stop"
		onclick="stop();disableAll(${numPeople});gameOver();">

	<h2>Players</h2>

	<div id="round" style="color: green"></div>

	<form name="" action="/start" method="POST">
		<table>
			<tr>
				<th>Player</th>
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

					<!-- State (---, PLAYING, GAME OVER, WINNER)-->
					<td><div id="state${count}">---</div></td>

					<!-- Score (last clicked) -->
					<td><div id="score${count}"
							style="width: 500px; font-size: 12px"></div></td>
				</tr>
				<c:set var="count" value="${count + 1}" scope="page" />
			</c:forEach>
		</table>

		<input type="hidden" id="listOfScores" name="listOfScores" value="" />
		<input type="submit" value="Submit Scores" onclick="save();">
		
	</form>



	<p>
		<a href="/scoreboard">Scoreboard</a>
	</p>


	<script type="text/javascript">
		var playerScores;
		var playerState;
		
	    function save() {
 	        document.getElementById("listOfScores").value = playerScores;
	    }
		
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
		
		function enable(playerNum) {
			var p = document.getElementById("player" + playerNum);
			p.disabled = false;
			p.style.color = "red";
			p.style.background = "white";
		}
		
		function enableAll(numPeople) {
			for (var i = 0; i < numPeople; i++) {
				enable(i);
				updateState(i, "PLAYING");
			}
		}
		
		function checkPlayers() {	
			for (var i = 0; i<playerState.length; i++) {
				//Player did not click button in time
				if (!document.getElementById("player" + i).disabled && playerState[i] === "PLAYING") {
					disable(i);
					updateState(i, "GAMEOVER");
				} 
				//Player clicked button
				else if (document.getElementById("player" + i).disabled && playerState[i] === "PLAYING") {
					if (x.getSeconds()/60 + 1 === 60) {
						updateState(i, "WINNER");
						disableAll();
					} else {
						enable(i);
					}
				}
			}
			
			//check if all players are gameover
			var count = 0;
			for (var i = 0; i<playerState.length; i++) {
				if (playerState[i] === "GAMEOVER") {
					count++;
				}
			}
			if (count==playerState.length) {
				x.stop();
				gameOver();
			}

		}
		
		function gameOver(){
			for (var i = 0; i<playerState.length; i++) {
				updateState(i, "GAMEOVER");
			}
	    	document.getElementById("round").innerHTML += ": GAME OVER!";
		}
		
		function updateState(playerNum, state){
			playerState[playerNum] = state;
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
		
	</script>

</body>

</html>