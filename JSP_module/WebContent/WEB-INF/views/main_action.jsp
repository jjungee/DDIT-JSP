<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<jsp:include page="/WEB-INF/views/include/header.jsp">
	<jsp:param value="<%=URLEncoder.encode("메인페이지", "utf-8") %>" name="title"/>	
</jsp:include>

			<!-- Content Wrapper. Contains page content -->
			<div class="content-wrapper">
				<!-- Content Header (Page header) -->
				<div class="content-header">
					<div class="container-fluid">
						<div class="row mb-2">
							<div class="col-sm-6">
								<h1 class="m-0 text-dark">Main Action Page</h1>
							</div>
							<!-- /.col -->
							<div class="col-sm-6">
								<ol class="breadcrumb float-sm-right">
									<li class="breadcrumb-item"><a href="#">Home</a></li>
									<li class="breadcrumb-item active">Starter Page</li>
								</ol>
							</div>
							<!-- /.col -->
						</div>
						<!-- /.row -->
					</div>
					<!-- /.container-fluid -->
				</div>
				<!-- /.content-header -->
	
				<!-- Main content -->
				<div class="content">
					<div class="container-fluid">
						
						<div class="row">
							<div class="col-sm-3">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
							
							<div class="col-sm-3">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
							
							<div class="col-sm-3">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
							
							<div class="col-sm-3">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
						<!-- /.row -->
						</div>
						
						<div class="row">
							<div class="col-sm-4">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
							
							<div class="col-sm-8">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
						<!-- /.row -->
						</div>
						
						<div class="row">
							<div class="col-sm-6">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
							
							<div class="col-sm-6">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
						<!-- /.row -->
						</div>
						
						<div class="row">
							<div class="col-sm-2">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
							
							<div class="col-sm-2">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
							
							<div class="col-sm-2">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
							
							<div class="col-sm-2">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
							
							<div class="col-sm-2">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
							
							<div class="col-sm-2">
								<div class="card">
									<div class="card-header">header</div>
									<div class="card-body">body</div>
									<div class="card-footer">footer</div>
								<!-- /.card -->
								</div>
							</div>
							
						<!-- /.row -->
						</div>
						
					<!-- /.container-fluid -->
				</div>
				<!-- /.content -->
			</div>
			<!-- /.content-wrapper -->
		</div>
<jsp:include page="/WEB-INF/views/include/footer.jsp"/>

