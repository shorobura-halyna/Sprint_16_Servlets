<%--
  Created by IntelliJ IDEA.
  User: halyna
  Date: 22.05.20
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update existing record in Address book</title>
</head>
<body>
<a href="/home">Home Page</a> |
<a href="/records/create">Add new record</a> |
<a href="/records/list">Show all records</a>
<br>
<br>
<form action="/records/update" method="post">
    First name: <input value="${record.getPerson().getFirstName()}" readonly type="text" name="firstName"><br>
    Last name: <input value="${record.getPerson().getLastName()}" readonly type="text" name="lastName"> <br>
    Address: <input value="${record.getAddress()}" type="text-area" name="address"> <br>
    <button>Update</button>
    <button>Clear</button>
</form>
</body>
</html>
