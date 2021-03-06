<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
					<!-- 합쳐지고 최소화된 최신 CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<style type="text/css">
			body {
				margin: 0;
				font: 14px/1.4 "Microsoft YaHei";
				background-color: #EDEFF0;
			}
			
			a {
				color: #50B6E5;
			}
			
			.constr {
				width: 1200px;
				margin-left: auto;
				margin-right: auto;
			}
			
			.regist-head {
				height: 60px;
				line-height: 60px;
				padding-left: 30px;
				background-color: #be3948;
				color: #fff;
				font-size: 18px;
			}
			
			.regist-body {
				min-height: 400px;
				padding: 100px 0;
				background-color: #fff;
			}
			
			.regist-main {
				width: 900px;
				margin-left: auto;
				margin-right: auto;
			}
			
			.regist-group {
				margin-top: 20px;
				overflow: hidden;
			}
			
			.regist-label {
				width: 70px;
				padding-top: 10px;
				float: left;
			}
			
			.regist-cell {
				display: table-cell;
				*display: inline-block;
				padding-top:10px;
			}
			
			.regist-input {
				height: 18px;
				line-height: 18px;
				width: 260px;
				padding: 10px 5px;
				margin: 0 10px 0 0;
				border: 1px solid #d0d6d9;
				vertical-align: top;
			}
			
			.regist-code-input {
				width: 130px;
			}
			
			.regist-btn {
				display: inline-block;
				width: 160px;
				line-height: 40px;
				background-color: #39b94e;
				color: #fff;
				text-align: center;
				text-decoration: none;
			}
			
			.regist-btn:hover {
				background-color: #33a646;
			}
			
			.icon-warn {
				display: inline-block;
				width: 20px;
				height: 21px;
				background: url(http://img.mukewang.com/5453084a00016ae300120012.gif)
					no-repeat center;
			}
			
			.regist-star {
				position: absolute;
				margin-left: -1em;
				font-family: simsun;
				color: #f30;
			}
			
			.regist-remark {
				position: absolute;
				line-height: 21px;
				padding-top: 9px;
				color: #666;
			}
			
			.regist-warn {
				padding-left: 20px;
				color: #be3948;
			}
			
			.regist-warn>.icon-warn {
				position: absolute;
				margin-left: -20px;
			}
		</style>
	</head>

	<body>
	
		<div class="constr">
			<div class="regist-head">회원리스트</div>
			<div class="regist-body">
				<div class="regist-main">
					<table class="table table-bordered">
						<tr class="text-center">
							<td>아이디</td>
							<td>비밀번호</td>
							<td>이름</td>
							<td>이메일</td>
							<td>전화번호</td>
						</tr>
	
						<c:forEach var="member" items="${memberList }">
							<tr>
								<td><a href="detail?id=${member.id }">${member.id }</a></td>
								<td>${member.pwd }</td>
								<td>${member.name }</td>
								<td>${member.phone }</td>
								<td>${member.email }</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>