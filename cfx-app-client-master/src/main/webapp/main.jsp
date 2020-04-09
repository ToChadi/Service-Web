<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%@ page import ="java.util.List"%>

		<%
		 List<fr.insa.service.Product> p1 = (new fr.insa.client.MyClass()).searchResult(request.getParameter("libelle"),request.getParameter("category"));
		%>

	<div>
		Product Search : <%= p1 %>
	</div>
</body>
</html>