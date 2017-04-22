<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/resources/table/style.css">
<script type="text/javascript" src="/resources/table/jquery-latest.js"></script>
<script type="text/javascript" src="/resources/table/jquery.tablesorter.js"></script>

<title>Beer Challenge - Power Hour, Scoreboard</title>
</head>

<body>
<body>
	<h1>Scoreboard</h1>

	<p>
		Current Time:
		<c:out value="${now}" />
	</p>
	<a href="/">Home</a>

	<p>Enter a specific team name of player name if you would like to
		see specific details:
	<form action="/scoreboard" method="POST">
		<input name="name" type="text" /> <select name="type">
			<option value="teamName">Team</option>
			<option value="playerName">Player</option>
		</select> <input type="submit" />
	</form>

	<h2>Teams</h2>

	<table id="teamTable" class="tablesorter">
		<thead>
			<tr>
				<th>ID</th>
				<th>Team Name</th>
				<th>Player Count</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="game" items="${gameList}">
				<tr>
					<td>${game.id}</td>
					<td>${game.teamName}</td>
					<td>${game.numPeople}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<h2>Players</h2>
	<table id="playerTable" class="tablesorter">
		<thead>
			<tr>
				<th>ID</th>
				<th>Player Name</th>
				<th>Status</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="player" items="${playerList}">
				<tr>
					<td>${player.id}</td>
					<td>${player.name}</td>
					<td>${player.status}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<script>
		$(document).ready(function() {
			$("#playerTable").tablesorter({
				sortList : [ [ 0, 0 ] ]
			});
			$("#teamTable").tablesorter({
				sortList : [ [ 0, 0 ] ]
			});
		});
	</script>

</body>
</html>