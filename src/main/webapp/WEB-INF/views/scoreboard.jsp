<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<% pageContext.setAttribute("newLine", "\n"); %>
<% pageContext.setAttribute("tab", "\t"); %>


<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Beer Challenge - Power Hour, Scoreboard</title>
</head>

<body>

  <body>
  	<h1>Scoreboard</h1>
  
    <p>Current Time: <c:out value="${now}"/></p>
    
    <p>Teams:</p>
    <c:forEach var="game" items="${gameList}" >
		<p>${fn:replace(game, newLine,"<br />")}</p>
    </c:forEach>
    
  </body>
</html>