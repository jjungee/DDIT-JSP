<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
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
				width: 600px;
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
		<form name="form" action="login" method="post">
	
			<div class="constr">
				<div class="regist-head">로그인</div>
				<div class="regist-body">
					<div class="regist-main">
	
						<div class="regist-group">
							<label class="regist-label">아이디</label>
							<div class="regist-cell">
								<input type="text" name="id" class="regist-input">
							</div>
						</div>
						<div class="regist-group">
							<label class="regist-label">비밀번호</label>
							<div class="regist-cell">
								<input type="password" name="pwd" class="regist-input">
							</div>
						</div>
	
						<div class="regist-group">
							<div>
								<input type="button" value="로그인" class="regist-btn">
							</div>
						</div>
					</div>
	
				</div>
			</div>
		</form>
	</body>
	<script type="text/javascript">
		document.querySelector('form[action="login"] input[type="button"]').onclick = function(event) {
	
			document.form.submit();
		};
		
		<c:if test="${!empty message }">
			alert("${message}");
		</c:if>
	</script>
</html>