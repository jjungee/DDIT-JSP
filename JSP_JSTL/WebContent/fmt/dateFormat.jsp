<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="today" value="<%=new Date() %>"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	
	<body>
		<h1 id="time"></h1>
		<h1 id="currentTime"></h1>
		<h1>server request time : <fmt:formatDate value="${today }" pattern="yyyy-MM-dd HH:mm:dd"/></h1>
	
<%-- 		<h1><fmt:formatDate value="${today }" pattern="yyyy-MM=dd HH:mm:dd"/> </h1> <!-- 대문자 D는 요일  HH는 24시간 형식 hh는 12시간 형식--> --%>
		<script type="text/javascript">
			var today=new Date(${today.time});	/* 서버시간 */
			
			var time = setInterval(function(){
				today.setTime(today.getTime()+1000);
				var todayStr = today.getFullYear()+"-"+(today.getMonth()+1)+"-"+today.getDate() + " "
				+ today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
				
				document.getElementById("time").innerHTML=todayStr;
			}, 1000)
			
			var current = setInterval(function(){
				var currentTime = new Date();
				var currentStr = today.getFullYear()+"-"+(today.getMonth()+1)+"-"+today.getDate() + " "
				+ today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
				
				document.getElementById("currentTime").innerHTML=currentStr
				})
		</script>
	</body>
</html>