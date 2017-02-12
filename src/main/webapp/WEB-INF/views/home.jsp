<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Beer Challenge - Welcome!</title>
</head>

<body>
	<h1>Beer Challenge - POWER HOUR!</h1>
	<h2>Introduction</h2>
		<p>...</p>
	
	<h2>Setup</h2>
		<p>..</p>
		
	<h2>Rules</h2>
		<p>..</p>
			
	<h2>Start the challenge!</h2>
		<p> Please enter a unique team name and the amount of players:</p>
		<form action="/home" method="POST">
			<label name="teamName">Team Name: </label><input name="teamName" type="text" /> </br>
        	<label name="numPeople">Team Count: </label><input name="numPeople" type="number" /> </br>
        	<input type="submit" />
   		</form>
</body>

</html>