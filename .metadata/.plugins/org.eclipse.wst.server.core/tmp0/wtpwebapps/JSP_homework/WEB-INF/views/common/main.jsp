<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<body>
<div class="content-wrapper">
		<div class="content-header">
			<p>${loginUser.name} 님 환영합니다.</p>
			<h1>main</h1>
		</div>
		
		<div class="content">
			<h1>body</h1>
			<button type="button" onclick="logout_go();">로그아웃</button>
			
		</div>
	</div>



<script>
	function logout_go() {
		if(confirm("로그아웃 합니다.")){
			location.href="<%=request.getContextPath()%>/common/logout";
		}
	}
</script>		

</body>