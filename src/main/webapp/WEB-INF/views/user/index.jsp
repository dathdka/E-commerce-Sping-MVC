<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h1> ${ TrangThai }</h1>
	<div class="container">
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
							<c:choose>
								<c:when test="${user == null }">
									<li class=""><a href="/DiamonShop/login">Login</a></li>
									<li class=""><a href="/DiamonShop/register">Register</a></li>
								</c:when>
								<c:when test="${user != null }">
									<li class=""><a href="/DiamonShop/profile">${user}</a></li>
									<li class=""><a href="/DiamonShop/logout">Logout</a></li>
									<li class=""><a href="cart"><img
									src="<c:url value="assets/user/img/shopping-cart.png" />"
									width="20px" /> </a></li>
								</c:when>
							</c:choose>
						</ul>
						<form action="#" class="navbar-search pull-left">
							<input type="text" placeholder="Search"
								class="search-query span2">
						</form>
					</div>
				</div>
			</div>
		</div>
		<!-- 
Body Section 
-->

		<div class="row">
			<div id="sidebar" class="span3">
				<div class="well well-small">
					<ul class="nav nav-list">
						<c:forEach var="item" items="${ LoaiSP }">
							<li><a href="<c:url value="/product/${item.malsp }"/>"><span
									class="icon-circle-blank"></span>${item.tenlsp }</a></li>
							<li>
						</c:forEach>
					</ul>
				</div>
			</div>
			<div class="span9">
				<div class="well np">
					<div id="myCarousel" class="carousel slide homCar">
						<div class="carousel-inner">
							<c:forEach var="item" items="${ slides }" varStatus="index">
								<c:if test="${ index.first }">
									<div class="item active">
								</c:if>
								<c:if test="${ not index.first }">
									<div class="item">
								</c:if>
								<img style="width: 100%"
									src="<c:url value="/assets/user/img/slide/${ item.img }"/>"
									alt="bootstrap ecommerce templates">
								<div class="carousel-caption">
									<h4>${ item.caption }</h4>
									<p>
										<span>${ item.content }</span>
									</p>
								</div>
						</div>
						</c:forEach>
					</div>
				</div>
			</div>
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
			<a class="right carousel-control" href="#myCarousel"
				data-slide="next">&rsaquo;</a>
		</div>
	</div>
	<!--
New Products
-->
	<div class="well well-small">
		<h3>New Products</h3>
		<hr class="soften" />
		<div class="row-fluid">
			<div id="newProductCar" class="carousel slide">
				<div class="carousel-inner">
					<div class="item active">
						<ul class="thumbnails">
							<li class="span3">
								<div class="thumbnail">
									<a class="zoomTool" href="product_details.html"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="#" class="tag"></a> <a
										href="product_details.html"><img
										src="<c:url value="assets/user/img/bootstrap-ring.png"/>"
										alt="bootstrap-ring"></a>
								</div>
							</li>
							<li class="span3">
								<div class="thumbnail">
									<a class="zoomTool" href="product_details.html"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="#" class="tag"></a> <a
										href="product_details.html"><img
										src="<c:url value="assets/user/img/i.jpg"/>" alt=""></a>
								</div>
							</li>
							<li class="span3">
								<div class="thumbnail">
									<a class="zoomTool" href="product_details.html"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="#" class="tag"></a> <a
										href="product_details.html"><img
										src="<c:url value="assets/user/img/g.jpg"/>" alt=""></a>
								</div>
							</li>
							<li class="span3">
								<div class="thumbnail">
									<a class="zoomTool" href="product_details.html"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="product_details.html"><img
										src="<c:url value="assets/user/img/s.png"/>" alt=""></a>
								</div>
							</li>
						</ul>
					</div>
					<div class="item">
						<ul class="thumbnails">
							<li class="span3">
								<div class="thumbnail">
									<a class="zoomTool" href="product_details.html"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="product_details.html"><img
										src="<c:url value="assets/user/img/i.jpg"/>" alt=""></a>
								</div>
							</li>
							<li class="span3">
								<div class="thumbnail">
									<a class="zoomTool" href="product_details.html"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="product_details.html"><img
										src="<c:url value="assets/user/img/f.jpg"/>" alt=""></a>
								</div>
							</li>
							<li class="span3">
								<div class="thumbnail">
									<a class="zoomTool" href="product_details.html"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="product_details.html"><img
										src="<c:url value="assets/user/img/h.jpg"/>" alt=""></a>
								</div>
							</li>
							<li class="span3">
								<div class="thumbnail">
									<a class="zoomTool" href="product_details.html"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="product_details.html"><img
										src="<c:url value="assets/user/img/j.jpg"/>" alt=""></a>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<a class="left carousel-control" href="#newProductCar"
					data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
					href="#newProductCar" data-slide="next">&rsaquo;</a>
			</div>
		</div>
		<div class="row-fluid">
			<ul class="thumbnails">
				<li class="span4">
					<div class="thumbnail">

						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <a href="product_details.html"><img
							src="<c:url value="assets/user/img/b.jpg"/>" alt=""></a>
						<div class="caption cntr">
							<p>Manicure & Pedicure</p>
							<p>
								<strong> $22.00</strong>
							</p>
							<h4>
								<a class="shopBtn" href="#" title="add to cart"> Add to cart
								</a>
							</h4>
							<div class="actionList">
								<a class="pull-left" href="#">Add to Wish List </a> <a
									class="pull-left" href="#"> Add to Compare </a>
							</div>
							<br class="clr">
						</div>
					</div>
				</li>
				<li class="span4">
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <a href="product_details.html"><img
							src="<c:url value="assets/user/img/c.jpg"/>" alt=""></a>
						<div class="caption cntr">
							<p>Manicure & Pedicure</p>
							<p>
								<strong> $22.00</strong>
							</p>
							<h4>
								<a class="shopBtn" href="#" title="add to cart"> Add to cart
								</a>
							</h4>
							<div class="actionList">
								<a class="pull-left" href="#">Add to Wish List </a> <a
									class="pull-left" href="#"> Add to Compare </a>
							</div>
							<br class="clr">
						</div>
					</div>
				</li>
				<li class="span4">
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <a href="product_details.html"><img
							src="<c:url value="assets/user/img/a.jpg"/>" alt=""></a>
						<div class="caption cntr">
							<p>Manicure & Pedicure</p>
							<p>
								<strong> $22.00</strong>
							</p>
							<h4>
								<a class="shopBtn" href="#" title="add to cart"> Add to cart
								</a>
							</h4>
							<div class="actionList">
								<a class="pull-left" href="#">Add to Wish List </a> <a
									class="pull-left" href="#"> Add to Compare </a>
							</div>
							<br class="clr">
						</div>
					</div>
				</li>
			</ul>
		</div>
	</div>
	<!--
	Featured Products
	-->
	<div class="well well-small">
		<h3>
			<a class="btn btn-mini pull-right" href="products.html"
				title="View more">VIew More<span class="icon-plus"></span></a>
			Featured Products
		</h3>
		<hr class="soften" />
		<div class="row-fluid">
			<ul class="thumbnails">
				<li class="span4">
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <a href="product_details.html"><img
							src="<c:url value="assets/user/img/d.jpg"/>" alt=""></a>
						<div class="caption">
							<h5>Manicure & Pedicure</h5>
							<h4>
								<a class="defaultBtn" href="product_details.html"
									title="Click to view"><span class="icon-zoom-in"></span></a> <a
									class="shopBtn" href="#" title="add to cart"><span
									class="icon-plus"></span></a> <span class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li class="span4">
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <a href="product_details.html"><img
							src="<c:url value="assets/user/img/e.jpg"/>" alt=""></a>
						<div class="caption">
							<h5>Manicure & Pedicure</h5>
							<h4>
								<a class="defaultBtn" href="product_details.html"
									title="Click to view"><span class="icon-zoom-in"></span></a> <a
									class="shopBtn" href="#" title="add to cart"><span
									class="icon-plus"></span></a> <span class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li class="span4">
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <a href="product_details.html"><img
							src="assets/img/f.jpg" alt="" /></a>
						<div class="caption">
							<h5>Manicure & Pedicure</h5>
							<h4>
								<a class="defaultBtn" href="product_details.html"
									title="Click to view"><span class="icon-zoom-in"></span></a> <a
									class="shopBtn" href="#" title="add to cart"><span
									class="icon-plus"></span></a> <span class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
			</ul>
		</div>
	</div>

	<div class="well well-small">
		<a class="btn btn-mini pull-right" href="#">View more <span
			class="icon-plus"></span></a> Popular Products
	</div>
	<hr>
	<div class="well well-small">
		<a class="btn btn-mini pull-right" href="#">View more <span
			class="icon-plus"></span></a> Best selling Products
	</div>
	</div>
	</div>
	<!-- 
Clients 
-->
	<section class="our_client">
		<hr class="soften" />
		<h4 class="title cntr">
			<span class="text">Manufactures</span>
		</h4>
		<hr class="soften" />
		<div class="row">
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value="assets/user/img/1.png"/>"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value="assets/user/img/2.png"/>"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value="assets/user/img/3.png"/>"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value="assets/user/img/4.png"/>"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value="assets/user/img/5.png"/>"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value="assets/user/img/6.png"/>"></a>
			</div>
		</div>
	</section>

	<!--
Footer
-->
	<footer class="footer">
		<div class="row-fluid">
			<div class="span2">
				<h5>Your Account</h5>
				<a href="#">YOUR ACCOUNT</a><br> <a href="#">PERSONAL
					INFORMATION</a><br> <a href="#">ADDRESSES</a><br> <a href="#">DISCOUNT</a><br>
				<a href="#">ORDER HISTORY</a><br>
			</div>
			<div class="span2">
				<h5>Iinformation</h5>
				<a href="contact.html">CONTACT</a><br> <a href="#">SITEMAP</a><br>
				<a href="#">LEGAL NOTICE</a><br> <a href="#">TERMS AND
					CONDITIONS</a><br> <a href="#">ABOUT US</a><br>
			</div>
			<div class="span2">
				<h5>Our Offer</h5>
				<a href="#">NEW PRODUCTS</a> <br> <a href="#">TOP SELLERS</a><br>
				<a href="#">SPECIALS</a><br> <a href="#">MANUFACTURERS</a><br>
				<a href="#">SUPPLIERS</a> <br />
			</div>
			<div class="span6">
				<h5>The standard chunk of Lorem</h5>
				The standard chunk of Lorem Ipsum used since the 1500s is reproduced
				below for those interested. Sections 1.10.32 and 1.10.33 from "de
				Finibus Bonorum et Malorum" by Cicero are also reproduced in their
				exact original form, accompanied by English versions from the 1914
				translation by H. Rackham.
			</div>
		</div>
	</footer>
	</div>
	<!-- /container -->

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