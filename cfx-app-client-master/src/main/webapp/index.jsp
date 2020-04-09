<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%
		fr.insa.service.Product p = (new fr.insa.client.MyClass()).getResult();
	%>
	
		<%
		String p1 = (new fr.insa.client.MyClass()).searchResult("Bannana","Fruits").toString();
	%>

	<div>
		Product Id :<%= p.getProductId()%></div>
	<div>
		Product Name :<%= p.getProductName()%></div>
	<div>
		Product Cat :<%= p.getProductCatg()%></div>
	<div>
		Product Search : <%= p1 %>
	</div>
</body>
</html>