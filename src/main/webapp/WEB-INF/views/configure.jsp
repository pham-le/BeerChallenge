<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Beer Challenge - Power Hour, Configure</title>
</head>

<body>
<h1>Welcome, <c:out value="${teamName}"/>!</h1>

<p>Please enter player names: </p>
		
		<!-- REMINDER: Update name of forms on all pages.. -->
		<form name="" action="/configure" method="POST"> 
				
		<% 
		for (int i = 1; i <= 3; i++) { %>
				<label name="players[]">Player <%=i%>: </label>
				<input name="players[]" type="text" /> <br />
		
		<% } %>
		<input type="submit"> </form> <font color=red><c:out value="${pnameError}"/></font>

</body>

</html>