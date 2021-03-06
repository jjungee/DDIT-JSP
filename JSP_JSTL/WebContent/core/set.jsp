<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%-- <%pageContext.setAttribute("messatge", "안녕");%> --%>

<c:set var = "message" value = "안녕" scope = "page"/>
<c:set var = "message" value = "졸려" scope = "request"/>
<c:set var = "message" value = "배고파" scope = "session"/>
<c:set var = "message" value = "잘래" scope = "application"/>

<%-- <% pageContext.removeAttribute("message"); %> <!-- attribute는 남기고  value만 지움 --> --%>
<c:remove var="message" scope="page"/> 실제 attribute를 지움, scope를 안 주면 다 지워짐 remove를 제외한 나머지는 scope의 기본값이 page

<h1>${requestScope.message}</h1>