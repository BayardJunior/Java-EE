<%@page import="entity.Product"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Produtos</title>
</head>
<body>
<h1>Lista de Produtos</h1>

<%
Collection<Product> products = (Collection<Product>) request.getAttribute("products");
%>

<table border="1" width="100%">
<tr>
	<td align="center"><strong>Produto</strong></td>	
	<td align="center"><strong>Valor</strong></td>	
	<td align="center"></td>	
</tr>
<% for(Product p : products){ %>
<tr>
	<td align="center"><%=p.getName() %></td>
	<td align="center"><%=p.getValue() %></td>
	<td align="center"><a href="Add?id<%=p.getId()%>">Add</a></td>
</tr>
	<%}%>
</table>

</body>
</html>