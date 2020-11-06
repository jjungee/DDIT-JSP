<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%
	String message = "Good day!";
	// 내장객체의 Attribute setting
// 	pageContext.setAttribute("message", "배고파요");
// 	request.setAttribute("message", "뭐건 닥치는대로 먹을거야!");
// 	session.setAttribute("message", "뭐먹을까");
	application.setAttribute("message", message);
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	
	<body>
		<ul>
			<li> 스크립틀릿 : <%out.print(message); %></li>
			<li> 표현식 : <%=message %></li>
			<li> EL : ${message}</li>
		</ul>
	</body>
</html>