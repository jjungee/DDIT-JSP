<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>


<body>
	<div class="container" style="min-height: 700px;">
		<form role="form" class="form-horizontal" action="modify.do" method="post" enctype="multipart/form-data">	
		<h1>마이페이지</h1>
		<div class="row">
			<div class="col-4">
				<div class="text-center mt-5">
					<div class="row">
						<input type="hidden" name="oldPicture" value="${member.picture }" />
						<input type="file" id="inputFile" name="picture"
							style="display: none" onchange="imageChange_go();" />
						<div class="input-group col-md-12">
							<div class="col-md-12" style="text-align: center;">
								<div class="" id="pictureView"
									style="background-image:url(<%=request.getContextPath() %>/member/getPicture.do?picture=${loginUser.picture}); background-position:center;
										  background-size:cover;
										  background-repeat:no-repeat;
										  border: 1px solid green; height: 230px; width: 230px; margin: 0 auto; margin-bottom:5px;"></div>
							</div>
							<div class="input-group input-group-sm">
								<label for="inputFile" class=" btn btn-outline-info btn-sm input-group-addon">사진변경</label>
								<input id="inputFileName" class="form-control" type="text" name="tempPicture" disabled/>
								<input id="picture" class="form-control" type="hidden" name="uploadPicture" />
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-8">
				<div class="table-responsive mt-5">
					<table class="table">
						<tbody>
							<tr>
								<th style="width: 50%">ID</th>
								<td><input value="${loginUser.id }" type="hidden" name="id">${loginUser.id }</td>
							</tr>
							<tr>
								<th>PASSWORD</th>
								<td><input value="${loginUser.pwd }" type="password" name="pwd"></td>
							</tr>
							<tr>
								<th>NAME</th>
								<td><input value="${loginUser.name }" type="text" name="name"></td>
							</tr>
							<tr>
								<th>PHONE</th>
								<td><input value="${loginUser.phone }" type="tel" name="phone"></td>
							</tr>
							<tr>
								<th>EMAIL</th>
								<td><input value="${loginUser.email }" type="text" name="email"></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-9"></div>
			<div class="col-3 pl-3 bn">
			<button id="modifyBtn"
						type="button" class="btn btn-outline-primary btn-sm ml-5"
						style="width: 90px">수정 완료</button>
			</div>
		</div>
		</form>
	</div>
	
	<%@ include file="modify_js.jsp"%>

</body>