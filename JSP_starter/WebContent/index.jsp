<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

		<%!
			String message = "대덕인재개발원";
		%>

<script type="text/javascript">
	alert("<%=getMessage()%>")
	location.href="<%=request.getContextPath()%>/gugudan.html?color=bc0718";
</script>

	<%!
		public String getMessage(){
			return message;
		}
	%>