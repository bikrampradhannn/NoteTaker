<!doctype html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, shrink-to-fit=no">

<title>NoteTaker: HomePage</title>

<%@include file="all_js_css.jsp"%>

<!-- Inline CSS for background image -->
<style>
body {
	background-image: url("img/index.jpg");
	background-size: cover;
	background-position: center;
	background-repeat: no-repeat;
}

.start-heading {
	margin-top: 3rem;
	color: black;
	text-transform: uppercase;
	text-align: left;
}

.btn-container {
	margin-top: 2rem;
	text-align: center;
}
</style>
</head>

<body>
	<div class="container-fluid p-0 m-0">
		<%@include file="navbar.jsp"%>

		<br>

		<!-- Main content -->
		<div class="container">
			<h1 class="start-heading glow-text">Start Taking Your Notes :)</h1>



		</div>

		<!-- Add this to your style section -->
		<style>
.glow-text {
	color: #fff;
	text-shadow: 0 0 10px #fff, 0 0 20px #ff00ff, 0 0 30px #ff00ff, 0 0 40px
		#ff00ff, 0 0 70px #ff00ff, 0 0 80px #ff00ff, 0 0 100px #ff00ff;
	font-size: 3rem;
}

.start-heading {
	margin-top: 3rem;
	text-transform: uppercase;
	text-align: left;
}
</style>


	</div>
</body>

</html>
