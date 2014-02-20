<!-- calls Customer Bean for the session -->
<jsp:useBean id="model" class="model.Customer" scope="session"/>
<jsp:useBean id="order" class="model.Order" scope="session"/>

<html>
<head>
	<title>Wacko Products</title>
	<link rel="stylesheet" href="assets/main.css">
</head>

<body>

<div class="container">

	<summary>
		<h1>WACKO FURNITURE</h1>
		<h2>If you're looking for tables, chairs, or couches, you've come to the right place.</h2>	
	</summary>