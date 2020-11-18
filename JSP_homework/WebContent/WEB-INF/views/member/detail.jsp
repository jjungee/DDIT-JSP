<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


	
	<body>
		<div class="constr container">
			<div class="regist-head">${member.name}님의 회원정보</div>
			<div class="regist-body">
				<div class="regist-main">
					<table class="table">
						<tr>
							<td>아이디</td>
							<td>${member.id}</td>
						</tr>
						<tr>
							<td>비밀번호</td>
							<td>${member.pwd}</td>
						</tr>
						<tr>
							<td>이름</td>
							<td>${member.name}</td>
						</tr>
						<tr>
							<td>이메일</td>
							<td>${member.email}</td>
						</tr>
						<tr>
							<td>전화번호</td>
							<td>${member.phone}</td>
						</tr>
					</table>
					
					<div class="regist-group">
						<div class="regist-cell">
							<button type="button" class="btn btn-outline-danger btn-sm" onclick="location.href='<%=request.getContextPath()%>/member/list.do'">목록으로</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
