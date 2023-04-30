<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Create Order</title>
</head>
<body>

<h1>Create Order</h1>

<form:form action="store_order" method="POST" modelAttribute="orderDto">
    <label for="customer">Select Customer:</label>
    <form:select path="customer.id" id="customer">
        <c:forEach items="${orderDto.customers}" var="customer">
            <form:option value="${customer.id}" label="${customer.user.fullName}"/>
        </c:forEach>
    </form:select>

    <br><br>
    <label for="product">Select Product:</label>
    <form:select path="product">
        <c:forEach items="${orderDto.product}" var="product">
            <form:option value="${product.id}" label="${product.name}"/>
        </c:forEach>
    </form:select>

    <button type="submit">Submit Order</button>
</form:form>


</body>
</html>
