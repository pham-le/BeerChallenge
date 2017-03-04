<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Beer Challenge - Power Hour, Configure</title>
</head>

<body>
<h1>Welcome, ${teamName}!</h1>

<p>Please enter player names: </p>
		
		<!-- REMINDER: Update name of forms on all pages.. -->
		<form name='X' action='/configure' method='POST'> 
				
		<%
		   for (int i = 1; i <= 3; i++) {
		%>
			<label name="players[]">Player <%=i%>: </label>
			<input name="players[]" type="text" /> <br />
		
		<% } %>
		<input type="submit"> </form>

</body>

</html>