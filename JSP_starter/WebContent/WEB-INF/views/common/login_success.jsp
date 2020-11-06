<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>


<script type="text/javascript">
	alert("<%=request.getAttribute("message")%>");
	${requestScope.message}
	location.href="<%=request.getContextPath()%>/common/login";
</script>