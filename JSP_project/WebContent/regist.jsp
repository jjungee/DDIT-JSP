<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%request.setCharacterEncoding("UTF-8"); %>

아이디 : <%=request.getParameter("id")%>
비밀번호 : <%=request.getParameter("pwd")%>
이름 : <%=request.getParameter("name")%>
이메일 : <%=request.getParameter("email")%>
전화번호 : <%=request.getParameter("phone")%>