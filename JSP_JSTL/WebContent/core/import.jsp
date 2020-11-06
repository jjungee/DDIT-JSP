<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

		<!-- header -->
		<c:import url="/core/include/header.jsp" var="head">
			<c:param name="message" value="안녕"/>
			<c:param name="title" value="회원가입"></c:param>
		</c:import>
		
		<!-- body -->
		<h1>Google.com</h1>
		<div id="google">
<%-- 			<c:import url="https://www.google.com"/> --%>
		</div>
		
		<h1>naver.com</h1>
		<div id="naver">
<%-- 			<c:import url="https://www.naver.com"/> --%>
		</div>
		
		<!-- footer -->
		<c:import url="/core/include/footer.jsp"/>
