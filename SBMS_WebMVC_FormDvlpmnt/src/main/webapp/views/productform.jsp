<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h1>Save Products
<form:form action="saveProductDetails" modelAttribute="product" method="POST">
<table>
<tr>
<td>Product Id  :</td>
<td><form:input path="productId"/></td>
</tr>
<tr>
<td>Product Name :</td>
<td><form:input path="productName"/></td>
</tr>
<tr>
<td>Product Price :</td>
<td><form:input path="productPrice"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Save"/></td>
</tr>
</table>
</form:form>
</h1></center>
</body>
</html>