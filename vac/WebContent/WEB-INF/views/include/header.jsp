<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="decorator"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">

<title><decorator:title default="Voice Act" /></title>


<!-- Font Awesome Icons -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/bootstrap/plugins/fontawesome-free/css/all.min.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/bootstrap/dist/css/adminlte.min.css">
<!-- Google Font: Source Sans Pro -->
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700"
	rel="stylesheet">


<decorator:head />
</head>
<body class="hold-transition sidebar-mini">
	<div class="wrapper">
		<!-- Navbar -->
		<nav class="navbar navbar-expand-md navbar-light navbar-white">
			<div class="container">
				<a href="<%=request.getContextPath() %>/" class="navbar-brand"> <span
					class=" font-weight-bold brand-text font-weight-light text-black-50"><i class="fas fa-microphone-alt"></i>&nbsp;&nbsp;VoiceActing</span>
				</a>

				<button class="navbar-toggler order-1" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse order-3" id="navbarCollapse">
					<!-- Left navbar links -->
					<ul class="navbar-nav">
						<li class="nav-item"><a href="index3.html" class="nav-link">menu1</a>
						</li>
						<li class="nav-item"><a href="#" class="nav-link">menu2</a>
						</li>
						<li class="nav-item dropdown"><a id="dropdownSubMenu1"
							href="#" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false" class="nav-link dropdown-toggle">menu3</a>
							<ul aria-labelledby="dropdownSubMenu1"
								class="dropdown-menu border-0 shadow">
								<li><a href="#" class="dropdown-item">Some action </a></li>
								<li><a href="#" class="dropdown-item">Some other action</a></li>

								<li class="dropdown-divider"></li>

								<!-- Level two dropdown-->
								<li class="dropdown-submenu dropdown-hover"><a
									id="dropdownSubMenu2" href="#" role="button"
									data-toggle="dropdown" aria-haspopup="true"
									aria-expanded="false" class="dropdown-item dropdown-toggle">Hover
										for action</a>
									<ul aria-labelledby="dropdownSubMenu2"
										class="dropdown-menu border-0 shadow">
										<li><a tabindex="-1" href="#" class="dropdown-item">level
												2</a></li>

										<!-- Level three dropdown-->
										<li class="dropdown-submenu"><a id="dropdownSubMenu3"
											href="#" role="button" data-toggle="dropdown"
											aria-haspopup="true" aria-expanded="false"
											class="dropdown-item dropdown-toggle">level 2</a>
											<ul aria-labelledby="dropdownSubMenu3"
												class="dropdown-menu border-0 shadow">
												<li><a href="#" class="dropdown-item">3rd level</a></li>
												<li><a href="#" class="dropdown-item">3rd level</a></li>
											</ul></li>
										<!-- End Level three -->

										<li><a href="#" class="dropdown-item">level 2</a></li>
										<li><a href="#" class="dropdown-item">level 2</a></li>
									</ul></li>
								<!-- End Level two -->
							</ul></li>
					</ul>

					<!-- SEARCH FORM -->
					<form class="form-inline ml-0 ml-md-3">
						<div class="input-group input-group-sm">
							<input class="form-control form-control-navbar" type="search"
								placeholder="Search" aria-label="Search">
							<div class="input-group-append">
								<button class="btn btn-navbar" type="submit">
									<i class="fas fa-search"></i>
								</button>
							</div>
						</div>
					</form>
				</div>

				<!-- Right navbar links -->
				<ul class="order-1 order-md-3 navbar-nav navbar-no-expand ml-auto">
					<!-- Messages Dropdown Menu -->
					<li class="nav-item dropdown"><a class="nav-link"
						data-toggle="dropdown" href="#"> <i class="fas fa-comments"></i>
							<span class="badge badge-danger navbar-badge">3</span>
					</a>
						<div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
							<a href="#" class="dropdown-item"> <!-- Message Start -->
								<div class="media">
									<img src="../../dist/img/user1-128x128.jpg" alt="User Avatar"
										class="img-size-50 mr-3 img-circle">
									<div class="media-body">
										<h3 class="dropdown-item-title">
											Brad Diesel <span class="float-right text-sm text-danger"><i
												class="fas fa-star"></i></span>
										</h3>
										<p class="text-sm">Call me whenever you can...</p>
										<p class="text-sm text-muted">
											<i class="far fa-clock mr-1"></i> 4 Hours Ago
										</p>
									</div>
								</div> <!-- Message End -->
							</a>
							<div class="dropdown-divider"></div>
							<a href="#" class="dropdown-item"> <!-- Message Start -->
								<div class="media">
									<img src="../../dist/img/user8-128x128.jpg" alt="User Avatar"
										class="img-size-50 img-circle mr-3">
									<div class="media-body">
										<h3 class="dropdown-item-title">
											John Pierce <span class="float-right text-sm text-muted"><i
												class="fas fa-star"></i></span>
										</h3>
										<p class="text-sm">I got your message bro</p>
										<p class="text-sm text-muted">
											<i class="far fa-clock mr-1"></i> 4 Hours Ago
										</p>
									</div>
								</div> <!-- Message End -->
							</a>
							<div class="dropdown-divider"></div>
							<a href="#" class="dropdown-item"> <!-- Message Start -->
								<div class="media">
									<img src="../../dist/img/user3-128x128.jpg" alt="User Avatar"
										class="img-size-50 img-circle mr-3">
									<div class="media-body">
										<h3 class="dropdown-item-title"> Nora Silvester 
											<span class="float-right text-sm text-warning">
												<i class="fas fa-star"></i>
											</span>
										</h3>
										<p class="text-sm">The subject goes here</p>
										<p class="text-sm text-muted">
											<i class="far fa-clock mr-1"></i> 4 Hours Ago
										</p>
									</div>
								</div> <!-- Message End -->
							</a>
							<div class="dropdown-divider"></div>
							<a href="#" class="dropdown-item dropdown-footer">See All Messages</a>
						</div>
					</li>
					<!-- Notifications Dropdown Menu -->
					<li class="nav-item dropdown">
						<a class="nav-link" data-toggle="dropdown" href="#"> <i class="far fa-bell"></i> 
							<span class="badge badge-warning navbar-badge">15</span>
						</a>
						<div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
							<span class="dropdown-header">15 Notifications</span>
							<div class="dropdown-divider"></div>
							<a href="#" class="dropdown-item"> <i
								class="fas fa-envelope mr-2"></i> 4 new messages <span
								class="float-right text-muted text-sm">3 mins</span>
							</a>
							<div class="dropdown-divider"></div>
							<a href="#" class="dropdown-item"> <i
								class="fas fa-users mr-2"></i> 8 friend requests <span
								class="float-right text-muted text-sm">12 hours</span>
							</a>
							<div class="dropdown-divider"></div>
							<a href="#" class="dropdown-item"> <i
								class="fas fa-file mr-2"></i> 3 new reports <span
								class="float-right text-muted text-sm">2 days</span>
							</a>
							<div class="dropdown-divider"></div>
							<a href="#" class="dropdown-item dropdown-footer">See All
								Notifications</a>
						</div>
					</li>
					<li class="nav-item dropdown">
						<c:if test="${not empty loginUser }">
							<a class="nav-link" data-toggle="dropdown" href="#"> 
								<div class="img-circle ml-1 " id="pictureView" style="background-image:url(<%=request.getContextPath() %>/member/getPicture.do?picture=${loginUser.picture}); background-position:center;
								  background-size:cover; background-repeat:no-repeat; border: 1px solid green; height: 30px; width: 30px; margin: 0 auto; margin-bottom:5px;"></div>
							</a>
							<div class="dropdown-menu dropdown-menu dropdown-menu-right">
								<a href="<%= request.getContextPath() %>/member/main.do" class="dropdown-item"> 
									<i class="fas fa-user-alt mr-2"></i> profile
								</a>
								<div class="dropdown-divider"></div>
								<a href="<%= request.getContextPath() %>/common/logout.do" class="dropdown-item"> 
									<i class="fas fa-sign-out-alt mr-2 "></i> logout
								</a>
							</div>
						</c:if> 
						
						<c:if test="${empty loginUser }">
							<a class="nav-link" href="<%=request.getContextPath()%>/common/loginForm.do"> 
								<i class="fas fa-sign-in-alt"></i> login
							</a>
						</c:if>
					</li>
				</ul>
			</div>
		</nav>
		<!-- /.navbar -->