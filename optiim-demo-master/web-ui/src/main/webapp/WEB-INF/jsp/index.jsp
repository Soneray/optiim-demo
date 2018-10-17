<%@page import="com.soneray.webui.domain.Product"%>
<%@page import="com.soneray.webui.domain.Account"%>
<%@page import="org.springframework.web.client.RestTemplate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%	
	Account account = new RestTemplate().getForObject("http://localhost:8080/account/" + 1, Account.class);	
	Product product = new RestTemplate().getForObject("http://localhost:8080/product/" + 1, Product.class);
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Optiim Demo</title>
</head>
<body>
	<table id="customers">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Product</th>
		</tr>
		<tr>
			<td><%=account.getId() %></td>
			<td><%=account.getName() %></td>
			<td><%=product.getName()%></td> 
		</tr>		
	</table>
</body>
<style>
#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 50%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}
</style>
</html>