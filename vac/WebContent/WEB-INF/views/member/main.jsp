<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>


<body>
	<div class="container" style="min-height: 700px;">
		<h1>마이페이지</h1>
		<div class="row">
		<div class="col-4">
            <div class="text-center mt-5">
              <div class="row">					
					<input type="hidden" name="oldPicture" value="${member.picture }" />
					<input type="file" id="inputFile" name="picture" style="display:none" onchange="imageChange_go();"/>
					<div class="input-group col-md-12">
						<div class="col-md-12" style="text-align: center;">
							<div class="" id="pictureView" style="background-image:url(<%=request.getContextPath() %>/member/getPicture.do?picture=${loginUser.picture}); background-position:center;
							  background-size:cover;
							  background-repeat:no-repeat;
							  border: 1px solid green; height: 230px; width: 230px; margin: 0 auto; margin-bottom:5px;"></div>														
						</div>												
					</div>
				</div>	
            </div>
		</div>
			<div class="col-8">
	            <div class="table-responsive mt-5">
	              <table class="table">
	                <tbody><tr>
	                  <th style="width:50%">ID</th>
	                  <td>${loginUser.id }</td>
	                </tr>
	                <tr>
	                  <th>PASSWORD</th>
	                  <td>${loginUser.pwd }</td>
	                </tr>
	                <tr>
	                  <th>NAME</th>
	                  <td>${loginUser.name }</td>
	                </tr>
	                <tr>
	                  <th>PHONE</th>
	                  <td>${loginUser.phone }</td>
	                </tr>
	                <tr>
	                  <th>EMAIL</th>
	                  <td>${loginUser.email }</td>
	                </tr>
	              </tbody></table>
	            </div>
			</div>
		</div>
        <div class="row">
        	<div class="col-9"></div>
        	<div class="col-3 pl-3 bn">
	          <a href="<%=request.getContextPath()%>/member/modifyForm.do?id=${loginUser.id}"><button type="button" class="btn btn-outline-primary btn-sm ml-5" style="width: 90px">정보 수정</button></a>
	         <a href="<%=request.getContextPath()%>/member/remove.do?id=${loginUser.id}"> <button type="button" class="btn btn-outline-primary btn-sm mt-0 mb-0 ml-2" style="width: 90px">탈퇴</button></a>
        	</div>
        </div>
	</div>
</body>