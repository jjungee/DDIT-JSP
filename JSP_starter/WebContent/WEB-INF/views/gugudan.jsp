<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	
	<body>
		<%
		int dan = 2; 
		dan = Integer.parseInt(request.getParameter("dan"));
		%>
		
		<h1><%=dan%>단</h1>
		
		<%
		for(int num2 = 1 ; num2 <= 9 ; num2++){
		%>
		
		<%=dan%> * <%=num2%> = <%=dan * num2 %>
		<br>
		
		<%
		}
		%>
	</body>
</html>