<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<!-- Bootstrap styles -->
<link href="<c:url value="assets/user/css/bootstrap.css"/>"
	rel="stylesheet" />
<!-- Customize styles -->
<link href="<c:url value="assets/user/style.css"/>" rel="stylesheet" />
<!-- font awesome styles -->
<link
	href="<c:url value="assets/user/font-awesome/css/font-awesome.css"/>"
	rel="stylesheet">

<!-- Favicons -->
<link rel="shortcut icon"
	href="<c:url value="assets/user/ico/favicon.ico"/>">
</head>
<body>
	<div class="container"></div>
	<div id="gototop"></div>

	<!--
Navigation Bar Section 
-->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container">
				<a data-target=".nav-collapse" data-toggle="collapse"
					class="btn btn-navbar"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a>
				<div class="nav-collapse">
					<ul class="nav">
						<li class="active"><a href="home">Home </a></li>
						<li class=""><a href="product">Product</a></li>
						<li class=""><a href="about">About us</a></li>
						<li class=""><a href="contact">Contact</a></li>
						<li class=""><a href="cart"><img
								src="<c:url value="assets/user/img/shopping-cart.png" />"
								width="20px" /> </a></li>
					</ul>
					<form action="#" class="navbar-search pull-left">
						<input type="text" placeholder="Search" class="search-query span2">
					</form>
					<ul class="nav pull-right">
						<li class="dropdown"><a data-toggle="dropdown"
							class="dropdown-toggle" href="#"><span class="icon-lock"></span>
								Login <b class="caret"></b></a>
							<div class="dropdown-menu">
								<form class="form-horizontal loginFrm">
									<div class="control-group">
										<input type="text" class="span2" id="inputEmail"
											placeholder="Email">
									</div>
									<div class="control-group">
										<input type="password" class="span2" id="inputPassword"
											placeholder="Password">
									</div>
									<div class="control-group">
										<label class="checkbox"> <input type="checkbox">
											Remember me
										</label>
										<button type="submit" class="shopBtn btn-block">Sign
											in</button>
									</div>
								</form>
							</div></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<h1>BackEnd - Hoang Dat</h1>
	<h1>FontEnd - </h1>
	<h1>Bao cao - Nguyen The Vinh</h1>
	<div class="copyright">
		<div class="container">
			<p class="pull-right">
				<a href="#"><img
					src="<c:url value="assets/user/img/maestro.png"/>" alt="payment"></a>
				<a href="#"><img src="<c:url value="assets/user/img/mc.png"/>"
					alt="payment"></a> <a href="#"><img
					src="<c:url value="assets/user/img/pp.png"/>" alt="payment"></a>
				<a href="#"><img src="<c:url value="assets/user/img/visa.png"/>"
					alt="payment"></a> <a href="#"><img
					src="<c:url value="assets/user/img/disc.png"/>" alt="payment"></a>
			</p>
			<span>Copyright &copy; 2013<br> bootstrap ecommerce
				shopping template
			</span>
		</div>
	</div>
	<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="<c:url value="assets/user/js/jquery.js"/>"></script>
	<script src="<c:url value="assets/user/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="assets/user/js/jquery.easing-1.3.min.js"/>"></script>
	<script
		src="<c:url value="assets/user/js/jquery.scrollTo-1.4.3.1-min.js"/>"></script>
	<script src="<c:url value="assets/user/js/shop.js"/>"></script>
</body>
</html>