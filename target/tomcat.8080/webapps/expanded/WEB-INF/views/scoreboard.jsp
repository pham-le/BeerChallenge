<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	pageContext.setAttribute("newLine", "\n");
%>
<%
	pageContext.setAttribute("tab", "\t");
%>


<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="/resources/layout.css">
	
	<title>Beer Challenge - Power Hour, Scoreboard</title>
</head>

<body>
<body>
	<h1>Scoreboard</h1>

	<p>
		Current Time:
		<c:out value="${now}" />
	</p>
	<a href="/home">Home</a>

	<p>Enter a specific team name of player name if you would like to
		see specific details:
	<form action="/scoreboard" method="POST">
		<input name="name" type="text" />
		<select name="type">
			<option value="teamName">Team</option>
			<option value="playerName">Player</option>
		</select> <input type="submit" />
	</form>

	<h2>Teams</h2>

	<table>
		<tr>
			<th>ID</th>
			<th>TEAM NAME</th>
			<th>NUMBER OF PLAYERS</th>
		</tr>
		<c:forEach var="game" items="${gameList}">
			<tr>
				<td>${game.id}</td>
				<td>${game.teamName}</td>
				<td>${game.numPeople}</td>
			</tr>
		</c:forEach>
	</table>
	
	<h2>Players</h2>
	<table>
		<tr>
			<th>ID</th>
			<th>PLAYER NAME</th>
			<th>STATUS</th>
		</tr>
		<c:forEach var="player" items="${playerList}">
			<tr>
				<td>${player.id}</td>
				<td>${player.name}</td>
				<td>${player.status}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>