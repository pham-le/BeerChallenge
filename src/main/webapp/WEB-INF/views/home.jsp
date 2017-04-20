<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Beer Challenge - Welcome!</title>
</head>

<body>
	<h1>Beer Challenge - POWER HOUR!</h1>
	<h2>Introduction</h2>
	<p>Power Hour is a popular party game where player(s) drink a shot
		of beer (or any liquid) every minute within one hour (i.e. 60 shots).
		This game can be played with any amount of players, and each player
		can drop out at any time. Please play at your own discretion.</p>
		
	<p><a href="/scoreboard">Scoreboard</a></p>

	<h2>Setup</h2>
	<p>Each player must have:</p>
	<ol>
		<li>One shot glass that holds 1.5 oz. of liquid.</li>
		<li>~7.5 cans of 12 oz. beers (60 shots x 1.5 oz. = 90 oz. of
			beer, which is 7.5 cans of 12 oz. beers, or 5.6 pints of beer)</li>
	</ol>

	<h2>Rules</h2>
	<p>After setting up your team's information (team name, number of
		players, and player names), you will be presented with a timer. Once
		every player is ready, press the "Start" button under the timer to
		begin the clock and start playing! The "Stop" button will stop the
		game indefinitely.</p>
	<p>Once a player drinks their shot, the player must click the
		button with their name on it, and that time will be recorded. Clicking
		these buttons indicate which players have passed the round.</p>
	<p>If a player fails to drink their shot and click their button
		within that minute, it will be game over for that player. If no one is
		able to finish their shots, meaning that none of the buttons have been
		pressed, then it is game over for the whole team and the timer will
		stop.</p>
	<p>Once the game is over, click the "Submit Scores" button each
		players times to the score board.</p>

	<h2>Start the challenge!</h2>
	<p>Please enter a team name (3 or more characters) and the amount
		of players:</p>
	<form action="/home" method="POST">
		<label name="teamName">Team Name: </label><input name="teamName"
			type="text" /> </br> <label name="numPeople">Team Count: </label><input
			name="numPeople" type="number" /> </br> <input type="submit" /> <font
			color=red><c:out value="${errorMessage}" /></font>
	</form>
</body>

</html>