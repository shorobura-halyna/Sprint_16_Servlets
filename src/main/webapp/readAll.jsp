<%--
  Created by IntelliJ IDEA.
  User: halyna
  Date: 22.05.20
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>List of Records Address Book</title>
</head>
<body>
<a href="/home">Home Page</a> |
<a href="/records/create">Add new record</a> |
<a href="/records/list">Show all records</a>
<br>
<br>
Sort by: <a href="/records/list?sort=asc">ascending</a> | <a href="/records/list?sort=desc">descending</a>
<br>
<br>
<table border="1">
    <tr>
        <th>No.</th>
        <th>First name</th>
        <th>Last name</th>
        <th>Address</th>
        <th>Operation</th>
    </tr>
    <c:forEach var="record" items="${records}">
        <tr>
            <td>${record.getId()}</td>
            <td>${record.getNameAddressPair().getPerson().getFirstName()}</td>
            <td>${record.getNameAddressPair().getPerson().getLastName()}</td>
            <td>${record.getNameAddressPair().getAddress()}</td>
            <th>
                <a href="/records/read?firstName=${record.getNameAddressPair().getPerson().getFirstName()}&lastName=${record.getNameAddressPair().getPerson().getLastName()}">Read</a>
            </th>
            <th>
                <a href="/records/update?firstName=${record.getNameAddressPair().getPerson().getFirstName()}&lastName=${record.getNameAddressPair().getPerson().getLastName()}">Update</a>
            </th>
            <th>
                <a href="/records/delete?firstName=${record.getNameAddressPair().getPerson().getFirstName()}&lastName=${record.getNameAddressPair().getPerson().getLastName()}">Delete</a>
            </th>
        </tr>
    </c:forEach>
    <br>
    <br>
    <b style="color: red">${error}</b>
</table>
</body>
</html>
